package kateaManoila.Java3.Exzercses.TemaDeAcasa3;

public interface Fighter {
    int damage(Fighter fighter);

    default boolean isVulnerable() {
        return false;
    }


}
