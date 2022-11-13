import java.util.Scanner;

public class EvenValue {
    public static void main(String[] args) {
        System.out.println("Введите целое число ");
        Scanner scanner = new Scanner(System.in);
        String value = scanner.next();
        try {
            int value1 = Integer.parseInt(value);
            if (value1 % 2 == 0) {
                System.out.println("Введенное число является чётным ");
            } else {
                System.out.println("Введенное число является нечетным");
            }
        } catch (NumberFormatException ignore) {
            System.out.println("Вы ввели не числовое значение ");
        }
    }
}
