<%--
  Created by IntelliJ IDEA.
  User: phuch
  Date: 11/12/2021
  Time: 2:35 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0">
    <meta name="description" content="admin-themes-lab">
    <meta name="author" content="themes-lab">
    <title>Make Admin Template &amp; Builder</title>

</head>
<body >
<!--[if lt IE 7]>
<p class="browsehappy">You are using an <strong>outdated</strong> browser. Please <a href="http://browsehappy.com/">upgrade your browser</a> to improve your experience.</p>
<![endif]-->
<div class="page-content">
    <div class="header">
        <h2> <strong>Company</strong></h2>
        <div class="breadcrumb-wrapper">
            <ol class="breadcrumb">
                <li><a href="dashboard">Make</a>
                </li>
                <li class="active">Company</li>
                <li><a href="user">User</a>
                </li>
            </ol>
        </div>
    </div>
    <div class="row">
        <div class="col-lg-12 portlets">
            <div class="panel">
                <div class="panel-header panel-controls">
                    <h3><i class="fa fa-table"></i> <strong>Company Table</strong></h3>
                </div>
                <div class="panel-content">
                    <div class="m-b-20">
                        <div class="btn-group">
                            <button  class="btn btn-sm btn-dark"><i class="fa fa-plus"></i><a href="addCompany">Thêm mới công ty</a> </button>
                        </div>
                    </div>
                    <table class="table table-hover dataTable" id="table-editable">
                        <thead>
                        <tr>
                            <th>ID</th>
                            <th>Company Name</th>
                        </tr>
                        </thead>
                        <tbody>
                        <c:forEach var="p" items="${company}">
                            <tr>
                                <td>${p.id}</td>
                                <td>${p.name}</td>
                                <td class="text-right"><a class="edit btn btn-sm btn-default" href="editCompany?id=${p.id}"><i class="icon-note"></i></a>  <a class="delete btn btn-sm btn-danger" href="deleteCompany?id=${p.id}" onclick="return confirm('Are you sure you want to delete this item?')"><i class="icons-office-52"></i></a>
                                </td>
                            </tr>
                        </c:forEach>
                        </tbody>
                    </table>
                </div>
            </div>
        </div>
    </div>
    <div class="footer">
        <div class="copyright">
            <p class="pull-left sm-pull-reset">
                <span>Copyright <span class="copyright">©</span> 2016 </span>
                <span>THEMES LAB</span>.
                <span>All rights reserved. </span>
            </p>
            <p class="pull-right sm-pull-reset">
                <span><a href="#" class="m-r-10">Support</a> | <a href="#" class="m-l-10 m-r-10">Terms of use</a> | <a href="#" class="m-l-10">Privacy Policy</a></span>
            </p>
        </div>
    </div>
</div>
</body>
</html>
