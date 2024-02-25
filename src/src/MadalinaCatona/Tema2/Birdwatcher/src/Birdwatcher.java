package MadalinaCatona.Tema2.Birdwatcher.src;

import java.time.DayOfWeek;
import java.time.LocalDate;
public class Birdwatcher {
    //    static int day1 = 0;
//    static int day2 = 2;
//    static int day3 = 5;
//    static int day4 = 3;
//    static int day5 = 7;
//    static int day6 = 8;
//    static int day7 = 4;
    static LocalDate localDate = LocalDate.now();
    static DayOfWeek dayOfWeek = localDate.getDayOfWeek();
    static int Today = dayOfWeek.getValue();
    static int[] lastWeek = {0,2,5,3,7,8,4};
    static int[] thisWeek = {2,5,0,7,4,1,3};
    public static int[] getLastWeek() {
        return lastWeek;
    }
    public static int getToday() {
//        switch (Today) {
//            case 1:
//                return thisWeek[0];
//            case 2:
//                return thisWeek[1];
//            case 3:
//                return thisWeek[2];
//            case 4:
//                return thisWeek[3];
//            case 5:
//                return thisWeek[4];
//            case 6:
//                return thisWeek[5];
//            case 7:
//                return thisWeek[6];
//            default:
//               return 999;
//        }
        int nr_azi = Today -1;
        return thisWeek[nr_azi];
    }
    public static void incremTodaysCount(){
        thisWeek[Today - 1] = thisWeek[Today - 1] +1;
    }
}










