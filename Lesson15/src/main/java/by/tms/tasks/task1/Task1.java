package by.tms.tasks.task1;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

import static by.tms.tasks.task1.TextFormatter.getPalindromes;

public class Task1 {
    // * 1)В исходном файле hw1/input.txt находятся слова, каждое слово на новой строке.
    // * После запуска программы должен создать файл output.txt, который будет содержать в себе только палиндромы.
    private static final String INPUT_FILE = "Lesson15/src/main/java/by/tms/tasks/task1/input1.txt";
    private static final String OUTPUT_FILE = "Lesson15/src/main/java/by/tms/tasks/task1/output1.txt";

    public static void main(String[] args) {
        try {
            List<String> words = Files.readAllLines(Path.of(INPUT_FILE));
            Files.write(Path.of(OUTPUT_FILE), getPalindromes(words));
        } catch (IOException exception) {
            System.out.println(exception.getMessage());
        }

    }
}