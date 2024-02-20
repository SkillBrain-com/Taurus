package CristianSandu.java3.teorie;

public class Cerc extends FiguriGeometrice implements Drawable {

    private double raza;


    public Cerc(double raza) {
        this.raza = raza;
    }

    public void setL(double l) {
        return;
    }

    @Override
    public double getArea() {
        return Math.PI * raza * raza;
    }

    @Override
    public void draw() {
        System.out.println("Drawing a circle");
    }
}
