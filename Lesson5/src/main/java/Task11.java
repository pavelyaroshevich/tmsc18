import java.util.Arrays;

public class Task11 {
    //        11) Проверить, различны ли все элементы массива, если не различны то вывести элемент повторяющийся
    //        Пример: {0,3,46,3,2,1,2}
    //        Массив имеет повторяющиеся элементы 3, 2
    //        Пример: {0,34,46,31,20,1,28}
    //        Массив не имеет повторяющихся элементов
    public static void main(String[] args) {
        variousElements(new int[]{0, 3, 46, 3, 2, 1, 2});
    }

    private static void variousElements(int[] mass) {
        if (mass != null && mass.length > 2) {
            Arrays.sort(mass);
            boolean isRepeated = false;
            for (int i = 0, j = i + 1; j < mass.length; j++, i++) {
                if (mass[i] == mass[j]) {
                    if (!isRepeated) {
                        System.out.println(mass[i] + " ");
                        isRepeated = true;
                    }
                } else {
                    isRepeated = false;
                }
            }
        }
    }
}

