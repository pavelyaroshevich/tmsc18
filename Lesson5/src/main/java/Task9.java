import java.util.Arrays;
import java.util.Random;

public class Task9 {
    //        9) Создайте массив размера 20, заполните его случайными целыми числами из отрезка от 0 до 20.
    //        Выведите массив на экран в строку. Замените каждый элемент с нечётным индексом на ноль.
    //        Снова выведете массив на экран на отдельной строке.
    public static void main(String[] args) {
        oddIndex();
    }

    private static void oddIndex() {
        int[] mass = new int[20];
        Random random = new Random();
        for (int i = 0; i < mass.length; i++) {
            mass[i] = random.nextInt(21);
        }
        System.out.println(Arrays.toString(mass));
        for (int i = 0; i < mass.length; i++) {
            if (i % 2 != 0) {
                mass[i] = 0;
            }
        }
        System.out.println(Arrays.toString(mass));
    }
}