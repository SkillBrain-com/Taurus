package CarmenOltean.Java_2;

public class Birdwatcher {
    public static void main(String[] args) {
        int [] birdsPerWeek = new int[]{0,2,5,3,7,8,4};
        getLastWeek(birdsPerWeek);
        System.out.println();
        System.out.println(getToday(birdsPerWeek));
        System.out.println(incrementTodaysCount(birdsPerWeek));
        System.out.println(hasDayWithoutBirds(birdsPerWeek));
        System.out.println(getCountForFirstDays(birdsPerWeek,4));
        int busyDays = getBusyDays(birdsPerWeek);
        System.out.println(busyDays);


    }
    private static void getLastWeek (int [] array){
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ",");
        }
    }
    private static int getToday(int [] array) {
        int todayCount = array[array.length - 1];
       return todayCount;

    }
    private static int incrementTodaysCount(int [] array){
       int today =  getToday(array);
       return ++today;
    }
    private static boolean hasDayWithoutBirds(int [] array){
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0){
                return true;
            }
        }
        return false;
    }
    private static int getCountForFirstDays(int [] array, int days){
        int sum = 0;
        for (int i = 0; i < days; i++) {
            sum = sum+array[i];
        }
        return sum;
    }
    private static int getBusyDays(int [] array){
        int busyDays = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i]>=5){
                busyDays++;
            }

        }
        return busyDays;
    }


}


