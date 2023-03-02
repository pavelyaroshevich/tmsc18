package by.tms.repositories;

import by.tms.models.Student;

import java.util.List;

public interface StudentRepository {

    List<Student> findStudents();

    List<Student> addStudent(Student student);

}
