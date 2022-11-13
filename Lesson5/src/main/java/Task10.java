import java.util.Arrays;

public class Task10 {
    //        10) Найти максимальный элемент в массиве {4,5,0,23,77,0,8,9,101,2} и поменять его местами с нулевым элементом
    public static void main(String[] args) {
        findMax();
    }

    private static void findMax() {
        int[] mass = {4, 5, 0, 23, 77, 0, 8, 9, 101, 2};
        int max = mass[0];
        for (int i = 0; i < mass.length; i++) {
            if (mass[i] > max) {
                max = mass[i];
            }
        }
        for (int i = 0; i < mass.length; i++) {
            if (mass[i] == 0) {
                mass[i] = max;
            }
        }
        System.out.println(Arrays.toString(mass));
    }
}
