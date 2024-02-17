package CarmenOltean.Java_3;

public class ElonsToyCar {


    public int batteryPercentage;
    public int totalDistanceDriven;

    public ElonsToyCar() {
        this.batteryPercentage = 100;
        this.totalDistanceDriven = 0;

    }

    public  void buy() {
        System.out.println("I have bought a new toy car");
    }


    public void distanceDisplay() {
        System.out.println(totalDistanceDriven + " driven meters");
    }


    public void batteryDisplay() {
        if (batteryPercentage > 0) {
            System.out.println("Battery at " + batteryPercentage + " %");
        } else {
            System.out.println("Empty battery");
        }
    }

    public void drive() {
        if (batteryPercentage > 0) {
            totalDistanceDriven += 20;
            batteryPercentage--;
        } else {
            System.out.println("Empty battery");
        }
    }

    public static void main(String[] args) {
        ElonsToyCar toyCar = new ElonsToyCar();

        //1. Buy a brand-new remote controlled car
        toyCar.buy();

        //2. Display the distance driven
        toyCar.distanceDisplay();

        //3. Display the battery percentage
        toyCar.batteryDisplay();

        //4. Update the number of meters driven when driving
        toyCar.drive();
        toyCar.drive();
        toyCar.distanceDisplay();

        //5. Update the battery percentage when driving
        toyCar.batteryDisplay();

        //6. Prevent driving when the battery is drained

        while(toyCar.batteryPercentage>0){
            toyCar.drive();
        }

        toyCar.distanceDisplay();
        toyCar.batteryDisplay();

    }



}




