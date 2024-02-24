package madalinVoicu.tema2;

public class AnnalynsInfiltration {
    //a fast attack can be made if the knight is sleeping
    public static boolean canFastAttack(boolean knightIsAwake) {
        return !knightIsAwake;
    }
    //the group can be spied upon if at least one of them is awake
    public static boolean canSpy(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake) {
        return knightIsAwake || archerIsAwake || prisonerIsAwake;
    }
    // the prisoner can be signalled  if the prisoner is awake and the archer is sleeping
    public static boolean canSignalPrisoner(boolean archerIsAwake, boolean prisonerIsAwake) {
        return !archerIsAwake && prisonerIsAwake;
    }
    //If Annalyn has her pet dog with her she can rescue the prisoner if the archer is asleep
    //If Annalyn does not have her dog,she can free the prisoner if the prisoner is awake and the knight and archer are both sleeping
    public static boolean canFreePrisoner(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake, boolean dogPresent) {
        return (prisonerIsAwake && !knightIsAwake && !archerIsAwake) || (!archerIsAwake && dogPresent);
    }

    public static void main(String[] args) {
        boolean knightIsAwake = true;
        boolean archerIsAwake = true;
        boolean prisonerIsAwake = false;
        boolean dogPresent = false;
        System.out.println("Can Annalyn perform a fast attack?" + canFastAttack(knightIsAwake));
        System.out.println("Can Annalyn spy the camp?" + canSpy(knightIsAwake,archerIsAwake,prisonerIsAwake));
        System.out.println("Can Annalyn signal the prisoner?" + canSignalPrisoner(archerIsAwake,prisonerIsAwake));
        System.out.println("Can Annalyn free the prisoner?" + canFreePrisoner(knightIsAwake,archerIsAwake,prisonerIsAwake,dogPresent));

    }
}
