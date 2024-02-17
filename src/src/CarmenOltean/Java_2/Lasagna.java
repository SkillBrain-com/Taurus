package CarmenOltean.Java_2;

public class Lasagna {

    public static void main(String[] args) {

        int expectedMinutes = expectedMinutesInOven();
        int remainingMinutesInOven = remainingMinutesInOven(30);
        int preparationTime = preparationTimeInMinutes(4);
        int totalPreparationTime = totalTimeInMinutes(4,20);
        System.out.println("Expected minutes in oven:" + expectedMinutes);
        System.out.println("Remaining minutes in oven:" + remainingMinutesInOven);
        System.out.println("Preparation time:" + preparationTime);
        System.out.println("Total preparation time:" + totalPreparationTime);

    }
     //Define the expectedMinutesInOven() method that does not take any parameters and returns how many minutes the lasagna should be in the oven.

        public static int expectedMinutesInOven(){
            return 40;
        }
    //Define the remainingMinutesInOven() method that takes the actual minutes the lasagna has been in the oven as a parameter
    // and returns how many minutes the lasagna still has to remain in the oven,
    // based on the expected oven time in minutes from the previous task.
        public static int remainingMinutesInOven(int minutesInOven) {
            int expectedMinutes = expectedMinutesInOven();
            return expectedMinutes-minutesInOven;
        }
    //Define the preparationTimeInMinutes() method that takes the number of layers you added to the lasagna as a parameter
    // and returns how many minutes you spent preparing the lasagna, assuming each layer takes you 2 minutes to prepare.
        public static int preparationTimeInMinutes(int numberOfLayers){
            return numberOfLayers*2;
        }
    //Define the totalTimeInMinutes() method that takes two parameters: the first parameter is the number of layers , a
    // nd the second parameter is the number of minutes the lasagna has been in the oven.
        public static int totalTimeInMinutes(int numberOfLayers, int minutesInOven){
            int preparationTime = preparationTimeInMinutes(numberOfLayers);
            return preparationTime+minutesInOven;

        }
    }

