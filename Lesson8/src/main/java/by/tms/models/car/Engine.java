package by.tms.models.car;

public class Engine {
    private final String type;
    private final double engineSize;
    private boolean condition; // false - выключен

    public Engine(String type, double engineSize) {
        this.type = type;
        this.engineSize = engineSize;
    }

    public void startEngine() {
        System.out.println("Двигатель запущен");
    }

    public void stopEngine() {
        if (condition) {
            System.out.println("Двигатель остановлен");
            condition = false;
        } else {
            System.out.println("Что-то не так");
        }
    }

    public void setCondition(boolean condition) {
        this.condition = condition;
    }

    public boolean isCondition() {
        return condition;
    }
}
