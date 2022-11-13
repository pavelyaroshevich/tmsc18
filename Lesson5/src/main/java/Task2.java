public class Task2 {
    //2) Одноклеточная амеба каждые 3 часа делится на 2 клетки. Определить,
    //         сколько амеб будет через 3, 6, 9, 12,..., 24 часа
    public static void main(String[] args) {
        countAmyoba();
    }

    private static void countAmyoba() {
        int value = 1;
        for (int i = 0; i <= 24; i += 3, value *= 2) {
            System.out.println(value);
        }
    }
}
