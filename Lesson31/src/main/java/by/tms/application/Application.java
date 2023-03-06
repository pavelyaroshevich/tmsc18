package by.tms.application;

import by.tms.factory.ElfFactory;
import by.tms.factory.HumanFactory;
import by.tms.factory.OrcFactory;
import by.tms.factory.SoldersFactory;

public class Application {
    private SoldersForm soldersForm;

    public void createSoldersForm(String name) {
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
    }

    public static void main(String[] args) {
        Application application = new Application();
        application.createSoldersForm("орк");

    }
}
