package CristianSandu.java3.exercises.polymorpihsm;

public interface Counter {
    static int count = 10;
}

class TestMyCounter {

    public static void main(String[] args) {
        Counter [] counters = new Counter[2];
        for (Counter ctr : counters) {
//            System.out.print(ctr.count); //1010, ASA NU!!!
            System.out.print(Counter.count); //1010, ASA DA!!
        }

    }


}