package MarianCocea.Java2;

import java.util.*;

public class Tema2 {
    public static void main(String[] args) {
        Ex1();
        Ex2();
        Ex3();
        Ex4();
        Ex5();
        Ex6();
        Ex7();
        Ex8();
        Ex9();
    }
//1. Citit un numar de la tastatura si stocati valoarea lui intr-o variabila.
// Generati un numar random intre 1 si 100 si stocati acel numar intr-o alta variabila.
// Daca numarul introdus de la tastatura este mai mic decat numarul random generat,
// afisati mesajul “Numarul introdus este mai mic decat <numar_random>”
// (inserati valoarea numarului random generat in textul afisat).

    public static void Ex1() {
        System.out.println("Ex.1");
        Scanner Number = new Scanner(System.in);
        System.out.println("Introduceti un numar:");
        int numarA = Number.nextInt();
        Random randomnumber = new Random();
        int numarR = randomnumber.nextInt(1, 101);
        System.out.println("Numarul Ales este: " + numarA);
        System.out.println("Numarul Random este: " + numarR);
        if
        (numarA < numarR) {
            System.out.println("Numarul ales este mai mic decat " + numarR);
        } else {
            System.out.println("Numarul ales este mai mare decat " + numarR);
        }

    }

//2. Citit un caracter si 2 numere de la tastatura, si stocati-le in variabile. Folosind structura switch,
// daca s-a introdus un caracter anume, realizati operatia respectiva cu cele 2 numere, si afisati rezultatul pe ecran:
//-‘a’: adaugare
//-‘s’: scadere
//-‘i’: inmultire
//-‘p’: impartire
//-‘m’: modul
//Daca nu s-a introdus un caracter valid, afisati un mesaj de eroare.

    public static void Ex2() {
        System.out.println("Ex.2");
        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Introduceti primul numar:");
        int numar1 = scanner2.nextInt();
        System.out.println("Introduceti al 2 lea numar:");
        int numar2 = scanner2.nextInt();
        System.out.println("Introduceti simbolul operatiei de executat: a / s / i / p / m");
        Scanner scanner2C = new Scanner(System.in);
        String caracter = scanner2C.nextLine();
        int a = numar1 + numar2;
        int s = numar1 - numar2;
        int i = numar1 * numar2;
        int p = numar1 / numar2;
        float m = numar1 % numar2;
        switch (caracter) {
            case "a":
                System.out.println("Rezultatul adunarii este " + a);
                break;
            case "s":
                System.out.println("Rezultatul scaderii este " + s);
                break;
            case "i":
                System.out.println("Rezultatul inmultirii este " + i);
                break;
            case "p":
                System.out.println("Rezultatul impartirii este " + p);
                break;
            case "m":
                System.out.println("Rezultatul modul este " + m);
                break;
            default:
                System.out.println("Simbolul introdus nu se regaseste in cele de mai sus");
        }
    }

//3. Definiti un array de 2 dimensiuni, fiecare dimensiune sa aiba cate 3, respectiv 5 elemente. Initializati array-ul.
// Afisati primele si ultimele elemente din fiecare dimensiune pe ecran.

    public static void Ex3() {
        System.out.println("Ex.3");
        Integer[][] numAray = {{11, 12, 13}, {21, 22, 23, 24, 25}};
        System.out.println(numAray[0][0]);
        System.out.println(numAray[0][2]);
        System.out.println(numAray[1][0]);
        System.out.println(numAray[1][4]);
    }
//4. Definiti un array de char-uri. Iterati array-ul folosind structura for,
// si afisati pe ecran cate al doilea caracter din sir.

    public static void Ex4() {
        System.out.println("Ex.4");
        char[] charAray = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h'};
        for (int i = 1; i < charAray.length; i = i + 2) {
            System.out.println(charAray[i]);
        }
    }

    //5. Definiti un array de double, cu valori zecimale. Iterati array-ul folosind strutura for,
// si daca un element este egal cu valoarea 4.5, afisati-l pe ecran.
// Daca un element este mai mare decat 5, afisati mesajul “Element peste 5”
    public static void Ex5() {
        System.out.println("Ex.5");
        double[] dbAray = {3.2, 6.9, 4.5, 1.3, 9.5, 0.4};
        for (int i = 0; i < dbAray.length; i++) {
            if (dbAray[i] == 4.5) {
                System.out.println("Pozitia " + i + " contine 4.5");
            } else if (dbAray[i] > 5) {
                System.out.println("La pozitia " + i + " avem element peste 5");
            }
        }
    }

    //6. Definiti un array cu 9 elemente si parcugeti-l cu structura for (tipul de date este la alegere).
// Daca iteratia este la indexul 2, sa se sara peste. Daca iteratia este la indexul 7, sa se opreasca iteratia.
// Altfel, sa se afiseze mesajul “Index valid” pe ecran.
    public static void Ex6() {
        System.out.println("Ex.6");
        double[] dbAray = {3.2, 6, 2, 4.5, 7, 9, 5, 0.4, 6.7};
        int i;
        for (i = 0; i < dbAray.length; i++) {
            if (i == 2) {
                System.out.println("Iteratia a ajuns la pozitia care contine " + i + ". Iteratia continua.");
                continue;
            } else if (i == 7) {
                System.out.println("Iteratia a ajuns la pozitia care contine " + i + ". Iteratia s-a oprit.");
                break;
            }
        }
    }

    //7. Definiti o lista de Integer, de 5 elemente. Calculati suma tuturor elementelor.
    public static void Ex7() {
        System.out.println("Ex.7");
        List<Integer> integerList = new ArrayList<>();
        integerList.add(1);
        integerList.add(2);
        integerList.add(3);
        integerList.add(4);
        integerList.add(5);
        int sum = 0;
        for (Integer numar : integerList) {
            sum += numar;
        }
        System.out.println("Suma elementelor este: " + sum);
    }

    //8. Definiti un array si o lista. Determinati daca ele sunt goale sau nu.
    public static void Ex8() {
        System.out.println("Ex.8");
        int[][] BiArray = {{1, 2, 3}, {10, 20, 30, 40, 50}};
        List<String> culori = new ArrayList<>();
        culori.add("verde");
        culori.add("rosu");
        culori.add("albastru");
        culori.add("mov");
        String rezultatA = (BiArray.length == 0) ? "Array-ul este gol" : "Array-ul contine " + BiArray.length + " elemente";
        System.out.println(rezultatA);
        String rezultatL = (culori.isEmpty()) ? "Lista este goala" : "Lista are " + culori.size() + " elemente";
        System.out.println(rezultatL);
    }

    //9. Definiti o metoda care ia un array de numere (intregi sau cu virgula) si sa-l ordoneze crescator sau descrescator.
    public static void Ex9() {
        System.out.println("Ex.9");
        double[] ListaA = {1.58, 20.5, 3.6, 20, 30, 0.5, 50};
        Arrays.sort(ListaA);
        System.out.printf(" ListaA crescator : %s", Arrays.toString(ListaA));
        System.out.printf(" ListaA crescator : %s", Arrays.toString(ListaA));
    }
}