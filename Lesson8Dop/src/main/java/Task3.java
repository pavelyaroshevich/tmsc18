import java.util.Arrays;
import java.util.Random;

//3. Создайте 2 массива из 5 чисел.
//   Выведите массивы на консоль в двух отдельных строках.
//   Посчитайте среднее арифметическое элементов каждого массива и
//   сообщите, для какого из массивов это значение оказалось больше (либо
//   сообщите, что их средние арифметические равны).
public class Task3 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] array = new int[5];
        int[] mass = new int[5];
        int sumArray = 0;
        int sumMass = 0;
        int averageMass;
        int averageArray;
        compareArrays(random, array, mass, sumArray, sumMass);
    }

    private static void compareArrays(Random random, int[] array, int[] mass, int sumArray, int sumMass) {
        int averageArray;
        int averageMass;
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(11);
            sumArray += array[i];
        }
        System.out.println(Arrays.toString(array));
        for (int i = 0; i < mass.length; i++) {
            mass[i] = random.nextInt(11);
            sumMass += mass[i];
        }
        System.out.println(Arrays.toString(mass));
        averageArray = sumArray / array.length;
        averageMass = sumMass / mass.length;
        if (averageArray > averageMass) {
            System.out.println("Среднее арифметическое элементов массива Array больше");
        } else if (averageArray < averageMass) {
            System.out.println("Среднее арифметическое элементов массива Mass больше");
        } else {
            System.out.println("Среднее арифметическое элементов равны");
        }
    }
}
