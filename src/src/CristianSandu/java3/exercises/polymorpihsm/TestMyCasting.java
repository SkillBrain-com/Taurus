package CristianSandu.java3.exercises.polymorpihsm;

public class TestMyCasting {

    public static void main(String[] args) {
        M obj1 = new M();
        M obj3 = new N();
        N obj2 = (N) obj1;//  <=> N obj2 = new M();
        obj2.print();// n error m
    }
}
class M {
    public void print() {
        System.out.println("m");
    }
}
class N extends M {
    public void print() {
        System.out.println("n");
    }
}
