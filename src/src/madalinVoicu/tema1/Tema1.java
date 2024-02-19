package madalinVoicu.tema1;


import java.util.Scanner;

public class Tema1 {
    public static void main(String[] args) {
        ex1();
        ex2();
        ex3();
        ex4();
//    ex5
        myVariables();
        ex6();
        ex7();
        ex8();
    }

    //1. Scrieti un program care afiseaza “Imi place Java”
    static void ex1(){

        System.out.println("Imi place Java!");
    }

    //2. Scrieti un program care afiseaza de 6 ori propozitia “Cursul acesta este foarte fain!”
    static void ex2(){
        System.out.println("Cursul acesta este foarte fain!");
        System.out.println("Cursul acesta este foarte fain!");
        System.out.println("Cursul acesta este foarte fain!");
        System.out.println("Cursul acesta este foarte fain!");
        System.out.println("Cursul acesta este foarte fain!");
        System.out.println("Cursul acesta este foarte fain!");

    }

    //3. Ana are 24 de ani. Fratele ei, David, e cu 6 ani mai mic. Scrieti un program care afiseaza varsta lui David.
    static void ex3(){
        int Ana, David;
        Ana = 24;
        David = Ana - 6;
        System.out.println("Varsta lui David este:" + " " + David);

    }

    //4. Scrieti un program in care cititi o propozitie de la tastatura
    static void ex4(){
        Scanner citit_de_la_tastatura = new Scanner(System.in);
        String propozitie;
        propozitie = citit_de_la_tastatura.nextLine();
        System.out.println("Propozitia introdusa de la tastatura este: " + propozitie);
    }

    //5. Scrieti un program in care definiti 3 variabile in metoda “myVariables”, un int, un
//    String si un boolean, apoi apelati metoda din metoda “main”
    static void myVariables(){
        int a;
        a=12;
        String b;
        b="java is fun";
        boolean valoare = true;

        System.out.println(a);
        System.out.println(b);
        System.out.println(valoare);

    }

    //6. Scrieti un program in care creati o metoda unde cititi 2 numere de la tastatura, le
//    stocati in variabile, si dupa ce le-ati citit, afisati-le pe ecran.
    static void ex6(){
        Scanner numar_de_la_tastatura = new Scanner(System.in);
        System.out.println("Introduceti oricare 2 numere: ");
        int primul_numar;
        primul_numar = numar_de_la_tastatura.nextInt();
        int al_doilea_numar;
        al_doilea_numar = numar_de_la_tastatura.nextInt();
        System.out.println("Cele 2 numere sunt: " + primul_numar + " si " + al_doilea_numar);

    }

//7. Scrieti un program in care cititi de la tastatura un numar, si
//    calculati:
//            - rezultatul sumei cu 5
//            - rezultatul scaderii cu 12.3
//            - rezultatul inmultirii cu -3.2
//            - rezultatul impartirii cu 4
//            - rezultatul modulului cu 6

    static void ex7(){
        Scanner introdu_de_la_tastatura = new Scanner(System.in);
        System.out.println("Introduceti 1 numer de la tastatura: ");
        int numar;
        numar = introdu_de_la_tastatura.nextInt();
        int suma, impartire, modul;
        double scadere, inmultire;
        suma = numar + 5;
        scadere = numar - 12.3;
        inmultire = numar * -3.2;
        impartire = numar / 4;
        modul = numar % 6;
        System.out.println("Rezultatul sumei este: " + suma);
        System.out.println("Rezultatul scaderii este: " + scadere);
        System.out.println("Rezultatul inmultirii este: " + inmultire);
        System.out.println("Rezultatul impartirii este: " + impartire);
        System.out.println("Rezultatul modulului este: " + modul);

    }

//8. Stergeti un singur comment din programul acesta in asa fel incat rezultatul afisat sa
//    fie 12 si 2:

    static void ex8(){
        int x = 2;
        int y = 12;
        y = x + y;
        x = y - x;
        y = y - x;
        System.out.println(x);
        System.out.println(y);

    }


}


