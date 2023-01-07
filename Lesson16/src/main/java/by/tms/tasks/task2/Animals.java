package by.tms.tasks.task2;

import java.io.Serializable;

public class Animals implements AnimalAware, Serializable {
    private String name;
    private int age;

    public Animals(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Animals() {
    }

    @Override
    public void say() {

    }

    @Override
    public String toString() {
        return "Animals{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
