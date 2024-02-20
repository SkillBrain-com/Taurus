package CristianSandu.java3.teorie;

public class Dreptunghi extends FiguriGeometrice implements Drawable {

    private double l, h ;

    public void setL(double l) {
        this.l = l;
    }

    public void setH(double h) {
        this.h = h;
    }

    @Override
    public double getArea() {
        return l * h;
    }

    @Override
    public void draw() {
        System.out.println("Drawing a rectangle!");
    }
}
