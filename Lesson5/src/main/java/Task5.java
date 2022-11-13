public class Task5 {
    public static void main(String[] args) {
        //        5) Напишите реализацию метода summ(int a, int b), вычисляющий a*b, не пользуясь операцией
        //        умножения, где a и b целые числа, вызовите метод summ  в методе main и распечатайте на консоль.
        System.out.println(summ(5, 8));
    }

    public static int summ(int a, int b) {
        int sum = 0;
        for (int i = 0; i < b; i++) {
            sum += a;
        }
        return sum;
    }
}
