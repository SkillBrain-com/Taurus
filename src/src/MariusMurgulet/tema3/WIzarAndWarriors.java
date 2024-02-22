package MariusMurgulet.tema3;

abstract class Fighter {
    boolean isVulnerable() {
            return false;
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
    int damagePoints(Fighter warrior) {
        if (spells == 0) {
            return 3;
        }
        spells -= 1;
        return 12;
    }
    void prepareSpell() {
        spells += 1;
    }

    public static void main(String[] args) {
        //1. Describe a fighter
        Fighter warrior = new Warrior();
        String typeFighter = warrior.toString();
        System.out.println(typeFighter);

        //2. Make fighters not vulnerable by default
        System.out.println("Fighter is vulnerable " + warrior.isVulnerable());

        //3. Allow Wizards to prepare a spell
        Wizard wizard = new Wizard();
        wizard.prepareSpell();

        //4. Make Wizards vulnerable when not having prepared a spell
        wizard.isVulnerable();
        System.out.println("Wizard is vulnerable  " + wizard.isVulnerable());

        //5. Calculate the damage points for a Wizard
        wizard.prepareSpell();
        wizard.damagePoints(warrior);
        System.out.println("Damage points for a wizzard that has a spell prepared " + wizard.damagePoints( warrior));
        wizard.isVulnerable();
        System.out.println("Damage points for a wizzard that doesn't have a spell prepared " + wizard.damagePoints(warrior));

        //6. Calculate the damage points for a Warrior
        warrior.damagePoints(wizard);
        System.out.println("Damage points for a warrior " + warrior.damagePoints(wizard));
        wizard.prepareSpell();
        System.out.println("Damage points for a warrior " + warrior.damagePoints(wizard));
    }


}




