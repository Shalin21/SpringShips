<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 25.02.2018
  Time: 16:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Ships list</title>
    <link href="${contextPath}/resources/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<ul class="list-group">
    <li class="list-group-item list-group-item-danger">LIST OF SHIPS</li>
    <c:forEach var="ship" items="${listShips}">
        <li class="list-group-item list-group-item-success"><a href="shipInfo?id=${ship.id}">${ship.name}</a></li>
    </c:forEach>
</ul>

</body>
</html>
