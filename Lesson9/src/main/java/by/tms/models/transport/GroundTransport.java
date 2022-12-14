package by.tms.models.transport;

abstract class GroundTransport extends Transport {

    private int countOfWheels;
    private int fuelConsumption;

    public GroundTransport(int power, int maxSpeed, int weight, String name, int countOfWheels, int fuelConsumption) {
        super(power, maxSpeed, weight, name);
        this.countOfWheels = countOfWheels;
        this.fuelConsumption = fuelConsumption;
    }

    public int getCountOfWheels() {
        return countOfWheels;
    }

    public int getFuelConsumption() {
        return fuelConsumption;
    }
}
