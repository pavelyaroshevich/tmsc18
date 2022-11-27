import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

//1. Создайте массив целых чисел. Удалите все вхождения заданного
//   числа из массива.
//   Пусть число задается с консоли (класс Scanner). Если такого числа нет -
//   выведите сообщения об этом.
//   В результате должен быть новый массив без указанного числа.
public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[10];
        Random random = new Random();
        int value = scanner.nextInt();
        boolean isTrue = false;
        deleteNumber(array, random, value, isTrue);
    }

    private static void deleteNumber(int[] array, Random random, int value, boolean isTrue) {
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(11);
        }
        System.out.println("Исходник " + Arrays.toString(array));
        for (int i = 0; i < array.length; i++) {
            if (value == array[i]) {
                array[i] = 0;
                isTrue = true;
            }
        }
        if (!isTrue) {
            System.out.println("Заданное число не обнаружено");
        } else {
            System.out.println("После удаления " + Arrays.toString(array));
        }
    }
}

