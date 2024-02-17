package CarmenOltean.Java_3.WizardsAndWarriors;

public class Warrior extends Fighter{
    @Override
    public String toString() {
        return "Fighter is a Warrior";
    }

    @Override
    int damagePoints(Fighter wizard) {
        return wizard.isVulnerable() ? 10 : 6;
        //if (wizard.isVulnerable()) {
        //      return 10;
        //      } else {
        //      return 6;//

    }
}
