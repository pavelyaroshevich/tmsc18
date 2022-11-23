package by.tms.service;

import by.tms.model.Computer;

public class Main {
    public static void main(String[] args) {
        Computer computer = new Computer(2.5, 16, 512, 4);
        System.out.println(computer);
        computer.onOrOff();
    }
}
