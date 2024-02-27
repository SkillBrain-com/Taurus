package AdinaPecie.JavaBasic2;

import java.util.Scanner;

public class Lasagna {

    public static void main(String[] args) {

        Lasagna lasagna = new Lasagna();
        System.out.println("Lasagna should stay in the oven " +Lasagna.expectedMinutesInOven() + " minutes.");
        System.out.println("Lasagna should stay in the oven for another " + Lasagna.remainingMinutesInOven() + " minutes.");
        System.out.println("Preparation time for lasagna depending on the number of layers " + Lasagna.preparationTimeInMinutes() + " minutes.");
        System.out.println("Total time for a lasagna is: " + Lasagna.totalTimeInMinutes(2, 20) + " minutes.");

    }


    public static int expectedMinutesInOven() {

        return 40;
    }

public static int remainingMinutesInOven() {
    System.out.println("Please, enter the minutes that lasagna already stays in the oven: ");
      Scanner scanner = new Scanner(System.in);
      int minutesInOven = scanner.nextInt();
       int remainingMinutes = 40-minutesInOven;
       return remainingMinutes;

   }

    public static int preparationTimeInMinutes() {

        System.out.println("Please, enter the number of layers: ");
        Scanner scanner = new Scanner(System.in);
        int layers = scanner.nextInt();
        int prepTime = 2*layers;
        return prepTime;
    }

    public static int totalTimeInMinutes(int layers, int minutesInOven) {
        int totalTime = 2*layers + minutesInOven;
        return totalTime;
    }

    }

