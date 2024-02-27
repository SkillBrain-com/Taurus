package MarianCocea.Java3;

public class BirdWatcher {
//    int day1 = 0;
//    int day2 = 2;
//    int day3 = 5;
//    int day4 = 3;
//    int day5 = 7;
//    int day6 = 8;
//    int day7 = 4;
    public static void main(String[] args) {
        int[] birdsPerWeek = new int[]{0, 2, 5, 3, 7, 8, 4};
        System.out.print("BirdsLastWeek:   ");
        getLastWeek(birdsPerWeek);
        System.out.println( "\nBirdsToday: " + getToday(birdsPerWeek));
        System.out.println("IncrementBirdsToday:   " + incrementTodayCpunt(birdsPerWeek));
        System.out.println("Have a day without birds?" + " - " + hasDaysWithoutBirds(birdsPerWeek));
        System.out.println("Birds in first days: " + getCountForFirstDays(birdsPerWeek, 5));
        System.out.println("Busy days: " + getBusyDays(birdsPerWeek));
    }

    private static void getLastWeek(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "   ");
        }
    }

    private static int getToday(int[] array) {
//    int today = array[array.length-1];
//    return today;
        return array[array.length - 1];
    }

    private static int incrementTodayCpunt(int[] array) {
        int increment = getToday(array);
//    increment++;
        return ++increment;
    }

    private static boolean hasDaysWithoutBirds(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                return true;
            }
        }
        return false;
    }

    private static int getCountForFirstDays(int[] array, int days) {
        int sum = 0;
        for (int i = 0; i < days; i++) {
//            sum = sum + array[i];
            sum += array[i];
        }
        return sum;
    }

    private static int getBusyDays(int[] array) {
        int busyDays = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] >= 5) {
                busyDays++;
            }
        }
        return busyDays;
    }

}
