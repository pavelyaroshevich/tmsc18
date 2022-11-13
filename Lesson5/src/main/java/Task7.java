import java.util.Arrays;

public class Task7 {
    //        7) Создайте массив из всех нечётных чисел от 1 до 100, выведите его на экран в строку,
    //        а затем этот же массив выведите на экран тоже в строку, но в обратном порядке (99 97 95 93 ... 7 5 3 1).
    public static void main(String[] args) {
        reverseMass();
    }

    private static void reverseMass() {
        int[] mass = new int[50];
        for (int i = 0; i < mass.length; i++) {
            mass[i] = 2 * i + 1;
        }
        System.out.println(Arrays.toString(mass));
        System.out.println("Наоборот");
        for (int j = mass.length - 1; j >= 0; j--) {
            mass[j] = 2 * mass.length - 2 * j - 1;
        }
        System.out.println(Arrays.toString(mass));
    }
}