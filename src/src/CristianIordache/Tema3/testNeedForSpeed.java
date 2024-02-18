package CristianIordache.Tema3;

public class testNeedForSpeed {
    public static void main(String[] args) {
//1. Creating a remote controlled car
        int speed = 5;
        int batteryDrain = 2;
        NeedForSpeed car1 = new NeedForSpeed(speed, batteryDrain);
//2. Creating a race track
        int distance = 800;
        RaceTrack raceTrack = new RaceTrack(distance);
//3. Drive the car and display distance driven
        car1.drive();
        System.out.println(car1.distanceDriven());
//4. Check for a drained battery
        System.out.println(car1.batteryDrained());
//5. Create the Nitro remote control car
        NeedForSpeed car2 = NeedForSpeed.nitro();
        car2.drive();
        System.out.println(car2.distanceDriven());
//6. Check if a remote control car can finish a race
        System.out.println(raceTrack.carCanFinish(car2));
    }
}
