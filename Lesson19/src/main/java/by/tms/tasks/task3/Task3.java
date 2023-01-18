package by.tms.tasks.task3;

import org.apache.commons.lang3.StringUtils;

import java.util.stream.Stream;

public class Task3 {
    public static void main(String[] args) {
        Stream.of("john", "arya", "sansa")
                .map(StringUtils::capitalize)
                .forEach(System.out::println);
    }
}
