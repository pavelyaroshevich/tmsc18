package by.tms.servlet;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;

@WebServlet("/test")
public class TestServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {


        response.setContentType("text/html");
        PrintWriter writer = response.getWriter();
        try {
            String url = "jdbc:postgresql://localhost:5432/postgres";
            String username = "postgres";
            String password = "root";
            Class.forName("org.postgresql.Driver").getDeclaredConstructor().newInstance();
            try (Connection connection = DriverManager.getConnection(url, username, password)) {

                writer.println("Connection to ProductDB successful!");
            }
        } catch (Exception ex) {
            writer.println("Connection failed...");
            writer.println(ex);
        } finally {
            writer.close();
        }
    }
}
