import java.util.Random;

public class Task3 {
    //3) В переменную записываем число.
    //        Надо вывести на экран сколько в этом числе цифр и положительное оно или отрицательное.
    //        Например, введите число: 5
    //        "5 - это положительное число, количество цифр = 1"
    public static void main(String[] args) {
        Random random = new Random();
        int value = random.nextInt(10000) - 5000;
        int length = (int) (Math.log10(Math.abs(value)) + 1);
        if (value > 0) {
            System.out.println(value + " - положительное");
            System.out.println("Кол-во цифр = " + length);
        } else if (value < 0) {
            System.out.println(value + " - отрицательное");
            System.out.println("Кол-во цифр = " + length);
        } else {
            System.out.println("Нулевое значение, кол-во цифр = 1");
        }
    }
}
