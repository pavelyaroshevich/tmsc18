package by.tms.models.authorization;

import java.util.Objects;

import static by.tms.utils.autorization.Constants.*;

public class Authorization implements AuthorizationService {
    @Override
    public boolean checkAuthorization(String login, String password, String confirmPassword) throws Exception {
        if (!login.matches(PATTERN_LOGIN)) {
            throw new WrongLoginException("В поле ЛОГИН введены не корректные данные");
        }
        if (!password.matches(PATTERN_PASSWORD)) {
            throw new WrongPasswordException("В поле ПАРОЛЬ введены не корректные данные");
        }
        if (!Objects.equals(password, confirmPassword)) {
            throw new WrongPasswordException("Пароли не совпадают");
        }
        return true;
    }
}
