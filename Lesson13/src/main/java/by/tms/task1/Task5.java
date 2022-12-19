package by.tms.task1;

public class Task5 {
    public static void main(String[] args) {
        String str = "машина";
        String str1 = "сигарета";
        String str2 = "поле";
        System.out.println(returnMiddleElements(str));
        System.out.println(returnMiddleElements(str1));
        System.out.println(returnMiddleElements(str2));
    }

    private static String returnMiddleElements(String string) {
        return string.substring(string.length() / 2 - 1, string.length() / 2 + 1);
    }
}
