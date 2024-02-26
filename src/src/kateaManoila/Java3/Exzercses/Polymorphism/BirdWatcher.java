package kateaManoila.Java3.Exzercses.Polymorphism;

public class BirdWatcher {
    public static void main(String[] args) {
        int[]birdsPerWeek = new int[]{0,2,5,3,7,8,4};
        getLastWeek(birdsPerWeek);


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
    public static void getLastWeek(int[]array){
        for (int i = 0; i< array.length;i++){
            System.out.print(array[i] +",");
        }
    }
}
