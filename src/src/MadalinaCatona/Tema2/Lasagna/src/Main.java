package MadalinaCatona.Tema2.Lasagna.src;

public class Main {

    public static void main(String[] args) {
        Lasagna lasagna = new Lasagna();
        System.out.println(lasagna.expectedMinutesInOven());
        //Print 40
        System.out.println(lasagna.remainingMinutesInOven(30));
        //Print 10
        System.out.println(lasagna.preparationTimeInMinutes(2));
        //Print 4
        System.out.println(lasagna.totalTimeInMinutes(3 , 20));
        //Print 26
    }
}