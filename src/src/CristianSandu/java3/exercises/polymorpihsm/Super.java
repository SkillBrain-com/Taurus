package CristianSandu.java3.exercises.polymorpihsm;

public interface Super {

    public static final String name = "SUPER"; // constants
}

interface Sub extends Super {

}

class TestMySuper {
    public static void main(String[] args) {
        Sub sub = null;
        // NullPointerException
        System.out.println(sub.name); // Super, null,
    }
}

