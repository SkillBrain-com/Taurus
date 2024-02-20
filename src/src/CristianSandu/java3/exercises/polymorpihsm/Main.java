package CristianSandu.java3.exercises.polymorpihsm;

public class Main {


    public static void main(String[] args) {
        printFromMain();
    }


    static void printFromMain() {
        System.out.println("Hello from static " + Main.class.getName());
    }

    void helloMain() {
        System.out.println("Hello from non-static main");
    }
}


class TestMain {

    public static void main(String[] args) {
        Main.printFromMain();

        Main main = new Main();

        main.helloMain();


    }

}
