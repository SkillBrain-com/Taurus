package AdinaPecie.JavaBasic2;

import java.util.*;


public class Tema2 {

    public static void main(String[] args) {
        ex1();
        ex2();
        ex3();
        ex4();
        ex5();
        ex6();
        //ex7();
        ex8();
        ex9();
    }

    public static void ex1() {

        /*Citit un numar de la tastatura si stocati valoarea lui intr-o variabila.
  Generati un numar random intre 1 si 100 si stocati acel numar intr-o alta variabila.
  Daca numarul introdus de la tastatura este mai mic decat numarul random generat,
  afisati mesajul “Numarul introdus este mai mic decat <numar_random>” (
  inserati valoarea numarului random generat in textul afisat).
 */
        System.out.println("Enter your number:");
        Scanner scanner = new Scanner(System.in);
        int numar_introdus = scanner.nextInt();
        Random random = new Random();
        int numar_random = random.nextInt(1, 100);
        System.out.println("Random number is:" +" "+ numar_random);
        if (numar_introdus < numar_random) {
            System.out.println("Numar introdus este mai mic decat:" + numar_random);
        }


    }

    public static void ex2() {

        System.out.println("Enter your character:");
        Scanner scanner = new Scanner(System.in);
        char character = scanner.next().charAt(0);
        System.out.println("Enter number 1:");
        int numar1 = scanner.nextInt();
        System.out.println("Enter number 2:");
        int numar2 = scanner.nextInt();

        switch (character) {
            case 'a': {
                System.out.println("Display adunare=" + (numar1 + numar2));
            }
            break;
            case 's': {
                System.out.println("Display scadere = " + (numar1 - numar2));
            }
            break;
            case 'i': {
                System.out.println("Display inmultire =" + (numar1 * numar2));
            }
            break;
            case 'p':
                if (numar2 != 0) {
                    System.out.println("Display impartire = " + numar1 / numar2);
                } else {
                    System.out.println("Cannot be divided by 0");
                }
                break;
            default: {
                System.out.println("The character is not right");
            }

        }
    }

    public static void ex3() {
        int[][] curs = {{1, 2, 3, 4, 5}, {6, 7, 8, 9, 10}, {11, 12, 13, 14, 15}};
        System.out.println(curs[0][0]);
        System.out.println(curs[0][4]);
        System.out.println(curs[1][0]);
        System.out.println(curs[1][4]);
        System.out.println(curs[2][0]);
        System.out.println(curs[2][4]);
    }

    public static void ex4() {
        Character[] litere = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i'};
        for (int i = 0; i < litere.length; i += 2) {
            System.out.println("Se afiseaza elementele array ului din 2 in 2 astfel: " + litere[i]);
        }
    }

    public static void ex5() {
        double[] zecimale = {1.2, 26.8, -3.4, 4.5, 6.9, 9d};
        for (int i = 0; i < zecimale.length; i++) {
            if (zecimale[i] == 4.5) {
                System.out.println("Afiseaza pe ecran valoarea " + zecimale[i]);
            }
            if (zecimale[i] > 5) {
                System.out.println(zecimale[i] + " element mai mare ca 5");
            }

        }
    }
    public static void ex6() {
        int [] numere = {1,2,3,4,5,6,7,8,9};
        for (int i=0; i<numere.length; i++) {
            if (i==2) {
                continue;
            }
            if (i == 7) {
                break;
            }
            System.out.println("Index valid");
        }

    }
    /*public static void ex7() {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(11);
        list.add(20);
        list.add(35);
        list.add(40);

        int suma = 0;
        for (int j=0, j < list.size(), ++j);
            suma = suma + list(j);
        }

        System.out.println("Suma elementelor din lista este: " + suma);
    }*/

    public static void ex8() {

        String[] array = {"mere", "pere", "ananas"};
        ArrayList<String> lista = new ArrayList<>();
        lista.add("fructe");
        lista.add("legume");
        lista.add("lactate");


        if (array.length == 0) {
            System.out.println("Array-ul este gol.");
        } else {
            System.out.println("Array-ul nu este gol.");
        }

        if (lista.isEmpty()) {
            System.out.println("Lista este goală.");
        } else {
            System.out.println("Lista nu este goală.");
        }


    }
    public static void ex9() {
        Integer[] array = {-9, 8, 9, 1, -3, 6,5,0,1};

        Arrays.sort(array);
        System.out.println("Array sorted in ascending order: " + Arrays.toString(array));

        Arrays.sort(array, Collections.reverseOrder());
        System.out.println("Array sorted in descending order: " + Arrays.toString(array));
    }


}






