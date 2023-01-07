package by.tms.tasks.task4;

import java.io.*;

public class Task4 {
    private static String FILE = "Lesson15/src/main/java/by/tms/tasks/task4/Car.ser";

    public static void main(String[] args) {
        Car car = new Car("Opel", 204, 4000);
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(FILE))) {
            outputStream.writeObject(car);
        } catch (IOException e) {
            e.printStackTrace();
        }
        Car carFromFile = null;
        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(FILE))) {
            carFromFile = (Car) inputStream.readObject();
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(carFromFile);
    }
}

