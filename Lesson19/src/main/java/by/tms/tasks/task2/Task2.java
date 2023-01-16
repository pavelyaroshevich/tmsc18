package by.tms.tasks.task2;

import java.util.Random;
import java.util.Set;
import java.util.stream.Collectors;

public class Task2 {
    public static final int COUNT_OF_INTS = 50;

    public static void main(String[] args) {
        System.out.println(getRandomSet().size());
    }

    private static Set<Integer> getRandomSet() {
        return new Random()
                .ints(0, 51)
                .limit(COUNT_OF_INTS)
                .filter(i -> i % 2 == 0)
                .boxed()
                .collect(Collectors.toSet());

    }
}
