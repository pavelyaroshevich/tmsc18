package by.tms.models.MilitaryOffice;//1) задача!
    /*
    Необходимо написать военкомат.
    1) Создаем класс военкомат by.tms.models.MilitaryOffice
    2) Создать в классе by.tms.models.MilitaryOffice конструктор, который принимает PersonRegistry.
    3) PersonRegistry содержит список людей (Person), которые могут быть призваны в армию.
    4) Создать класс Person, который будет содержать следующие поля имя, возраст, пол, адрес(страна, город)
    Военкомат должен уметь:
    а) вывести имена всех людей годных к военной службе на текущий момент времени, которые есть в PersonRegistry
    T.е нужно написать метод в классе by.tms.models.MilitaryOffice, который будет отфильтровывать годных к службе призывников
    (годными считать мужчин от 18 до 27 лет, проверяем пол и возраст)
    б) вывести количество годных призывников в городе Минске.
    в) вывести количество призывников от 25 до 27 лет
    г) вывести количество призывников у которых имя Александр.
    5) Создать класс Main, наполнить PersonRegistry людьми, по желанию можно создавать людей через консоль
    */

public class MilitaryOffice {
    private PersonRegistry personRegistry;

    public MilitaryOffice(PersonRegistry personRegistry) {
        this.personRegistry = personRegistry;
    }

    public void printOne() {
        for (int i = 0; i < personRegistry.getPersons().length; i++) {
            if (personRegistry.getPersons()[i].getAge() >= 18 && personRegistry.getPersons()[i].getAge() <= 27 && personRegistry.getPersons()[i].getSex().equals("M")) {
                System.out.println(personRegistry.getPersons()[i].getName());
            }
        }
    }

    public void printTwo() {
        int count = 0;
        for (int i = 0; i < personRegistry.getPersons().length; i++) {
            if (personRegistry.getPersons()[i].getAge() >= 18 && personRegistry.getPersons()[i].getAge() <= 27 && personRegistry.getPersons()[i].getAddress().getCity().equals("Minsk")) {
                count++;
            }
        }
        System.out.println(count);
    }

    public void printThree() {
        int count = 0;
        for (int i = 0; i < personRegistry.getPersons().length; i++) {
            if (personRegistry.getPersons()[i].getAge() >= 25 && personRegistry.getPersons()[i].getAge() <= 27) {
                count++;
            }
        }
        System.out.println(count);
    }

    public void printFour() {
        int count = 0;
        for (int i = 0; i < personRegistry.getPersons().length; i++) {
            if (personRegistry.getPersons()[i].getName().equals("Aleksandr")) {
                count++;
            }
        }
        System.out.println(count);
    }
}