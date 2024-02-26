package kateaManoila.Java3.Exzercses.TemaDeAcasa3;

public class Warrior implements Fighter {
    @Override
    public int damage(Fighter fighter) {
        return fighter.isVulnerable() ? 10 : 6;
    }

    @Override
    public String toString() {
        return "Fighter is a " + this.getClass().getSimpleName(); //hart cod adica am scris cu mina
    }
}
