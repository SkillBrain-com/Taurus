package madalinVoicu.tema3;

public class WizardsandWarriors{

    public static void main(String[] args) {
        Fighter warrior = new Warrior();
        warrior.toString();
        System.out.println(warrior);
        System.out.println("Is warrior vulnerable? " + warrior.isVulnerable());

        Wizard wizard = new Wizard();
        wizard.prepareSpell();
        wizard.isVulnerable();
        System.out.println("Is wizard vulnerable? " + wizard.isVulnerable());

        wizard.prepareSpell();
        wizard.damagePoints(warrior);
        System.out.println("Damage points for a wizard: " + wizard.damagePoints(warrior));

        wizard.prepareSpell();
        warrior.damagePoints(wizard);
        System.out.println("Damage points for a warrior: " + warrior.damagePoints(wizard));

    }
}

abstract class Fighter {

    boolean isVulnerable() {
        {
            System.out.println("Fighters are never vulnerable!");
            return false;
        }
    }

    abstract int damagePoints(Fighter fighter);

}
class Warrior extends Fighter {

    @Override
    public String toString() {
        return "Fighter is a Warrior";
    }

    @Override
    int damagePoints(Fighter wizard) {

        return wizard.isVulnerable() ? 10 : 6;
    }

}

class Wizard extends Fighter {
    int spells;

    @Override
    boolean isVulnerable() {
        return spells == 0;
    }

    @Override
    int damagePoints(Fighter wizard) {
        if (spells == 0) {
            return 3;
        }
        spells -= 1;
        return 12;
    }

    void prepareSpell() {
        spells += 1;
    }
}