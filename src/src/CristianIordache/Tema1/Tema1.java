package CristianIordache.Tema1;

import java.util.Scanner;

public class Tema1 {
    public static void main(String[] args) {
        exercitiul1();
        exercitiul2();
        exercitiul3();
        exercitiul4();
        exercitiul5();
        exercitiul6();
        exercitiul7();
        exercitiul8();

    }
    //Stergeti un singur comment din programul acesta in asa fel incat rezultatul afisat sa
//fie 12 si 2:
    static void exercitiul8(){
        int x = 2;
        int y = 12;

        // y = x * y;
        y = x + y;

        x = y - x;
        y = y - x;

        System.out.println(x);
        System.out.println(y);

    }
    //Scrieti un program incare cititi de la tastatura un numar, si
    //calculati:
    //
    //        - rezultatul sumei cu 5
    //
    //        - rezultatul scaderii cu 12.3
    //
    //        - rezultatul inmultirii cu -3.2
    //
    //        - rezultatul impartirii cu 4
    //
    //        - rezultatul modulului cu 6
    static void exercitiul7(){
        Scanner keyboard_input = new Scanner(System.in);
        double numar = keyboard_input.nextDouble();
        System.out.println("suma =" + (numar + 5));
        System.out.println("scadere =" + (numar - 12.3));
        System.out.println("inmultire =" + (numar * -3.2));
        System.out.println("impartire =" + (numar / 4));
        System.out.println("modul =" + (numar % 6));

    }
    //Scrieti un program in care creati o metoda unde cititi 2 numere de la tastatura, le
//stocati in variabile, si dupa ce le-ati citit, afisati-le pe ecran.
    static void exercitiul6(){
        Scanner keyboard_input = new Scanner(System.in);
        int numar1 = keyboard_input.nextInt();
        int numar2 = keyboard_input.nextInt();
        System.out.println("numar1 =" + numar1);
        System.out.println("numar2 =" + numar2);

    }
    //Scrieti un program in care definiti 3 variabile in metoda “myVariables”, un int, un
//String si un boolean, apoi apelati metoda din metoda “main”
    static void exercitiul5(){

        int a = 5;
        System.out.println(a);
        boolean b = true;
        System.out.println(b);
        String c = "Bau bau";
        System.out.println(c);

    }
    //Scrieti un program in care cititi o propozitie de la tastatura
    static void exercitiul4(){
        Scanner keyboard_input = new Scanner(System.in);
        String keyboard_reading = keyboard_input.nextLine();
        System.out.println(keyboard_reading);

    }
    //Ana are 24 de ani. Fratele ei, David, e cu 6 ani mai mic. Scrieti un program care afiseaza varsta lui David.
    static void exercitiul3(){
        int David = 24 - 6;
        System.out.println("David are varsta de " + David + " ani");
    }
    //Scrieti un program care afiseaza de 6 ori propozitia “Cursul acesta este foarte fain!”
    static void exercitiul2(){
        System.out.println("Cursul acesta este foarte fain!");
        System.out.println("Cursul acesta este foarte fain!");
        System.out.println("Cursul acesta este foarte fain!");
        System.out.println("Cursul acesta este foarte fain!");
        System.out.println("Cursul acesta este foarte fain!");
        System.out.println("Cursul acesta este foarte fain!");

    }
    //Scrieti un program care afiseaza “Imi place Java”
    static void exercitiul1(){
        System.out.println("Imi place java");

    }
}

