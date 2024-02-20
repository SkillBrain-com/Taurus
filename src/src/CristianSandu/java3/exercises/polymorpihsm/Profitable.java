package CristianSandu.java3.exercises.polymorpihsm;

public interface Profitable {

    static double profitPercentage = 42.0;

}

class Business implements Profitable {
    double profitPercentage = 50.0;
}

class TestMyBusiness {

    public static void main(String[] args) {
        Business business = new Business();
        System.out.println(business.profitPercentage); // 42
//        System.out.println(Profitable.profitPercentage);
    }

}
