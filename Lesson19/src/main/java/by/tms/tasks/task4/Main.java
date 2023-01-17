package by.tms.tasks.task4;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Car> cars = Arrays.asList(
                new Car("AA1111BX", 2017),
                new Car("AK5555IT", 2010),
                new Car(null, 2012),
                new Car("", 2015),
                new Car("AI3838PP", 2017));
        cars.stream()
                .filter(car -> car.getYearOfIssue() > 2010 && car.getCarNumber() != null && !car.getCarNumber().isEmpty())
                .map(Car::getCarNumber)
                .forEach(System.out::println);


    }
}
