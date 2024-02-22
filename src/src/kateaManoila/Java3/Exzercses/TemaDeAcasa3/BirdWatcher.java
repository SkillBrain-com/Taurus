package kateaManoila.Java3.Exzercses.TemaDeAcasa3;

public class BirdWatcher {
    private final int[] birdPerDay;

    public BirdWatcher(int[] birdPerDay) {
        this.birdPerDay = birdPerDay;
    }

    void getLastWeek() {
        for (int i = 0; i < birdPerDay.length; i++) {
            if (i == 0) {
                System.out.print(" [ " + birdPerDay[i] + " , ");
            } else if (i == birdPerDay.length - 1) {
                System.out.println(birdPerDay[i] + "]");
            } else {
                System.out.print(birdPerDay[i] + " , ");
            }

        }

    }
     int getToday() {
        return birdPerDay[birdPerDay.length - 1]; //array[6]
    }
     int incrementToday() {
        return getToday() + 1;

    }
     boolean hasDayWithoutBirds() {
        boolean hasDayWithoutBirds = false;
        for (int i = 0; i < birdPerDay.length; i++) {
            if (birdPerDay[i] == 0) {
                hasDayWithoutBirds = true;
                return hasDayWithoutBirds;

            }
        }
        return hasDayWithoutBirds;

    }
    int getCountForFirstDays( int numberOfDays) {
        int suma = 0;
        for (int i = 0; i < numberOfDays; i++) {
            suma += birdPerDay[i];

        }
        return suma;

    }
     int getBusyDays() {
        int busyDays = 0;
        for (int i = 0; i < birdPerDay.length; i++) {
            if (birdPerDay[i] >= 5) {
                busyDays++;
            }
        }
        return busyDays;

    }
}
