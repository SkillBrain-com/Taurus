package MadalinaCatona.Tema1.Tema1.src;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
//    Imi place Java
        ex1();
        ex2();
        ex3();
        ex4();
        ex5();
        ex6();
        ex7();
        ex8();
    }

    static void ex1() {
        System.out.println("Imi place Java!");
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
        System.out.println("Varsta lui David este de " + David + " ani.");
    }

    static void ex4() {
        Scanner Propozitie = new Scanner(System.in);
        System.out.println("Introdu propozitia: .");
        String Prop = Propozitie.nextLine();
        System.out.println(Prop);
    }

    static void ex5() {
        myVariables();
    }

    public static void myVariables() {
        int a = 5;
        String b = "Java este interesant.";
        boolean c = true;
        System.out.println("Variabila mea de tip int este: " + a);
        System.out.println("Variabila mea de tip String este: " + b);
        System.out.println("Variabila mea de tip boolean este: " + c);
    }

    static void ex6() {
        citeste_afiseaza_variabile();
    }

    public static void citeste_afiseaza_variabile() {
        Scanner citeste_tastatura = new Scanner(System.in);
        System.out.println("x");
        double x = citeste_tastatura.nextDouble();
        System.out.println("y");
        double y = citeste_tastatura.nextDouble();
        System.out.println("x = " + x);
        System.out.println("y = " + y);
    }

    static void ex7() {
        citeste_calculeaza();
    }

    public static void citeste_calculeaza() {
        Scanner citeste = new Scanner(System.in);
        System.out.println("z");
        int z = citeste.nextInt();
        System.out.println("Adunare: " + (z + 5));
        System.out.println("Scadere: " + (z - 12.3));
        System.out.println("Inmultire: " + (z * -3.2));
        System.out.println("Impartire: " + (z / 4));
        System.out.println("Modul: " + (z % 6));
    }

    static void ex8() {
        int x = 2;
        int y = 12;
        //   y = x * y;
        y = x + y;
        x = y - x;
        y = y - x;
        System.out.println(x);
        System.out.println(y);
    }

}