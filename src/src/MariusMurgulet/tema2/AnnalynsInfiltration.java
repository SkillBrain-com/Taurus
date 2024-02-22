package MariusMurgulet.tema2;

public class AnnalynsInfiltration {

        //1. Check if a fast attack can be made
        public static boolean canFastAttack(boolean knightIsAwake) {
            if(knightIsAwake == true){
                return false;
            }
            return knightIsAwake;
        }

        public static boolean canSpy(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake) {
            if(knightIsAwake || archerIsAwake && !prisonerIsAwake){
                return true;
             }
            return ((knightIsAwake || archerIsAwake) && !prisonerIsAwake);
        }

        public static boolean canSignalPrisoner(boolean archerIsAwake, boolean prisonerIsAwake) {
            return (!archerIsAwake && prisonerIsAwake);
        }

        public static boolean canFreePrisoner(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake, boolean petDogIsPresent) {
            if(petDogIsPresent && prisonerIsAwake && !archerIsAwake){
                return true;
            } else if (!petDogIsPresent && prisonerIsAwake && !archerIsAwake && !knightIsAwake) {
                return true;
            }
            return false;
        }

    public static void main(String[] args) {
           AnnalynsInfiltration annalynsInfiltration  = new AnnalynsInfiltration();
           System.out.println("Annalyn can make a fast attack " + AnnalynsInfiltration.canFastAttack(true));
           System.out.println("Annalyn can spy " + AnnalynsInfiltration.canSpy(true,true, false));
           System.out.println("The prisoner can be signaled " + AnnalynsInfiltration.canSignalPrisoner(false,true));
           System.out.println("The prisoner can be freed " + AnnalynsInfiltration.canFreePrisoner(false,false, true, false));
    }
}


