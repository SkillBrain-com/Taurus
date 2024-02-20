package CristianSandu.java3.exercises.polymorpihsm;

public class TestABC {

    public static void main(String[] args) {
        A obj1 = new C();
        A obj2 = new B();
        C obj3 = (C) obj1;
        C obj4 = (C) obj2; // ClassCastException
        obj3.print(); // C  A C
        obj4.print(); //  B C C
    }
}

class A {
    public void print() {
        System.out.println("A");
    }
}

class B extends C {
    public void print() {
        System.out.println("B");
    }
}

class C extends A {
    public void print() {
        System.out.println("C");
    }
}
