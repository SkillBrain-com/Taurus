package RazvanTrandafir.Java3;

public class MainDND {
    public static void main(String[] args) {
        Fighter warrior = new Warrior();
        System.out.println(warrior.toString());

        System.out.println("Warrior vulnerable?: " + warrior.isVulnerable());

        Wizard wizard = new Wizard();
        wizard.prepareSpell();

        Fighter wizardFighter = new Wizard();
        System.out.println("Wizard vulnerable?: " + wizardFighter.isVulnerable());

        System.out.println("Damage from wizard: " + wizard.damagePoints(warrior));

        Fighter warriorFighter = new Warrior();
        System.out.println("Damage from warrior: " + warriorFighter.damagePoints(wizard));
    }
}
