package CristianIordache.Tema3;

public class testElonsToyCar {
    public static void main(String[] args) {
//1. buy a car
        ElonsToyCar car = new ElonsToyCar();
        System.out.println("Just buy a new toy car!");
//2. display distance
        System.out.println(car.distanceDisplay());
//3. display battery percentage
        System.out.println(car.batteryDisplay());
//4. update the number of meters driven when driving
        car.drive();
        car.drive();
        System.out.println(car.distanceDisplay());
//5. update the battery percentage when driving
        car.drive();
        car.drive();
        System.out.println(car.batteryDisplay());
//6. prevent driving when battery is drained
        while (!car.batteryDisplay().equals("Battery empty")){
            car.drive();
        }
        System.out.println(car.distanceDisplay());
        System.out.println(car.batteryDisplay());
    }
}
