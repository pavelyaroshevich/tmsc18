package by.tms.tasks.task1;

import java.util.Arrays;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(2, 3, 4, 5, 6, 7);
        numbers.stream()
                .map(i -> i * 2)
                .forEach(System.out::println);
    }
}

