package MarianCocea.Java2Bonus;

class AnnalynsInfiltration {

    // Test variables
    // knightIsAwake;
    // archerIsAwake;
    // prisonerIsAwake;
    // petDogIsPresent;


    // canFastAttack
    public static boolean canFastAttack(boolean knightIsAwake) {
        return !knightIsAwake;
    }

    // canSpy
    public static boolean canSpy(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake) {
        return knightIsAwake || archerIsAwake || prisonerIsAwake;
    }

    // canSignalPrisoner
    public static boolean canSignalPrisoner(boolean archerIsAwake, boolean prisonerIsAwake) {
        return !archerIsAwake && prisonerIsAwake;
    }

    // canFreePrisoner
    public static boolean canFreePrisoner(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake, boolean petDogIsPresent) {
        return (prisonerIsAwake && !knightIsAwake && !archerIsAwake) || (!archerIsAwake && petDogIsPresent);
    }

    public static void main(String[] args) {
        // Test variables
        boolean knightIsAwake = true;
        boolean archerIsAwake = true;
        boolean prisonerIsAwake = true;
        boolean petDogIsPresent = true;

        System.out.println("canFastAttack = " + canFastAttack(knightIsAwake));
        System.out.println("canSpy = " + canSpy(knightIsAwake, archerIsAwake, prisonerIsAwake));
        System.out.println("canSignalPrisoner = " + canSignalPrisoner(archerIsAwake, prisonerIsAwake));
        System.out.println("canFreePrisoner = " + canFreePrisoner(knightIsAwake, archerIsAwake, prisonerIsAwake, petDogIsPresent));
    }
}