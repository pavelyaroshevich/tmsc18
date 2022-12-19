package by.tms.services.authorization;

import by.tms.models.authorization.Authorization;
import by.tms.models.authorization.AuthorizationService;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String[]> authorizationList = List.of(
                new String[]{"11111", "222", "222"},
                new String[]{"111", "2", "222"},
                new String[]{"111", "222", "223"},
                new String[]{"1", "222", "222"},
                new String[]{"111", "2 22", "2 22"},
                new String[]{"111", " 222", " 222"},
                new String[]{"_111", "222", "222"},
                new String[]{"1234567891011121314151617181920", "222", "222"},
                new String[]{"111", "222222222222222222222", "222"},
                new String[]{"2222222222222222222", "2222222222222222222", "2222222222222222222"}
        );
        AuthorizationService service = new Authorization();
        for (String[] strings : authorizationList) {
            System.out.println("Login: " + strings[0] + "; Password: " + strings[1] + "; Confirm password: " + strings[2] + ";");
            try {
                System.out.println(service.checkAuthorization(strings[0], strings[1], strings[2]) ? "Авторизация успешна" : "Авторизация отклонена");
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
}