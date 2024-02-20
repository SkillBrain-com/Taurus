package CristianSandu.java2;

import java.util.Scanner;

public class BankingApp{

    public static void main(String[] args) {
        boolean cardBlocked = false;
        int retry = 3;
        int correctPin = 3124;

        // getter - read-only -> public
        // setter -> private

        // Login
        while (retry > 0 ) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Va rugam introduceti codul Pin:");
            int pin = sc.nextInt();

            if(pin == correctPin && !cardBlocked) {
                System.out.println("Welcome!");
                System.out.println("Welcome to beta bank");
                break;
            } else {
                System.out.println("Codul PIN este incorect, va rugam sa incercati din nou");
                retry--;
            }

            if(retry == 0) {
                cardBlocked = true;
            }
//            if(cardBlocked == true) {
//                System.out.println("Your card has been blocked");
//            }

            if(cardBlocked) {
                System.out.println("Your card has been blocked");
            }

        }




    }
}
