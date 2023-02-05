<%@ page import="by.tms.models.Student" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="by.tms.models.Student" %>
<%@ page import="java.util.List" %>
<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>Students List</title>
</head>
<body>
<h1>Displaying Students List</h1>
<table border="1">
    <caption>Students table</caption>
    <tr>
        <th>ID</th>
        <th>Name</th>
        <th>Surname</th>
        <th>Course</th>
    </tr>
    <%
        List<Student> students = (List<Student>) request.getAttribute("data");
        for (Student student : students) {
    %>
    <tr>
        <td><%=student.getId()%>
        </td>
        <td><%=student.getName()%>
        </td>
        <td><%=student.getSurname()%>
        </td>
        <td><%=student.getCourse()%>
        </td>
    </tr>
    <%}%>
</table>

</body>
</html>
