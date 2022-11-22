import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task12 {
    //        12) Создаём квадратную матрицу, размер вводим с клавиатуры.
//        Заполняем случайными числами в диапазоне от 0 до 50. И выводим на консоль(в виде матрицы).
//        Далее необходимо транспонировать матрицу(1 столбец станет 1-й строкой, 2-й столбец - 2-й строкой и т. д.)
//        Пример:
//          1 2 3 4      1 6 3 1
//          6 7 8 9      2 7 3 5
//          3 3 4 5      3 8 4 6
//          1 5 6 7      4 9 5 7
    public static void main(String[] args) {
        System.out.println("Введите размер матрицы");
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int[][] mass = new int[scanner.nextInt()][scanner.nextInt()];
        for (int i = 0; i < mass.length; i++) {
            for (int j = 0; j < mass.length; j++) {
                mass[i][j] = random.nextInt(51);
                System.out.print(mass[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println();
        transpose(mass);
    }
    public static void transpose(int[][] mass) {
        int[][] transposedMass = new int[mass.length][mass.length];
        for (int i = 0; i < mass.length; i++) {
            for (int j = 0; j < mass.length; j++) {
                transposedMass[j][i] = mass[i][j];
            }
        }
        for (int i = 0; i < transposedMass.length; i++) {
            for (int j = 0; j < transposedMass.length; j++) {
                System.out.printf("%2d ", transposedMass[i][j]);
            }
            System.out.println();
        }
    }
}
