package CarmenOltean.Java_2;

import java.util.*;

public class Exercises {

    static void exercise_1() {
        // Cititi un numar de la tastatura si stocati valoarea lui intr-o variabila.
        // Generati un numar random intre 1 si 100 si stocati acel numar intr-o alta variabila.
        // Daca numarul introdus de la tastatura este mai mic decat numarul random generat, afisati mesajul
        // “Numarul introdus este mai mic decat <numar_random>” (inserati valoarea numarului random generat in textul afisat).

        System.out.println("Enter a number:");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        System.out.println("Generate a random number:");
        Random random = new Random();
        int randomNumber = random.nextInt(100);
        System.out.println("The random number is:" + randomNumber);

        if (number < randomNumber) {
            System.out.println("Numarul introdus este mai mic decat numarul random" + randomNumber);
        } else {
            System.out.println("Numarul introdus nu este mai mic decat numarul random:");
        }

    }

    static void exercise_2() {
        //Cititi un caracter si 2 numere de la tastatura, si stocati-le in variabile.
        // Folosind structura switch, daca s-a introdus un caracter anume, realizati operatia respectiva cu cele 2 numere,
        // si afisati rezultatul pe ecran:
        //-‘a’: adaugare
        //-‘s’: scadere
        //-‘i’: inmultire
        //-‘p’: impartire
        //-‘m’: modul
        //Daca nu s-a introdus un caracter valid, afisati un mesaj de eroare.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a character:");
        String character = scanner.nextLine();

        System.out.println("Enter the first number:");
        int firstNumber = scanner.nextInt();

        System.out.println("Enter the second number:");
        int secondNumber = scanner.nextInt();

        switch (character) {
            case "a": {
                int rezultatAdaugare = firstNumber + secondNumber;
                System.out.println("Rezultatul adaugarii este:" + rezultatAdaugare);
                break;
            }
            case "s": {
                int rezultatScadere = firstNumber - secondNumber;
                System.out.println("Rezultatul scaderii este:" + rezultatScadere);
                break;
            }
            case "i": {
                int rezultatInmultire = firstNumber * secondNumber;
                System.out.println("Rezultatul inmultirii este:" + rezultatInmultire);
                break;
            }
            case "p": {
                int rezultatImpartire = firstNumber / secondNumber;
                System.out.println("Rezultatul impartirii este:" + rezultatImpartire);
                break;
            }
            case "m": {
                int rezultatModul = firstNumber % secondNumber;
                System.out.println("Rezultatul modulului este:" + rezultatModul);
                break;
            }
            default: {
                System.out.println("Invalid character-no operation performed");
            }
        }


    }

    static void exercise_3() {
        //Definiti un array de 2 dimensiuni, fiecare dimensiune sa aiba cate 3, respectiv 5 elemente.
        // Initializati array-ul. Afisati primele si ultimele elemente din fiecare dimensiune pe ecran.
        int array[][] = {
                {29, 45, 54, 92, 36},
                {2, 3, 4, 5, 6},
                {11, 22, 33, 44, 55}
        };
        for (int i = 0; i < array.length; i++) {
            System.out.println("Primul element din randul" + (i + 1) + "este:" + array[i][0]);
            System.out.println("Ultimul element din randul" + (i + 1) + "este:" + array[i][array.length + 1]);

        }
    }

    static void exercise_4() {
        //Definiti un array de char-uri. Iterati array-ul folosind structura for, si afisati pe ecran cate al doilea caracter din sir.
        char array[] = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h'};
        for (int i = 1; i < array.length; i += 2) {
            System.out.println("Elementul de la pozitia" + i + "este:" + array[i]);

        }

    }

    static void exercise_5() {
        //Definiti un array de double, cu valori zecimale.
        // Iterati array-ul folosind strutura for, si daca un element este egal cu valoarea 4.5, afisati-l pe ecran.
        // Daca un element este mai mare decat 5, afisati mesajul “Element peste 5”
        double array[] = {1.1, 3.5, 29.6, 4.5, 7.7, 11.2, 4.5};
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 4.5) {
                System.out.println("Elementul de la pozitia " + i + "este egal cu 4.5");
            } else if (array[i] > 5) {
                System.out.println("Elementul de la pozitia " + i + "este mai mare decat 5");

            } else {
                System.out.println("Elementul de la pozitia " + i + "este " + array[i]);
            }

        }
    }

    static void exercise_6() {
        //Definiti un array cu 9 elemente si parcugeti-l cu structura for (tipul de date este la alegere).
        // Daca iteratia este la indexul 2, sa se sara peste.
        // Daca iteratia este la indexul 7, sa se opreasca iteratia. Altfel, sa se afiseze mesajul “Index valid” pe ecran.
        int array[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        for (int i = 0; i < array.length; i++) {
            if (i == 2) {
                continue;
            } else if (i == 7) {
                break;
            } else {
                System.out.println("Index valid - elementul de la pozitia " + i + "este:" + array[i]);
            }
        }
    }

    static void exercise_7() {
        //Definiti o lista de Integer, de 5 elemente. Calculati suma tuturor elementelor.
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(-2);
        list.add(3);
        list.add(-3);
        int i = 0;
        Integer sum = 0;
        do {
            sum = sum + list.get(i);
            i++;
        }
        while (i < list.size());
        System.out.println("Suma elementelor din lista este:" + sum);

    }

    static void exercise_8() {
        //Definiti un array si o lista. Determinati daca ele sunt goale sau nu.
        int[] array = {};
       /* int [] array = new int[2];
        array[0] = 2;
        array[1] = 29;*/
        ArrayList<Integer> lista = new ArrayList<>();
        // lista.add(6);
        // lista.add(8);

        if (array.length == 0) {
            System.out.println("The array is empty.");
        } else {
            System.out.println("The array is not empty.");
        }

        if (lista.isEmpty()) {
            System.out.println("The list is empty.");
        } else {
            System.out.println("The list is not empty");
        }
    }

    static void exercise_9() {
        //Definiti o metoda care ia un array de numere (intregi sau cu virgula)
        // si sa-l ordoneze crescator sau descrescator.

        Integer [] array = {11, 4, 9, 7, 1, 29};

        Arrays.sort(array);
        System.out.println("Array sorted in ascending order:" + Arrays.toString(array));

        Arrays.sort(array, Collections.reverseOrder());
        System.out.println("Array sorted in descending order:" + Arrays.toString(array));

    }


    public static void main(String[] args) {
       // exercise_1();
       // exercise_2();
       // exercise_3();
       // exercise_4();
       // exercise_5();
       // exercise_6();
       // exercise_7();
       //  exercise_8();
        //exercise_9();
    }
}


