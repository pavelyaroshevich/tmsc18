package by.tms.repository;

import by.tms.models.Student;

import java.util.List;

public interface StudentRepository {
    List<Student> findStudents();
}
