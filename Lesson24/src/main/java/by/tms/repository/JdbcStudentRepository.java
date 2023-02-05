package by.tms.repository;

import by.tms.models.Student;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class JdbcStudentRepository implements StudentRepository {
    private final Connection connection;

    public JdbcStudentRepository(Connection connection) {
        this.connection = connection;
    }

    @Override
    public List<Student> findStudents() {
        try {
            Statement statement = connection.createStatement();
            String sql = "select * from students";
            ResultSet rs = statement.executeQuery(sql);
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
}
