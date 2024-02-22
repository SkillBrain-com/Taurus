package MariusMurgulet.tema2;

import java.util.Scanner;

public class Lasagna {
    public static int expectedMinutesInOven() {
        return 40;
    }
    public static int remainingMinutesInOven(int minuteInCuptor){
        // int i = expectedMinutesInOven()-minuteInCuptor;
        return expectedMinutesInOven()-minuteInCuptor;
    }
    public static int preparationTimeInMinutes(int layers){
        int timeForOneLayer = 2;
        int prepTime=timeForOneLayer * layers;
        return prepTime;
    }
    public static int totalTimeMinutes(int layers, int minutes){
        int timeForOneLayer = 2;
        int prepTime = timeForOneLayer * layers;
        int totalTimeMinutes = prepTime + minutes;
        return totalTimeMinutes;
    }

    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        Lasagna lasagna = new Lasagna();
        System.out.println("Expected minutes in oven" + expectedMinutesInOven());
        System.out.println("Remaining minutes in oven" + remainingMinutesInOven(sc.nextInt()));
        System.out.println("Preparation time in minutes " + preparationTimeInMinutes(sc.nextInt()));
        System.out.println("Insert the number of layers that the lasagna has and the number of minutes " +
                "the lasagna has spent in the oven at tha moment");
        System.out.println("Total time in minutes is:" + totalTimeMinutes(sc.nextInt(), sc.nextInt()));
    }

}
