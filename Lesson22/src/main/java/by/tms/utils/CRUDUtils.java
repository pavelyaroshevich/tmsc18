package by.tms.utils;

import by.tms.models.Workers;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class CRUDUtils {
    private static final String GET_ALL_WORKERS_QUERY = "select (age) from workers";

    public static List<Workers> getAllWorkers() {
        List<Workers> workers = new ArrayList<>();
        try (Connection connection = DataBaseUtils.getConnection()) {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(GET_ALL_WORKERS_QUERY);
            while (resultSet.next()) {
                Long id = resultSet.getLong("id");
                String login = resultSet.getString("login");
                BigDecimal salary = resultSet.getBigDecimal("salary");
                int age = resultSet.getInt("age");
                String date = resultSet.getString("date");
                LocalDate localDate = LocalDate.parse(date, DateTimeFormatter.ofPattern("dd.MM.yyyy"));
                String description = resultSet.getString("description");
                workers.add(new Workers(id, login, salary, age, localDate, description));
            }
        } catch (SQLException e) {
            System.out.println("Exception " + e.getMessage());
        }
        return workers;
    }
}
