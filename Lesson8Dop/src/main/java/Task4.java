import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

//4. Создайте массив из n случайных целых чисел и выведите его на экран.
//   Размер массива пусть задается с консоли и размер массива может быть
//   больше 5 и меньше или равно 10.
//   Если n не удовлетворяет условию - выведите сообщение об этом.
//   Если пользователь ввёл не подходящее число, то программа должна
//   просить пользователя повторить ввод.
//   Создайте второй массив только из чётных элементов первого массива,
//   если они там есть, и вывести его на экран.
public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int size;
        int count = 0;
        do {
            System.out.println("Введите число из диапазона от 6 до 10");
            while (!scanner.hasNextInt()) {
                System.out.println("Вы ввели не числовое значение");
                scanner.next();
            }
            size = scanner.nextInt();
        } while (size < 6 || size > 10);
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(26);
            if (array[i] % 2 == 0) {
                count++;
            }
        }
        System.out.println(Arrays.toString(array));
        int[] mass = new int[count];
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                mass[index] = array[i];
                index++;
            }
        }
        System.out.println(Arrays.toString(mass));
    }
}
