package CristianIordache.Tema3;

public class NeedForSpeed {
    public int speed;
    public int batteryDrain;
    public int distanceDriven;
    public int batteryPercentage;

    // Constructor
    public NeedForSpeed(int speed, int batteryDrain){
        this.speed = speed;
        this.batteryDrain = batteryDrain;
        this.distanceDriven = 0;
        this.batteryPercentage = 100;
    }
    // Method to drive the car
    public void drive(){
        if (!batteryDrained()){
            distanceDriven += speed;
            batteryPercentage -= batteryDrain;
        }
    }
    // Method to get the distance driven
    public int distanceDriven(){
        return distanceDriven;
    }
    // Method to check if the battery is drained
    public boolean batteryDrained(){
        return batteryPercentage <= 0;
    }
    // Static method to create Nitro car
    public static NeedForSpeed nitro(){
        return new NeedForSpeed(50, 4);
    }
}
