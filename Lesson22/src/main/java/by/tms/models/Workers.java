package by.tms.models;

import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Workers {
    private Long id;
    private String login;
    private BigDecimal salary;
    private int age;
    private LocalDate date;
    private String description;
}


