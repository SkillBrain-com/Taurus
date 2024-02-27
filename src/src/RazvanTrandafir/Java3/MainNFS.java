package RazvanTrandafir.Java3;

public class MainNFS {
    public static void main(String[] args) {
        int speed = 5;
        int batteryDrain = 2;
        NeedForSpeed car = new NeedForSpeed(speed, batteryDrain);

        car.drive();
        System.out.println("Distanta parcursa " + car.distanceDriven());

        System.out.println("Baterie descarcata: " + car.batteryDrained());

        NeedForSpeed nitroCar = NeedForSpeed.nitro();
        nitroCar.drive();
        System.out.println("Distanta parcursa " + nitroCar.distanceDriven());

        int distance = 800;
        RaceTrack race = new RaceTrack(distance);
        System.out.println("Termina cursa? " + race.carCanFinish(car));
    }
}
