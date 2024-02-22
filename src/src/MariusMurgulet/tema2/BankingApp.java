package MariusMurgulet.tema2;

import java.util.Scanner;

public class BankingApp {
    public static void main(String[] args) {
        boolean cardBlocked = false;
        int retry = 3;
        int correctPin = 3124;

        // Login
        while(retry>0){
            Scanner sc = new Scanner(System.in);
            System.out.println("Va rugam introduceti codul correctPin:");
            int pin = sc.nextInt();
            
            if(pin == correctPin && !cardBlocked) {
                System.out.println("Welcome!");
                System.out.println("Welcome to beta bank") ;
                break;
            }else {
                System.out.println("Codul PIN este incorect, va rugam sa incercati din nou");
                retry--;
            }

            if(retry == 0){
                cardBlocked = true;
                System.out.println("Please contact your local bank");
            }
            if(cardBlocked == true){
                System.out.println("Your card has been blocked!");
            }
            }

        }
            
    }

