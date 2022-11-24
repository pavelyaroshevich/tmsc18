package by.tms.services.MilitaryOffice;

import by.tms.models.MilitaryOffice.Address;
import by.tms.models.MilitaryOffice.MilitaryOffice;
import by.tms.models.MilitaryOffice.Person;
import by.tms.models.MilitaryOffice.PersonRegistry;

public class Main {
    public static void main(String[] args) {
        Person[] mass = new Person[16];
        mass[0] = new Person("Aleksandr", 22, "M", new Address("Minsk","Belarus"));
        mass[1] = new Person("Roman", 16, "M", new Address("Vitebsk","Belarus"));
        mass[2] = new Person("Andrei", 32, "M", new Address("Minsk","Belarus"));
        mass[3] = new Person("Aleksandr", 34, "M", new Address("Gomel","Belarus"));
        mass[4] = new Person("Pavel", 19, "M", new Address("Minsk","Belarus"));
        mass[5] = new Person("Aleksandr", 27, "M", new Address("Brest","Belarus"));
        mass[6] = new Person("Maksim", 32, "M", new Address("Minsk","Belarus"));
        mass[7] = new Person("Aleksandr", 31, "M", new Address("Minsk","Belarus"));
        mass[8] = new Person("Sergei", 17, "M", new Address("Baranovichi","Belarus"));
        mass[9] = new Person("Victoria", 26, "F", new Address("Minsk","Belarus"));
        mass[10] = new Person("Aleksei", 24, "M", new Address("Minsk","Belarus"));
        mass[11] = new Person("Ruslan", 17, "M", new Address("Minsk","Belarus"));
        mass[12] = new Person("Aleksandr", 30, "M", new Address("Minsk","Belarus"));
        mass[13] = new Person("Stepan", 24, "M", new Address("Mikashevichi","Belarus"));
        mass[14] = new Person("Bogdan", 24, "M", new Address("Mogilov","Belarus"));
        mass[15] = new Person("Aleksandr", 24, "M", new Address("Grodno","Belarus"));
        PersonRegistry personRegistry = new PersonRegistry(mass);
        MilitaryOffice militaryOffice = new MilitaryOffice(personRegistry);
        militaryOffice.printOne();
        System.out.println("________");
        militaryOffice.printTwo();
        System.out.println("________");
        militaryOffice.printThree();
        System.out.println("________");
        militaryOffice.printFour();

    }
}
