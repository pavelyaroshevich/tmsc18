package by.tms.model;

import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

public class Computer {
    public double cpu;
    public int ram;
    public int hdd;
    public int resourceWork;
    protected boolean computerBreak = false;
    protected Scanner scanner = new Scanner(System.in);

    public Computer(int resourceWork) {
        this.resourceWork = resourceWork;
    }

    public Computer(double cpu, int ram, int hdd, int resourceWork) {
        this.cpu = cpu;
        this.ram = ram;
        this.hdd = hdd;
        this.resourceWork = resourceWork;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "cpu=" + cpu +
                ", ram=" + ram +
                ", hdd=" + hdd +
                ", resourceWork=" + resourceWork +
                '}';
    }

    public void onOrOff() {
        System.out.println("Выберите действие (on/off)");
        if (Objects.equals(scanner.nextLine(), "on")) {
            on();
        } else if (Objects.equals(scanner.nextLine(), "off")) {
            off();
        }
    }

    public void on() {
        if (!computerBreak) {
            System.out.println("Внимание! Введите 0 или 1");
            Random random = new Random();
            if (scanner.nextInt() == random.nextInt(2)) {
                System.out.println("Компьютер выключен");
                onOrOff();
            } else {
                System.out.println("Компьютер сгорел");
                computerBreak = true;
                onOrOff();
            }
        } else {
            System.out.println("Компьютер сгорел");
        }
    }

    public void off() {
        if (computerBreak && resourceWork <= 0) {
            System.out.println("Компьютер сгорел");
        } else {
            System.out.println("Выключение компьютера");
            resourceWork--;
        }
    }
}

