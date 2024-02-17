package CarmenOltean.Java_3.Annalyn;

public class Main_Annalyns_Infiltration extends Annalyns_Infiltration {
    public static void main(String[] args) {
        Annalyns_Infiltration action = new Annalyns_Infiltration();

        //1. Check if a fast attack can be made
        boolean knightIsAwake = true;
        boolean canFastAttack = action.canFastAttack(knightIsAwake);
        System.out.println("Can Annalyn perform a fast attack? " + canFastAttack);

        //2. Check if the group can be spied upon
        boolean archerIsAwake = true;
        boolean prisonerIsAwake = false;
        boolean canSpy = action.canSpy(knightIsAwake,archerIsAwake,prisonerIsAwake);
        System.out.println("Can Annalyn spy the camp? " + canSpy);

        //3. Check if the prisoner can be signalled
        boolean canSignalPrisoner = action.canSignalPrisoner(archerIsAwake,prisonerIsAwake);
        System.out.println("Can Annalyn signal the prisoner? " + canSignalPrisoner);

        //4. Check if the prisoner can be freed
        boolean dogPresent = true;
        boolean canFreePrisoner = action.canFreePrisoner( knightIsAwake, archerIsAwake, prisonerIsAwake, dogPresent);
        System.out.println("Can Annalyn free the prisoner? " + canFreePrisoner);


    }
}
