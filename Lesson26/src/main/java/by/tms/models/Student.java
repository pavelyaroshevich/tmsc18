package by.tms.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Student {
    private int id;
    private String name;
    private String surname;
    private Integer course;

    public Student(String name, String surname, Integer course) {
        this.name = name;
        this.surname = surname;
        this.course = course;
    }
}
