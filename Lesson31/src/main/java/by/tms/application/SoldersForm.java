package by.tms.application;

import by.tms.factory.SoldersFactory;
import by.tms.solders.Archer;
import by.tms.solders.Magician;
import by.tms.solders.Warrior;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class SoldersForm {
    private Archer archer;
    private Magician magician;
    private Warrior warrior;

    public SoldersForm(SoldersFactory soldersFactory) {
        archer = soldersFactory.createArcher();
        magician = soldersFactory.createMagician();
        warrior = soldersFactory.createWarrior();
    }
}
