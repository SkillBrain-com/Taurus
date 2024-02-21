package kateaManoila.Java3.Exzercses.Polymorphism;

public interface Profitable {

    double profitPercentage = 42.0;
}
class Business implements Profitable{
    double profitPercentage = 50.0;

}
class TestMyBusiness{
    public static void main(String[] args) {
        Profitable business = new Business();
        System.out.println(business.profitPercentage);
    }
}
