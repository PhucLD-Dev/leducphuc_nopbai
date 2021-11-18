<%--
  Created by IntelliJ IDEA.
  User: anhtran
  Date: 11/10/21
  Time: 6:35 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://www.opensymphony.com/sitemesh/decorator" prefix="decorator" %>
<html>
<head>
    <title><decorator:title /></title>
    <jsp:include page="head.jsp" />
    <decorator:head />
</head>
<body>
<jsp:include page="sidebar.jsp" />
<section>
    <div class="main-content">
        <!-- BEGIN TOPBAR -->
        <jsp:include page="topbar.jsp" />
        <!-- END TOPBAR -->
        <!-- BEGIN PAGE CONTENT -->
        <decorator:body />
        <!-- END PAGE CONTENT -->
        <jsp:include page="BeginBuilder.jsp" />
    </div>
</section>

<jsp:include page="tonghop.jsp" />

<jsp:include page="jsdefault.jsp" />

</body>
</html>
