package kateaManoila.Java2.TemaDeAcasa2;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Tema2 {
    public static void main(String[] args) {
        ex1();
        ex2();
        ex3();
        ex4();
        ex5();
        ex6();
        ex7();
        ex8();
        ex9();

    }


    //1. Citit un numar de la tastatura si stocati valoarea lui intr-o variabila.
    // Generati un numar random intre 1 si 100 si stocati acel numar intr-o alta variabila.
    // Daca numarul introdus de la tastatura este mai mic decat numarul random generat,
    // afisati mesajul “Numarul introdus este mai mic decat <numar_random>”
    // (inserati valoarea numarului random generat in textul afisat).


    public static void ex1() {
        System.out.println("----EXERCITIU 1 ---");
        Scanner number = new Scanner(System.in);
        System.out.println("Introduceti un numar de la tastatura:");
        int numarCitit = number.nextInt();
        Random numar = new Random();
        int numarRandom = numar.nextInt();
        System.out.println("Numarul aliatoriu ales este:" + numarRandom);
        if (numarCitit < numarRandom) {
            System.out.println("Numar introdus este mai mic decit" + numarRandom);
        } else {
            System.out.println("Numarul introdus este mai mare decit" + numarRandom);
        }
    }

    //2. Citit un caracter si 2 numere de la tastatura, si stocati-le in variabile.
    // Folosind structura switch, daca s-a introdus un caracter anume,
    // realizati operatia respectiva cu cele 2 numere, si afisati rezultatul pe ecran:-‘a’:
    // adaugare-‘s’: scadere-‘i’: inmultire-‘p’: impartire-‘m’:
    // modulDaca nu s-a introdus un caracter valid, afisati un mesaj de eroare.

    public static void ex2() {
        System.out.println("---EXZERCITIU 2---");
        Scanner numarAles = new Scanner(System.in);
        int numar1 = numarAles.nextInt();
        System.out.println("Introduceti al doilea numae :");
        int numar2 = numarAles.nextInt();
        System.out.println("Introduceti o operatie la alegere:'a','s','i','p','m':");
        Scanner caracter = new Scanner(System.in);
        char simbol = caracter.nextLine().charAt(0);

        switch (simbol) {
            case 'a':
                System.out.println(numar1 + numar2);
                break;
            case 's':
                System.out.println(numar1 > numar2 ? numar1 - numar2 : numar2 - numar1);
                break;
            case 'i':
                System.out.println(numar1 * numar2);
                break;
            case 'p':
                System.out.println(numar1 / numar2);
                break;
            case 'm':
                System.out.println(numar1 % numar2);
                break;
            default:
                System.out.println("Eroare!");
        }


    }

    //3. Definiti un array de 2 dimensiuni,
    // fiecare dimensiune sa aiba cate 3, respectiv 5 elemente.
    // Initializati array-ul. Afisati primele si ultimele elemente
    // din fiecare dimensiune pe ecran.
    public static void ex3() {
        System.out.println("---EXZERCITIU 3--");
        int[][] sirNumere = {{1, 2, 3, 4, 5}, {6, 7, 8, 9, 10}, {11, 12, 13, 14, 15}};
        System.out.println(sirNumere[0][0]);
        System.out.println(sirNumere[2][4]);
    }


    //4. Definiti un array de char-uri.
    // Iterati array-ul folosind structura for,
    // si afisati pe ecran cate al doilea caracter din sir

    public static void ex4() {
        System.out.println("---EXERCITIU 4---");
        char[] sirCaractere = {'a', 'b', 'c', 'd', 'e'};
        for (int i = 1; i < sirCaractere.length; i += 2) {
            System.out.println(sirCaractere[i]);
        }
    }


    //5. Definiti un array de double, cu valori zecimale.
    // Iterati array-ul folosind strutura for,
    // si daca un element este egal cu valoarea 4.5, afisati-l pe ecran.
    // Daca un element este mai mare decat 5, afisati mesajul “Element peste 5”
    public static void ex5() {
        System.out.println("---EXZERCITIU 5--");
        double[] sirDouble = {4.5, 3.2, 5.5, 3.8, 8.4};
        for (double v : sirDouble) {
            if (v == 4.5) {
                System.out.println(v);
            }
            if (v > 5) {
                System.out.println("Element peste 5");
            }
        }

    }


    //6. Definiti un array cu 9 elemente
    // si parcugeti-l cu structura for (tipul de date este la alegere).
    // Daca iteratia este la indexul 2, sa se sara peste.
    // Daca iteratia este la indexul 7, sa se opreasca iteratia.
    // Altfel, sa se afiseze mesajul “Index valid” pe ecran.
    public static void ex6() {
        System.out.println("---EXZERCITIU 6--");
        String[] numeAngajati = {"Vasile", "Ion", "Ana", "Cezar", "Katea", "Natalia", "Mihai",
                "Cristian", "Alina"};
        for (int i = 0; i < numeAngajati.length; i++) {
            if (i == 2) {
                continue;
            }
            System.out.println(numeAngajati[i]);
            if (i == 7) {
                System.out.println("Index valid");
                break;
            }
        }
    }


    //7. Definiti o lista de Integer, de 5 elemente. Calculati suma tuturor elementelor.

    public static void ex7() {
        System.out.println("---EXZERCITIU 7 ---");
        int[] numbers = {40, 22, 56, 12, 78};
        int suma = 0;
        for (int i = 0; i < numbers.length; i++) {
            suma += numbers[i];
        }
        System.out.println("Suma elementelor este:" + suma);

    }


    //8. Definiti un array si o lista. Determinati daca ele sunt goale sau nu.
    public static void ex8() {
        System.out.println("---EXZERCITIU 8--");
        int[] numere = new int[0];
        ArrayList<String> nume = new ArrayList<>();
        int lungimeLista = nume.size();
        int lungimeArray = numere.length;
        System.out.println(lungimeArray == 0 ? "Sirul este gol" : "Sirul are"
                + lungimeArray + "elemente");
        System.out.println(lungimeLista == 0 ? "Lista este goala" : "Lista are" + lungimeLista
                + "element");


    }

    public static void ex9() {
        System.out.println("---EXZERCITIU 9---");
        int[] numereIntregi = {3, 5, 8, 1, 89, 34, 12};
        System.out.println("Sirul de numere intregi este:");
        for (int element : numereIntregi) {
            System.out.println(element);
        }
        for (int i = numereIntregi.length; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (numereIntregi[j] > numereIntregi[j + 1]) {
                    int swat = numereIntregi[j];
                    numereIntregi[j] = numereIntregi[j + 1];
                    numereIntregi[j + 1] = swat;
                }

            }
        }
        System.out.println("Sirul de numere dupa stocare eswte:");
        for (int element : numereIntregi) {
            System.out.println(element);
        }
    }

}



