package by.tms.models.spaceport;

import java.util.Random;

public class NoNameShuttle implements IStart {
    @Override
    public boolean checkSystem() {
        Random random = new Random();
        return random.nextInt(10) > 7;
    }

    @Override
    public void startEngine() {
        System.out.println("Двигатели шаттла запущены. Все системы в норме");
    }

    @Override
    public void start() {
        System.out.println("Старт NoName шаттла");
    }
}
