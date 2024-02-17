package timeeaPop.tema3;

abstract class Fighter {
    boolean isVulnerable() {
        {
            return false;
        }
    }

    abstract int damagePoints(Fighter fighter); // il declaram abstract si implementarea metodei efectiv se va face in subclasses Warrior si Wizard?

    public static void main(String[] args) {
//        // 1
//        Fighter warrior = new Warrior();
//        System.out.println(warrior.toString());
//        // 2
//        System.out.println(warrior.isVulnerable());
//        // 3
//        Wizard wizard = new Wizard();
//        wizard.prepareSpell();
//        // 4
//        System.out.println(wizard.isVulnerable());
        // 5
        Wizard wizard1 = new Wizard();
        Warrior warrior1 = new Warrior();
        wizard1.prepareSpell();
        System.out.println(warrior1.isVulnerable());
        warrior1.isVulnerable();
        System.out.println(wizard1.damagePoints(warrior1));
        // 6
        wizard1.isVulnerable();
        System.out.println(warrior1.damagePoints(wizard1));
    }
}

class Warrior extends Fighter {

    @Override
    public String toString() {
        return "Fighter is a Warrior";
    }

    @Override
    int damagePoints(Fighter fighter) {
        if (fighter.isVulnerable()){
            return 10;
        } else {
            return 6;
        }
    }

}

class Wizard extends Fighter {

    private boolean spellPrepared; // added to keep track of whether a spell has been prepared or not
    void prepareSpell() {
        spellPrepared = true;
        System.out.println("Spell prepared: " + spellPrepared);
    }

    @Override
    boolean isVulnerable() {
        return !spellPrepared;
    }

    @Override
    int damagePoints(Fighter fighter) {
        if (spellPrepared == false) {
            return 3;
        } else {
            return 12;
        }
    }
}
