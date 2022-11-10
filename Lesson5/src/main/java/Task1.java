import java.util.Random;

public class Task1 {
    //1) Задача на оператор switch!
    //        Рандомно генерируется число От 1 до 7.
    //        Если число равно 1, выводим на консоль “Понедельник”, 2 –”Вторник” и так далее.
    //        Если 6 или 7 – “Выходной”.
    public static void main(String[] args) {
        Random random = new Random();
        int value = random.nextInt(1, 8);
        switch (value) {
            case 1:
                System.out.println("Понедельник");
                break;
            case 2:
                System.out.println("Вторник");
                break;
            case 3:
                System.out.println("Среда");
                break;
            case 4:
                System.out.println("Четверг");
                break;
            case 5:
                System.out.println("Пятница");
                break;
            case 6:
                System.out.println("Суббота");
                break;
            case 7:
                System.out.println("Воскресенье");
                break;
        }
    }
}
