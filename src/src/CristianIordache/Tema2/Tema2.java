package CristianIordache.Tema2;

import java.util.*;

public class Tema2 {
    public static void main(String[] args) {
        exercitiul1();
        exercitiul2();
        exercitiul3();
        exercitiul4();
        exercitiul5();
        exercitiul6();
        exercitiul7();
        exercitiul8();
        exercitiul9();
    }

    //Citit un numar de la tastatura si stocati valoarea lui intr-o variabila.
// Generati un numar random intre 1 si 100 si stocati acel numar intr-o alta variabila.
// Daca numarul introdus de la tastatura este mai mic decat numarul random generat,
// afisati mesajul “Numarul introdus este mai mic decat <numar_random>”
// (inserati valoarea numarului random generat in textul afisat).
    static void exercitiul1() {
        Scanner keyboard_input = new Scanner(System.in);
        int keyboard_number;
        int random_number = 15;

        System.out.print("Type a number: ");
        keyboard_number = keyboard_input.nextInt();
        System.out.println("Random number: " + random_number);
        if (keyboard_number < random_number) {
            System.out.println("Numarul introdus este mai mic decat 15");
        }
    }

    //Cititi un caracter si 2 numere de la tastatura, si stocati-le in variabile. Folosind structura switch, daca s-a introdus un caracter anume, realizati operatia respectiva cu cele 2 numere, si afisati rezultatul pe ecran:
//-‘a’: adaugare
//-‘s’: scadere
//-‘i’: inmultire
//-‘p’: impartire
//-‘m’: modul
//Daca nu s-a introdus un caracter valid, afisati un mesaj de eroare.
    static void exercitiul2() {
        Scanner keyboard_input = new Scanner(System.in);
        char letter;
        int number1;
        int number2;
        System.out.print("Type a letter: ");
        letter = keyboard_input.next().charAt(0);
        System.out.print("Type first number: ");
        number1 = keyboard_input.nextInt();
        System.out.print("Type second number: ");
        number2 = keyboard_input.nextInt();

        switch (letter) {
            case 'a':
                System.out.println("Adunare: " + (number1 + number2));
                break;
            case 's':
                System.out.println("Scadere: " + (number1 - number2));
                break;
            case 'i':
                System.out.println("Inmultire: " + (number1 * number2));
                break;
            case 'p':
                System.out.println("Impartire: " + (number1 / number2));
                break;
            case 'm':
                System.out.println("Modul: " + (number1 % number2));
                break;
            default:
                System.out.println("Eroare: niciun caracter valid");
        }
    }

    //Definiti un array de 2 dimensiuni, fiecare dimensiune sa aiba cate 3,
// respectiv 5 elemente. Initializati array-ul.
// Afisati primele si ultimele elemente din fiecare dimensiune pe ecran.
    static void exercitiul3() {
        int[][] arr = {{1, 2, 3}, {4, 5, 6, 7, 8}};
        System.out.println(arr[0][0]);
        System.out.println(arr[1][0]);
        System.out.println(arr[0][2]);
        System.out.println(arr[1][4]);
    }

    //Definiti un array de char-uri. Iterati array-ul folosind structura for,
// si afisati pe ecran cate al doilea caracter din sir.
    static void exercitiul4() {
        char[][] arr = {{'A', 'B', 'C'}, {'X', 'Y', 'Z'}, {'1', '2', '3'}};

        for (int i = 0; i < arr.length; i++) {
            char[] currentString = arr[i];
            if (currentString.length > 1) {
                System.out.println("Al doilea caracter din sirul " + i + " este: " + currentString[1]);
            } else {
                System.out.println("Sirul " + i + " are mai puțin de 2 caractere.");
            }
        }
    }

    //Definiti un array de double, cu valori zecimale.
// Iterati array-ul folosind strutura for, si daca un element este egal
// cu valoarea 4.5, afisati-l pe ecran. Daca un element este mai mare decat 5,
// afisati mesajul “Element peste 5”
    static void exercitiul5() {
        double[] arr = {3.2, 4.5, 7.1, 9.7, 1.9};

        for (int i = 0; i < arr.length; i++) {
            double currentNumber = arr[i];

            if (currentNumber == 4.5) {
                System.out.println("Elementul " + currentNumber + " este egal cu 4.5");
            }

            if (currentNumber > 5) {
                System.out.println("Elementul " + currentNumber + " este mai mare decât 5");
            }
        }
    }
    //Definiti un array cu 9 elemente si parcugeti-l cu structura for
// (tipul de date este la alegere). Daca iteratia este la indexul 2,
// sa se sara peste. Daca iteratia este la indexul 7, sa se opreasca iteratia.
// Altfel, sa se afiseze mesajul “Index valid” pe ecran.
    static void exercitiul6() {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        for (int i = 0; i < arr.length; i++) {
            if (i == 2) {

            } else if (i == 7) {
                break;

            } else {
                System.out.println("Index valid: " + i);
            }
        }
    }
    //Definiti o lista de Integer, de 5 elemente. Calculati suma tuturor elementelor.
    static void exercitiul7() {
        List<Integer> lista = new ArrayList<>();
        lista.add(3);
        lista.add(7);
        lista.add(35);
        lista.add(78);
        lista.add(120);

        int suma = 0;
        for (Integer numar : lista) {
            suma += numar;
        }
        System.out.println("Suma tuturor elementelor din lista este: " + suma);
    }

    //Definiti un array si o lista. Determinati daca ele sunt goale sau nu.
    static void exercitiul8() {
        int[] array = {1, 2, 3, 4, 5};

        if (array.length == 0) {
            System.out.println("Array-ul este gol.");
        } else {
            System.out.println("Array-ul NU este gol.");
        }

        List<Integer> lista = new ArrayList<>();

        if (lista.isEmpty()) {
            System.out.println("Lista este goală.");
        } else {
            System.out.println("Lista NU este goală.");
        }
    }

    //Definiti o metoda care ia un array de numere (intregi sau cu virgula)
// si sa-l ordoneze crescator sau descrescator.
    static void exercitiul9() {
        Integer[] array = {3, 7, 1, 6, 5, 9};

        sortArrayAscending(array);
        System.out.println("Array sorted in ascending order: " + Arrays.toString(array));

        sortArrayDescending(array);
        System.out.println("Array sorted in descending order: " + Arrays.toString(array));
    }
    static void sortArrayAscending(Integer[] array) {
        Arrays.sort(array);
    }
    static void sortArrayDescending(Integer[] array) {
        Arrays.sort(array, Collections.reverseOrder());
    }
}

