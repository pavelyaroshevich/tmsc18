package by.tms.tasks;

public class Task1 {
    //     Вырезать подстроку из строки начиная с первого вхождения символа(А) до, последнего вхождения символа(B).
    public static void main(String[] args) {
        String str = "zdsfafdsbfdsfvs";
        int indexFirstA = str.indexOf("a");
        int indexLastB = str.lastIndexOf("b");
        System.out.println(str.substring(indexFirstA, indexLastB + 1));
        System.out.println(str.replace(str.substring(3, 4), str.substring(0, 1)));
        String[] stringArray = {"казак", "дед", "спасибо", "возможно", "шалаш"};
        for (String s : stringArray) {
            if (isPalindrome(s)) {
                System.out.println(s);
            }
        }
    }

    private static boolean isPalindrome(String string) {
        StringBuilder stringBuilder = new StringBuilder(string);
        return string.equals(String.valueOf(stringBuilder.reverse()));
    }
}
