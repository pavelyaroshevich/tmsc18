package by.tms.services.car;

import by.tms.models.car.Car;
import by.tms.models.car.Engine;
import by.tms.models.car.Tank;

public class Main {
    public static void main(String[] args) {
        Car car = new Car(new Engine("gasoline", 2.4), new Tank(65, 30));
        car.startCar();
        car.drivingCar();
        car.stopCar();
        car.fullDistance();
        car.fillFuel();
        car.remainingFuel();
    }
}
