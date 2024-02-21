package kateaManoila.Java3.Exzercses.Polymorphism;

public class TestXY {
    public static void main(String[] args) {

        X x = new Z ();
        x.sayHello();
        ((Y)x).sayHello();
    }

}
class X{
    void sayHello(){
        System.out.println("Buna dimineata!");
    }
}
class Y extends X{
    @Override
    void sayHello() {
        System.out.println("Buna ziua!");
    }
}
class Z extends Y{
    @Override
    void sayHello() {
        System.out.println("Buna seara!");
    }
}
