package by.tms.models;

public class PassengerCar extends GroundTransport {
    private String bodyType;
    private int countOfPassenger;
    private double distance;
    private double time = 4.5;

    public PassengerCar(int power, int maxSpeed, int weight, String name, int countOfWheels, int fuelConsumption, String bodyType, int countOfPassenger) {
        super(power, maxSpeed, weight, name, countOfWheels, fuelConsumption);
        this.bodyType = bodyType;
        this.countOfPassenger = countOfPassenger;
    }

    public String getInfo() {
        return "Мощность - " + getPower() +
                ", Максимальная скорость - " + getMaxSpeed() +
                ", Вес - " + getWeight() +
                ", Модель - " + getName() +
                ", Количество колес - " + getCountOfWheels() +
                ", Расход топлива - " + getFuelConsumption() +
                ", Тип кузова - " + getBodyType() +
                ", Количество пассажиров - " + getCountOfPassenger() +
                ", Мощность в киловаттах - " + convertPower();
    }

    public double distance() {
        distance = getMaxSpeed() * time;
        return distance;
    }

    private double calculationFuel() {
        double fuel = distance * getFuelConsumption() / 100;
        return fuel;
    }

    public void getCharacteristic() {
        System.out.println("За время " + time + "ч, автомобиль " + getName() + " двигаясь с максимальной скоростью " + getMaxSpeed() + "км/ч проедет " + distance() + " км и израсходует " + calculationFuel() + " литров топлива.");
    }

    public String getBodyType() {
        return bodyType;
    }

    public int getCountOfPassenger() {
        return countOfPassenger;
    }
}
