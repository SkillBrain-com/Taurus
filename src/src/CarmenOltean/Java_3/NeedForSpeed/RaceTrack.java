package CarmenOltean.Java_3.NeedForSpeed;

public class RaceTrack {
    int distance;

    public RaceTrack(int distance) {
        this.distance = distance;
    }
    public boolean carCanFinish (NeedForSpeed car){
        while (car.distanceDriven() < distance && !car.batteryDrained()) {
            car.drive();
        }

        return car.distanceDriven() >= distance;}
}


