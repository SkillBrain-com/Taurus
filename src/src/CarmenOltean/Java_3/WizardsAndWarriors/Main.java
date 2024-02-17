package CarmenOltean.Java_3.WizardsAndWarriors;

public class Main {
    public static void main(String[] args) {


        //1. Describe a fighter
        Fighter warrior = new Warrior();
        String description = warrior.toString();
        System.out.println(description);

        //2. Make fighters not vulnerable by default
        System.out.println("Is a fighter vulnerable? " + warrior.isVulnerable());

        //3. Allow Wizards to prepare a spell
        Wizard wizard = new Wizard();
        wizard.prepareSpell();

        //4. Make Wizards vulnerable when not having prepared a spell
        wizard.isVulnerable();
        System.out.println("Is the wizard vulnerable? " + wizard.isVulnerable());

        //5. Calculate the damage points for a Wizard
        wizard.prepareSpell();
        wizard.damagePoints(warrior);
        System.out.println("Damage points for a wizard: " + wizard.damagePoints(warrior));

        //6. Calculate the damage points for a Warrior
        wizard.prepareSpell();
        warrior.damagePoints(wizard);
        System.out.println("Damage points for a warrior: " + warrior.damagePoints(wizard));


    }

}