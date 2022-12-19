package by.tms.textformatter.models;

public class TextFormatter {
//      Есть строка в которой содержится текст, предложения разделены точками.
//      После запуска программы на экран должны выводиться только те предложения в которых от 3-х до 5-ти слов.
//      Если в предложении присутствует слово-палиндром, то не имеет значения какое количество слов в предложении, оно выводится на экран.
//      Пишем все в ООП стиле. Создаем класс TextFormatter
//      1. Метод принимает строку и возвращает кол-во слов в строке.
//      2. Метод принимает строку и проверяет есть ли в строке слово-палиндром. Если есть возвращает true, если нет false
//      В main создаем строку с текстом, также можно текст задавать с консоли.
//      Разбиваем текст на предложения. Используя методы класса TextFormatter определяем подходит ли нам предложение.
//      Если подходит, то выводим на экран.

    public int returnNumberOfWords(String string) {
        String[] strings = string.split(" ");
        return strings.length;
    }

    public boolean isPalindrome(String string) {
        String[] strings = string.toLowerCase().split(" ");
        for (int i = 0; i < strings.length; i++) {
            if (strings[i].equals((new StringBuilder(strings[i])).reverse().toString())) {
                return true;
            }
        }
        return false;
    }
}
