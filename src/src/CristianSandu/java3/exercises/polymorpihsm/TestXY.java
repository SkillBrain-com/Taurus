package CristianSandu.java3.exercises.polymorpihsm;

public class TestXY {

    public static void main(String[] args) {

        X x = new Z();
        x.sayHello(); //  Good night!
        ((Y)x).sayHello(); //Good night!
        ((Z)x).sayHello();  //Good night!
    }
}

class X {

    void sayHello() {
        System.out.println("Good morning!");
    }

}

class Y extends X  {

    void sayHello() {
        System.out.println("Good afternoon!");
    }

}
class Z extends Y {

    void sayHello() {
        System.out.println("Good night!");
    }
}