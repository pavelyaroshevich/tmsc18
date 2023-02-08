package by.tms.servlets;

import by.tms.services.UserAware;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(value = "/login")
public class LoginServlet extends HttpServlet {
    private UserAware userService;
    private static Object access = null;

    @Override
    public void init(ServletConfig config) throws ServletException {
        super.init(config);
        userService = (UserAware) config.getServletContext().getAttribute("userService");
    }

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        if (access != null) {
            getRedirect(request, response, "/menu.jsp");
        } else {
            getRedirect(request, response, "/login.jsp");
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String login = req.getParameter("login");
        String password = req.getParameter("password");
        if (userService.isVerifyUser(login, password)) {
            HttpSession session = req.getSession();
            access = new Object();
            session.setAttribute("accessPermission", access);
            getRedirect(req, resp, "/menu.jsp");
        } else {
            getRedirect(req, resp, "/login.jsp");
        }
    }

    private void getRedirect(HttpServletRequest req, HttpServletResponse resp, String address) throws ServletException, IOException {
        RequestDispatcher requestDispatcher = getServletContext().getRequestDispatcher(address);
        requestDispatcher.forward(req, resp);
    }
}
