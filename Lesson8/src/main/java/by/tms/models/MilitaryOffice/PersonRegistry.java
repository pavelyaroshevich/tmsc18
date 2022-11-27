package by.tms.models.MilitaryOffice;

public class PersonRegistry {
    private Person persons[];

    public Person[] getPersons() {
        return persons;
    }

    public PersonRegistry(Person[] persons) {
        this.persons = persons;
    }
}
