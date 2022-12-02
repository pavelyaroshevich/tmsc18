package by.tms.models.transport;

public class CargoCar extends GroundTransport {
    private int loadCapacity;

    public CargoCar(int power, int maxSpeed, int weight, String name, int countOfWheels, int fuelConsumption, int loadCapacity) {
        super(power, maxSpeed, weight, name, countOfWheels, fuelConsumption);
        this.loadCapacity = loadCapacity;
    }

    public String getInfo() {
        return toString() +
                ", Количество колес - " + getCountOfWheels() +
                ", Расход топлива - " + getFuelConsumption() +
                ", Грузоподъемность - " + getLoadCapacity() +
                ", Мощность в киловаттах - " + convertPower();
    }

    public void checkCapacity(int capacity) {
        if (capacity <= getLoadCapacity()) {
            System.out.println("Грузовик загружен");
        } else {
            System.out.println("Вам нужен грузовик побольше");
        }
    }

    public int getLoadCapacity() {
        return loadCapacity;
    }
}
