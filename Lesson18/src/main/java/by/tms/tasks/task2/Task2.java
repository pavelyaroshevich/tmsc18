package by.tms.tasks.task2;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.time.temporal.Temporal;
import java.time.temporal.TemporalAdjuster;

@Getter
@Setter
public class Task2 {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        System.out.println("Следующий вторник :" + localDate.with(new TemporalAdjuster() {
            @Override
            public Temporal adjustInto(Temporal temporal) {
                return null;
            }
        }));
    }
}
