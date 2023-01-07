package by.tms.tasks.task3;

public class Task3 {
    public static void main(String[] args) {
        Double[] numbersDouble = {1.8, 2.4, 8.2, 192.2, 23.223};
        Integer[] numbersInteger = {96, 24, 564, 148};
        MinOrMax<?> MinOrMaxDouble = new MinOrMax<>(numbersDouble);
        MinOrMax<Integer> MinOrMaxInteger = new MinOrMax<>(numbersInteger);

        MinOrMax<Integer> MinOrMaxInteger2 = createMinOrMax(numbersInteger);
        printMinAndMaxValue(MinOrMaxInteger2);
        getInfo(MinOrMaxInteger2);

        printMinAndMaxValue(MinOrMaxDouble);
        getInfo(MinOrMaxDouble);
        printMinAndMaxValue(MinOrMaxInteger);
        getInfo(MinOrMaxInteger);
    }

    public static <T extends Number> MinOrMax<T> createMinOrMax(T[] array) {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("incorrect input parameters");
        }
        return new MinOrMax<>(array);
    }

    private static void printMinAndMaxValue(MinOrMax<?> MinOrMax) {
        System.out.println("Минимальный элемент " + MinOrMax.getMin() + "\n" + "Максимальный элемент " + MinOrMax.getMax());
    }

    private static void getInfo(MinOrMax<?> minMax) {
        for (int i = 0; i < minMax.getArrayOfNumbers().length; i++) {
            System.out.println("Элемент " + minMax.getArrayOfNumbers()[i] + " типа " + minMax.getArrayOfNumbers()[i].getClass().getName());
        }
        System.out.println();
    }
}
