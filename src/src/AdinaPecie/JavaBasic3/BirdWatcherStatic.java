package AdinaPecie.JavaBasic3;

public class BirdWatcherStatic {
    public static <array> void main(String[] args) {

        int[] birdsPerWeek = new int[]{0, 2, 5, 3, 7, 8, 4};


        getLastWeek(birdsPerWeek);
        System.out.println(" ");
        System.out.println("#######################");
        System.out.println(getToday(birdsPerWeek));
        System.out.println("#######################");
        System.out.println(incrementTodayCount(birdsPerWeek));
        System.out.println("#######################");
        System.out.println(hasDaysWithoutBirds(birdsPerWeek));
        System.out.println("#######################");
        System.out.println(getCountForFirstDays(birdsPerWeek,5));


    }


    private static void getLastWeek(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ",");

        }
    }

    private static int getToday(int[] array) {
        int today = array[array.length - 1];
        return today;
    }

    private static int incrementTodayCount(int[] array) {
        int today = getToday(array);
        today ++;
        return today;


    }

    private static boolean hasDaysWithoutBirds(int [] array){
        for (int i = 0; i < array.length; i++) {
            if (array[i] ==0) {
                return true;
            }

            }
        return false;
        }

        private static int getCountForFirstDays (int [] array, int days) {
            int sum = 0;
            for (int i = 0; i < days; i++) {
                sum = sum + array[i];}
                // sum += array[i];
                return sum;
            }


            private static int getBusyDays (int [] array) {
                int busyDays = 0;
                for (int i = 0; i < array.length; i++) {
                    if (array[i] >=0){
                        busyDays++;
                    }

                }
                return busyDays;
            }

        }

