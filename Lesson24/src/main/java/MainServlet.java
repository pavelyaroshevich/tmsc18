import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/hello")
public class MainServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter writer = response.getWriter();

        String parameter1 = request.getParameter("userparametr1");
        String parameter2 = request.getParameter("userparametr2");
        String operation = request.getParameter("operation");
        String result = request.getParameter("result");

        try {
            writer.println("<p>Parameter1: " + parameter1 + "</p>");
            writer.println("<p>Parameter2: " + parameter2 + "</p>");
            writer.println("<p>Operation: " + operation + "</p>");
            writer.println("<p>Result: " + chooseOperation(operation, parameter1, parameter2) + "<p>");
        } finally {
            writer.close();
        }
    }

    public double chooseOperation(String operation, String parameter1, String parameter2) {
        Calculator calculator = new Calculator();
        Exception Exception = null;
        return switch (operation) {
            case "+" -> calculator.getSum(Integer.parseInt(parameter1), Integer.parseInt(parameter2));
            case "-" -> calculator.getSubtraction(Integer.parseInt(parameter1), Integer.parseInt(parameter2));
            case "*" -> calculator.getMultiplication(Integer.parseInt(parameter1), Integer.parseInt(parameter2));
            case "/" -> calculator.getDivision(Integer.parseInt(parameter1), Integer.parseInt(parameter2));
            default -> {
                try {
                    throw Exception;
                } catch (java.lang.Exception e) {
                    throw new RuntimeException(e);
                }
            }
        };
    }
}