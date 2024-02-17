package timeeaPop.tema2;

import java.util.*;

public class javaTema2Exercitii {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
//        exercitiul01();
//        exercitiul02();
//        exercitiul03();
//        exercitiul04();
//        exercitiul05();
//        exercitiul06();
//        exercitiul07();
//        exercitiul08();
//        exercitiul09();
    }
    static void exercitiul01() {
        System.out.print("Introdu un numar: ");
        int numarulIntrodusDeLaTastatura = scanner.nextInt();
        int randomNumber = new Random(100).nextInt();
        System.out.println("Numarul introdus este: " + numarulIntrodusDeLaTastatura);
        System.out.println("Numarul random este: " + randomNumber);

        if(numarulIntrodusDeLaTastatura < randomNumber){
            System.out.println("Numarul introdus este mai mic decat " + randomNumber);
        } else if (randomNumber > numarulIntrodusDeLaTastatura){
            System.out.println("Numarul introdus este mai mare decat " + randomNumber);
        }
    }

    static void exercitiul02() {
        System.out.println("Introdu un caracter: ");
        char caracterulIntrodusDeLaTastatura = scanner.next().charAt(0); //charAt(0) assumes that the user enters only one character; if the user enters more than one character, only the first one will be considered.
        System.out.println("Introdu primul numar: ");
        double primulNumar = scanner.nextDouble();
        System.out.println("Introdu al doilea numar: ");
        double alDoileaNumar = scanner.nextDouble();

        switch (caracterulIntrodusDeLaTastatura){
            case 'a':
                System.out.println("Adaugare: " + (primulNumar + alDoileaNumar));
                break;

            case 's':
                System.out.println("Scadere: " + (primulNumar - alDoileaNumar));
                break;

            case 'i':
                System.out.println("Inmultire: " + (primulNumar * alDoileaNumar));
                break;

            case 'p':
                System.out.println("Impartire: " + (primulNumar / alDoileaNumar));
                break;

            case 'm':
                System.out.println("Modul: " + (primulNumar % alDoileaNumar));
                break;

            default:
                System.out.println("Nu s-a introdus niciun caracter valid!");
        }
    }


    static void exercitiul03() {

        String [][] array = {
                {"Ana","Marcela","Sanda"},
                {"Ioana","Alex","Gigel","Sandu","Mihai"}
        };

        for(int i = 0; i < array.length; i++){ //initializam i si ii dam conditie ca atata timp cat ii mai mic decat lungimea arrayului sa execute ce urm
            String primaValoare = array[i][0]; // [i] reprezinta randul curent care ii iterat si [0] ii primu element de pe linia respectiva
            String aDouaValoare = array[i][array[i].length-1];// array[i].length ii folosit sa ne dea lungimea randului current si -1 => indexul ultimului elem. pt ca noi pornim de la 0
            System.out.println(primaValoare);
            System.out.println(aDouaValoare);
        }
    }

    static void exercitiul04() {
        char [] arrayDeCharuri = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j'};
        System.out.println();

        for (int i = 1; i < arrayDeCharuri.length; i = i+2) {
//            i=1, pentru ca incepem de la al doilea index, si primu index ii 0
//            i < arrayDeCharuri ii conditia de opririe, adica sa se opreasca la final daca a depasit lungimea arrayului
//            i = i+2 pentru ca trb sa ajunga la fiecare al doilea caracter in array
            System.out.println(arrayDeCharuri[i]);
        }
    }

    static void exercitiul05() {
        double [] arrayDeDouble = {1.5, 2.5, 3.5, 4.5, 5.5, 6.5, 7.5, 8.5, 9.5};

        for (int i = 0; i < arrayDeDouble.length; i++){
            if( arrayDeDouble[i] == 4.5){ // trb comparat daca arrayDouble[i] e egal cu 4.5 ca sa verifice ca acel element de la indexu respectiv ii 4.5, si nu i simplu cum am scris prima oara
                System.out.println("Elementul 4.5 este prezent la pozitia/index: " + i);
            } else if (arrayDeDouble[i] > 5) {
                System.out.println("Element peste 5");
                break;
            }
        }
    }

    static void exercitiul06() {
        int [] arrayDeInturi = {0,1,2,3,4,5,6,7,8,9};
        for (int i = 0; i < arrayDeInturi.length; i++) {
            if (i == 2){
                System.out.println("Iteratia a ajuns la elementul de pe pozitia 2 si s-a sarit peste");
                continue;// cu 'continue' sare peste
            } else if (i == 7) {
                System.out.println("Iteratia a ajuns la elementul de pe pozitia 7 si s-a oprit");
                break;
            } else {
                System.out.println("Index valid:");
            }
            System.out.println(arrayDeInturi[i]);
        }
    }

    static void exercitiul07() {
        List<Integer> listaDeInturi = new ArrayList<>();
        listaDeInturi.add(10);
        listaDeInturi.add(20);
        listaDeInturi.add(30);
        listaDeInturi.add(40);
        listaDeInturi.add(50);

        int sum = 0;
        for (Integer num : listaDeInturi) { // initializam var sum cu 0, si iteram prin fiecare element din lista
            sum += num; // dupa care se adauga fiecare nr la var sum, care face suma tuturor elementelor
        }
        System.out.println("Suma elementelor este: " + sum);
    }

    static void exercitiul08() {
        int [] array = {1,2,3,4,5,6,7,8,9,10};

        List<String> stringList = new ArrayList<>();
        //List<String> stringList = List.of("unu", "doi");
        stringList.add("unu");
        stringList.add("doi");
        stringList.add("trei");
        stringList.add("patru");
        stringList.add("cinci");
        stringList.add("sase");
        stringList.add("sapte");
        stringList.add("opt");
        stringList.add("noua");
        stringList.add("zece");

        if (array.length == 0){ // luam tot array ul si vedem daca are elemente, iar daca e 0, atunci inseamna ca array ul e gol
            System.out.println("Array-ul nu are elemente.");
        } else {
            System.out.println("Array-ul are " + array.length + " elemente.");
        }

        if (stringList.isEmpty()) {
            System.out.println("Lista nu are elemente.");
        } else {
            System.out.println("Lista are " + stringList.size() + " elemente."); //stringList.size() determinam lungimea listei
        }
    }

    static void exercitiul09() {
        int [] arrayDeNumere = {1,2,3,4,5,12,14,18,13,20,16,11};

        System.out.println("Ordine Crescatoare:");
        Arrays.sort(arrayDeNumere);// sorteaza numerele
        for (int i = 0; i < arrayDeNumere.length; i++) {

            System.out.println(arrayDeNumere[i]);
        }
        System.out.println("Ordine Descrescatoare:");
        Arrays.sort(arrayDeNumere);
        for (int j = arrayDeNumere.length - 1; j >=0 ; j--) { // for an array of length 'n', valid indices are from 0 to 'n-1'

            System.out.println(arrayDeNumere[j]);
        }
    }
}
