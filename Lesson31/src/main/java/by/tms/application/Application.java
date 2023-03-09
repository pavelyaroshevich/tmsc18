package by.tms.application;

import by.tms.factory.ElfFactory;
import by.tms.factory.HumanFactory;
import by.tms.factory.OrcFactory;
import by.tms.factory.SoldersFactory;

public class Application {
    private SoldersForm soldersForm;

    public void createSoldersForm(String name, String solder) {
        createFactory(name, solder);
    }

    private void createFactory(String name, String solder) {
        SoldersFactory soldersFactory;
        switch (name) {
            case "орк" -> soldersFactory = new OrcFactory();
            case "эльф" -> soldersFactory = new ElfFactory();
            case "человек" -> soldersFactory = new HumanFactory();
            default -> {
                System.out.println("Unknown solder");
                return;
            }
        }
        soldersForm = new SoldersForm(soldersFactory);
        action(solder);
    }

    private void action(String name) {
        switch (name) {
            case "воин" -> soldersForm.getWarrior().action();
            case "маг" -> soldersForm.getMagician().action();
            case "лучник" -> soldersForm.getArcher().action();
            default -> {
                System.out.println("Unknown solder");
            }
        }
    }

    public static void main(String[] args) {
        Application application = new Application();
        application.createSoldersForm("орк", "маг");
    }
}
