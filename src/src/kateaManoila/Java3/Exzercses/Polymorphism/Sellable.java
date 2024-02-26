package kateaManoila.Java3.Exzercses.Polymorphism;

public interface Sellable {
    double getPrice();

    default String currency() {
        return "$";
    }
}

class Chair implements Sellable {
    @Override
    public double getPrice() {
        return 40;
    }

    @Override
    public String currency() {
        return "l";
    }
}
class TestMyChair{
    public static void main(String[] args) {
        Sellable chair = new Chair();
        System.out.println(chair.currency() +chair.getPrice());

    }
}
