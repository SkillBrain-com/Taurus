package CarmenOltean.Java_3.WizardsAndWarriors;

public abstract class Fighter {
    boolean isVulnerable() {
        return false;
    }
    abstract int damagePoints(Fighter fighter);

}
