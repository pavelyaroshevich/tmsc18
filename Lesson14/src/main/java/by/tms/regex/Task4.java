package by.tms.regex;

public class Task4 {
//    *  5*)со звездочкой! В метод на вход приходит строка
//    *
//    *  public static boolean validate(String str) {
//        return false;
//    }
//     * Необходимо выполнить проверку на валидацию входящей строки и вернуть false или true
//     * - Строка должна содержать только маленькие латинские буквы и цифры 1 или 5 без знака подчеркивания.
//     * - Длина строки должна быть от 4 до 20 символов.

    public static void main(String[] args) {
        System.out.println(validate("1111dfgdg5555dfgdfgd"));
        System.out.println(validate("5555sssss1111asddsss"));
        System.out.println(validate("24"));
        System.out.println(validate("17"));
        System.out.println(validate("54"));
        System.out.println(validate("15151515151515151515"));
    }

    private static boolean validate(String string) {
        return !(string.length() < 20 || string.length() > 4 && string.matches("[a-z.,15]"));
    }
}
