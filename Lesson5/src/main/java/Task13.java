import java.util.Random;

public class Task13 {
    /**
     * заполнить рандомно 2-х мерный массив и посчитать сумму элементов на диагонали
     */
    public static void main(String[] args) {
        calculateSumOfDiagonalElements();
    }

    private static void calculateSumOfDiagonalElements() {
        Random random = new Random();
        int sum = 0;
        int[][] mass = new int[3][3];
        for (int i = 0; i < mass.length; i++) {
            for (int j = 0; j < mass[i].length; j++) {
                mass[i][j] = random.nextInt(101);
                System.out.print(mass[i][j]+ "\t");
            }
            System.out.println();
            sum += mass[i][i];
        }
        System.out.println();
        System.out.println(sum);
    }
}