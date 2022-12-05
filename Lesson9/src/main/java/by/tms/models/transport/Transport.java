package by.tms.models.transport;

abstract class Transport {
    private int power;
    private int maxSpeed;
    private int weight;
    private String name;

    public double convertPower() {
        return power * 0.73;
    }

    public Transport(int power, int maxSpeed, int weight, String name) {
        this.power = power;
        this.maxSpeed = maxSpeed;
        this.weight = weight;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Мощность - " + power +
                ", Максимальная скорость - " + maxSpeed +
                ", Вес - " + weight +
                ", Модель - " + name + ", ";
    }

    public int getPower() {
        return power;
    }


    public int getMaxSpeed() {
        return maxSpeed;
    }


    public int getWeight() {
        return weight;
    }


    public String getName() {
        return name;
    }
}
