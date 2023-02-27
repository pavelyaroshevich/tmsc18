<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
    <meta charset="UTF-8">
    <title>Students</title>
    <link rel="stylesheet" href="<c:url value="/css/table.css"/>">
    <link rel="stylesheet" href="<c:url value="/css/login.css"/>">
</head>
<h1><span class="orange">List of Students</span></h1>
<body>
<div>
    <div style="float: left; margin: 0 10px 0 10px">
        <a href="<c:url value="/add_student.jsp"/>" class="button">Add Student</a>
    </div>
    <div style="float: right">
        <a href="<c:url value="form.jsp"/>" class="button">Back</a>
    </div>
</div>
<br>
<table class="container">
    <tr>
        <th>ID</th>
        <th>Name</th>
        <th>Surname</th>
        <th>Course</th>
        <th></th>
    </tr>
    <c:forEach var="student" items="${students}">
        <tr>
            <td>${student.id}</td>
            <td>${student.name}</td>
            <td>${student.surname}</td>
            <td>${student.course}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
