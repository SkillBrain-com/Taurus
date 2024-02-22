package kateaManoila.Java3.Teotie;

public class Angajat extends Patrat.Persoana {

    private String pozitie;
    private long aidAngajat;
    private int vechime;

    public Angajat(){
        super("Ana","Grosu");

    }
    public Angajat(String nume, String prenume){
        super();
        this.nume = nume;
        this.prenume = prenume;
    }



}
