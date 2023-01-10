package by.tms.tasks.task1;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Task1 {
    public static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        String date = "2023.01.11";
        LocalDate localDate = LocalDate.parse(date, DateTimeFormatter.ofPattern("yyyy.MM.dd"));
        System.out.println(localDate.getDayOfWeek());
    }
}
