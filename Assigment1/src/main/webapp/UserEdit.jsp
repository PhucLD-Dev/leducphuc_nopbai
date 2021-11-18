<%--
  Created by IntelliJ IDEA.
  User: phuch
  Date: 11/12/2021
  Time: 6:45 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Edit </title>
    </head>
<body>
<div class="container">
    <div class="row">
        <div class="row align-items-center">
            <div class="col-lg-3 col-md-4 col-sm-4 col-xs-12">
                <h2 class="page-title">Chỉnh sửa nhân viên</h2>
            </div>
        </div>
    </div>
    <div class="row">
        <div class="col-6">
            <form method="post" action="updateUser?id=${edituser.id}">
                <div class="mb-3">
                    <label for="name" class="form-label">Name</label>
                    <input type="text" class="form-control" name="name" id="name" value="${edituser.name}" required oninvalid="this.setCustomValidity('Vui lòng nhập tên')"
                           oninput="setCustomValidity('')">
                </div>
                <div class="mb-3">
                    <label for="age" class="form-label">Age</label>
                    <input type="text" class="form-control" name="age" id="age" value="${edituser.age}">
                </div>
                <div class="mb-3">
                    <label for="address" class="form-label">Address</label>
                    <input type="text" class="form-control" name="address" id="address" value="${edituser.address}">
                </div>
                <div class="mb-3">
                    <label>Company</label>
                    <select name="company" class="form-control">
                        <c:forEach var="p" items="${company}">
                            <option
                                    value="${p.id}"${p.id==edituser.companyid ?'selected':''}> ${p.name}
                                    <%-- value="{{$item -> id}}"{{$hang_sx_selected->id==$item->id?'selected':''}}>{{$item->ten_hangsx}}--%>
                            </option>
                        </c:forEach>
                    </select>
                </div>
                <button type="submit" class="btn btn-primary">Save</button>
            </form>
        </div>
    </div>
</div>
</body>
</html>

