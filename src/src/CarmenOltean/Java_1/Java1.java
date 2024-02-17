package CarmenOltean.Java_1;

import java.util.Scanner;

public class Java1 {
    public static void main(String[] args){
        ex_1();
        ex_2();
        ex_3();
        ex_4();
        myVariables();
        ex_6();
        ex_7();
        ex_8();
    }

    static void ex_1(){
        //Scrieti un program care afiseaza “Imi place Java”
        System.out.println("Imi place Java");
    }

    static void ex_2(){
        //Scrieti un program care afiseaza de 6 ori propozitia “Cursul acesta este foarte fain!”
        String sentence = "Cursul acesta este foarte fain!";
        for (int i=0; i<6; i++){
            System.out.println(sentence);
        }
    }
    static void ex_3(){
        // Ana are 24 de ani. Fratele ei, David, e cu 6 ani mai mic. Scrieti un program care afiseaza varsta lui David.
        int anaAge = 24;
        int davidAge = anaAge-6;
        System.out.println("Varsta lui David este:" + " " + davidAge);
    }

    static void ex_4(){
        // Scrieti un program in care cititi o propozitie de la tastatura
        System.out.println("Enter a sentence:");
        Scanner scanner = new Scanner(System.in);
        String sentence = scanner.nextLine();
    }

    static void myVariables(){
        // Scrieti un program in care definiti 3 variabile in metoda “myVariables”, un int, un
        //String si un boolean, apoi apelati metoda din metoda “main”
        int myInt = 2929;
        String myString = "This is a string variable";
        boolean myBoolean = true;
        System.out.println(myInt);
        System.out.println(myString);
        System.out.println(myBoolean);
    }
    static void ex_6(){
        // Scrieti un program in care creati o metoda unde cititi 2 numere de la tastatura, le
        //stocati in variabile, si dupa ce le-ati citit, afisati-le pe ecran.
        System.out.println("Enter the first number:");
        Scanner scanner = new Scanner(System.in);
        int firstNumber = scanner.nextInt();
        System.out.println("Enter the second number:");
        double secondNumber = scanner.nextDouble();
        System.out.println("The first number is:" + firstNumber);
        System.out.println("The second number is:" + secondNumber);
    }
    static void ex_7(){
        // Scrieti un program in care cititi de la tastatura un numar, si calculati:
        //      - rezultatul sumei cu 5
        //      - rezultatul scaderii cu 12.3
        //      - rezultatul inmultirii cu -3.2
        //      - rezultatul impartirii cu 4
        //      - rezultatul modulului cu 6
        System.out.println("Enter the number");
        Scanner scanner = new Scanner(System.in);
        double number = scanner.nextDouble();
        double suma = number+5;
        double scadere = number-12.3;
        double inmultire = number * -3.2;
        double impartire = number/4;
        double modul = number%6;

        System.out.println("Rezultatul sumei este:" + suma);
        System.out.println("Rezultatul scaderii este:"+ scadere);
        System.out.println("Rezultatul inmultirii este:"+inmultire);
        System.out.println("Rezultatul impartirii este:"+impartire);
        System.out.println("Rezultatul modulului este:"+modul);

    }

    static void ex_8(){
        int x = 2;
        int y = 12;
        // y = x * y;
        y = x + y;
        x = y - x;
        y = y - x;

        System.out.println(x);
        System.out.println(y);
    }

}

