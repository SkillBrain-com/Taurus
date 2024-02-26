package kateaManoila.Java3.Exzercses.TemaDeAcasa3;

public class TestMyFighter {
    public static void main(String[] args) {
        Fighter warrior = new Warrior();
        String myFighter = warrior.toString();
        Fighter wizard = new Wizard();
        int wizardDamage = ((Wizard) wizard).getSpell();
        System.out.println("Prepared spells" + wizardDamage);
        System.out.println("Wizard damage" + wizard.damage(warrior));
        System.out.println("Warrior damage" + warrior.damage(wizard));
        ((Wizard) wizard).prepareSpell();
        wizardDamage = ((Wizard) wizard).getSpell();
        System.out.println("Prepared spells" + wizardDamage);
        System.out.println("Wizard damage" + wizard.damage(warrior));
        wizardDamage = ((Wizard) wizard).getSpell();
        System.out.println(wizardDamage);
        System.out.println("Prepared spells" + wizardDamage);


        System.out.println("==========");
        System.out.println("Warrior damage" + warrior.damage(wizard));


    }
}
