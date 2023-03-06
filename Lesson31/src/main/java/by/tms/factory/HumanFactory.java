package by.tms.factory;

import by.tms.solders.*;

public class HumanFactory implements SoldersFactory {
    @Override
    public Warrior createWarrior() {
        return new HumanWarrior();
    }

    @Override
    public Archer createArcher() {
        return new HumanArcher();
    }

    @Override
    public Magician createMagician() {
        return new HumanMagician();
    }
}
