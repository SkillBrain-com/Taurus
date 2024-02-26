package kateaManoila.Java3.Exzercses.Polymorphism;

public class Main {
    public static void main(String[] args) {
        printFromMain();
    }
    static void printFromMain(){
        System.out.println("Salut de la static"+ Main.class.getName());

    }
    void helloMain(){
        System.out.println(" Salut de la Non-static Main ");

    }

}
class TestMain{
    public static void main(String[] args) {
        Main.printFromMain();
        Main main = new Main();
        main.helloMain();

    }
}
