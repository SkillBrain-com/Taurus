package RazvanTrandafir.Java3;

class NeedForSpeed {
    public int speed;
    public int batteryDrain;
    public int distanceDriven;
    public int batteryRemaining;

    public NeedForSpeed(int speed, int batteryDrain) {
        this.speed = speed;
        this.batteryDrain = batteryDrain;
        this.distanceDriven = 0;
        this.batteryRemaining = 100; // Initial battery percentage
    }

    public static NeedForSpeed nitro() {
        return new NeedForSpeed(50, 4);
    }

    public void drive() {
        if (batteryRemaining > batteryDrain) {
            distanceDriven += speed;
            batteryRemaining -= batteryDrain;
        }
    }

    public int distanceDriven() {
        return distanceDriven;
    }

    public boolean batteryDrained() {
        return batteryRemaining <= 0;
    }

    public int getBatteryRemaining() {
        return batteryRemaining;
    }
}

class RaceTrack {
    private int distance;

    public RaceTrack(int distance) {
        this.distance = distance;
    }

    public boolean carCanFinish(NeedForSpeed car) {
        int maxDistancePossible = car.getBatteryRemaining() / car.batteryDrain * car.speed;
        return distance <= maxDistancePossible;
    }
}

