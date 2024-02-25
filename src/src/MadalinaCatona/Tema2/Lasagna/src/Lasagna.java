package MadalinaCatona.Tema2.Lasagna.src;

public class Lasagna {
    //1.Define the expected oven time in minutes
    public static int expectedMinutesInOven() {
        return 40;
    }

    //2.Calculate the remaining oven time in minutes
    public static int remainingMinutesInOven(int minuteInCuptor) {
        return expectedMinutesInOven() - minuteInCuptor;
    }

    //3.Calculate the preparation time in minutes
    public static int preparationTimeInMinutes(int layers) {
        return layers * 2;
    }

    //4.Calculate the total working time in minutes
    public static int totalTimeInMinutes(int layers, int minuteInOven) {
        return preparationTimeInMinutes(layers) + minuteInOven;
    }
}


