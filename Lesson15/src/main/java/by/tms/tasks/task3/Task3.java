package by.tms.tasks.task3;

import by.tms.tasks.task1.TextFormatter;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

import static by.tms.tasks.task1.TextFormatter.hasBlacklistWordInString;

public class Task3 {
    private static final String BLACKLIST = "Lesson15/src/main/java/by/tms/tasks/task3/blacklist.txt";
    private static final String BLACKLIST_SEPARATOR = "[,\\s]+";
    private static final String TEXT = "Lesson15/src/main/java/by/tms/tasks/task3/input.txt";

    public static void main(String[] args) {
        try {
            String text = Files.readString(Path.of(TEXT));
            String[] blacklist = Files.readString(Path.of(BLACKLIST)).split(BLACKLIST_SEPARATOR);
            if (hasBlacklistWordInString(text, blacklist)) {
                System.out.println("В тексте обнаружены слова из чёрного списка." +
                        "\nПредложения, подлежащие исправлению:");
                List<String> sentences = TextFormatter.getSentencesFromText(text);
                int sentencesWithBLWords = 0;
                for (String sentence : sentences) {
                    if (hasBlacklistWordInString(sentence, blacklist)) {
                        System.out.println(sentence);
                        sentencesWithBLWords++;
                    }
                }
                System.out.println("Всего предложений подлежащих исправлению: " + sentencesWithBLWords);
            } else {
                System.out.println("В тексте не встречаются слова из чёрного списка.");
            }
        } catch (IOException exception) {
            System.out.println(exception.getMessage());
        }
    }
}
