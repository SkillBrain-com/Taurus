package RazvanTrandafir.Java2;

public class Annalyn {
    public static boolean canFastAttack(boolean knightIsAwake) {
        return knightIsAwake;
    }

    public static boolean canSpy(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake) {
        return knightIsAwake || archerIsAwake || prisonerIsAwake;
    }

    public static boolean canSignalPrisoner(boolean archerIsAwake, boolean prisonerIsAwake) {
        return archerIsAwake && prisonerIsAwake;
    }

    public static boolean canFreePrisoner(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake, boolean petDogIsPresent) {
        if (petDogIsPresent) {
            return archerIsAwake;
        } else {
            return knightIsAwake && archerIsAwake && prisonerIsAwake;
        }
    }

    public static void main(String[] args) {
        boolean knightIsAwake = false;
        boolean archerIsAwake = true;
        boolean prisonerIsAwake = false;
        boolean petDogIsPresent = false;

        System.out.println("Can Fast Attack: " + canFastAttack(knightIsAwake));
        System.out.println("Can Spy: " + canSpy(knightIsAwake, archerIsAwake, prisonerIsAwake));
        System.out.println("Can Signal Prisoner: " + canSignalPrisoner(archerIsAwake, prisonerIsAwake));
        System.out.println("Can Free Prisoner: " + canFreePrisoner(knightIsAwake, archerIsAwake, prisonerIsAwake, petDogIsPresent));
    }
}
