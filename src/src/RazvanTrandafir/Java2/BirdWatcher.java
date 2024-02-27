package RazvanTrandafir.Java2;

import java.util.Arrays;

public class BirdWatcher {
    public int[] birdsPerDay;

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

    public void incrementTodaysCount() {
        birdsPerDay[birdsPerDay.length - 1]++;
    }

    public boolean hasDayWithoutBirds() {
        for (int count : birdsPerDay) {
            if (count == 0) {
                return true;
            }
        }
        return false;
    }

    public int getCountForFirstDays(int numberOfDays) {
        int totalCount = 0;
        for (int i = 0; i < numberOfDays && i < birdsPerDay.length; i++) {
            totalCount += birdsPerDay[i];
        }
        return totalCount;
    }

    public int getBusyDays() {
        int busyDaysCount = 0;
        for (int count : birdsPerDay) {
            if (count >= 5) {
                busyDaysCount++;
            }
        }
        return busyDaysCount;
    }

    public static void main(String[] args) {
        int[] birdsPerDay = {2, 5, 0, 7, 4, 1};
        BirdWatcher birdCount = new BirdWatcher(birdsPerDay);

        System.out.println("Last week's counts: " + Arrays.toString(birdCount.getLastWeek()));
        System.out.println("Birds visited today: " + birdCount.getToday());

        birdCount.incrementTodaysCount();
        System.out.println("Birds visited today after increment: " + birdCount.getToday());

        System.out.println("Has a day without birds: " + birdCount.hasDayWithoutBirds());
        System.out.println("Count for the first 4 days: " + birdCount.getCountForFirstDays(4));
        System.out.println("Number of busy days: " + birdCount.getBusyDays());
    }
}