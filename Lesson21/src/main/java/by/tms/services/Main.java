package by.tms.services;

import by.tms.models.Student;
import by.tms.utils.CRUDUtils;

public class Main {
    public static void main(String[] args) {
        System.out.println(CRUDUtils.getAllStudents());
        System.out.println(CRUDUtils.saveStudent(new Student("Павел", "Симонов", 4)));
    }
}
