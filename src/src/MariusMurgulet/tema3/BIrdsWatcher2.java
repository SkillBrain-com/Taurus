package MariusMurgulet.tema3;


class BirdWatcher2 {
    private final int[] birdsPerDay;
    public BirdWatcher2(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay;
    }

    public int[] getLastWeek(int [] birdsPerDay) {
        for (int i = 0; i < birdsPerDay.length; i++) {
            System.out.print(birdsPerDay[i] + ",");
        }
        System.out.println();
        return birdsPerDay;
    }

    public int getToday(int[] birdsPerDay) {
        return birdsPerDay[birdsPerDay.length-1];
    }

    public int incrementTodaysCount() {
        int today = getToday(birdsPerDay);
        return ++today;
    }

    public boolean hasDayWithoutBirds() {
        for (int i = 0; i < birdsPerDay.length; i++) {
            if (birdsPerDay[i] == 0){
                return true;
            }
        }
        return false;
    }

    public int getCountForFirstDays(int[] birdsPerDay, int days) {
        int sum = 0;
        for (int i = 0; i < days; i++) {
            sum +=birdsPerDay[i];
        }
        return sum;
    }

    public int getBusyDays(int[] birdsPerDay) {
        int busyDay = 0;
        for (int i = 0; i < birdsPerDay.length; i++) {
            if (birdsPerDay[i]>=5){
                busyDay++;
            }
        }
        return busyDay;
    }

    public static void main(String[] args) {
        int[] birdsPerWeek = {5, 10, 8, 3, 12, 7, 0};

        BirdWatcher2 birdWatcher2 = new BirdWatcher2(birdsPerWeek);

        int today = birdWatcher2.getToday(birdsPerWeek);
        System.out.println(today);

        int todayIncrement = birdWatcher2.incrementTodaysCount();
        System.out.println(todayIncrement);

        boolean daysWithoutBirds = birdWatcher2.hasDayWithoutBirds();
        System.out.println(daysWithoutBirds);

        BirdWatcher2 lastWeek = new BirdWatcher2(birdWatcher2.getLastWeek(birdsPerWeek));
        System.out.println();

        int countForFirstDays = birdWatcher2.getCountForFirstDays(birdsPerWeek, 4);
        System.out.println(countForFirstDays);

        int busyDay = birdWatcher2.getBusyDays((birdsPerWeek));
        //System.out.println(birdWatcher2.getBusyDays(birdsPerWeek));
        System.out.println(busyDay);


        }



}


