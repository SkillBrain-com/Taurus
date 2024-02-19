package madalinVoicu.tema2;

import java.util.*;
import java.util.Collections;


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


//    Citit un numar de la tastatura si stocati valoarea lui intr-o variabila. Generati un numar
//    random intre 1 si 100 si stocati acel numar intr-o alta variabila. Daca numarul introdus de la tastatura
//    este mai mic decat numarul random generat, afisati mesajul “Numarul introdus este
//    mai mic decat <numar_random>” (inserati valoarea numarului random generat in textul afisat).

    static void ex1() {
        Scanner sc = new Scanner(System.in);
        int numar = sc.nextInt();
        Random rand = new Random();
        int numar_random = rand.nextInt(100);
        System.out.println("Numarul random este: " + numar_random);
        if (numar < numar_random) {
            System.out.println("Numarul introdus este mai mic decat: " + numar_random);
        } else {
            System.out.println("Numarul introdus nu este mai mic decat " + numar_random);
        }
    }


    ////        Citit un caracter si 2 numere de la tastatura, si stocati-le in variabile.
////        Folosind structura switch, daca s-a introdus un caracter anume, realizati
////        operatia respectiva cu cele 2 numere, si afisati rezultatul pe ecran:
////        -‘a’: adaugare
////                -‘s’: scadere
////                -‘i’: inmultire
////                -‘p’: impartire
////                -‘m’: modul
////        Daca nu s-a introdus un caracter valid, afisati un mesaj de eroare.
//
    static void ex2() {
        Scanner sc2 = new Scanner(System.in);
        String caracter = sc2.nextLine();
        int primul_numar = sc2.nextInt();
        int al_doilea_numar = sc2.nextInt();
        int a, s, i, p;
        float m;
        switch (caracter) {
            case "a":
                a = primul_numar + al_doilea_numar;
                System.out.println("Rezultatul adunarii este: " + a);
                break;
            case "s":
                s = primul_numar - al_doilea_numar;
                System.out.println("Rezultatul scaderii este: " + s);
                break;
            case "i":
                i = primul_numar * al_doilea_numar;
                System.out.println("Rezultatul inmultirii este: " + i);
                break;
            case "p":
                p = primul_numar / al_doilea_numar;
                System.out.println("Rezultatul impartirii este: " + p);
                break;
            case "m":
                m = primul_numar % al_doilea_numar;
                System.out.println("Rezultatul modulului este: " + m);
                break;
        }
    }

    ////            Definiti un array de 2 dimensiuni, fiecare dimensiune sa aiba cate 3,
////            respectiv 5 elemente. Initializati array-ul. Afisati primele
////            si ultimele elemente din fiecare dimensiune pe ecran.
//
    static void ex3(){
        String[][] tari = {{"Romania", "Turcia", "Bulgaria"},{"Spania", "Italia", "Danemarca", "China", "America"}};
        System.out.println(tari[0][0]);
        System.out.println(tari[0][2]);
        System.out.println(tari[1][0]);
        System.out.println(tari[1][4]);


    }


//         Definiti un array de char-uri. Iterati array-ul folosind structura for,
//         si afisati pe ecran cate al doilea caracter din sir.

    static void ex4() {
        char[] caractere = {'a', 'b', 'c', 'd', 'e', 'f', 'g'};
        for (int i = 1; i < caractere.length; i = i + 2) {
            System.out.println(caractere[i]);

        }
    }


//          Definiti un array de double, cu valori zecimale. Iterati array-ul folosind strutura for, si
//          daca un element este egal cu valoarea 4.5, afisati-l pe ecran.
//          Daca un element este mai mare decat 5, afisati mesajul “Element peste 5”

    static void ex5() {
        double[] duble = {1.5, 2.3, 4.5, 3.6, 15.23, 126.33};

        int i;
        for (i = 0; i < duble.length; i++) {
            if(duble[i]==4.5){
                System.out.println(duble[i]);
            }
            else if(duble[i]>5){
                System.out.println("Element peste 5");
            }

        }
    }

//    Definiti un array cu 9 elemente si parcugeti-l cu structura for (tipul de date este la alegere).
//    Daca iteratia este la indexul 2, sa se sara peste.
//    Daca iteratia este la indexul 7, sa se opreasca iteratia. Altfel, sa se afiseze mesajul “Index valid” pe ecran.

    static void ex6(){
        int[] numere = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int i = 0; i < numere.length; i++) {
            if(i==2) {
//                System.out.println("Sarim indexul 2.");
                continue;
            }
            if(i==7){
                System.out.println("Iteratia s-a oprit!");
                break;
            }
            else{
                System.out.println("Index valid.");
            }
        }

    }

    //    Definiti o lista de Integer, de 5 elemente. Calculati suma tuturor elementelor.
    static void ex7(){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(10);
        list.add(15);
        list.add(20);
        list.add(25);
        int sum = 0;
        for(int numar : list){
//            sum = sum + numar;
            sum+=numar;
        }
        System.out.println("Suma elementelor listei este: " + sum);
    }

    //    Definiti un array si o lista. Determinati daca ele sunt goale sau nu.
    static void ex8(){
        int[] matrice = {1, 2, 3, 4};
        ArrayList<String> lista = new ArrayList<>();
        int size;
        if(matrice.length == 0){
            System.out.println("Array-ul matrice nu contine elemente.");
        }
        else{
            System.out.println("In array-ul matrice se regaseste un numar de elemente.");
        }
        if(lista.isEmpty()){
            System.out.println("Lista nu contine elemete.");
        }


    }


    //    Definiti o metoda care ia un array de numere (intregi sau cu virgula) si sa-l ordoneze crescator sau descrescator.
    static void ex9(){
        double[] numere = {1.0d, 72.5d, 3d, 22.56, 14, 123.23, 48, 90};

        System.out.println("Numerele inainte de ordonare sunt: ");
        System.out.println(Arrays.toString(numere));

//        for(double n : numere){
//            System.out.println(n);
//        }

        System.out.println("Numerele in ordine crescatoare sunt: ");
        Arrays.sort(numere);
        for(double crescator:numere){
            System.out.println(crescator);
        }

//        Arrays.sort(numere, Collections.reverseOrder());
//        System.out.println("array after sorted in reverse order: "
//                + Arrays.toString(numere));


    }



}

















