import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        int count = 0;
        System.out.println("Введите числовые значения через пробел");
        Scanner console = new Scanner(System.in);
        String[] str = console.nextLine().split(" ");
        for (String s : str) {
            try {
                int i = Integer.parseInt(s);
                if (i > 0) {
                    count++;
                }
            } catch (NumberFormatException exception) {
            }
        }
        System.out.println("Количество положительных чисел - " + count);
    }
}