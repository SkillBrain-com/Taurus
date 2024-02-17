package timeeaPop.tema3;

public class NeedForSpeed {
    int speed;
    int batteryDrain;
    int numberOfMetersDriven = 0;
    int battery = 100;

    // 1
    public NeedForSpeed(int speed, int batteryDrain) {
        this.speed = speed;
        this.batteryDrain = batteryDrain;
    }

    public void drive() {
        numberOfMetersDriven += speed;
        battery -= batteryDrain;
    }

    public boolean batteryDrained() {
//        System.out.println(battery == 0);
        return battery == 0;
    }

    public int distanceDriven() {
        System.out.println(numberOfMetersDriven);
        return numberOfMetersDriven;
    }

    public static NeedForSpeed nitro() {
        //        NeedForSpeed car = new NeedForSpeed(50, 4);
        //        return car;
        return new NeedForSpeed(50,4);
    }

    public static void main(String[] args) {
//        int speed = 5;
//        int batteryDrain = 2;
//        //NeedForSpeed car = new NeedForSpeed(speed, batteryDrain);
//        NeedForSpeed car = NeedForSpeed.nitro();
//        car.drive();
//        car.distanceDriven();
//        car.batteryDrained();
//
//
//        int distance = 100;
//        RaceTrack raceTrack = new RaceTrack(distance);
        int speed = 5;
        int batteryDrain = 2;
        NeedForSpeed car = new NeedForSpeed(speed, batteryDrain);

        int distance = 100;
        RaceTrack race = new RaceTrack(distance);

        race.carCanFinish(car);
        System.out.println(race.carCanFinish(car));
    }
}

class RaceTrack {

    int distance;
    // 2
    public RaceTrack (int distance) {
        this.distance = distance;
    }

    public boolean carCanFinish(NeedForSpeed car) {
        var canFinish = false;
        while(!car.batteryDrained()) {
            if (car.distanceDriven() >= distance) {
                canFinish = true;
                break;
            }
            car.drive();
        }
        return canFinish;
    }
}
