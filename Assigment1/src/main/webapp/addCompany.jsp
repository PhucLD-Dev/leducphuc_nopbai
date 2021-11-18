<%--
  Created by IntelliJ IDEA.
  User: phuch
  Date: 11/15/2021
  Time: 1:15 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="">
    <meta name="author" content="">
    <title>Edit Company</title>
</head>
<body id="page-top">
<div id="wrapper">

            <div class="container-fluid">

                <div class="container">
                    <div class="page-breadcrumb bg-white">
                        <div class="row align-items-center">
                            <div class="col-lg-3 col-md-4 col-sm-4 col-xs-12">
                                <h4 class="page-title">Thêm mới Công ty</h4>
                            </div>

                        </div>
                    </div>
                    <div class="row">
                        <div class="col-6">
                            <form method="post" action="addCompany" >
                                <div class="mb-3">
                                    <label for="name" class="form-label">Name</label>
                                    <input type="text" class="form-control" name="name" id="name">
                                </div>
                                <input type="submit" class="btn btn-primary" value="Save">
                            </form>
                        </div>
                    </div>
                </div>
            </div>

</div>
</body>
</html>