package CristianSandu.java3.exercises;

public class TestBaseDerived {

    public static void main(String[] args) {

        Base b = new Derived();
        b.m1(); // override - supra-scriere
        // override - run-tine

    }

}

class Base {
    protected void m1() {
        System.out.println("Base: m1()");
    }
}
class Derived extends Base {
    protected void m1() {
        System.out.println("Derived: m1()");
    }
}

