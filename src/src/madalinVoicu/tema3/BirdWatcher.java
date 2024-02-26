package madalinVoicu.tema3;

import java.util.Arrays;

public class BirdWatcher {
    private final int[] birdsPerDay;
    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay;
    }
    public int[] getLastWeek() {
        int[] lastWeekCounts = {0, 2, 5, 3, 7, 8, 4};
        return lastWeekCounts;
    }
    public int getToday() {
        return birdsPerDay[birdsPerDay.length - 1];
    }
    public int incrementTodaysCount(){
        int today = getToday();
        return ++today;
    }
    public boolean hasDayWithoutBirds(){
        for (int i = 0; i < birdsPerDay.length; i++) {
            if (birdsPerDay[i] == 0){
                return true;}

        }
        return false;
    }
    public int getCountForFirstDays(int numberOfDays){
        int birdsTotal = 0;

        for(int i = 0; i<numberOfDays; i++){
            birdsTotal += birdsPerDay[i] ;
        }
        return birdsTotal;
    }
    public int getBusyDays(){
        int busyDays = 0;
        for(int i = 0; i < birdsPerDay.length; i++) {
            if (birdsPerDay[i] >= 5) {
                busyDays++;
            }
        }
        return busyDays;


    }

}
class Main {
    public static void main(String[] args) {
        //TASK1  Check what the counts were last week
        BirdWatcher birdCount = new BirdWatcher(new int[]{2, 5, 0, 7, 4, 1});
        int[] birdsLastWeek = birdCount.getLastWeek();
        System.out.println("Last week's counts: " + Arrays.toString(birdsLastWeek));

        //TASK2  Check how many birds visited today

        int birdsToday = birdCount.getToday();
        System.out.println("Birds which visited the garden today: " + birdsToday);

        //TASK3  Increment today's count

        int incrementedNumber = birdCount.incrementTodaysCount();
        System.out.println("Incremented number of birds:" + incrementedNumber);

        //TASK4  Check if there was a day with no visiting birds
        boolean dayWithoutBirds = birdCount.hasDayWithoutBirds();
        System.out.println("Was there a day with no visiting birds? " + dayWithoutBirds);

        //TASK5 Calculate the number of visiting birds for the first number of days
        int numberOfBirds = birdCount.getCountForFirstDays(4);
        System.out.println("The total number of birds visiting the garden: " + numberOfBirds);

        //TASK6 Calculate the number of busy days
        int busyDays = birdCount.getBusyDays();
        System.out.println("The number of busy days: " + busyDays);

    }
}