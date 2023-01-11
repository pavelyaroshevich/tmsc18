package by.tms.tasks.task2;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Task2 {
    public static void main(String[] args) {
        String date = "2023-01-09";
        LocalDate localDate = LocalDate.parse(date, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        DayOfWeek dayOfWeek = localDate.getDayOfWeek();
        System.out.println("Today is: " + date + " - " + dayOfWeek);
        switch (dayOfWeek) {
            case MONDAY -> System.out.println("The date of next TUESDAY: " + localDate.plusDays(8));
            case TUESDAY -> System.out.println("The date of next TUESDAY: " + localDate.plusDays(7));
            case WEDNESDAY -> System.out.println("The date of next TUESDAY: " + localDate.plusDays(6));
            case THURSDAY -> System.out.println("The date of next TUESDAY: " + localDate.plusDays(5));
            case FRIDAY -> System.out.println("The date of next TUESDAY: " + localDate.plusDays(4));
            case SATURDAY -> System.out.println("The date of next TUESDAY: " + localDate.plusDays(3));
            case SUNDAY -> System.out.println("The date of next TUESDAY: " + localDate.plusDays(2));
            default -> System.out.println("Something went wrong");
        }
    }
}
