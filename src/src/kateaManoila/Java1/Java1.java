package kateaManoila.Java1;

public class Java1 {

    public static void main(String[] args) {

////        extracted();
//        int number = 1; // are doar stari
//
//        String nume = "Manoila"; // are stari si comportamente
//        System.out.println(nume);
//        System.out.println(nume.toLowerCase());
//        System.out.println(nume.toUpperCase());
//        System.out.println(nume.charAt(0));
//        System.out.println(number);
//        String prenume ="Ecaterina";
//        System.out.println(nume+ " "+ prenume);
//
//        boolean isGreaterThan5 = 6>5;
//        System.out.println(isGreaterThan5);
//
//        int a = 10;
//        System.out.println(a);
//        a++ ;  //  +1
//        System.out.println(a);
//        a--;  //-1
//        System.out.println(a);
//        a--;
//        System.out.println(a);

        sayHello();
        String numeComplet = numePrenume("Manoila","Ecaterina");
        int i = giveMeNumber(10);
        System.out.println(numeComplet);
        System.out.println(i);


    }

    static int giveMeNumber(int number){
        return number * 10 ;
    }

   static void sayHello(){
       System.out.println("Hello");

    }

    static String numePrenume(String nume, String prenume){
        String numeIntreg = nume + prenume;
        return numeIntreg;

    }



    private static void extracted() {
        byte smallNumber = 5;
        short mediumNumber =5;
        int  numberInteg = 5;
        long bigNumber = 5000l;
        float floatNumber = 5.5f;  //floating point number
        //32 biti
        double decimalNumber = 9.65;//double - 64 biti
        char character = 'M';
        boolean isTrue = true;
        boolean isFalse = false;

        System.out.println(mediumNumber + numberInteg);
        System.out.println(numberInteg - bigNumber);
        System.out.println(floatNumber * decimalNumber);
    }


}
