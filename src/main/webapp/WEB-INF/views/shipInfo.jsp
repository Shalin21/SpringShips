<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 25.02.2018
  Time: 18:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<intercept-url pattern="/shipInfo.jsp" access="hasRole('ANONYMOUS')" />
<head>
    <title>Title</title>
    <link href="${contextPath}/resources/css/bootstrap.min.css" rel="stylesheet">
    <link href="${contextPath}/resources/css/flex.css" rel="stylesheet">
    <sec:csrfMetaTags/>
</head>
<body>

<div class="container">
    <div class="row-flex">
        <div class="col-flex">
            <div class=""><label><i class="fa fa-user"></i>Vessel name :</label>  <span>${name}</span></div>
            <div class=""><label><i class="fa fa-user"></i>Vessel flag :</label>  <span> ${flag} </span></div>
            <div class=""><label><i class="fa fa-calendar"></i>Vessel Type :</label>  <span>${type}</span></div>
            <div class=""><label><i class="fa fa-male"></i>Length :</label>  <span>${length}</span></div>
            <div class=""><label><i class="fa fa-male"></i>Width :</label>  <span>${width}</span></div>
        </div>
         <div class="col-flex">
            <div class=""><label><i class="fa fa-map-marker"></i>MaxEqp :</label>  <span>${maxeqp}</span></div>
            <div class=""><label><i class="fa fa-map-marker"></i>Max Seaguage :</label>  <span>${maxseg}</span></div>
            <div class=""><label><i class="fa fa-map-marker"></i>Eqp weight :</label>  <span>${eqpw}</span></div>
            <div class=""><label><i class="fa fa-map-marker"></i>Year of build :</label>  <span>${year}</span></div>
         </div>
    </div>
    <form:form method="POST">
        <input type="text" name="a" id="a"/>
        <input type="text" name="b" id="b"/>
        <input type="submit">
    </form:form>
</div>



</body>
</html>
