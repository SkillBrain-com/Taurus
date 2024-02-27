package AdinaPecie.JavaBasic2;

import java.util.Random;
import java.util.Scanner;

public class Dungeon {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        Random rand = new Random();

        //variabile de jucator
        int sanatate = 100;
        int atacDeteriorare = 25;
        int nrPotiuni = 3;
        int valoareRegenerarePotiune = 30;

        int sansaPotiune = 50; //procentaj

        //variabile inamic

        String[] inamici = {"Zombie", "Skeleton", "Worrior", "Assasin"};
        int maxSanatateInamic = 75;
        int inamicAtacDeteriorare = 25;


        boolean running = true;

        System.out.println("Bine ai venit in Temnita!");

        GAME:
        while (running) {
            System.out.println("--------------------------------------");


            int sanatateInamic = rand.nextInt(maxSanatateInamic);
            String inamic = inamici[rand.nextInt(inamici.length)];

            System.out.println("\t#" + inamic + " a aparut!#");

            while (sanatateInamic > 0) {
                System.out.println("\tSanatatea ta este " + sanatate);
                System.out.println("\tSantatea inamicului " + inamic + " este: " + sanatateInamic);
                System.out.println("\t\n Ce ai vrea sa faci?");
                System.out.println("t1. Ataca!");
                System.out.println("t2. Bea potiune");
                System.out.println("t3. Fugi!");

                String input = in.nextLine();

                if (input.equals("1")) {
                    //cod pentru actiunea de a ataca
                    int deteriorareProdusa = rand.nextInt(atacDeteriorare);
                    int deteriorarePrimita = rand.nextInt(inamicAtacDeteriorare);

                    sanatateInamic -= deteriorareProdusa;
                    sanatate -= deteriorarePrimita;

                    System.out.println("\tL-ai lovit pe " + inamic + " cu " + deteriorareProdusa + " deteriorare");
                    System.out.println("\tAi primit " + deteriorarePrimita + " deteriorare");

                    if (sanatate < 1) {
                        System.out.println("\tAi fost lovit prea tare, esti prea slabit sa contiunui.");

                        break;
                    }

                } else if (input.equals("2")) {
                    //cod pentru actiunea de a bea potiunea
                    if (nrPotiuni > 0) {
                        sanatate += valoareRegenerarePotiune;
                        nrPotiuni--;
                        System.out.println("\tAi baut o potiune, te-ai vindecat cu " + valoareRegenerarePotiune +
                                "\n\tAcum ai " + sanatate + " sanatate." +
                                "\n\tTi-au ramas " + nrPotiuni + " nrPotiuni");
                    } else {
                        System.out.println("\tNu mai ai nrPotiuni! Invinge un inamic ca sa mai castigi nrPotiuni!\n");
                    }

                } else if (input.equals("3")) {
                    //cod pentru actiunea de a fugi
                    System.out.println("\tAi fugit de " + inamic);
                    continue GAME;
                } else {
                    //cod pentru optiune invalida
                    System.out.println("Comanda invalida!");
                }

            }
            if (sanatate < 1) {
                System.out.println("Te-au batut rau in Temnita, esti prea slab.");
                break;
            }

            System.out.println("--------------------------------------");
            System.out.println(" # " + inamic + " a fost invins! #");
            System.out.println(" # Ai santatate " + sanatate + " #");

        if (rand.nextInt(100) < sansaPotiune) {
            nrPotiuni++;
            System.out.println(" # Ai castigat o potiune in urma infrangerii lui " + inamic + " #");
            System.out.println(" # Mai ai " + nrPotiuni + " nrPotiuni. #");
        }
            System.out.println("Ce ai vrea sa faci in contiunuare?");
            System.out.println("1. Continui lupta");
            System.out.println("2. Termina jocul");
            String input = in.nextLine();

            while (!input.equals("1") && !input.equals("2")) {
                System.out.println("Comanda invalida!");
                input = in.nextLine();
            }
                switch (input){
                    case "1":{
                        System.out.println("Continui cu aventura!");
                        break;
                    }
                    case "2":{
                        System.out.println("Ai ales sa iesi din Temnita! Drum bun!");
                        break GAME;
                    }
                }

            }
        System.out.println("######################################");
        System.out.println(" # Multumim de joc! # ");
        System.out.println("######################################");
        }
    }



