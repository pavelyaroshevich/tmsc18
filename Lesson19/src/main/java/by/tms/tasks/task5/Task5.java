package by.tms.tasks.task5;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

//        5) Задан список сотрудников, которые хранятся в коллекции List<p3.Person>.
//        * Объект сp3.Person одержит имя и фамилию(по желанию другие данные)
//        *  a) написать метод, который отображает все фамилии, начинающиеся на букву "Д".
//        *     Внимание! метод должен вернуть объект Optional<String>.
//        *  b*)Со звездочкой. Написать метод, который будет выводить в столбик первую букву фамилии и рядом количество сотрудников,
//        *  у которых фамилия начинается с этой буквы.
//        *  Пример: Антонов, Петров, Сидоров, Александров...
//        *  на экран выведет:
//        *  A - 2 сотрудника
//        *  П - 1 сотрудник
//        *  С - 1 сотрудник
public class Task5 {
    public static void main(String[] args) {
        List<Person> personList = new ArrayList<>();
        personList.add(new Person("Павел", "Деревянко"));
        personList.add(new Person("Дмитрий", "Назаров"));
        personList.add(new Person("Бред", "Питт"));
        personList.add(new Person("Леонардо", "ДиКаприо"));
        personList.add(new Person("Меган", "Фокс"));
        getSurname(personList);
    }

    public static Optional<String> getSurname(List<Person> personList) {
        System.out.println(personList.stream()
                .map(Person::getSurname)
                .filter(surname -> surname.charAt(0) == 'Д')
                .toList());
        return Optional.empty();
    }

}