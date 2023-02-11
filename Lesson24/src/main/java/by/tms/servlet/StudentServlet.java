package by.tms.servlet;

import by.tms.models.Student;
import by.tms.service.StudentService;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/db")
public class StudentServlet extends HttpServlet {

    public StudentService studentService;

    @Override
    public void init(ServletConfig config) throws ServletException {
        super.init(config);
        studentService = (StudentService) config.getServletContext().getAttribute("studentService");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        List<Student> students = studentService.findStudents();
        req.setAttribute("students", students);
        try {
            getServletContext().getRequestDispatcher("/students.jsp").forward(req, resp);
            resp.sendRedirect("/db");
        } catch (ServletException e) {
            System.out.println("Unexpected error " + e.getMessage());
        }
    }
}