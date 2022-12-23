package by.tms.tasks;

import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Task1 {
    // * 1)В исходном файле hw1/input.txt находятся слова, каждое слово на новой строке.
    // * После запуска программы должен создать файл output.txt, который будет содержать в себе только палиндромы.
    public static void main(String[] args) {

        try (FileInputStream fileInputStream = new FileInputStream("Lesson15/src/main/resources/input1.txt");
             FileOutputStream fileOutputStream = new FileOutputStream("Lesson15/src/main/resources/output1.txt")) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byte[] bytes = new byte[fileInputStream.available()];
            fileInputStream.read(bytes, 0, bytes.length);
            String str = new String(bytes);
            if (isPalindrome(str)) {
                System.out.println(str);
                fileOutputStream.write(bytes);
            }
            fileOutputStream.write(bytes, 0, bytes.length);
        } catch (IOException e) {
            System.out.println("error" + e.getMessage());
        }
    }

    private static boolean isPalindrome(String string) {
        String[] strings = string.toLowerCase().split("\t\n");
        for (int i = 0; i < strings.length; i++) {
            if (strings[i].equals((new StringBuilder(strings[i])).reverse().toString())) {
                return true;
            }
        }
        return false;
    }
}