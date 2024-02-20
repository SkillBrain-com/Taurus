package CristianSandu.java3.teorie;

import java.time.LocalDateTime;

public class Persoana {

    public String nume;  // null
    public String prenume;  // null
    public int varsta; // 0
    private long cnp;
    private LocalDateTime dateOfBirth;
    private String address;

    Persoana() {

    }


    Persoana(String nume, String prenume) {
        this.nume = nume;
        this.prenume = prenume;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getPrenume() {
        return prenume;
    }

    public void setPrenume(String prenume) {
        this.prenume = prenume;
    }

    public int getVarsta() {
        return varsta;
    }

    public long getCnp() {
        return cnp;
    }


    public LocalDateTime getDateOfBirth() {
        return dateOfBirth;
    }


    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
