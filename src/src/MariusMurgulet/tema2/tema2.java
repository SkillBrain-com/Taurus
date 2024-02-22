package MariusMurgulet.tema2;

import java.util.*;

public class tema2 {
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
    static void ex1(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write a number:");
        int numar = scanner.nextInt();
        Random rand = new Random();
        int numarRandom = rand.nextInt(100);
        if (numar>numarRandom){
            System.out.println("The number you wrote is bigger than the random number between 1-100: " + numarRandom);
        } else{
            System.out.println("The number you wrote is smaller than the random number between 1-100: " + numarRandom);
        }

    }
    static void ex2(){
        Scanner input = new Scanner(System.in);
        System.out.println("Please insert a charater from this range: a, s, i, p or m");
        char litera = input.next().charAt(0);
        // se poate renunta
        if( litera !='a' && litera != 's' && litera != 'i' && litera !='p' && litera != 'm'){
            System.out.println("Error: invalid character!");
            return;
        }
        Scanner number = new Scanner(System.in);

        System.out.println("Please insert the first number");
        int firstnumber = number.nextInt();

        System.out.println("Please insert the second number");
        int secondnumber = number.nextInt();

        switch (litera){
            case 'a':{
                System.out.println("Adaugare:"  + (firstnumber+secondnumber));
                break;
            }
            case 's':{
                System.out.println("Scadere:"  + (firstnumber-secondnumber));
                break;
            }
            case 'i':{
                System.out.println("Inmultire:"  + (firstnumber*secondnumber));
                break;
            }
            case 'p':{
                System.out.println("Impartire:"  + (firstnumber/secondnumber));
                break;
            }
            case 'm':{
                System.out.println("Modul:"  + (firstnumber%secondnumber));
                break;
            }
        }
    }
    static void ex3(){
        String [][] fructe = {{"mar","para","prune"},{"banane","kiwi","zmeura","cirese","visine"}};
        System.out.println(fructe[0][0]);
        System.out.println(fructe[0][2]);

        System.out.println(fructe[1][0]);
        System.out.println(fructe[1][4]);
    }
    static void ex4(){
        char [] charaters = {'1','2','3','4','5','6','7'};

        for (int i=1; i<charaters.length; i+=2){
            System.out.println("Caracterul de pe pozitia " + i + " este " + charaters[i]);
        }

    }
    static void ex5(){
        double[] doubleArray = {1.5, 3.5, 4.5, 5.5, 6.5, 7.5};
        for (int i = 0; i < doubleArray.length; i++) {
            if (doubleArray[i] == 4.5) {
                System.out.println("Elementul " + i + "=" + doubleArray[i] +" este egal cu " + doubleArray[i]);
            }
            if(doubleArray[i]>5){
                System.out.println("Elementul " + i + "=" + doubleArray[i] +" este mai mare decat 5.");
            }

        }

    }
    static void ex6(){
        int[] numere = {1,2,3,4,5,6,7,8,9};
        //int i=0;
        for(int i=0; i<numere.length; i++){
            if(i==2){
                continue;
            } if (i==7){
                break;
            }
            else{
                System.out.println("Index valid-elementul de la indexul " + i + " este " + numere[i]);
            }
        }

    }
    static void ex7(){
        ArrayList<Integer> myNumbers = new ArrayList<>();
        myNumbers.add(1);
        myNumbers.add(2);
        myNumbers.add(3);
        myNumbers.add(4);
        myNumbers.add(5);
        int summyNumbers = 0;

        int i = 0;
        do{
            summyNumbers = summyNumbers+myNumbers.get(i);
            i++;
        }
        while(i<myNumbers.size());
        System.out.println("Lista:" +myNumbers);
        System.out.println("Suma elementelor este " + summyNumbers);

    }
    static void ex8(){
            // Definirea și inițializarea array-ului și listei
            Integer[] array = {1,2,3,4,5};
            List<Integer> lista = new ArrayList<>();
            lista.add(6);
            lista.add(6);
            lista.add(6);
        // Verificarea dacă array-ul este gol
        if (array.length == 0) {
            System.out.println("Array-ul este gol.");
        } else {
            System.out.println("Array-ul nu este gol.");
        }
        // Verificarea dacă lista este goală
        if (lista.isEmpty()) {
            System.out.println("Lista este goală.");
        } else {
            System.out.println("Lista nu este goală.");
        }

    }
    static void ex9(){
        Integer [] array = {29,12,36,36,54,1,5};
       Arrays.sort(array);
        System.out.println("Elements of array sorted in ascending order:" + Arrays.toString(array));
//        for(int i=0; i< array.length; i++){
//            System.out.println(array[i]);
//        }
        Arrays.sort(array,Collections.reverseOrder()); // gresit
        System.out.println("Elements of array sorted in descending order:" + Arrays.toString(array));
    }

}


