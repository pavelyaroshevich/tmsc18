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
            case MONDAY ->
                    System.out.println("The date of next TUESDAY: " + localDate.plusDays(DayOfWeek.MONDAY.getValue()));
            case TUESDAY ->
                    System.out.println("The date of next TUESDAY: " + localDate.plusDays(DayOfWeek.SUNDAY.getValue()));
            case WEDNESDAY ->
                    System.out.println("The date of next TUESDAY: " + localDate.plusDays(DayOfWeek.SATURDAY.getValue()));
            case THURSDAY ->
                    System.out.println("The date of next TUESDAY: " + localDate.plusDays(DayOfWeek.FRIDAY.getValue()));
            case FRIDAY ->
                    System.out.println("The date of next TUESDAY: " + localDate.plusDays(DayOfWeek.THURSDAY.getValue()));
            case SATURDAY ->
                    System.out.println("The date of next TUESDAY: " + localDate.plusDays(DayOfWeek.WEDNESDAY.getValue()));
            case SUNDAY ->
                    System.out.println("The date of next TUESDAY: " + localDate.plusDays(DayOfWeek.TUESDAY.getValue()));
            default -> System.out.println("Something went wrong");
        }
    }
}
