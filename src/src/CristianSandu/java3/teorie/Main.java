package CristianSandu.java3.teorie;

public class Main {


    public static void main(String[] args) {

        Cerc c  = new Cerc(5.5);
        double area =  c.getArea();
        System.out.println(area);
        FiguriGeometrice patrat = new Patrat();
        ((Patrat) patrat).setL(10);
        System.out.println(patrat.getArea());

        FiguriGeometrice dreptunghi = new Dreptunghi();

        ((Dreptunghi) dreptunghi).setL(2.1);
        ((Dreptunghi) dreptunghi).setH(3.4);
        System.out.println(dreptunghi.getArea());

    }

}
