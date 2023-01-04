package by.tms.tasks.task2;

public class Task2 {
    //    * 2) Обобщенный класс с тремя параметрами
    //     * Создать обобщенный класс с тремя параметрами (T, V, K).
    //     * Класс содержит три переменные типа (T, V, K), конструктор, принимающий на вход параметры типа (T, V, K),
    //     * методы возвращающие значения трех переменных. Создать метод, выводящий на консоль имена классов для трех
    //       переменных класса.
    //     * Наложить ограничения на параметры типа: T должен реализовать интерфейс Comparable (String),
    //     * V должен реализовать интерфейс Serializable и расширять класс Animal, K должен расширять класс Number.
    public static void main(String[] args) {
        Generic<String, Animals, Double> genericTest = new Generic<>("word", new Animals("Jackie", 11), 1.2);
        System.out.println(genericTest.getK());
        System.out.println(genericTest.getT());
        System.out.println(genericTest.getV());
        genericTest.getNameClasses();
    }
}
