package kateaManoila.Java2.TemaDeAcasa2;

public class Lasagna {
    public static void main(String[] args) {

        remainingMinutesInOven(30);
        preparationTimeMinutes(2);
        int totalTime = totalTimeInMinutees(3, 20);
        System.out.println("Timpul total de preparare" + totalTime);
    }

//1. Definiți timpul estimat al cuptorului în minute
//Definiți  expectedMinutesInOven() metoda care nu ia niciun parametru și
// returnează câte minute trebuie să fie lasagna la cuptor.
// Conform cărții de gătit, timpul estimat al cuptorului în minute este de 40:

    static int expectedMinutesInOven() {
        int expectedTime = 40;
        System.out.println(expectedTime + "min");
        return expectedTime;
    }

    //2. Calculați timpul de cuptor rămas în minute
//Definiți  remainingMinutesInOven() metoda care ia minutele efective
// în care lasagna a fost în cuptor ca parametru și returnează câte
// minute mai trebuie să rămână lasagna în cuptor, pe baza duratei de cuptor
// estimate în minute de la sarcina anterioară.
    static int remainingMinutesInOven(int minutesInOven) {
        int remainingMinutes = expectedMinutesInOven() - minutesInOven;
        System.out.println("Minute ramase in cuptor" + remainingMinutes + "min");
        return remainingMinutes;

    }

    //3. Calculați timpul de pregătire în minute
//Definiți  preparationTimeInMinutes() metoda care ia numărul de straturi
// pe care le-ați adăugat la lasagna ca parametru și returnează câte minute
// ați petrecut pregătind lasagna, presupunând că fiecare strat durează
// 2 minute pentru a pregăti.
    static int preparationTimeMinutes(int layers) {
        int preparationTime = layers * 2;
        System.out.println("Timpul de preparare este:" + preparationTime + "min");
        return preparationTime;

    }

    //4. Calculați timpul total de lucru în minute
    //Definiți  totalTimeInMinutes() metoda care ia doi parametri:
    // primul parametru este numărul de straturi pe care le-ați adăugat la lasagna,
    // iar al doilea parametru este numărul de minute în care lasagna a stat în cuptor.
    // Funcția ar trebui să returneze câte minute în total ați lucrat
    // la gătirea lasagnei, care este suma timpului de preparare în minute și
    // a timpului în minute petrecut lasagna în cuptor în acest moment.
    static int totalTimeInMinutees(int layers, int timeInOven) {
        return preparationTimeMinutes(layers) + remainingMinutesInOven(timeInOven);

    }


}



