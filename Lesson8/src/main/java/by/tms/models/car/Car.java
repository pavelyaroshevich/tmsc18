package by.tms.models.car;

public class Car {
    private Engine engine;
    protected Tank tank;
    private String model;
    private String yearOfIssue;
    private int distance;

    public Car(Engine engine, Tank tank) {
        this.engine = engine;
        this.tank = tank;
    }

    public void startCar() {
        if (!engine.condition && tank.getCurrentVolume() > 0) {
            engine.startEngine();
            System.out.println("Машина заведена");
            engine.condition = true;
        } else if (engine.condition) {
            System.out.println("Машина была заведена ранее");
        } else {
            System.out.println("Нет топлива");
        }
    }

    public void drivingCar() {
        if (engine.condition) {
            System.out.println("Машина поехала");
            distance += 5;
            tank.currentVolume -= 4;
        } else {
            System.out.println("Двигатель не запущен");
        }
    }

    public void stopCar() {
        if (engine.condition) {
            System.out.println("Глушим машину");
        } else {
            System.out.println("Машина заглохла ранее или не была заведена");
        }
    }

    public void fullDistance() {
        System.out.println("Машина проехала " + getDistance() + " км");
    }

    public void fillFuel() {
        if (tank.getCurrentVolume() < tank.getMaxVolume()) {
            tank.refill();
            System.out.println("Машина заправлена");
        } else if (tank.getCurrentVolume() == tank.getMaxVolume()) {
            System.out.println("Дозаправка не нужна");
        }
    }

    public void remainingFuel() {
        System.out.println(tank.getCurrentVolume());
    }

    public Engine getEngine() {
        return engine;
    }

    public Tank getTank() {
        return tank;
    }

    public int getDistance() {
        return distance;
    }
}
