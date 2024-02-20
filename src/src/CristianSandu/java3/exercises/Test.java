package CristianSandu.java3.exercises;

public class Test {

    public static void main(String[] args) {
       new B();  // correct answer: NM
    }
}

class A {
    // public {static} String A() { } <- method
    // {className} () {}  <- constructor
    // constructor?
    // method?
    // mixed?
    // Overload (supra-incarcare)  -> compile-time
    // method signature -> methodName + input parames
    //   void method()  -> method 1
    //   void method(int i) -> method 2
    //   void method(String a) -> method 3
    A() {  // no-arg constructor
        this(1); // must be first
        System.out.println("M");
    }

    A(int i) {
        System.out.println("N");
    }

}
class B extends A {}
