package RazvanTrandafir.Java3;

abstract class Fighter {
    abstract boolean isVulnerable();

    abstract int damagePoints(Fighter opponent);

    @Override
    public String toString() {
        return "Fighter is a " + this.getClass().getSimpleName();
    }
}

class Warrior extends Fighter {
    @Override
    boolean isVulnerable() {
        return false;
    }

    @Override
    int damagePoints(Fighter opponent) {
        if (opponent.isVulnerable()) {
            return 10;
        } else {
            return 6;
        }
    }
}

class Wizard extends Fighter {
    private boolean spellPrepared;

    Wizard() {
        this.spellPrepared = false;
    }

    void prepareSpell() {
        this.spellPrepared = true;
    }

    @Override
    boolean isVulnerable() {
        return !spellPrepared;
    }

    @Override
    int damagePoints(Fighter opponent) {
        if (spellPrepared) {
            return 12;
        } else {
            return 3;
        }
    }
}

