package by.tms.tasks.task1;

import java.util.stream.IntStream;

public class Task1 {
    public static void main(String[] args) {
        IntStream.of(2, 3, 4, 5, 6, 7)
                .map(i -> i * 2)
                .forEach(System.out::println);
    }
}

