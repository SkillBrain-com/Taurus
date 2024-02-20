package CristianSandu.java3.exercises.polymorpihsm;

public interface Flyable {
    static int unghiCuOrizontala() {
        return 20;
    }
    default void fly() {
        System.out.println("Zboara la " + unghiCuOrizontala() + " grade fata de orizontala");
    }
    public abstract void aterizare();
}

class Avion implements Flyable {
    @Override
    public void aterizare() {
        System.out.println("Aterizeasca la un unghi " + Flyable.unghiCuOrizontala() + ".");
    }

    public static void main(String[] args) {
        new Avion().fly();
        new Avion().aterizare();
    }

}
