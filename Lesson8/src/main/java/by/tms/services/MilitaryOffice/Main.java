package by.tms.services.MilitaryOffice;

import by.tms.models.MilitaryOffice.Address;
import by.tms.models.MilitaryOffice.MilitaryOffice;
import by.tms.models.MilitaryOffice.Person;
import by.tms.models.MilitaryOffice.PersonRegistry;

public class Main {
    public static void main(String[] args) {
        Person[] persons = new Person[16];
        persons[0] = new Person("Aleksandr", 22, "M", new Address("Minsk", "Belarus"));
        persons[1] = new Person("Roman", 16, "M", new Address("Vitebsk", "Belarus"));
        persons[2] = new Person("Andrei", 32, "M", new Address("Minsk", "Belarus"));
        persons[3] = new Person("Aleksandr", 34, "M", new Address("Gomel", "Belarus"));
        persons[4] = new Person("Pavel", 19, "M", new Address("Minsk", "Belarus"));
        persons[5] = new Person("Aleksandr", 27, "M", new Address("Brest", "Belarus"));
        persons[6] = new Person("Maksim", 32, "M", new Address("Minsk", "Belarus"));
        persons[7] = new Person("Aleksandr", 31, "M", new Address("Minsk", "Belarus"));
        persons[8] = new Person("Sergei", 17, "M", new Address("Baranovichi", "Belarus"));
        persons[9] = new Person("Victoria", 26, "F", new Address("Minsk", "Belarus"));
        persons[10] = new Person("Aleksei", 24, "M", new Address("Minsk", "Belarus"));
        persons[11] = new Person("Ruslan", 17, "M", new Address("Minsk", "Belarus"));
        persons[12] = new Person("Aleksandr", 30, "M", new Address("Minsk", "Belarus"));
        persons[13] = new Person("Stepan", 24, "M", new Address("Mikashevichi", "Belarus"));
        persons[14] = new Person("Bogdan", 24, "M", new Address("Mogilov", "Belarus"));
        persons[15] = new Person("Aleksandr", 24, "M", new Address("Grodno", "Belarus"));
        PersonRegistry personRegistry = new PersonRegistry(persons);
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
