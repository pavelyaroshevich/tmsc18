package by.tms.tasks.task6.models;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Book implements Comparable<Book> {
    private String author;
    private String name;
    private Integer yearOfIssue;


    @Override
    public int compareTo(Book o) {
        return this.getYearOfIssue().compareTo(o.getYearOfIssue());
    }
}
