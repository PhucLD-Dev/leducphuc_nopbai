<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
</head>
<body>

<div class="w3-container">
    <h1>Product</h1>
    <a href="/showNewEmployeeForm" class="btn btn-primary btn-sm mb-3"> Add Employees </a>
    <table class="w3-table w3-striped">
        <tr>
            <th>ID</th>
            <th>Tên</th>
            <th>Lương</th>
        </tr>
        <c:forEach var="p" items="${employees}">
            <tr>
                <td>${p.id}</td>
                <td>${p.name}</td>
                <td>${p.wage}</td>

            </tr>
        </c:forEach>

    </table>
</div>




<%--${message}--%>

<%--<form action="login" method="post">--%>
<%--    <input type="text" name="username">--%>
<%--    <input type="password" name="password">--%>
<%--    <input type="submit" value="LOGIN">--%>
<%--</form>--%>

</body>
</html>
