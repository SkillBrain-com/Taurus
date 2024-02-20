package CristianSandu.java1;

public class Java1 {

    // psvm
    // main

    public static void main(String[] args) {
        // camelCase
        // anotherVariable
        // anotherVariableName
//        extracted();
//        int number = 1; // are doar stari
//        String nume = "Popescu";  // au stari si comportamente
//        System.out.println(nume);
//        System.out.println(nume.toLowerCase());
//        System.out.println(nume.toUpperCase());
//        System.out.println(nume.charAt(0));
//        System.out.println(number);
//        String prenume = "Bogdan";
//        System.out.println(nume+ " " + prenume);
                                            // true       :     false
//        String isGreaterThan5 = 4 > 5 ? "Yes it's greater": "No it's not";
//        System.out.println(isGreaterThan5);
//        int a = 10;
//        System.out.println(a++);
//        System.out.println(++a);
//        System.out.println(--a);
//        System.out.println(a--);
        // a++ -> use variable a after do ++
        // ++a -> do ++ then use variable

//        sayHello();

        String numeComplet = numePrenume("Ion", "Creanga");
        int i = giveMeNumber(10);
        System.out.println(numeComplet);
        System.out.println(i);
        giveMeAnotherNumber();

    }

    // void -> nu contine cuvantul return
    // altceva in afara de void -> cotine cuvantul return;

    static void giveMeAnotherNumber() {
        System.out.println(Math.random());
    }

    static String numePrenume(String nume, String prenume) {
        String numeIntreg = nume + prenume;
        return numeIntreg;
    }

    static int giveMeNumber(int number) {
        int Number = number * 10;
        System.out.println(Number);
        return Number;
    }

    static void sayHello() {
        System.out.println("Hello!");
    }


    public void doSomething() {
        System.out.println("doing something");
    }



    private static void e() {
        byte smallNumber =5;
        short mediumNumber = 5;
        int numarInteg = 5;
        long bigNumber = 5000L;
        float floatNumber = 5.5f; // floating point number
        // float - 32 biti
        double decimalNumber = 9.65;  // double - 64 biti
        char character = 'M';
        boolean isTrue = true;
        boolean isFalse = false;

        System.out.println( mediumNumber + numarInteg);
        System.out.println( numarInteg - bigNumber);
        System.out.println( floatNumber * decimalNumber);
        System.out.println( floatNumber / decimalNumber);
        System.out.println(character);
    }


}

