package by.tms.services.spaceport;

import by.tms.models.spaceport.*;

public class Main {
    public static void main(String[] args) {
        SpacePort spacePort = new SpacePort();
        IStart iStart = new Shuttle();
        spacePort.start(iStart);
        System.out.println("___________");
        IStart iStart1 = new SpaceX();
        spacePort.start(iStart1);
        System.out.println("___________");
        IStart iStart2 = new NoNameShuttle();
        spacePort.start(iStart2);

    }
}
