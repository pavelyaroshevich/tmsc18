package by.tms.models;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@ToString
@EqualsAndHashCode
public class User {
    private String login;
    private String password;
}
