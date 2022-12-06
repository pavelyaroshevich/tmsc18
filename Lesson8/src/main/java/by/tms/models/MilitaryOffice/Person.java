package by.tms.models.MilitaryOffice;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class Person {
    private String name;
    private int age;
    private String sex;
    private Address address;
}
