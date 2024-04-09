package MarianCocea.Java1;

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

    //1. Scrieti un program care afiseaza “Imi place Java”
        public static void ex1() {
            System.out.println ("Ex.1");
                System.out.println("Imi place Java");
    }

    //2. Scrieti un program care afiseaza de 6 ori propozitia “Cursul acesta este foarte fain!”
       public static void ex2() {
           System.out.println ("Ex.2");
        String text = "Cursul acesta este foarte fain";
        for (int i = 0; i < 6; i++)
            System.out.println(text);
    }

    //3. Ana are 24 de ani. Fratele ei, David, e cu 6 ani mai mic. Scrieti un program care afiseaza varsta lui David.
        public static void ex3() {
            System.out.println ("Ex.3");
        int x = 24;
        int y = 6;
        System.out.println("Ana are " + x + " ani. Fratele ei, David, care e cu " + y + " ani mai mic, are varsta de " + (x - y) + " ani.");
    }

    //4. Scrieti un program in care cititi o propozitie de la tastatura
    public static void ex4() {
        System.out.println ("Ex.4");
        System.out.println("Scrieti numarul mai jos");
        Scanner nrTastatura = new Scanner(System.in);
        String inputString = nrTastatura.nextLine();
        System.out.println(inputString);
    }

    //5. Scrieti un program in care definiti 3 variabile in metoda “myVariables”, un int, un String si un boolean, apoi apelati metoda din metoda “main”
    public static void ex5() {
        System.out.println ("Ex.5");
        int a = 10;
        double b = 100.01;
        boolean ceva = (a > b);
        System.out.println(a);
        System.out.println(b);
        System.out.println(ceva);
    }

    //6. Scrieti un program in care creati o metoda unde cititi 2 numere de la tastatura, le stocati in variabile, si dupa ce le-ati citit, afisati-le pe ecran.
    public static void ex6() {
        System.out.println ("Ex.6");
        System.out.println("Doua numere pe care le afisam");

        System.out.println("Primul numar este:");

        Scanner nr1 = new Scanner(System.in);
        double numar1 = nr1.nextDouble();

        System.out.println("Al doilea numar este:");

        Scanner nr2 = new Scanner(System.in);
        double numar2 = nr2.nextDouble();

        System.out.println("Primul numar este: " + numar1 + " si al doilea numar este: " + numar2);
    }

    //7. Scrieti un program incare cititi de la tastatura un numar, si calculati:
//            - rezultatul sumei cu 5
//            - rezultatul scaderii cu 12.3
//            - rezultatul inmultirii cu -3.2
//            - rezultatul impartirii cu 4
//            - rezultatul modulului cu 6
    public static void ex7() {
        System.out.println ("Ex.7");
        System.out.println("Numarul ales este:");

        Scanner tastat = new Scanner(System.in);
        double numar = tastat.nextDouble();

        System.out.println("suma cu 5 este: " + (numar + 5));
        System.out.println("scadere cu 12.3 este: " + (numar - 12.3));
        System.out.println("inmultire cu -3.2 este: " + (numar * (-3.2)));
        System.out.println("impartire cu 4 este: " + (numar / 4));
        System.out.println("modul cu 6 este: " + (numar % 6));
    }

//8. Stergeti un singur comment din programul acesta in asa fel incat rezultatul afisat sa fie 12 si 2:

    public static void ex8() {
        System.out.println ("Ex.8");
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