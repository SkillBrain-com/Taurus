package StefanBatrinache.Tema1;
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
        ex8();
    }

    static void ex1 () {
        System.out.println("Imi place Java!");

    }

    static void ex2(){
        System.out.println("Cursul acesta este foarte fain!");
        System.out.println("Cursul acesta este foarte fain!");
        System.out.println("Cursul acesta este foarte fain!");
        System.out.println("Cursul acesta este foarte fain!");
        System.out.println("Cursul acesta este foarte fain!");
        System.out.println("Cursul acesta este foarte fain!");
    }

    static void ex3(){

        int virsta_ana = 24;
        int virsta_david = virsta_ana - 6;

        System.out.println("Varsta David = " + virsta_david);
    }

    static void ex4(){
        Scanner citirea_tastatura = new Scanner(System.in);
        String sir_de_caractere_citit = citirea_tastatura.nextLine();
        System.out.println("Proprozitia citita de la tastatura este: " + sir_de_caractere_citit);
    }

    static void ex5() {

        int intreg = 1;
        String sir_de_caractere = "taurus";
        boolean valoare_booleana = true;

        System.out.println("intreg:" + intreg);
        System.out.println("nume grupa:" + sir_de_caractere);
        System.out.println("valoare_booleana:" + valoare_booleana);
    }

    static void ex6(){
        Scanner citirea_tastatura = new Scanner(System.in);
        double numar1 = citirea_tastatura.nextDouble();
        double numar2 = citirea_tastatura.nextDouble();
        System.out.println("numar1 = " + numar1);
        System.out.println("numar2 = " + numar2);
    }

    static void ex7(){
        Scanner citirea_tastatura = new Scanner(System.in);
        double numar = citirea_tastatura.nextDouble();

        System.out.println("suma = " + (numar + 5));
        System.out.println("scaderea = " + (numar - -3.2));
        System.out.println("inmultirea = " + (numar * -3.2));
        System.out.println("impartirea = " + (numar / 4));
        System.out.println("modulului = " + (numar % 6));
    }

    static void ex8(){
        int x = 2;
        int y = 12;

        y = x * y;
        y = x + y;
        x = y - x;
        y = y - x;

        System.out.println(x);
        System.out.println(y);

    }


}


