package kateaManoila.Java2;

import java.util.Scanner;

public class BankingApp {

    public static void main(String[] args) {


        boolean cardBlocat = false;
        int retry = 3;
        int correctPin = 4589;

        //login;
        while (retry > 0){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Va rugam sa introduceti PIN:");
            int pin = scanner.nextInt();

            if (pin==correctPin && !cardBlocat){
                System.out.println("Bine ati venit");
                System.out.println("Bine ati venit la beta banc");
                break;
            }else {
                System.out.println("Codul pin este incorect va rugam sa incercati din nou");
                retry--;
            }

            if (retry == 0){
                cardBlocat= true;
                System.out.println("Cardul a fost blocat,va rugam contactati banca!");
            }


        }


    }
}
