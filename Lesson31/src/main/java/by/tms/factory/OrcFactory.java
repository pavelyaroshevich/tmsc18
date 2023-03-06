package by.tms.factory;

import by.tms.solders.*;

public class OrcFactory implements SoldersFactory {
    @Override
    public Warrior createWarrior() {
        return new OrcWarrior();
    }

    @Override
    public Archer createArcher() {
        return new OrcArcher();
    }

    @Override
    public Magician createMagician() {
        return new OrcMagician();
    }
}
