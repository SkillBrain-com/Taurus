package CarmenOltean.Java_3.Lasagna;

public class Lasagna {
    public int expectedMinutesInOven(){
        return 40;

    }
    public int remainingMinutesInOven(int minutesInOven) {
        int expectedMinutes = expectedMinutesInOven();
        return expectedMinutes-minutesInOven;

    }

    public int preparationTimeInMinutes(int numberOfLayers){
        return numberOfLayers*2;

    }



    public int totalTimeInMinutes(int numberOfLayers, int minutesInOven){
        int preparationTime = preparationTimeInMinutes(numberOfLayers);
        return preparationTime+minutesInOven;
    }
}
