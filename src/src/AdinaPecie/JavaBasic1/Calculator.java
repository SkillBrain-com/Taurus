package AdinaPecie.JavaBasic1;

import java.util.Scanner;

public class Calculator {
    static public void main(String [] args) {
        System.out.println("Let's calculate something!");
        System.out.println("Please, enter your first number:");

        Scanner scanner = new Scanner(System.in);
        double numar1 = scanner.nextDouble();
        System.out.println("Please, enter your second number:");
        double numar2 = scanner.nextDouble();

        double rezultatInmultire = inmultire(numar1, numar2);
        double rezulatAdunare = adunare(numar1, numar2);
        double rezultatScadere = scadere(numar1, numar2);
        double rezultatImpartire = impartire(numar1, numar2);
        double rezultatModul = modul((int)numar1,(int) numar2);
        double numarRandom = genereazaNumarRandom(rezultatScadere, rezultatInmultire);

        System.out.println("Rezultat inmultire este:" +" "+ rezultatInmultire);
        System.out.println("Rezultat adunare este:" +" "+ rezulatAdunare);
        System.out.println("Rezultat scadere este:" +" "+ rezultatScadere);
        System.out.println("Rezultat impartire este:" +" "+ rezultatImpartire);
        System.out.println("Rezultat modul este:" +" "+ rezultatModul);
        System.out.println("Numarul random generat inre " + rezultatScadere+ " si "+ rezultatInmultire + " este: 15" +
                "" + numarRandom);


    }
    public static double inmultire(double nr1, double nr2) {
        double rezultat = nr1*nr2;
        return rezultat;
    }

    public static Double adunare(double numar1, double nr2) {
        double rezultat = numar1 + nr2;
        return rezultat;
    }

    public static double scadere(Double numar1, Double numar2) {
        Double rezultat = numar1 - numar2;
        return rezultat;
    }

    public static Double impartire(Double numar1, double numar2) {
        double rezultat = numar1 / numar2;
        return rezultat;
    }

    public static int modul (int nr1, Integer nr2) {
        return nr1 % nr2;
    }

    public static double genereazaNumarRandom(double minim, double maxim) {
        return Math.random()*(maxim-minim)+ minim;
    }

    }

