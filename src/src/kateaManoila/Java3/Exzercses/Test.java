package kateaManoila.Java3.Exzercses;

public class Test {
    public static void main(String[] args) {
        new B();

    }

}


class A{
    //public {static}String(){  } < -method
    //{className}() {} <- constructor
    //constructor;
    //method;
    //mixed;
    //Overload sau (supra-incarcare) -> compile -time;
    //method signature -> methodName + input parames;
    //void method() ->method1;
    // void method(int i) ->method2;
    //void method(String a) -> method3;

    A(){ //non-arg constructor
        this(1); //acest cuvint trebuie scris pe prima linie de cod in constructor;

        System.out.println("M");

    }
    A(int i){

        System.out.println("N");
    }


}
class B extends A {}
