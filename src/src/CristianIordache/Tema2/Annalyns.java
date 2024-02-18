package CristianIordache.Tema2;

public class Annalyns {
// 1. Check if a fast attack can be made
    public static boolean canFastAttack(boolean knightIsAwake){
        return knightIsAwake;
    }
// 2. Check if the group can be spied upon
    public static boolean canSpy(boolean knightIsAwake,
                                 boolean archerIsAwake,
                                 boolean prisonerIsAwake){
        return knightIsAwake || archerIsAwake || prisonerIsAwake;
    }
// 3. Check if the prisoner can be signalled
    public static boolean canSignalPrisoner(boolean archerIsAwake,
                                            boolean prisonerIsAwake){
        return !prisonerIsAwake && archerIsAwake;
    }
    public static boolean canFreePrisoner(boolean knightIsAwake,
                                          boolean archertIsAwake,
                                          boolean prisonertIsAwake,
                                          boolean dogIsPresent){
        if (dogIsPresent){
            return !archertIsAwake;
        }else{
            return !knightIsAwake && !archertIsAwake && !prisonertIsAwake;
        }
    }

    public static void main(String[] args) {
        boolean knightIsAwake = false;
        boolean archerIsAwake = true;
        boolean prisonerIsAwake = false;
        boolean dogIsPresent = false;

        System.out.println(canFastAttack(knightIsAwake));
        System.out.println(canSpy(knightIsAwake, archerIsAwake, prisonerIsAwake));
        System.out.println(canSignalPrisoner(archerIsAwake, prisonerIsAwake));
        System.out.println(canFreePrisoner(knightIsAwake, archerIsAwake, prisonerIsAwake, dogIsPresent));
    }
}
