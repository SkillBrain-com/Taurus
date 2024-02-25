package MadalinaCatona.Tema2.Exercises.src;//Creati un nou Repl , si rezolvati fiecare subpunct intr-o metoda din clasa Main:
import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
public class Main {
    public static void main(String[] args) {

        //1.Citit un numar de la tastatura si stocati valoarea lui intr-o variabila.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti un nr:");
        int numarIntroodus = scanner.nextInt();
        // Generati un numar random intre 1 si 100 si stocati acel numar intr-o alta variabila.
        Random random = new Random();
        int numarRandom = random.nextInt(100) + 1;
        // Daca numarul introdus de la tastatura este mai mic decat numarul random generat,
        // afisati mesajul “Numarul introdus este mai mic decat <numar_random>”
        // (inserati valoarea numarului random generat in textul afisat).
        if (numarIntroodus < numarRandom) {
            System.out.println("Nr introdus este < decat" + numarRandom);
        } else {
            System.out.println("Nr introdus nu este < decat" + numarRandom);
        }

        //2.Cititi un caracter si 2 numere de la tastatura, si stocati-le in variabile.
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Introduceti un caracter:");
        char operatie = scanner1.next().charAt(0);
        System.out.println("Introduceti primul nr:");
        int numar1 = scanner1.nextInt();
        System.out.println("Introduceti al doilea nr:");
        int nr2 = scanner1.nextInt();
        // Folosind structura switch, daca s-a introdus un caracter anume,
        // realizati operatia respectiva cu cele 2 numere, si afisati rezultatul pe ecran:
        //-‘a’: adaugare
        //-‘s’: scadere
        //-‘i’: inmultire
        //-‘p’: impartire
        //-‘m’: modul
        //Daca nu s-a introdus un caracter valid, afisati un mesaj de eroare.
        switch (operatie) {
            case 'a':
                System.out.println("Suma este:" + (numar1 + nr2));
                break;
            case 's':
                System.out.println("Diferenta este:" + (numar1 - nr2));
                break;
            case 'i':
                System.out.println("Produsul este:" + (numar1 * nr2));
                break;
            case 'p':
                if (nr2 != 0) {
                    System.out.println("Deimpartitul este:" + ((double) numar1 / nr2));
                    System.out.println("Nu se poate imparti la zero.");
                }
                break;
            case 'm':
                if (nr2 != 0) {
                    System.out.println("Modulul este:" + (numar1 % nr2));
                }
                break;
            default:
                System.out.println("Caracterul introdus nu este valid.");

                //3.Definiti un array de 2 dimensiuni, fiecare dimensiune sa aiba cate 3,
                // respectiv 5 elemente.
                // Initializati array-ul.
                int[][] array = {
                        {1, 2, 3, 4, 5},
                        {6, 7, 8, 9, 10},
                        {11, 12, 13, 14, 15}
                };
                //Afisati primele si ultimele elemente din fiecare dimensiune pe ecran.
                for (int i = 0; i < array.length; i++) {
                    System.out.println("Primul element din randul " + (i + 1) + "este: " + array[i][0]);
                    System.out.println("Ultimul element din randul " + (i + 1) + "este: " +
                            array[i][array[i].length - 1]);
                }

                //4.Definiti un array de char-uri.
                char[] arr = {'a', 'b', 'c', 'd', 'e', 'f', 'g'};
                // Iterati array-ul folosind structura for,
                // si afisati pe ecran cate al doilea caracter din sir.
                for (int i = 1; i < arr.length; i += 2) {
                    System.out.println("Caracterul este: " + arr[i]);
                }

                //5.Definiti un array de double, cu valori zecimale.
                // Iterati array-ul folosind strutura for, si daca un element este egal cu valoarea 4.5,
                // afisati-l pe ecran. Daca un element este mai mare decat 5, afisati mesajul
                // “Element peste 5”
                double[] arra = {1.3, 4.2, 3.0, 5.1, 1.8, 4.8};
                for (int i = 0; i < arra.length; i++) {
                    if (arra[i] == 4.5) {
                        System.out.println("Elementul este: " + arra[i]);
                    }
                    if (arra[i] > 5) {
                        System.out.println("Element peste 5");
                    }
                }

                //6.Definiti un array cu 9 elemente si parcugeti-l cu structura for
                // (tipul de date este la alegere). Daca iteratia este la indexul 2,
                // sa se sara peste. Daca iteratia este la indexul 7, sa se opreasca
                // iteratia. Altfel, sa se afiseze mesajul “Index valid” pe ecran.
                int[] ar = {1, 2, 3, 4, 5, 6, 7, 8, 9};
                for (int i = 0; i < ar.length; i++) {
                    if (i == 2) {
                        continue;
                    }
                    if (i == 7) {
                        break;
                    }
                    System.out.println("Index valid");
                }

                //7.Definiti o lista de Integer, de 5 elemente. Calculati suma tuturor elementelor.
                List<Integer> lista = Arrays.asList(1, 2, 3, 4, 5);
                int suma = 0;
                for (Integer element : lista) {
                    suma += element;
                }
                System.out.println("Suma elem din lista este: " + suma);

                //8.Definiti un array si o lista. Determinati daca ele sunt goale sau nu.
                int[] arrays = {};
                List<Integer> lista1 = new ArrayList<>();
                if (arrays.length == 0) {
                    System.out.println("Array-ul este gol.");
                } else {
                    System.out.println("Array-ul nu este gol.");
                }
                if (lista1.isEmpty()) {
                    System.out.println("Lista este goală.");
                } else {
                    System.out.println("Lista nu este goală.");
                }

                //9.Definiti o metoda care ia un array de numere (intregi sau cu virgula)
                //si sa-l ordoneze crescator sau descrescator.
                Integer[] array1 = {3, 1, 7, 4, 6, 9};
                sortArrayAscending(array1);
                System.out.println("Array sortare ascendenta: " + Arrays.toString(array1));
                sortArrayDescending(array1);
                System.out.println("Array sortare descendenta: " + Arrays.toString(array));
        }
    }
    public static void sortArrayAscending(Integer[] array1) {

    }
    public static void sortArrayDescending(Integer[] array1) {
    }
}