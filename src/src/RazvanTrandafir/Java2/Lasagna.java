package RazvanTrandafir.Java2;

public class Lasagna {

    // Task 1: Define the expected oven time in minutes
    public int expectedMinutesInOven() {
        return 40;
    }

    // Task 2: Calculate the remaining oven time in minutes
    public int remainingMinutesInOven(int minutesInOven) {
        int expectedMinutes = expectedMinutesInOven();
        return expectedMinutes - minutesInOven;
    }

    // Task 3: Calculate the preparation time in minutes
    public int preparationTimeInMinutes(int numberOfLayers) {
        return numberOfLayers * 2;
    }

    // Task 4: Calculate the total working time in minutes
    public int totalTimeInMinutes(int numberOfLayers, int minutesInOven) {
        int preparationTime = preparationTimeInMinutes(numberOfLayers);
        return preparationTime + minutesInOven;
    }

    public static void main(String[] args) {
        Lasagna lasagna = new Lasagna();

        // Testing the methods
        System.out.println("Expected Minutes in Oven: " + lasagna.expectedMinutesInOven());
        System.out.println("Remaining Minutes in Oven: " + lasagna.remainingMinutesInOven(30));
        System.out.println("Preparation Time in Minutes: " + lasagna.preparationTimeInMinutes(2));
        System.out.println("Total Working Time in Minutes: " + lasagna.totalTimeInMinutes(3, 20));
    }
}
