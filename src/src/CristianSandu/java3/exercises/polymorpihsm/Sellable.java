package CristianSandu.java3.exercises.polymorpihsm;

public interface Sellable {

    double getPrice();

    default String currency() {
        return "$";
    }

    //£

}

class Chair implements Sellable {
    @Override
    public double getPrice() {
        return 40;
    }
    @Override
    public String currency() {
        return "£";
    }
}

class TestMyChair {

    public static void main(String[] args) {
        Sellable chair = new Chair();
        System.out.println(chair.currency() + chair.getPrice());

    }


}