package kateaManoila.Java3.Exzercses.Polymorphism;

public class TestABC {
    public static void main(String[] args) {
        A obj1 = new C();
        A obj2 = new B();
        C obj3 = (C) obj1;
        C obj4 =(C)obj2;
        obj3.print();
    }

}
class A{
    public void print(){
        System.out.println("A");
    }
}
class B extends C{
    public void print(){
        System.out.println("B");
    }
}
class C extends A{

    public void print() {
        System.out.println("C");
    }
}
