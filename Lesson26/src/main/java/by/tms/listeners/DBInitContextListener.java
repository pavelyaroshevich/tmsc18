package by.tms.listeners;

import by.tms.repositories.JdbcStudentRepository;
import by.tms.repositories.StudentRepository;
import by.tms.services.StudentService;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

@WebListener
public class DBInitContextListener implements ServletContextListener {
    @Override
    public void contextInitialized(final ServletContextEvent sce) {
        String url = sce.getServletContext().getInitParameter("db_url");
        String login = sce.getServletContext().getInitParameter("db_user");
        String password = sce.getServletContext().getInitParameter("db_password");
        String dbDriver = sce.getServletContext().getInitParameter("db_driver");
        try {
            Class.forName(dbDriver);
            Connection connection = DriverManager.getConnection(url, login, password);
            StudentRepository jdbcStudentRepository = new JdbcStudentRepository(connection);
            StudentService studentService = new StudentService(jdbcStudentRepository);
            sce.getServletContext().setAttribute("studentService", studentService);
            sce.getServletContext().setAttribute("connection", connection);
        } catch (Exception e) {
            System.out.println("Unexpected error " + e.getMessage());
        }
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        Connection connection = (Connection) sce.getServletContext().getAttribute("connection");
        try {
            connection.close();
        } catch (SQLException e) {
            System.out.println("Unexpected error " + e.getMessage());
        }
    }
}
