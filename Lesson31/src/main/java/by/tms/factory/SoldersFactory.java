package by.tms.factory;

import by.tms.solders.Archer;
import by.tms.solders.Magician;
import by.tms.solders.Warrior;

public interface SoldersFactory {
    Warrior createWarrior();

    Archer createArcher();

    Magician createMagician();
}
