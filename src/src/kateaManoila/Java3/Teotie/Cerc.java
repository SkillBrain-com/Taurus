package kateaManoila.Java3.Teotie;

public  class Cerc extends FiguriGeometrice implements Drawable {
    private double raza;

    public Cerc(double raza) {
        this.raza = raza;
    }

    @Override
    public  double getArea(){
        return Math.PI * raza * raza;

    }


    @Override
    public void draw() {
        System.out.println("Desenam un cerc");
    }
}
