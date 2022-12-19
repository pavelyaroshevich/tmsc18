package by.tms.textformatter.services;

import by.tms.textformatter.models.TextFormatter;

import static by.tms.textformatter.utils.Constants.MAX_COUNT_OF_WORDS;
import static by.tms.textformatter.utils.Constants.MIN_COUNT_OF_WORDS;

public class Main {
    public static void main(String[] args) {
        TextFormatter textFormatter = new TextFormatter();
        String str = "Мария не декоратор. Не дизайнер. Не художник. Она айтишница. Шалаш тут. Марии сегодня исполнилось двадцать лет";
        String[] strings = str.split("\\.");
        for (int i = 0; i < strings.length; i++) {
            if (textFormatter.isPalindrome(strings[i].trim()) ||
                    textFormatter.returnNumberOfWords(strings[i].trim()) >= MIN_COUNT_OF_WORDS &&
                            textFormatter.returnNumberOfWords(strings[i].trim()) <= MAX_COUNT_OF_WORDS) {
                System.out.println(strings[i].trim());
            }
        }
    }
}
