import java.util.Arrays;

//7. Реализуйте алгоритм сортировки пузырьком.
public class Task7 {
    public static void main(String[] args) {
        int[] array = {4, 5, 1, 9, 3, 2, 8, 6, 7};
        int temporaryVariable;
        boolean isSorted = false;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    isSorted = false;
                    temporaryVariable = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temporaryVariable;
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }
}
