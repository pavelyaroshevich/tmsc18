package by.tms.models.authorization;

public interface AuthorizationService {
    boolean checkAuthorization(String login, String password, String confirmPassword) throws Exception;
}
