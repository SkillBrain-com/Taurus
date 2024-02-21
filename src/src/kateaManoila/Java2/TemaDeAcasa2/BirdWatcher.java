package kateaManoila.Java2.TemaDeAcasa2;

public class BirdWatcher {

    public static void main(String[] args) {
        int[] birdsPerDay = {0, 2, 5, 3, 7, 8, 4};
        getLastWeek(birdsPerDay);
        System.out.println(getToday(birdsPerDay));
        System.out.println(incrementToday(birdsPerDay));
        System.out.println(hasDayWithoutBirds(birdsPerDay));
        System.out.println(getCountForFirstDays(birdsPerDay, 3));
        System.out.println(getBusyDays(birdsPerDay));

    }
    //Ești un pasionat observator de păsări care ține evidența
    // câte păsări ți-au vizitat grădina în ultimele șapte zile.
    //Aveți șase sarcini, toate care se ocupă de numărul de
    // păsări care v-au vizitat grădina.

    //1. Verificați care au fost numărările săptămâna trecută
    //În scopuri de comparație, păstrați întotdeauna în apropiere
    // o copie a numărătorilor de săptămâna trecută, care au fost: 0, 2, 5, 3, 7, 8 și 4.
    // Implementați metoda  BirdWatcher.getLastWeek() care returnează numărările de
    // săptămâna trecută:

    static void getLastWeek(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (i == 0) {
                System.out.print(" [ " + array[i] + " , ");
            } else if (i == array.length - 1) {
                System.out.println(array[i] + "]");
            } else {
                System.out.print(array[i] + " , ");
            }

        }

    }

    //2. Verifică câte păsări au vizitat astăzi
    //Implementați  BirdWatcher.getToday() metoda pentru a returna
    // câte păsări v-au vizitat grădina astăzi. Numărările păsărilor sunt ordonate după zi,
    // primul element fiind numărul zilei celei mai vechi, iar ultimul
    // element fiind numărul de astăzi.

    static int getToday(int[] array) {
        return array[array.length - 1]; //array[6]
    }
    //3. Creșteți numărul de astăzi
    //Implementați  BirdWatcher.incrementTodaysCount() metoda
    // pentru a crește numărul de astăzi:

    static int incrementToday(int[] array) {
        return getToday(array) + 1;

    }
    //4. Verificați dacă a existat o zi fără păsări în vizită
    //Implementați  BirdWatcher.hasDayWithoutBirds() metoda care revine
    // true dacă a existat o zi în care zero păsări au vizitat grădina;
    // in caz contrar, returneaza  false:

    static boolean hasDayWithoutBirds(int[] array) {
        boolean hasDayWithoutBirds = false;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                hasDayWithoutBirds = true;
                return hasDayWithoutBirds;

            }
        }
        return hasDayWithoutBirds;

    }
    //5. Calculați numărul de păsări în vizită pentru primul număr de zile
    //Implementați  BirdWatcher.getCountForFirstDays() metoda care returnează numărul
    // de păsări care v-au vizitat grădina de la începutul săptămânii,
    // dar limitați numărul la numărul specificat de zile de la începutul săptămânii.

    static int getCountForFirstDays(int[] array, int numberOfDays) {
        int suma = 0;
        for (int i = 0; i < numberOfDays; i++) {
            suma += array[i];

        }
        return suma;

    }
    //6. Calculați numărul de zile aglomerate
    //Unele zile sunt mai aglomerate decât altele. O zi plină este una în care cinci
    // sau mai multe păsări v-au vizitat grădina.
    // Implementați  BirdWatcher.getBusyDays() metoda pentru a returna numărul
    // de zile ocupate:

    static int getBusyDays(int[] array) {
        int busyDays = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] >= 5) {
                busyDays++;
            }
        }
        return busyDays;

    }


}
