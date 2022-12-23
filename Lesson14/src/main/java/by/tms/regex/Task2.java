package by.tms.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

//        3) Дана строка "Versions: Java  5, Java 6, Java   7, Java 8, Java 12."  Найти все подстроки "Java X", где X - число и распечатать их.
public class Task2 {
    public static void main(String[] args) {
        String text = "Versions: Java  5, Java 6, Java   7, Java 8, Java 12";
        Pattern PATTERN = Pattern.compile("Java\\s+[0-9]+");
        Matcher matcher = PATTERN.matcher(text);
        while (matcher.find()) {
            System.out.println(text.substring(matcher.start(), matcher.end()));
        }
    }
}
