package AdinaPecie.JavaBasic3;

public class ElonsToyCar {

    int batteryPercentage;
    int distanceDrivenMeters;

    public ElonsToyCar(int battery, int distance){
        batteryPercentage =100;
        distanceDrivenMeters = 0;
    }

    public static ElonsToyCar buy() {
        ElonsToyCar car = new ElonsToyCar(100,0);
        System.out.println("I've bought a new car.");
        return car;
    }


    public void distanceDisplay () {
        System.out.println("Total distance driven is " + distanceDrivenMeters +"m");
    }

    public void batteryDisplay() {
        if (batteryPercentage > 0) {
            System.out.println("Battery is " + batteryPercentage);
        } else {
            System.out.println("Out of power");
        }
    }


    public void drive() {
            if (batteryPercentage > 0) {
                distanceDrivenMeters+= 20;
                batteryPercentage --;
                System.out.println(distanceDrivenMeters);
            }else{
                System.out.println("Battery is out of power.");
            }
    }

    public void testCar (){
        for( int i = 0; i < 101; i++){
            drive();
        }
    }


        public static void main (String[]args){

        ElonsToyCar car = ElonsToyCar.buy();


            car.batteryDisplay();
            car.distanceDisplay();
            car.drive();
            car.drive();
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
            car.testCar();




        }
    }