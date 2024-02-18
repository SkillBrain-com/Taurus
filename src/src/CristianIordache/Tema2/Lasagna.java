package CristianIordache.Tema2;

public class Lasagna {
    public int expectedMinutesInOven() {
        return 40;
    }
    public int preparationTimeInMinutes(int numberOfLayers) {
        return numberOfLayers * 2;
    }
    public int totalTimeInMinutes(int numberOfLayers, int actualMinutesInOven) {
        int preparationTime = preparationTimeInMinutes(numberOfLayers);
        return preparationTime + actualMinutesInOven;
    }
    public static void main(String[] args) {
        Lasagna lasagna = new Lasagna();
        int expectedOvenTime = lasagna.expectedMinutesInOven();
        System.out.println("Expected Oven Time: " + expectedOvenTime);
        int actualMinutesInOven = 30;
        int remainingOvenTime = lasagna.remainingMinutesInOven(actualMinutesInOven);
        System.out.println("Remaining Oven Time: " + remainingOvenTime);

        int numberOfLayers = 2;
        int preparationTime = lasagna.preparationTimeInMinutes(numberOfLayers);
        System.out.println("Preparation Time: " + preparationTime);

        int totalTime = lasagna.totalTimeInMinutes(3, 20);
        System.out.println("Total Working Time: " + totalTime);
    }

    private int remainingMinutesInOven(int actualMinutesInOven) {
        return 0;
    }
}

