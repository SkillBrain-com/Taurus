package StefanBatrinache.Tema3;

import java.util.Scanner;

public class ElonsToyCar {
    static ElonsToyCar car = new ElonsToyCar();
    public static void buy() {
        System.out.println("Am cumparat o noua masina pe telecomanda!");
    }
    public void distanceDisplay() {
        int distanta = 0;
        System.out.println("Distanta parcursa este " + distanta + ".");
    }

    public void batteryDisplay() {
        int baterie = 100;
        System.out.println("Bateria este incarcata " + baterie + "%.");
    }
    int baterie = 100;
    int distanta = 0;
    public void drive(){
        Scanner pornireMasina = new Scanner(System.in);
        System.out.println("Pentru a porni masina apasa tasta 1! Daca vrei sa o lasi oprita, apasa tasta 2!");
        int pornitaSauOprita = pornireMasina.nextInt();
        if(pornitaSauOprita == 2 ){
            System.out.println("Masina este oprita!");
        }
        else if(pornitaSauOprita == 1){
        System.out.println("Masina este pornita! Incepe utilizarea!");
        }
        else{
            System.out.println("1");
//            continue;
        }
        while(pornitaSauOprita == 1 && baterie > 0){
            baterie -= 1;
            distanta += 20;
            System.out.println("Bateria este incarcata " + baterie + "%," +
                    " iar distanta parcursa pana acum este " + distanta + " metri.");
            if(baterie == 0){
                System.out.println("Masina nu mai are baterie si s-a oprit!");
                break;
            }
        }
//        if(pornitaSauOprita == 1 && baterie > 0){
//            baterie -= 1;
//            distanta += 20;
//            System.out.println("Bateria este incarcata " + baterie + "%," +
//                    " iar distanta parcursa pana acum este " + distanta + " metri.");
//        }
//            else if (pornitaSauOprita == 2 || baterie == 0){
//                System.out.println("Masina s-a oprit!");
//
//            }
    }

    public int viataBaterie(){
        return baterie;
    }
    public int distantaParcursa(){
        return distanta;
    }

    public static void main(String[] args) {
        car.buy();
        car.distanceDisplay();
        car.batteryDisplay();
        car.drive();

//        car.drive();
//        car.drive();
//        UtilizareMasina utilizareMasina = new UtilizareMasina();
//        utilizareMasina.drive();

    }

}





//
//
//        int distanta = 0;
//        boolean turnedOn = false;
//        public void drive(){
//
//            }
//
//
////            int baterie = 100;
////if(turnedOn){
////            System.out.println("Masina este oprita!");
////        }
////        else{
////            while(!turnedOn && baterie!=0) {
////
//            }
//
//
//
//
//
//    }







