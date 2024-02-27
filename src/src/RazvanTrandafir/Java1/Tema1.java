package RazvanTrandafir.Java1;

import java.util.Scanner;

public class Tema1 {

        public static void main(String[] args) {

        ex1();
        ex2();
        ex3();
//            Scanner exercitiu4 = new Scanner(System.in);
//        ex4(exercitiu4);
        ex4(new Scanner(System.in) );
        ex5();
        ex6(new Scanner(System.in));
        ex7(new Scanner(System.in));     //  (new Scanner(System.in) = scanner de unica folosinta
        ex8();
    }

    static void ex1() {
        System.out.println("Imi place Java");
    }

    static void ex2() {
        System.out.println("Cursul acesta este foarte fain!");
        System.out.println("Cursul acesta este foarte fain!");
        System.out.println("Cursul acesta este foarte fain!");
        System.out.println("Cursul acesta este foarte fain!");
        System.out.println("Cursul acesta este foarte fain!");
        System.out.println("Cursul acesta este foarte fain!");
    }

    static void ex3() {
        int Ana = 24;
        int David = Ana - 6;
        System.out.println("David are " + David + " ani.");
    }

    public static void ex4(Scanner scanner) {
        System.out.print("Introduceți o propoziție: ");
        String propozitie = scanner.nextLine();
        System.out.println("Ai introdus: " + propozitie);
    }

    static void ex5() {
        int numar = 10;
        String text = "Aceasta este o propoziție.";
        boolean esteAdevarat = true;

        System.out.println("Variabila de tip int: " + numar);
        System.out.println("Variabila de tip String: " + text);
        System.out.println("Variabila de tip boolean: " + esteAdevarat);
    }

    private static void ex6(Scanner scanner) {
        System.out.print("Introduceti primul numar: ");
        int numar1 = scanner.nextInt();
        System.out.print("Introduceti al doilea numar: ");
        int numar2 = scanner.nextInt();
        System.out.println("Numerele introduse sunt: " + numar1 + " si " + numar2);
    }

    static void ex7(Scanner scanner) {
        System.out.print("Introduceti un numar: ");
        double numar = scanner.nextDouble();

        double suma = numar + 5;
        double scadere = numar - 12.3;
        double inmultire = numar * -3.2;
        double impartire = numar / 4;
        double modul = numar % 6;

        System.out.println("Suma cu 5= " + suma);
        System.out.println("Scaderea cu 12.3= " + scadere);
        System.out.println("Inmultirea cu -3.2:= " + inmultire);
        System.out.println("Impartirea cu 4= " + impartire);
        System.out.println("Modulul cu 6= " + modul);
    }

    static void ex8() {
        int x = 2;
        int y = 12;

        // y = x * y;
        y = x + y;
        x = y - x;
        y = y - x;

        System.out.println(x);
        System.out.println(y);
    }
}