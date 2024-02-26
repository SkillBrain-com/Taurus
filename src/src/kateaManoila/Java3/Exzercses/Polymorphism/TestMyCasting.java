package kateaManoila.Java3.Exzercses.Polymorphism;

public class TestMyCasting {
    public static void main(String[] args) {
        M obj1 = new M ();
       M obj3 = new N ();
        N obj2 =(N)obj1;
        obj2.print();
    }

}
class M{
    public void print(){
        System.out.println("m");
    }
}
class N extends M{
    public void print(){
        System.out.println("n");
    }
}
