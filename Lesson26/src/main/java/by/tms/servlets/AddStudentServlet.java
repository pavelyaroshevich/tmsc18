package by.tms.servlets;

import by.tms.models.Student;
import by.tms.services.StudentService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/add")
public class AddStudentServlet extends HttpServlet {
    private StudentService studentService;

    @Override
    public void init(ServletConfig config) throws ServletException {
        super.init(config);
        studentService = (StudentService) config.getServletContext().getAttribute("studentService");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try {
            String name = req.getParameter("name");
            String surname = req.getParameter("surname");
            Integer course = Integer.parseInt(req.getParameter("course"));
            studentService.addStudent(new Student(name, surname, course));
            resp.sendRedirect(req.getContextPath() + "/students");
        } catch (Exception e) {
            System.out.println("Error " + e.getMessage());
        }
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        forwardTo(req, resp);
    }

    private void forwardTo(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        RequestDispatcher requestDispatcher = getServletContext().getRequestDispatcher("/add_student.jsp");
        requestDispatcher.forward(request, response);
    }
}
