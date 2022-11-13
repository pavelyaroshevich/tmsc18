//import java.util.Scanner;
//
public class Task4 {
    //    4) Дано 2 числа, день и месяц рождения. Написать программу, которая определяет знак зодиака человека.
    public static void main(String[] args) {
        zodiac(31, 16);
    }

    private static void zodiac(int day, int month) {
        if (month >= 0 && month <= 12) {
            switch (month) {
                case 1 -> month(day, 31, 20, "Козерог", "Водолей");
                case 2 -> month(day, 28, 19, "Водолей", "Рыбы");
                case 3 -> month(day, 31, 20, "Рыбы", "Овен");
                case 4 -> month(day, 30, 20, "Овен", "Телец");
                case 5 -> month(day, 31, 21, "Телец", "Близнецы");
                case 6 -> month(day, 30, 21, "Близнецы", "Рак");
                case 7 -> month(day, 31, 22, "Рак", "Лев");
                case 8 -> month(day, 31, 21, "Лев", "Дева");
                case 9 -> month(day, 30, 23, "Дева", "Весы");
                case 10 -> month(day, 31, 23, "Весы", "Скорпион");
                case 11 -> month(day, 30, 22, "Скорпион", "Стрелец");
                case 12 -> month(day, 31, 22, "Стрелец", "Козерог");
            }
        } else {
            System.out.println("Введены не верные параметры");
        }
    }

    private static void month(int day, int x, int x1, String s1, String s2) {
        if (day > x) {
            System.out.println("Введены не верные параметры");
        } else {
            day(day <= x1, s1, s2);
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
