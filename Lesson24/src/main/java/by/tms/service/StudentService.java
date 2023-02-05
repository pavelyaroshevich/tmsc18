package by.tms.service;

import by.tms.models.Student;
import by.tms.repository.StudentRepository;

import java.util.List;

public class StudentService {
    private final StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public List<Student> findStudents() {
        return studentRepository.findStudents();
    }
}
