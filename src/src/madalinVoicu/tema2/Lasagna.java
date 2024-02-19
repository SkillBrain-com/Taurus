package madalinVoicu.tema2;
import java.util.Scanner;

public class Lasagna {
    public static int expectedMinutesInOven(){
        return 40;
    }

    public static int remainingMinutesInOven(int minuteInCuptor) {
//        int i = expectedMinutesInOven() - minuteInCuptor;
        return expectedMinutesInOven() - minuteInCuptor;
    }

    public static int preparationTimeInMinutes(int layers){
        int timeForOneLayer = 2;
        int prepTime = timeForOneLayer * layers;
        return prepTime;
    }

    public static int totalTimeInMinutes(int layers, int minute){
        int timeForOneLayer = 2;
//        int prepTime = timeForOneLayer * layers;
        int prepTime = preparationTimeInMinutes(layers);
        int totalTimeInMinutes = prepTime + remainingMinutesInOven(minute);
        return totalTimeInMinutes;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        Lasagna lasagna = new Lasagna();
        System.out.println("Punctul 1)");
        System.out.println("Expected minutes in oven is: " + expectedMinutesInOven());
        System.out.println("Punctul 2)");
        System.out.println("Remaining minutes in oven: " + remainingMinutesInOven(sc.nextInt()));
        System.out.println("Punctul 3)");
        System.out.println("Preparation time in minutes: " + preparationTimeInMinutes(sc.nextInt()));
        System.out.println("Punctul 4) Insert the number of layers that the lasagna has and the number of minutes " +
                "the lasagna has spent in the oven at the moment");
        System.out.println("Total time in minutes is: " + totalTimeInMinutes(sc.nextInt(),sc.nextInt()));
    }


}

