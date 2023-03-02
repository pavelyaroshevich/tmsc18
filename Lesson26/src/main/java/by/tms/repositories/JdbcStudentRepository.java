package by.tms.repositories;

import by.tms.models.Student;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class JdbcStudentRepository implements StudentRepository {
    private final Connection connection;

    public JdbcStudentRepository(Connection connection) {
        this.connection = connection;
    }

    private static final String GET_ALL_STUDENTS_QUERY = "select * from students";
    private static final String INSERT_STUDENT_QUERY = "insert into students(name, surname, course) values(?, ?, ?)";

    @Override
    public List<Student> findStudents() {
        try {
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery(GET_ALL_STUDENTS_QUERY);
            final List<Student> students = new ArrayList<>();
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String surname = rs.getString("surname");
                int course = rs.getInt("course");
                students.add(new Student(id, name, surname, course));
            }
            return students;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public List<Student> addStudent(Student student) {
        List<Student> updatedStudents = new ArrayList<>();

        try {
            PreparedStatement preparedStatement = connection.prepareStatement(INSERT_STUDENT_QUERY);
            preparedStatement.setString(1, student.getName());
            preparedStatement.setString(2, student.getSurname());
            preparedStatement.setInt(3, student.getCourse());
            preparedStatement.executeUpdate();
            updatedStudents = findStudents();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return updatedStudents;
    }
}
