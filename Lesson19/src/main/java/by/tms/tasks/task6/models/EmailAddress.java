package by.tms.tasks.task6.models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class EmailAddress {
    private String email;
    private String someData;

    public EmailAddress(String email) {
        this.email = email;
    }
}
