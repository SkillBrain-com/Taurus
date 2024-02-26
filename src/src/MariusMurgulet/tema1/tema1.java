package MariusMurgulet.tema1;

import java.util.Scanner;
public class tema1 {
    public static void main(String[] args) {
    ex1();
    ex2();
    ex3();
    ex4();
    myVariables();
    ex6();
    ex7();
    ex8();
    }
    static void ex1() {
        System.out.println("Imi place Java");
        System.out.println("---------------");
    }
    static void ex2(){
        System.out.println("Imi place Java");
        System.out.println("Imi place Java");
        System.out.println("Imi place Java");
        System.out.println("Imi place Java");
        System.out.println("Imi place Java");
        System.out.println("Imi place Java");
    }
    static void ex3(){
        System.out.println("Ana are 24 de ani.");
        System.out.println("Fratele ei David este cu 6 ani mai mic ");
        int varsta_Ana= 24;
        int varsta_David=varsta_Ana-6;
        System.out.println("David are varsta de "+ varsta_David + " ani.");
    }
    static void ex4(){
        System.out.println("Scrieti ceva");
        Scanner citire_tastatura = new Scanner(System.in);
        String sir_de_caractere_citit = citire_tastatura.nextLine();
        System.out.println(sir_de_caractere_citit);

    }
        static void myVariables() {
            int a = 5;
            String titlu = "Cartea mea preferata!";
            boolean test = true;

            System.out.println(a);
            System.out.println(titlu);
            System.out.println(test);
        }


    static void ex6(){
        System.out.println("Scrieti doua numere: ");
        Scanner numar1 = new Scanner(System.in);
        int x = numar1.nextInt();
        Scanner numar2 = new Scanner(System.in);
        int y = numar2.nextInt();
        System.out.println("Primul numar este x= "+x);
        System.out.println("Al doilea numar este y=" +y);
    }
    static void ex7(){
        System.out.println("Introduceti de la tastatura un numar");
        Scanner scanner = new Scanner(System.in);
        double x = scanner.nextDouble();
        double suma = x + 5;
        double scadere = x - 12.3;
        double inmultire = x * -3.2;
        double impartire = x / 4;
        double modulo = x % 6;


        System.out.println("Suma dintre primul numar si al doilea este " + suma);
        System.out.println("Scaderea dintre primul numar si al doilea este " + scadere);
        System.out.println("Inmultirea dintre primul numar si al doilea este " + inmultire);
        System.out.println("IMpartirea dintre primul numar si al doilea este " + impartire);
        System.out.println("Modulo este " + modulo);


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
