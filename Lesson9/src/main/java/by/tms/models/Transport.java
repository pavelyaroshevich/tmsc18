package by.tms.models;

public class Transport {
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
