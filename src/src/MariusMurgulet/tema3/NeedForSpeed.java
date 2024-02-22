package MariusMurgulet.tema3;

class NeedForSpeed {
    // TODO: define the constructor for the 'NeedForSpeed' class
    private int speed;
    private int batteryDrain;
    private int batteryPercentage;
    private int metersDriven;

    public NeedForSpeed(int speed, int batteryDrain) {
        this.speed = speed;
        this.batteryDrain = batteryDrain;
        this.batteryPercentage = 100;
        this.metersDriven = 0;
    }

    public boolean batteryDrained() {
        return batteryPercentage < batteryDrain;
    }

    public int getBatteryDrain() {
        return batteryDrain;
    }

    public int distanceDriven() {
        return metersDriven;
    }

    public int getSpeed() {
        return speed;
    }

    public int getBatteryPercentage() {
        return batteryPercentage;
    }

    public void drive() {
        if (!batteryDrained()) {
            metersDriven += speed;
            batteryPercentage -= batteryDrain;
        }
    }

    public static NeedForSpeed nitro() {
        return new NeedForSpeed(50, 4);
    }

    public static void main(String[] args) {
        NeedForSpeed car1 = new NeedForSpeed(5, 2);
        car1.drive();
        System.out.println("Distance driven: " + car1.distanceDriven());
        System.out.println("Is battery drained: " + car1.batteryDrained());

        NeedForSpeed car2 = NeedForSpeed.nitro();
        car2.drive();
        System.out.println("Distance driven for Nitro " + car2.distanceDriven());

        RaceTrack track1 = new RaceTrack(100);
        System.out.println(track1.carCanFinish(car1));

    }
}
class RaceTrack {
    private int distance;

    public RaceTrack(int distance) {
        this.distance = distance;
    }
    public boolean carCanFinish(NeedForSpeed car) {
        int maxDistanceCarCanTravel = (car.getBatteryPercentage() / car.getBatteryDrain() *
                car.getSpeed());
        return maxDistanceCarCanTravel >= distance;
    }
}

