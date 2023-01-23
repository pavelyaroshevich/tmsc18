package by.tms.tasks.task6.models;

import lombok.*;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
public class Reader {
    private String name;
    private String emailAddress;
    private boolean subscriber;
    private List<Book> bookList;
}
