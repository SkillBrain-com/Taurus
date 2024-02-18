package CristianIordache.Tema3;

public class RaceTrack {
    public int distance;
    // Constructor
    public RaceTrack(int distance){
        this.distance = distance;
    }
    // Method to check if a car can finish the race
    public boolean carCanFinish (NeedForSpeed car){
        while (!car.batteryDrained() && car.distanceDriven() < distance){
            car.drive();
        }
        return car.distanceDriven() >= distance;
    }
}
