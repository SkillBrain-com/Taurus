package CristianSandu.java3.exercises.polymorpihsm;

public class BirdWatcher {

    public static void main(String[] args) {
        int[] birdsPerWeek = new int[]{2, 5, 3, 0, 7, 8, 4};
        getLastWeek(birdsPerWeek);
        int today = getToday(birdsPerWeek);
        System.out.println(today);
        int todayIncrement = incrementTodayCount(birdsPerWeek);
        System.out.println(todayIncrement);
        boolean daysWithoutBirds = hasDaysWithoutBirds(birdsPerWeek);
        System.out.println(daysWithoutBirds);
        int countForFirstDays = getCountForFirstDays(birdsPerWeek, 5);
        System.out.println(countForFirstDays);
        int busyDays = getBusyDays(birdsPerWeek);
        System.out.println(busyDays);

    }

    private static int getBusyDays(int[] array) {
        int busyDays = 0;
        for (int i = 0; i < array.length; i++) {
            if(array[i] >= 5) {
                busyDays++;
            }
        }
        return busyDays;
    }

    private static int getCountForFirstDays(int[] array, int days) {
        int sum = 0;
        for (int i = 0; i < days; i++) {
//            sum = sum + array[i];
            sum += array[i];
        }
        return sum;
    }

    private static boolean hasDaysWithoutBirds(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if(array[i] ==0) {
                return true;
            }
        }
        return false; // default return
    }

    private static int incrementTodayCount(int[] array) {
        int today = getToday(array); //reuse existing code
        return ++today;
//        return ++array[array.length-1];
    }

    private static void getLastWeek(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ",");
        }
    }

    private static int getToday(int[] array) {
        return array[array.length - 1];
    }


}
