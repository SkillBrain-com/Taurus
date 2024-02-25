package MadalinaCatona.Tema3.ElonToyCar.src;

public class ElonsToyCar {
        public int batteryPercentage = 100;
        public int totalDistanceDriven = 0;

        public ElonsToyCar() {
        }

        public void buy() {
            System.out.println("I bought a new toy car");
        }

        public void distanceDisplay() {
            System.out.println(this.totalDistanceDriven + "driven meters");
        }

        public void batteryDisplay() {
            if (this.batteryPercentage > 0) {
                System.out.println("Battery at" + this.batteryPercentage + "%");
            } else {
                System.out.println("Empty baterry.");
            }

        }
    public void drive() {
        if (this.batteryPercentage > 0) {
            this.totalDistanceDriven += 20;
            --this.batteryPercentage;
        } else {
            System.out.println("Empty baterry.");
        }

    }
}
