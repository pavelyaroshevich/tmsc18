package by.tms.tasks.task2;

import by.tms.tasks.task1.TextFormatter;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

//2)        Текстовый файл hw2/input.txt содержит текст.
//        * После запуска программы в другой файл должны записаться только те предложения, в которых от 3-х до 5-ти слов.
//        * Если в предложении присутствует слово-палиндром, то не имеет значения какое кол-во слов в предложении, оно попадает в output.txt файл.
public class Task2 {
    private static final String INPUT_FILE = "Lesson15/src/main/java/by/tms/tasks/task2/input.txt";
    private static final String OUTPUT_FILE = "Lesson15/src/main/java/by/tms/tasks/task2/output.txt";

    public static void main(String[] args) throws IOException {
        String text = Files.readString(Path.of(INPUT_FILE));

        List<String> sentences = TextFormatter.getSentencesFromText(text);
        List<String> filteredSentences = new ArrayList<>();
        for (String sentence : sentences) {
            int numberOfWords = TextFormatter.getCountWordsInString(sentence);
            if (numberOfWords >= 3 && numberOfWords <= 5 || TextFormatter.hasPalindromeInString(sentence)) {
                filteredSentences.add(sentence);
            }
        }

        Files.write(Path.of(OUTPUT_FILE), filteredSentences);
    }
}
