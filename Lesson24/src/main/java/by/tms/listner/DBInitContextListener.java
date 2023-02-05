package by.tms.listner;

import by.tms.repository.JdbcStudentRepository;
import by.tms.service.StudentService;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

@WebListener
public class DBInitContextListener implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        final String dbDriver = "org.postgresql.Driver";
        String url = sce.getServletContext().getInitParameter("db_url");
        String login = sce.getServletContext().getInitParameter("db_login");
        String password = sce.getServletContext().getInitParameter("db_password");
        try {
            try {
                Class.forName(dbDriver);
            } catch (ClassNotFoundException e) {
                throw new RuntimeException(e);
            }
            Connection connection = DriverManager.getConnection(url, login, password);
            JdbcStudentRepository jdbcStudentRepository = new JdbcStudentRepository(connection);
            StudentService studentService = new StudentService(jdbcStudentRepository);
            sce.getServletContext().setAttribute("connection", connection);
            sce.getServletContext().setAttribute("studentService", studentService);

        } catch (SQLException e) {
            System.out.println("Exception" + e.getMessage());
            ;
        }
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        Connection connection = (Connection) sce.getServletContext().getAttribute("connection");
        try {
            connection.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
