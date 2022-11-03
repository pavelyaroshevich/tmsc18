import java.util.Scanner;

public class EvenNumber {
    public static void main(String[] args) {
        System.out.println("Введите целое число ");
        Scanner scanner = new Scanner(System.in);
        String number = scanner.nextLine();
        try {
            int value = Integer.parseInt(number);
            if (value % 2 == 0) {
                System.out.println("Введенное число является чётным ");
            } else {
                System.out.println("Введенное число является нечетным");
            }
        } catch (NumberFormatException ignore) {
            System.out.println("Вы ввели не числовое значение ");
        }
    }
}
