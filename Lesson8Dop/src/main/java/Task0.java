import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

//0. Создайте массив целых чисел. Напишете программу, которая выводит
//   сообщение о том, входит ли заданное число в массив или нет.
//   Пусть число для поиска задается с консоли (класс Scanner).
public class Task0 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[10];
        Random random = new Random();
        int value = scanner.nextInt();
        boolean isTrue = false;
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(11);
        }
        System.out.println(Arrays.toString(array));
        checkNumber(array, value, isTrue);
    }

    private static void checkNumber(int[] array, int value, boolean isTrue) {
        for (int j : array) {
            if (j == value) {
                System.out.println("Число входит в массив");
                isTrue = true;
            }
        }
        if (!isTrue) {
            System.out.println("Число не входит в массив");
        }
    }
}
