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
        <div class="form-style-8">
          <!--  <div class="row-flex">
                <div class="col-flex">
-->
                    <div class="row-flex">
                        <label>Gross</label>
                        <input type="text" name="gross" id="gross"/>
                    </div>
                    <div class="row-flex">
                        <label>Nett</label>
                        <input type="text" name="nett" id="nett"/>
                    </div>
                    <div class="row-flex">
                        <label>LBP</label>
                        <input type="text" name="lbp" id="lbp"/>
                    </div>
                    <div class="row-flex">
                        <label>Dock Density</label>
                         <input type="text" name="dDens1" id="dDens1"/>
                         <input type="text" name="dDens2" id="dDens2"/>
                    </div>

                    <div class="row-flex">
                         <label>Ford P</label>
                         <input type="text" name="fordP1" id="fordP1"/>
                         <input type="text" name="fordP2" id="fordP2"/>
                    </div>

                    <div class="row-flex">
                        <label>Ford S</label>
                        <input type="text" name="fordS1" id="fordS1"/>
                        <input type="text" name="fordS2" id="fordS2"/>
                    </div>





                    <div class="row-flex">
                        <label>Mid P</label>
                        <input type="text" name="midP1" id="midP1"/>
                        <input type="text" name="midP2" id="midP2"/>
                    </div>
                    <div class="row-flex">
                        <label>Mid S</label>
                        <input type="text" name="midS1" id="midS1"/>
                        <input type="text" name="midS2" id="midS2"/>
                    </div>
                    <div class="row-flex">
                        <label>Aft P</label>
                        <input type="text" name="aftP1" id="aftP1"/>
                        <input type="text" name="aftP2" id="aftP2"/>
                    </div>
                    <div class="row-flex">
                        <label>Aft s</label>
                        <input type="text" name="aftS1" id="aftS1"/>
                        <input type="text" name="aftS2" id="aftS2"/>
                    </div>
                    <div class="row-flex">
                        <label>Disp Fp</label>
                        <input type="text" name="dispFp1" id="dispFp1"/>
                        <input type="text" name="dispFp2" id="dispFp2"/>
                    </div>
                    <div class="row-flex">
                        <label>Disp Midp</label>
                        <input type="text" name="dispMp1" id="dispMp1"/>
                        <input type="text" name="dispMp2" id="dispMp2"/>
                    </div>
                    <div class="row-flex">
                        <label> Disp Ap</label>
                        <input type="text" name="dispAp1" id="dispAp1"/>
                        <input type="text" name="dispAp2" id="dispAp2"/>
                    </div>
                    <div class="row-flex">
                        <label>Scale Density</label>
                        <input type="text" name="scaleD1" id="scaleD1"/>
                        <input type="text" name="scaleD2" id="scaleD2"/>
                    </div>


            <input type="submit" name="action1" value="Action1">
            <input type="submit" name="action2" value="Action2">
        </div>

    </form:form>
</div>



</body>
</html>
