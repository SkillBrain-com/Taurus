package CristianSandu.java3.exercises.polymorpihsm;

public class MyClass {
    MyClass() {
        System.out.println(101);
    }

}

class MySubClass extends MyClass {
    MySubClass() {
        super(); // parent constructor
        System.out.println(202);
    }
}

class MyOtherSubClas extends MyClass {}

class TestClass {
    public static void main(String[] args) {
        System.out.println(new MySubClass());  // 101 -> 202
    }
}
