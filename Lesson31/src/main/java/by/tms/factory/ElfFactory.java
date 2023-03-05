package by.tms.factory;

import by.tms.solders.*;

public class ElfFactory implements SoldersFactory {
    @Override
    public Warrior createWarrior() {
        return new ElfWarrior();
    }

    @Override
    public Archer createArcher() {
        return new ElfArcher();
    }

    @Override
    public Magician createMagician() {
        return new ElfMagician();
    }
}
