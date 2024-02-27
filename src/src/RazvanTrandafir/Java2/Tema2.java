package RazvanTrandafir.Java2;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Tema2 {

    public static void main(String[] args) {

//        ex1(new Scanner(System.in));
//        ex2(new Scanner(System.in));
//        ex3();
//        ex4();
//        ex5();
        ex6();
//        ex7();
//        ex8();
//        ex9();
    }

    static void ex1(Scanner scanner) {
        System.out.println("Introduceti un numar");
        int numarEx1 = scanner.nextInt();
        Random random = new Random();
        int numarRand = random.nextInt(100);
        if (numarEx1 < numarRand) {
            System.out.println("Numarul introdus este mai mic decat " + numarRand);
        } else {
            System.out.println("Numarul introdus este mai mare decat " + numarRand);
        }
    }

    static void ex2(Scanner scanner) {
        System.out.println("Introduceti un caracter");
        char caracter = scanner.next().charAt(0);
        System.out.println("Introduceti primul numar");
        double primulNr = scanner.nextDouble();
        System.out.println("Introduceti al doilea numar");
        double alDoileaNr = scanner.nextDouble();

        switch (caracter) {
            case 'a':
                System.out.println("Rezultatul adunarii numerelor " + primulNr + " si " + alDoileaNr + " este: "
                        + (primulNr + alDoileaNr));
                break;
            case 's':
                System.out.println("Rezultatul scaderii numerelor " + primulNr + " si " + alDoileaNr + " este: "
                        + (primulNr - alDoileaNr));
                break;
            case 'i':
                System.out.println("Rezultatul inmultirii numerelor " + primulNr + " si " + alDoileaNr + " este: "
                        + (primulNr * alDoileaNr));
                break;
            case 'p':
                if (alDoileaNr == 0) {
                    System.out.println("Eroare: Impartire la zero.");
                } else {
                    System.out.println("Rezultatul impartirii numerelor " + primulNr + " si " + alDoileaNr + " este: "
                            + (primulNr / alDoileaNr));
                }
                break;
            case 'm':
                System.out.println("Rezultatul modulului numerelor " + primulNr + " si " + alDoileaNr + " este: "
                        + (primulNr % alDoileaNr));
                break;
            default:
                System.out.println("Caracterul introdus nu este valid");

        }
    }

    static void ex3() {
        int[][] array = {{1, 2, 3}, {4, 5, 6, 7, 8}};
        System.out.println("Primele elemente din fiecare array sunt: " + array[0][0] + " si " + array[1][0]);
        System.out.println("Ultimele elenede din fiecare array sunt: " + array[0][2] + " si " + array[1][4]);
    }

    static void ex4() {
        char[] charArray = {'a', 'b', 'c', 'd', 'e'};
        for (int i = 0; i < charArray.length; i++)
            if (i % 2 == 1)
                System.out.println("Fiecare al doilea caracter din sir este: " + charArray[i]);
    }

    static void ex5() {
        double[] doubleArray = {1.5, 2, 3.5, 5, 2.5, 1, 5.5, 4.5};
        for (double numar : doubleArray)
            if (numar == 4.5) {
                System.out.println("Numarul este 4.5");
            } else if (numar > 5) {
                System.out.println("Numarul " + numar + " este mai mare de 5.");
            }
    }

    static void ex6() {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        for (int i = 0; i < array.length; i++) {
            if (i == 2) {
                continue;
            } else if (i == 7) {
                break;
            } else {
                System.out.println("Index invalid: " + i);
            }
        }
    }

    static void ex7() {
        List<Integer> lista = Arrays.asList(1, 2, 3, 4, 5);
        int suma = 0;
        for (int numar : lista) {
            suma += numar;
        }
        System.out.println("Suma elementelor din lista este: " + suma);
    }

    static void ex8() {
        int[] array = new int[5];
        List<Integer> lista = new java.util.ArrayList<>();
        System.out.println("Array gol? " + (array.length == 0));
        System.out.println("Lista goala? " + lista.isEmpty());
    }

    static void ex9() {
        double[] arrayDouble = {2, 6, 5.8, 84.1, 93, 17.1, 25.3, 27, 32.3, 99.9, 20};
        Arrays.sort(arrayDouble);
        System.out.println("Array dupa sortare crescatoare: " + Arrays.toString(arrayDouble));
    }

}
