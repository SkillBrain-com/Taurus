package AdinaPecie.JavaBasic1;

import java.util.Scanner;

public class Tema1 {
    public static void main(String[] args) {
        ex1();
        ex2();
        ex3();
        ex4();
        ex5();
        ex6();
        ex7();

    }
       static void ex1() {
        System.out.println(" Imi place Java");
    }

    static void ex2(){
        System.out.println("Cursul acesta este foarte fain");
        System.out.println("Cursul acesta este foarte fain");
        System.out.println("Cursul acesta este foarte fain");
        System.out.println("Cursul acesta este foarte fain");
        System.out.println("Cursul acesta este foarte fain");
        System.out.println("Cursul acesta este foarte fain");
    }

    static void ex3(){
        int varstaAna = 24;
        int varstaDavid = varstaAna - 6;
        System.out.println("David are varsta de " + " "+ varstaDavid +"ani");

    }

    static void ex4() {
        System.out.println("Introduceti propozitia:");
        Scanner scanner = new Scanner(System.in);
        String propozitie = scanner.next();
    }

    static void ex5() {
        int a = 5;
        String text = "Weekend";
        boolean valoareBooleana = true;

        System.out.println("Valoarea lui a este " + a);
        System.out.println("Valoarea textului este " + text);
        System.out.println("Valoarea booleana este" + valoareBooleana);
    }

    static void ex6 () {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti primul numar: ");
        double numar1 = scanner.nextDouble();
        System.out.println("Introduceti cel de al doilea numar:");
        double numar2 = scanner.nextDouble();
    }

    static void ex7 () {
        System.out.println("Introduceti numarul de la tastatura: ");
        Scanner scanner = new Scanner(System.in);
        double numar = scanner.nextDouble();
        double a = numar + 5;
        double s = numar - 12.3;
        double i = numar * (-3.2);
        double p = numar / 4;
        double m = numar % 6;

        System.out.println("Rezultatul adunarii cu 5 este:" + a);
        System.out.println("Rezultatul scaderii este:" + s);
        System.out.println("Rezultatul inmultirii este: " + i);
        System.out.println("Rezultatul impartirii este:" + p);
        System.out.println("Rezultatul modul este:" + m);
    }
    }










