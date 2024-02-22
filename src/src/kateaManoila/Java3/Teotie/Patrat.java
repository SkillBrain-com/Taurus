package kateaManoila.Java3.Teotie;

import java.time.LocalDateTime;

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
        System.out.println("Desenam un patrat");
    }

    public static class Persoana {
        public String nume; //null
        public String prenume; //null
        public int virsta; //0
        private long cnp;
        private LocalDateTime dataDeNastere;
        private String adresa;

        Persoana(){

        }


        Persoana(String nume, String prenume) {
           this.nume = nume;
           this.prenume = prenume;

        }
        public void setPrenume(String newPrenume){
            prenume =newPrenume;

        }
        public void setNume(String newNume){
            nume = newNume;

        }
        public String getNume(){
            return nume;
        }
        public String getPrenume(){
            return prenume;
        }

        public int getVirsta() {
            return virsta;
        }

        public void setVirsta(int virsta) {
            this.virsta = virsta;
        }

        public long getCnp() {
            return cnp;
        }



        public LocalDateTime getDataDeNastere() {
            return dataDeNastere;
        }



        public String getAdresa() {
            return adresa;
        }

        public void setAdresa(String adresa) {
            this.adresa = adresa;
        }
    }
}
