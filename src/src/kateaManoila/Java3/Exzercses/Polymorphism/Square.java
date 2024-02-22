package kateaManoila.Java3.Exzercses.Polymorphism;

public class Square {

    int length;
    Square sq;

    Square(int length) {
        this.length = length;
    }

    void setInner(Square sq) {
        this.sq = sq;

    }

    int getLength() {
        return this.length;
    }
}

class TestSquare {
    public static void main(String[] args) {

        Square sq1 = new Square(10);
        Square sq2 = new Square(5);
        sq1.setInner(sq2);
        System.out.println(sq1.sq.length);

    }

}
