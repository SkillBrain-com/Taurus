package CarmenOltean.Java_3.Lasagna;

public class Main_Lasagna extends Lasagna {
    public static void main(String[] args) {
        Lasagna lasagna = new Lasagna();

        //1. Define the expected oven time in minutes
        int expectedMinutesInOven = lasagna.expectedMinutesInOven();
        System.out.println("Expected minutes in oven:" + expectedMinutesInOven + " minutes");

        //2. Calculate the remaining oven time in minutes
        int minutesInOven = 30;
        int remainingMinutesInOven = lasagna.remainingMinutesInOven(minutesInOven);
        System.out.println("Remaining minutes in oven:" + remainingMinutesInOven + " minutes");

        //3. Calculate the preparation time in minutes
        int numberOfLayers = 2;
        int preparationTime = lasagna.preparationTimeInMinutes(numberOfLayers);
        System.out.println("Preparation time:" + preparationTime + " minutes");

        //4. Calculate the total working time in minutes
        int totalWorkingTime = lasagna.totalTimeInMinutes(2,30);
        System.out.println("Total working time for lasagna:" + totalWorkingTime + " minutes" );

    }


}
