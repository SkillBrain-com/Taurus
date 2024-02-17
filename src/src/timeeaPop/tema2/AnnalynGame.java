package timeeaPop.tema2;

public class AnnalynGame {
    // 1. Check if fast attack can be made
    static boolean canFastAttack(boolean knightIsAwake) {
        if (knightIsAwake == true){
            return false; // daca knight ii treaz no fast attack can be made deci returneaza false
        }
        return knightIsAwake; // returnam valoare, not a void
    }

    // 2. Check if Annalyn can spy
    static boolean canSpy(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake){
        if (knightIsAwake || archerIsAwake || prisonerIsAwake){
            return true;
        }
        return knightIsAwake || archerIsAwake || prisonerIsAwake; // The method will return true if at least one of the parameters is true. If none of them are true, it will return false.
    }

    // 3. Check if the prisoner can be signalled
    static boolean canSignalPrisoner(boolean archerIsAwake, boolean prisonerIsAwake){
        return !archerIsAwake && prisonerIsAwake;
        // returneaza true doar daca amandoua conditiile is true, dar daca archerIsAwake = true, nu se poate da signal, deci de aia folosim "!" ca sa ne returneze daca putem da signal sau nu
    }

    // 4. Check if prisoner can be freed
    static boolean canFreePrisoner(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake, boolean doggoIsPresent) {
        if (doggoIsPresent && prisonerIsAwake && !archerIsAwake) {
            return true;
        } else if (!doggoIsPresent && prisonerIsAwake && !archerIsAwake && !knightIsAwake) {
            return true;
        }
        return false; // returnam false daca nu e indeplinita niciuna din conditii , deci prizonierul nu se poate elibera
    }
    public static void main(String[] args) {
        AnnalynGame AnnalynsInfiltration = new AnnalynGame();
        System.out.println("Annalyn can do a fast attack: " + AnnalynsInfiltration.canFastAttack(true));
        System.out.println("Annalyn can do some spying: " + AnnalynsInfiltration.canSpy(false, true, false));
        System.out.println("The prisoner can be signaled: " + AnnalynsInfiltration.canSignalPrisoner(false,true));
        System.out.println("Prisoner can be freed: " + AnnalynsInfiltration.canFreePrisoner(false, false, true,true));
    }
}
