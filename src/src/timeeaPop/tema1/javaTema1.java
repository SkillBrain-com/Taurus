package timeeaPop.tema1;

import java.util.Scanner;

public class javaTema1 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        exercitiul01(); //ex1
        exercitiul02(); //ex2
        int varstaDavid = exercitiul03(24); //ex3
        System.out.println(varstaDavid);
        exercitiul04(); //ex4
        myVariables05(); //ex5
        exercitiul06(); //ex6
        exercitiul07(); //ex7
        exercitiul08(); //ex8
    }

    static void exercitiul01() {
        System.out.println("EX 1");
        System.out.println("Imi place Java");
        System.out.println();
    }

    static void exercitiul02() {
        System.out.println("EX 2");
        System.out.println("Cursul acesta este foarte fain");
        System.out.println("Cursul acesta este foarte fain");
        System.out.println("Cursul acesta este foarte fain");
        System.out.println("Cursul acesta este foarte fain");
        System.out.println("Cursul acesta este foarte fain");
        System.out.println("Cursul acesta este foarte fain");
        System.out.println();
    }

    static int exercitiul03(int varstaAna){
        System.out.println("EX 3");
        System.out.println();
        return varstaAna - 6;
    }

    static void exercitiul04 () {
        System.out.println("EX 4");
        System.out.print("Scrie o propozitie: ");
        String sentence = scanner.nextLine();
        System.out.println("Ai scris: " + sentence);
        System.out.println();
    }

    static void myVariables05() {
        System.out.println("EX 5");
        int numarIntreg = 44;
        String text = "text random";
        boolean isTrue = true;
        System.out.println("Variabila int: " + numarIntreg);
        System.out.println("Variabila String: " + text);
        System.out.println("Variabila boolean: " + isTrue);
        System.out.println();
    }

    static void exercitiul06() {
        System.out.println("EX 6");
        System.out.println("Introdu primul numar: ");
        int primulNumar = scanner.nextInt();
        System.out.println("Introdu al doilea numar");
        int alDoileaNumar = scanner.nextInt();
        System.out.println("Primul numar este: " + primulNumar);
        System.out.println("Al doilea numar este: " + alDoileaNumar);
        System.out.println();
    }

    static void exercitiul07() {
        System.out.println("EX 7");
        System.out.println("Introdu un numar: ");
        int numarulIntrodus = scanner.nextInt();
        System.out.println(numarulIntrodus + 5);
        System.out.println(numarulIntrodus - 12.3);
        System.out.println(numarulIntrodus * -3.2);
        System.out.println(numarulIntrodus / 4);
        System.out.println(numarulIntrodus % 6);
        System.out.println();
    }

    static void exercitiul08() {
        System.out.println("EX 8");
        int x = 2;
        int y = 12;
        //primul comment trebuia sters pentru ca rezultatul sa fie 12 si 2
        y = x + y;
        x = y - x;
        y = y - x;
        System.out.println(x);
        System.out.println(y);
        System.out.println();
    }
}
