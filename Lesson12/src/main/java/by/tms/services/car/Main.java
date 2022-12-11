package by.tms.services.car;

import by.tms.models.car.Car;
import by.tms.models.car.CarNotStartException;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("Honda", 200, 15000);
        Car car1 = new Car("Opel", 220, 4000);
        Car car2 = new Car("Porsche", 320, 300000);
        checkCar(car);
        checkCar(car1);
        checkCar(car2);
    }

    private static void checkCar(Car car) {
        try {
            car.start();
        } catch (CarNotStartException e) {
            System.out.println(e.getMessage());
        }
    }
}
