import java.util.Arrays;
import java.util.Scanner;

//2. Создайте и заполните массив случайным числами и выведете
//   максимальное, минимальное и среднее значение.
//   Для генерации случайного числа используйте метод Math.random().
//   Пусть будет возможность создавать массив произвольного размера.
//   Пусть размер массива вводится с консоли.
public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[scanner.nextInt()];
        double averageValue;
        int maxValue;
        int minValue;
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 10);
            sum += array[i];
        }
        System.out.println(Arrays.toString(array));
        Arrays.sort(array);
        System.out.println(minValue = array[0]);
        System.out.println(maxValue = array[array.length - 1]);
        System.out.println(averageValue = sum / array.length);
    }
}
