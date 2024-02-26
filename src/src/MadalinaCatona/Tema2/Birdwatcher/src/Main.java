package MadalinaCatona.Tema2.Birdwatcher.src;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Arrays;

public class Main {
    public static void main(String[] args){
        //1. Check what the counts were last week
        System.out.println(Arrays.toString(Birdwatcher.getLastWeek()));
        //2. Check how many birds visited today
        System.out.println(Birdwatcher.getToday());
        //3. Increment today's count
        Birdwatcher.incremTodaysCount();
        System.out.println(Birdwatcher.getToday());
        //4. Check if there was a day with no visiting birds

        //5. Calculate the number of visiting birds for the first number of days

        //6. Calculate the number of busy days


        //7.localData
//        LocalDate today = LocalDate.now();
//
//        DayOfWeek dayOfWeek = today.getDayOfWeek();
//        System.out.println("Day of the Week - in Number :: "
//                + dayOfWeek.getValue());                        //2
//        System.out.println("Day of the Week :: " + dayOfWeek);  //Marti

    }
}