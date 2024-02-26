package MadalinaCatona.Tema3.ElonToyCar.src;//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

public class Main {

    public static void main(String[] args) {
        ElonsToyCar toyCar = new ElonsToyCar();
        toyCar.buy();
        toyCar.distanceDisplay();
        toyCar.batteryDisplay();
        toyCar.drive();
        toyCar.distanceDisplay();
        toyCar.batteryDisplay();

        while(toyCar.batteryPercentage > 0) {
            toyCar.drive();
        }
        toyCar.distanceDisplay();
        toyCar.batteryDisplay();
    }
}
