package kateaManoila.Java1;

import java.util.Scanner;

public class Tema1 {

    public static void main(String[] args) {


        ex1();
        ex2();
        ex3();
        ex4();
        myVariables_ex5();
        ex6();
        ex7();
        ex8();

    }


    // 1.Scrieți un program care afiseaza “Imi place Java”
    static void ex1 () {
        System.out.println("Imi place java");

    }


    //2.Scrieti un program care afiseaza de 6 ori propozitia “Cursul acesta este foarte fain!”
    static void ex2 (){
        System.out.println("Cursul acesta este foarte fain");
        System.out.println("Cursul acesta este foarte fain");
        System.out.println("Cursul acesta este foarte fain");
        System.out.println("Cursul acesta este foarte fain");
        System.out.println("Cursul acesta este foarte fain");
        System.out.println("Cursul acesta este foarte fain");
    }


    //3.Ana are 24 de ani. Fratele ei, David, e cu 6 ani mai mic.
    // Scrieti un program care afiseaza varsta lui David.
    static void ex3(){
        int ana = 24;
        int david = ana - 6;
        System.out.println("Varsta lui David este:" + david);
    }


    //4.Scrieti un program in care cititi o propozitie de la tastatura
    static void ex4 (){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Scrie sirul de cuvinte");
        String sir = scanner.nextLine();
        System.out.println("Sirul introdus este:" + sir);

    }


    //5.Scrieti un program in care definiti 3 variabile in metoda “myVariables”, un int, un
    //String si un boolean, apoi apelati metoda din metoda “main”
    static  void myVariables_ex5(){
        System.out.println("ex5");
        int numarIntreg = 23;
        String text = "text rendom";
        boolean isTrue = true;
        System.out.println("Variabila int:" +numarIntreg);
        System.out.println("Variabila String:" + text);
        System.out.println("Variabila boolean:" +isTrue);

    }


    // 6.Scrieti un program in care creati o metoda unde cititi 2 numere de la tastatura, le
    //stocati in variabile, si dupa ce le-ati citit, afisati-le pe ecran.
    static void ex6 (){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introdu te rog un numar!");
        int numarTastatura =  scanner.nextInt();
        System.out.println(" Introdu te rog inca un numar!");
        int numarTastatura2 = scanner.nextInt();
        System.out.println("Felicitari numarul  introdus este" + " " + numarTastatura);
        System.out.println("Felicitari numarul  introdus este" + " " + numarTastatura2);

    }


    //7.Scriți un program in care creati o metoda unde cititi 2 numere de la tastatura, le
    //stocati in variabile, si dupa ce le-ati citit, afisati-le pe ecran.
    //7.Scrieti un program incare cititi de la tastatura un numar, si
    //calculati:
    //- rezultatul sumei cu 5
    //- rezultatul scaderii cu 12.3
    //- rezultatul inmultirii cu -3.2
    //- rezultatul impartirii cu 4
    //- rezultatul modulului cu 6
    static void ex7(){
        // Introdu te rog numarul dorit pentru calcul.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introdu te rog numarul dorit pentru calcul.");
        int numarGenerat=scanner.nextInt();
        System.out.println(numarGenerat + 5);
        System.out.println(numarGenerat - 12.3);
        System.out.println(numarGenerat * (-3.2));
        System.out.println(numarGenerat / 4);
        System.out.println("Rezultatele dvs au fost afisate!");
    }


    //8.Stergeti un singur comment din programul acesta in asa fel incat rezultatul afisat sa
    //fie 12 si 2:
    static void ex8(){
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
