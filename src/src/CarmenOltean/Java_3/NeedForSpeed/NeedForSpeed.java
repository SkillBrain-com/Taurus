package CarmenOltean.Java_3.NeedForSpeed;

public class NeedForSpeed {
    int speed;
   int batteryDrain;
    int distanceDriven;

    int batteryPercentage;


    public NeedForSpeed(int speed, int batteryDrain) {
        this.speed = speed;
        this.batteryDrain = batteryDrain;
        this.distanceDriven = 0;
        this.batteryPercentage = 100;


    }
    public boolean batteryDrained(){
        return batteryPercentage <= 0;
    }
    public int distanceDriven() {
        return distanceDriven;
    }
    public void drive() {
        if (!batteryDrained()) {
            distanceDriven += speed;
            batteryPercentage -= batteryDrain;
        }
    }
    public static NeedForSpeed nitro() {
        return new NeedForSpeed(50,4);
    }

    public static void main(String[] args) {
        //1. Creating a remote controlled car
        NeedForSpeed car = new NeedForSpeed(5,2);

        //2. Creating a racetrack
        RaceTrack raceTrack = new RaceTrack(800);

        //3. Drive the car
        car.drive();
        car.distanceDriven();
        System.out.println("Distance driven: " + car.distanceDriven());

        //4. Check for a drained battery
        boolean isBatteryDrained = car.batteryDrained();
        System.out.println("Is battery drained? " +isBatteryDrained);

        //5. Create the Nitro remote control car
        NeedForSpeed NitroCar = NeedForSpeed.nitro();
        NitroCar.drive();
        int distanceDriven = NitroCar.distanceDriven();
        System.out.println("Distance driven by Nitro car:" + distanceDriven);

        //6. Check if a remote control car can finish a race
        NeedForSpeed car1 = new NeedForSpeed(5,2);

        RaceTrack race = new RaceTrack(100);

        boolean canFinishRace = race.carCanFinish(car1);
        System.out.println("Can car finish the race? " + canFinishRace);







    }

}
