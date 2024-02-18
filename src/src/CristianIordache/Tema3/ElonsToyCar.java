package CristianIordache.Tema3;

public class ElonsToyCar {
    public int distanceDriven;
    public int batteryPercentage;
    public static int driveDistance = 20;
    public static int batteryDrain = 1;
    public static int maxBattery = 100;
    public static int minBattery = 0;

    // Method buy a car
    public static ElonsToyCar buy() {
        return new ElonsToyCar();
    }

    // Constructor
    public ElonsToyCar() {
        distanceDriven = 0;
        batteryPercentage = maxBattery;
    }

    // Method display distance driven
    public String distanceDisplay() {
        return "Driven " + distanceDriven + " meters";
    }

    //Method display battery percentage
    public String batteryDisplay() {
        if (batteryPercentage <= minBattery) {
            return "Empty battery";
        } else {
            return "Battery " + batteryPercentage + "%";
        }
    }
    // Method drive
    public void drive(){
        if (batteryPercentage > minBattery){
            distanceDriven += driveDistance;
            batteryPercentage -= batteryDrain;
            if (batteryPercentage < minBattery){
                batteryPercentage = minBattery;
            }
        }
    }
}
