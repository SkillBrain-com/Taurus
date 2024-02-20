package CristianSandu.java3.teorie;

public class Patrat extends FiguriGeometrice implements Drawable {

    private double l;

    @Override
    public double getArea() {
        return l * l;
    }

    public void setL(double l) {
        this.l = l;
    }

    @Override
    public void draw() {
        System.out.println("Drawing a square.");
    }
}
