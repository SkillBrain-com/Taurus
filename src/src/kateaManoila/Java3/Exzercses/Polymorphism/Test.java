package kateaManoila.Java3.Exzercses.Polymorphism;

public class Test {
    //Overload-> supra-incarcam
    //compile-tame

    private static void m(int i){
        System.out.print(1);
    }
    private static void m(int i1,int i2){
        System.out.print(2);
    }
    //var-args (variable arguments)
    private static void m(char... c){
        System.out.print(3);
    }

    public static void main(String[] args) {
        m('A');
        m('A','B');
        m('A','B','C');
        m('A','B','C','D');
    }
}
