package by.tms.tasks.task1;

import java.util.Random;
import java.util.stream.Collectors;

public class Task1 {
    public static void main(String[] args) {
        Random random = new Random();
        random.ints(50, 0, 10)
                .map(i -> i * 2)
                .boxed()
                .collect(Collectors.toSet())
                .forEach(System.out::println);

    }
}

