import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

//1. Создать трехмерный массив из целых чисел.
//   С помощью циклов "пройти" по всему массиву и увеличить каждый
//   элемент на заданное число. Пусть число, на которое будет
//   увеличиваться каждый элемент, задается из консоли.
public class Task8 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int[][][] array = new int[3][3][3];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                for (int k = 0; k < array.length; k++) {
                    array[i][j][k] = random.nextInt(10);
                }
            }
        }
        System.out.println(Arrays.deepToString(array));
        int value = scanner.nextInt();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                for (int k = 0; k < array.length; k++) {
                    array[i][j][k] += value;
                }
            }
        }
        System.out.println(Arrays.deepToString(array));
    }
}
