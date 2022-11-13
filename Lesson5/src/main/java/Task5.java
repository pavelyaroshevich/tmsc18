public class Task5 {
    public static void main(String[] args) {
        //        5) Напишите реализацию метода sum(int a, int b), вычисляющий a*b, не пользуясь операцией
        //        умножения, где a и b целые числа, вызовите метод sum в методе main и распечатайте на консоль.
        System.out.println(sum(3, 3));
    }

    public static int sum(int a, int b) {
        int sum = 0;
        if (a < 0 && b < 0) {
            for (int i = 0; i < Math.abs(b); i++) {
                sum += Math.abs(a);
            }
        } else if (a == 0 || b == 0) {
            for (int i = 0; i < b; i++) {
                sum = 0;
            }
        } else if (a < 0 || b < 0) {
            for (int i = 0; i < Math.abs(b); i++) {
                sum += Math.abs(a) * -1;
            }
        } else {
            for (int i = 0; i < Math.abs(b); i++) {
                sum += Math.abs(a);
            }
        }
        return sum;
    }
}
