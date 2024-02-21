package kateaManoila.Java2.TemaDeAcasa2;

public class AnanasInflitration {
    public static void main(String[] args) {
        boolean knightIsAwake = false;
        boolean archerIsAwake = false;
        boolean prisonerIsAwake = false;
        boolean petDogIsPresent = false;
        System.out.println(canSignalPrisoner(archerIsAwake, prisonerIsAwake));
        System.out.println(canSpy(knightIsAwake, archerIsAwake, prisonerIsAwake));
        System.out.println(canSignalPrisoner(archerIsAwake, prisonerIsAwake));
        System.out.println(canFreePrisoner(archerIsAwake, prisonerIsAwake, knightIsAwake, petDogIsPresent));

    }
    //1. Verificați dacă se poate face un atac rapid
    //Implementați metoda ( static )  AnnalynsInfiltration.canFastAttack() care ia o valoare booleană
    // care indică dacă cavalerul este treaz.
    // Această metodă revine  true dacă se poate face un atac rapid pe baza stării cavalerului.
    // În caz contrar, returnează  false:

    static boolean canFastAttack(boolean knightIsAwake) {
        return !knightIsAwake;
    }

    //2. Verificați dacă grupul poate fi spionat
    //Implementați metoda ( statică )  AnnalynsInfiltration.canSpy() care ia trei valori booleene,
    // indicând dacă cavalerul, arcașul și respectiv prizonierul sunt treaz.
    // Metoda revine  true dacă grupul poate fi spionat, pe baza stării celor trei personaje.
    // În caz contrar, returnează  false:
    static boolean canSpy(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake) {
        return (knightIsAwake || archerIsAwake || prisonerIsAwake);
    }
    //3. Verificați dacă prizonierul poate fi semnalizat
    //Implementați metoda ( static )  AnnalynsInfiltration.canSignalPrisoner() care ia două valori booleene,
    // indicând dacă arcașul și respectiv prizonierul sunt treaz.
    // Metoda revine  true dacă prizonierul poate fi semnalizat, în funcție de starea celor două personaje.
    // În caz contrar, returnează  false:
        static boolean canSignalPrisoner(boolean archerIsAwake, boolean prisonerIsAwake) {
        return (!archerIsAwake && prisonerIsAwake);
    }
    //4. Verificați dacă prizonierul poate fi eliberat
    //Implementați metoda ( statică )  AnnalynsInfiltration.canFreePrisoner() care ia patru valori booleene.
    // Primii trei parametri indică dacă cavalerul, arcasul și respectiv prizonierul sunt treaz.
    // Ultimul parametru indică dacă animalul de companie al lui Annalyn este prezent.
    // Metoda revine  true dacă prizonierul poate fi eliberat pe baza stării celor trei personaje
    // și a prezenței câinelui de companie a lui Annalyn. În caz contrar, returnează  fals
        static boolean canFreePrisoner(boolean archerIsAwake,
                                   boolean prisonerIsAwake,
                                   boolean knightIsAwake,
                                   boolean petDogIsPresent) {
        if (petDogIsPresent && !archerIsAwake) {
            return true;
        } else if (prisonerIsAwake && !knightIsAwake && !archerIsAwake) {
            return true;
        } else {
            return false;
        }
    }
}
