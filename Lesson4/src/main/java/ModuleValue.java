import java.util.Scanner;

public class ModuleValue {
    public static void main(String[] args) {
        getDataTypes();
    }

    //3) Меньшее по модулю число
    // создать программу, которая будет выводить на экран меньшее по модулю из трёх введённых
    // пользователем вещественных чисел с консоли.
    private static void getDataTypes() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите 3 вещественных числа ");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();
        int[] array = {Math.abs(num1), Math.abs(num2), Math.abs(num3)};
        int min = array[0];
        for (int index : array) {
            if (min > index) {
                min = index;
            }
        }
        System.out.println("Наименьшее число по модулю - " + min);
    }
}