package kateaManoila.Java3.Teotie;

public class Dreptunghi extends FiguriGeometrice implements Drawable {

    private double l,h;

    public void setH(double h) {
        this.h = h;
    }

    public void setL(double l) {
        this.l = l;
    }

    @Override
    public double getArea() {
        return l * h;
    }

    @Override
    public void draw() {
        System.out.println("Desenam un dreptunghi");
    }
}
