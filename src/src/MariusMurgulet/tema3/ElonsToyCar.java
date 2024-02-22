package MariusMurgulet.tema3;

public class ElonsToyCar {
    private int metersDriven;
    private int batteryPercentage;

    private ElonsToyCar(){
        this.metersDriven = 0;
        this.batteryPercentage = 100;
    }
    public static ElonsToyCar buy() {
        return new ElonsToyCar();
    }

    public String distanceDisplay() {
        return "Driven " + metersDriven + " meters";
    }

    public String batteryDisplay() {
        if(batteryPercentage == 0)
        {
            return "Battery empty";
        }
        return "Battery at " + batteryPercentage + "%";
    }

    public void drive() {
        if(batteryPercentage > 0)
        {
            metersDriven += 20;
            batteryPercentage -= 1;
        }
    }
    public static void main(String[] args) {
        //Task1 Buy a brand-new remote controlled car
        ElonsToyCar car = ElonsToyCar.buy();
        System.out.println("Elons si-a cumparat o masina noua!");

        //Task2 Display the distance driven
        System.out.println(car.distanceDisplay());
        //Task3 Display the battery percentage
        System.out.println(car.batteryDisplay());
        //Task 4 and 5 Update the number of meters driven when driving/Update the battery percentage when driving
        car.drive();
        car.drive();
        System.out.println(car.distanceDisplay());
        System.out.println(car.batteryDisplay());

        //Task6 Prevent driving when the battery is drained
        for(int i =0; i < 100;i++)
        {
            car.drive();
        }
        System.out.println(car.distanceDisplay());
        System.out.println(car.batteryDisplay());
    }
}

