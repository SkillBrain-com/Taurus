package RazvanTrandafir.Java3;

public class ElonsToyCar {
    private int distanceDriven;
    private int batteryPercentage;

    public static ElonsToyCar buy() {
        return new ElonsToyCar();
    }

    public String distanceDisplay() {
        return "Driven " + distanceDriven + " meters.";
    }

    public String batteryDisplay() {
        if (batteryPercentage <= 0) {
            return "Battery empty";
        } else {
            return "Battery at " + batteryPercentage + " %";
        }
    }

    public void drive() {
        if (batteryPercentage > 0) {
            distanceDriven += 20;
            batteryPercentage -= 1;
        }
    }

    public static void main(String[] args) {
        ElonsToyCar car = ElonsToyCar.buy();
        car.distanceDisplay();
        System.out.println("Driven 0 meters.");
        car.batteryDisplay();
        System.out.println("Battery at 100%");

        car.drive();
        System.out.println("Car moving");
        car.drive();
        System.out.println("Car moving");
        car.distanceDisplay();
        System.out.println("Driven 40 meters");
        car.batteryDisplay();
        System.out.println("Battery at 98%");
    }
}
