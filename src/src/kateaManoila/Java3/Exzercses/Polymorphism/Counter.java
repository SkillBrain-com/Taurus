package kateaManoila.Java3.Exzercses.Polymorphism;

public interface Counter {
    int counter = 10;
}
class TestMyCounter{
    public static void main(String[] args) {
        Counter[] counters = new Counter[2];
        for (Counter ctr : counters){
            System.out.print(ctr.counter); //asa nu
            System.out.println(Counter.counter);// asa da

        }
    }
}
