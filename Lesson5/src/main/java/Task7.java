import java.util.Arrays;
import java.util.Collections;

public class Task7 {
    //        7) Создайте массив из всех нечётных чисел от 1 до 100, выведите его на экран в строку,
    //        а затем этот же массив выведите на экран тоже в строку, но в обратном порядке (99 97 95 93 ... 7 5 3 1).
    public static void main(String[] args) {
        reverseMass();
    }

    private static void reverseMass() {
        Integer[] mass = new Integer[50];
        for (int i = 0; i < mass.length; i++) {
            mass[i] = 2 * i + 1;
        }
        System.out.println(Arrays.toString(mass));
        System.out.println("Наоборот");
        Arrays.sort(mass, Collections.reverseOrder());
        System.out.println(Arrays.toString(mass));
    }
}