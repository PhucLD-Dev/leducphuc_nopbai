<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html xmlns:th="http://www.thymeleaf.org">
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>Employee Management System</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
</head>
<body>
<div class="container">
    <h1>Employee Management System</h1>
    <hr>
    <h2>Save Employee</h2>

    <form action="#" th:action="@{/saveEmploye}" th:object="${p}" method="POST">
        <input type="text" th:field="*{name}" placeholder="Nhập tên" required class="form-control mb-4 col-4">

        <input type="text" th:field="*{wage}" placeholder="Nhập lương" class="form-control mb-4 col-4" required>

        <button type="submit" class="btn btn-info col-2">Lưu</button>
    </form>

    <hr>
</div>
</body>
</html>
