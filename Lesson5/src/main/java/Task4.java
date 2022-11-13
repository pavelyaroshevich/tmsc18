//import java.util.Scanner;
//
public class Task4 {
    //    4) Дано 2 числа, день и месяц рождения. Написать программу, которая определяет знак зодиака человека.
    public static void main(String[] args) {

        zodiac(24, 10);
    }

    private static void zodiac(int day, int month) {
        if (day > 0 && day < 31) {
            if (month >= 0 && month <= 12) {
                switch (month) {
                    case 1 -> day(day <= 20, "Козерог", "Водолей");
                    case 2 -> day(day <= 19, "Водолей", "Рыбы");
                    case 3 -> day(day <= 20, "Рыбы", "Овен");
                    case 4 -> day(day <= 20, "Овен", "Телец");
                    case 5 -> day(day <= 21, "Телец", "Близнецы");
                    case 6 -> day(day <= 21, "Близнецы", "Рак");
                    case 7 -> day(day <= 22, "Рак", "Лев");
                    case 8 -> day(day <= 21, "Лев", "Дева");
                    case 9 -> day(day <= 23, "Дева", "Весы");
                    case 10 -> day(day <= 23, "Весы", "Скорпион");
                    case 11 -> day(day <= 22, "Скорпион", "Стрелец");
                    case 12 -> day(day <= 22, "Стрелец", "Козерог");
                }
            } else {
                System.out.println("Введены не верные параметры");
            }
        } else {
            System.out.println("Введены не верные параметры");
        }
    }

    private static void day(boolean x, String s1, String s2) {
        if (x) {
            System.out.println(s1);
        } else {
            System.out.println(s2);
        }
    }
}
