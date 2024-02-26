package kateaManoila.Java3.Exzercses.Polymorphism;

public class MyClass {
    MyClass(){
        System.out.println(101);

    }
}
class MySubClass extends MyClass{
    MySubClass(){
        super();//->face referire la parintele  constructului
        System.out.println(202);
    }

}
 class TestClass{
    public static void main(String[] args) {
        System.out.println(new MySubClass());
    }

}
