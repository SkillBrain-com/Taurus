package AdinaPecie.JavaBasic3;

public class Model1ElonCar {
    public static void main(String[] args) {
        BuyCar();
        distanceDisplay(5);
        batteryDisplay(5);
        carEmpty(5);
    }

    public static void BuyCar() {
        System.out.println("You bought a car with 100% battery and 0 meters.");
    }

    public static void distanceDisplay(int remoteControlUsage) {
        //ElonsToyCar car = new ElonsToyCar();
        int distanceDisplay = 0;
        distanceDisplay = 20 * remoteControlUsage;
        System.out.println("Car has driven " + distanceDisplay + " meters.");
    }

    public static void batteryDisplay(int remoteControlUsage) {
        int batteryDisplay = 100;
        batteryDisplay = 100 - remoteControlUsage;
        System.out.println("Car has " + batteryDisplay + " % battery");
    }

    public static void carEmpty(int remoteControlUsage) {

        if (remoteControlUsage > 100) {
            System.out.println("The battery is empty, please do not use the car.");
        } else {
            Model1ElonCar car = new Model1ElonCar();
            car.batteryDisplay(5);
            car.distanceDisplay(5);
        }
    }
}


