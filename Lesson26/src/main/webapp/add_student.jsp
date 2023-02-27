<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>Create</title>
    <link rel="stylesheet" href="<c:url value="/css/login.css"/>">
</head>
<body>
<div class="login-box">
    <h2>Create Student</h2>
    <form action="<c:url value="/add"/>" method="post">
        <div class="user-box">
            <input type="text" name="name" required="">
            <label>Student name</label>
        </div>
        <div class="user-box">
            <input type="text" name="surname" required="">
            <label>Student surname</label>
        </div>
        <div class="user-box">
            <input type="text" name="course" required="">
            <label>Student course</label>
        </div>
        <div>
            <input type="submit" value="Create">
        </div>
    </form>
    <a href="<c:url value="/students"/>" class="button">Back</a>
</div>
</body>
</html>