package by.tms.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task1 {
    //     Дана строка "cab, ccab, cccab" Необходимо составить регулярное выражение, сделать класс Pattern, Matcher, вызвать метод find и вывести слова на консоль
//     * Должно вывести:
//     * cab
//     * ccab
//     * cccab
    public static void main(String[] args) {
        String text = "cab, ccab, cccab, cb";
        Pattern PATTERN = Pattern.compile("c+ab");
        Matcher matcher = PATTERN.matcher(text);
        while (matcher.find()) {
            System.out.println(text.substring(matcher.start(), matcher.end()));
        }
    }
}
