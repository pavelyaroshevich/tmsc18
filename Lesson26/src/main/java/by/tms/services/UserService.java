package by.tms.services;

import by.tms.models.User;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class UserService implements UserAware {
    private User user;

    @Override
    public boolean isVerifyUser(String login, String password) {
        return user.getName().equals(login) && user.getPassword().equals(password);
    }
}
