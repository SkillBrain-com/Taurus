package timeeaPop.tema2;

import java.util.Arrays;

public class BirdsWatcher {
    public int[] birdsPerDay;

    // Constructor to initialize the birdsPerDay array
    public BirdsWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay;
    }

    // Task 1: Check what the counts were last week
    public int[] getLastWeek() {
        System.out.println("Last week's counts: " + Arrays.toString(birdsPerDay));
        return birdsPerDay;
    }

    // Task 2
    public int getToday() {
        int lastElementPosition = birdsPerDay.length - 1;
        int todayCount = birdsPerDay[lastElementPosition];
        System.out.println("Birds that visited me today: " + todayCount);
        return todayCount;
    }

    // Task 3
    public void incrementTodaysCount() {
        birdsPerDay[birdsPerDay.length - 1] ++;
    }

    // Task 4
    public boolean hasDayWithoutBirds() {
        boolean hasDayWithoutBirds = false;
        for (int i : birdsPerDay) {
            if (i == 0){
                hasDayWithoutBirds = true;
                break;
            } else {
                hasDayWithoutBirds = false;
            }
        }
        System.out.println(hasDayWithoutBirds);
        return hasDayWithoutBirds;
    }

    // Task 5
    public int getCountForFirstDays(int days) {
        int sum = 0;
        int actualNumberOfDays = days;
        if (days > birdsPerDay.length) {
            actualNumberOfDays = birdsPerDay.length;
            System.out.println("You exceeded the maximum number of days. The max number of days is: " + actualNumberOfDays);
        }

        for (int i = 0; i <= actualNumberOfDays - 1; i++) {
            sum += birdsPerDay[i];
        }

        System.out.println("The sum of the " + actualNumberOfDays + " days is: " + sum);
        return sum;
    }

    // Task 6
    public int getBusyDays() {
        int sum = 0;
        for (int i : birdsPerDay) {
            if (i >= 5){
                sum++;
            }
        }

        System.out.println("Number of busy days: " + sum);
        return sum;
    }

    public static void main(String[] args) {
        int[] birdsPerDay = { 0, 2, 5, 3, 7, 8, 4 };
        BirdsWatcher birdCount = new BirdsWatcher(birdsPerDay);
        // 1
        birdCount.getLastWeek();
        // 2
        birdCount.getToday();
        // 3
        birdCount.incrementTodaysCount();
        birdCount.getToday();
        // 4
        birdCount.hasDayWithoutBirds();
        // 5
        birdCount.getCountForFirstDays(90);
        // 6
        birdCount.getBusyDays();
    }
}
