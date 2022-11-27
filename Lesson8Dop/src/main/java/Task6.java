import java.util.Arrays;

//6. Создайте массив строк. Заполните его произвольными именами
//   людей.
//   Отсортируйте массив.
//   Результат выведите на консоль.
public class Task6 {
    public static void main(String[] args) {
        String[] array = new String[5];
        array[0] = "Vladislav";
        array[1] = "Aleksandr";
        array[2] = "Pavel";
        array[3] = "Dmitry";
        array[4] = "Stepan";
        System.out.println(Arrays.toString(array));
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
    }
}
