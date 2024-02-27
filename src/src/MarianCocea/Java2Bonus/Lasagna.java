package MarianCocea.Java2Bonus;

public class Lasagna {

    // Task 1: Define the expected oven time in minutes
    public static int expectedMinutesInOven() {
        return 40;
    }

    // Task 2: Calculate the remaining oven time in minutes
    public static int remainingMinutesInOven(int minuteInCuptor) {
        return expectedMinutesInOven() - minuteInCuptor;
    }

    // Task 3: Calculate the preparation time in minutes
    public static int preparationTimeInMinutes(int layers) {
        return layers * 2;
    }

    // Task 4: Calculate the total working time in minutes
    public static int totalTimeInMinutes(int layers, int minuteInOven) {
        return preparationTimeInMinutes(layers) + minuteInOven;
    }

    public static void main(String[] args) {
        // Test the methods
        System.out.println(expectedMinutesInOven());
        System.out.println(remainingMinutesInOven(25));
        System.out.println(preparationTimeInMinutes(2));
        System.out.println(totalTimeInMinutes(5, 20));
    }
}
