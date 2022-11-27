import java.util.Arrays;
import java.util.Random;

//5. Создайте массив и заполните массив.
//   Выведите массив на экран в строку.
//   Замените каждый элемент с нечётным индексом на ноль.
//   Снова выведете массив на экран на отдельной строке.
public class Task5 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(101);
        }
        System.out.println(Arrays.toString(array));
        for (int i = 1; i < array.length; i += 2) {
            array[i] = 0;
        }
        System.out.println(Arrays.toString(array));
    }
}
