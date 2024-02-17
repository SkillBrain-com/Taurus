package timeeaPop.tema2;

public class Lasagna {
    public int expectedMinutesInOven() {
        // metoda returneaza timpul asteptat in cuptor (40 min ca asa zice cooking book)
        return 40;
    }
    public int remainingMinutesInOven(int actualMinutesInOven) {
        // metoda primeste un parametru de la user cu cate minute a stat in cuptor lasagna, si in func. de asta calculeaza timpul ramas (40 - x)
        return expectedMinutesInOven() - actualMinutesInOven;
    }
    public int preparationTimeInMinutes(int numberOfLayers) {
        // metoda primeste un parametru cu nr de blaturi si facem *2 pt ca presupunem ca pt fiecare blat dureaza 2 min
        return numberOfLayers * 2;
    }
    public int totalTimeInMinutes(int numberOfLayers, int actualMinutesInOven) {
        // metoda calculeaza timpul total de preg.
        return preparationTimeInMinutes(numberOfLayers) + actualMinutesInOven;
    }

    public static void main(String[] args) {
        Lasagna lasagna = new Lasagna();

        System.out.println("Cate minute trebuie sa stea lasagna la cuptor conform cartii de bucate: " + lasagna.expectedMinutesInOven());
        System.out.println("Cate minute mai are de stat lasagna la cuptor: " + lasagna.remainingMinutesInOven(30));
        System.out.println("Timp de preparare in minute: " + lasagna.preparationTimeInMinutes(2));
        System.out.println("Timpul total in minute: " + lasagna.totalTimeInMinutes(3, 20));
    }
}
