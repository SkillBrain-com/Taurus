package RazvanTrandafir.Java1;

public class Java1 {
    // psvm
    // main
    public static void main(String[] args) {

        // camelCase
        // anotherVariable
        // anotherVariableName

        // System.out.println(Integer.MAX_VALUE);
        // System.out.println(Integer.MIN_VALUE);
        // extracted();

        int number = 1;
        String nume = "Popescu";  // click dreapta pe nume > refactor > rename *wink*
//        System.out.println(nume);
//        System.out.println(nume.toLowerCase());
//        System.out.println(nume.toUpperCase());
//        System.out.println(nume.charAt(0));
//        System.out.println(number);

//        String prenume = "Bogdan";
//        System.out.println(nume + " " + prenume);
//                                            // true     :    false
//        String isGreaterThan5 = 4 > 5 ? "Yes it's greater": "No it's not";
//        System.out.println(isGreaterThan5);


//        int a = 10;
//        System.out.println(a++);
//        System.out.println(++a);
//        System.out.println(a--);
//        System.out.println(--a);
//        // a++ => use variable then use ++
//        // ++a => use ++ then use variable

        sayHello();
    }

    static void sayHello() {
        System.out.println("Hello!");
    }

    static String numePrenume(String nume, String prenume) {
        String numeIntreg = nume + prenume;
        return numeIntreg;
    }


    private static void extracted() {
        byte smallNumber = 5;
        short mediumNumber = 5;
        int numarIntreg = 5;
        long bigNumber = 432432543L;  // daca chiar am nevoie de long, trebuie L mare la final
        float floatNumber = 5.5f;  // floating point number
        // float = 32 biti
        double decimalNumber = 9.65;  // double = 64 biti
        char genul = 'M';
        boolean isTrue = true;
        boolean isFalse = false;

        System.out.println(mediumNumber + bigNumber);
        System.out.println(mediumNumber - smallNumber);
        System.out.println(mediumNumber);
        System.out.println(floatNumber);
        System.out.println(decimalNumber);
    }


}
