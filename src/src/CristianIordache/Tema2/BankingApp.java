package CristianIordache.Tema2;

import java.util.Scanner;

public class BankingApp {
    public static void main(String[] args) {
        boolean cardBlocked = false;
        int retry = 3;
        int correctPin = 3124;

        while (retry >0){
            Scanner sc = new Scanner(System.in);
            System.out.println("Please enter your PIN: ");
            int pin = sc.nextInt();
            if (pin == correctPin) {
                System.out.println("Welcome to ABCD bank!");
                break;
            }
            else{
                System.out.println("PIN incorrect, please retry.");
                retry--;
            }
            if (retry ==0){
                cardBlocked = true;
                System.out.println("Please contact your local bank.");
            }
        }
    }
}

