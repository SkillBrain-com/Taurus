package CristianSandu.java3.teorie;

public class Angajat extends Persoana {

    private String pozitie;
    private long idAngajat;
    private int vechime;

    public Angajat() {
        super("Gigel", "Popescu");
    }

    public Angajat(String nume, String prenume) {
        super();
        this.nume = nume;
        this.prenume = prenume;
    }

}
