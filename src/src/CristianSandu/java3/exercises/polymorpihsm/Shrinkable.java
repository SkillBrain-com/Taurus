package CristianSandu.java3.exercises.polymorpihsm;

public interface Shrinkable {
     static void shrinkPercentage() {
        System.out.println("80%");
    }
}

class AntMan implements Shrinkable{

}

class TestAntMan {
    public static void main(String[] args) {
        Shrinkable.shrinkPercentage();
    }
}
