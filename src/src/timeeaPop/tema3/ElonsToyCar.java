package timeeaPop.tema3;

 public class ElonsToyCar {
        public int batteryPercentage = 100;
        public int metersCovered = 0;

        // 1
        static ElonsToyCar buy(){
            return new ElonsToyCar();
        }

        // 2
        public int distanceDisplay() {
            int distanceDisplay = metersCovered;
            System.out.println("Driven " + metersCovered + " meters.");
            return distanceDisplay;
        }

        // 3
        public int batteryDisplay() {
            int batteryDisplay = batteryPercentage;
            System.out.println("Baterry at " + batteryPercentage + "%.");
            return batteryDisplay;
        }

        // 4 + 5 + 6
        public void drive() {
            if(batteryPercentage != 0) {
                metersCovered += 1000;
                batteryPercentage -= 25;
            } else {
                System.out.println("Battery empty");
            }
        }

        public static void main(String[] args) {
            // 1
            ElonsToyCar car = ElonsToyCar.buy();
            // 2
            car.distanceDisplay();
            // 3
            car.batteryDisplay();
            //4 + 5 + 6
            car.drive();
            car.drive();
            car.drive();
            car.drive();
            car.drive();
            car.drive();
            car.drive();
            car.drive();

            car.distanceDisplay();
            car.batteryDisplay();
        }
}
