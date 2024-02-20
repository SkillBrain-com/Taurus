package CristianSandu.java3.exercises.polymorpihsm;

public class Test {

    // Overload
    // compile-time

    private static void m(int x) {
        System.out.println(1);
    }

    private static void m(int i1, int i2) {
        System.out.print(2);
    }

    // var-args (variable arguments)
    private static void m(char ... c) {
        System.out.print(3);
    }

    public static void main(String[] args) {
        // 3333 ?
        // 1233 ?
        // 2333 ?
        m('A');
        m('A', 'B');
        m('A', 'B', 'C');
        m('A', 'B', 'C', 'D');
    }


}
