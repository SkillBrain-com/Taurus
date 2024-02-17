package CarmenOltean.Java_3.Annalyn;

public class Annalyns_Infiltration {
    //a fast attack can be made if the knight is sleeping
    public  boolean canFastAttack(boolean knightIsAwake) {
        return !knightIsAwake;
    }
    //the group can be spied upon if at least one of them is awake
    public  boolean canSpy(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake) {
        return knightIsAwake || archerIsAwake || prisonerIsAwake;
    }
    // the prisoner can be signalled  if the prisoner is awake and the archer is sleeping
    public  boolean canSignalPrisoner(boolean archerIsAwake, boolean prisonerIsAwake) {
        return !archerIsAwake && prisonerIsAwake;
    }
    //If Annalyn has her pet dog with her she can rescue the prisoner if the archer is asleep
    //If Annalyn does not have her dog,she can free the prisoner if the prisoner is awake and the knight and archer are both sleeping
    public  boolean canFreePrisoner(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake, boolean dogPresent) {
        return (prisonerIsAwake && !knightIsAwake && !archerIsAwake) || (!archerIsAwake && dogPresent);
    }
}
