package MarianCocea.Java3;

public class ElonsToyCar {
    int baterryPercentage;
    int totalDistance;

    public ElonsToyCar() {
        this.baterryPercentage = 100;
        this.totalDistance = 0;
    }

    public void buy() {
        System.out.println("I bought an electric toy car.");
    }

    public void distanceDisplay() {
        System.out.println("The car traveled a distance of " + totalDistance + " meters.");
    }

    public void batteryDisplay() {
        if (baterryPercentage > 0) {
            System.out.println(baterryPercentage + "% Battery");
        } else {
            System.out.println("Empty battery");
        }

    }

    public void drive() {
        if (baterryPercentage > 0) {
            totalDistance+=20;
            baterryPercentage--;
        } else {
            System.out.println("Empty battery");
        }
    }
    public static void main(String[] args) {
        ElonsToyCar RemoteControlCar = new ElonsToyCar();

//    public static ElonsToyCar buy() {
//        throw new UnsupportedOperationException("Please implement the (static) RemoteControlCar.buy()  method");
//    }
        RemoteControlCar.buy();
//    public String distanceDisplay() {
//        throw new UnsupportedOperationException("Please implement the (static) RemoteControlCar.distanceDisplay()  method");
//    }
        RemoteControlCar.distanceDisplay();
//    public String batteryDisplay() {
//        throw new UnsupportedOperationException("Please implement the (static) RemoteControlCar.batteryDisplay()  method");
//    }
//   public void drive() {
//        throw new UnsupportedOperationException("Please implement the (static) RemoteControlCar.drive()  method");
        RemoteControlCar.drive();
    }
}
