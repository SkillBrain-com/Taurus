package kateaManoila.Java3.Exzercses.Polymorphism;

public interface Super {

    String name = "SUPER";  //constants
}
interface  Sub extends Super{
    String name ="NAME";

}
class TestMySuper{
    public static void main(String[] args) {
        Sub sub = null;
        System.out.println(sub.name);
    }
}