<%--
  Created by IntelliJ IDEA.
  User: Danier Javid
  Date: 12/07/2019
  Time: 5:08 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<html>
    <head>
        <title>Jsp Tags Functions</title>
    </head>
    <body>
        <c:set var="datos" value="Ana, Lopez, Directora, 75000" scope="page"/>

        <c:set var="datosArray" value="${fn:split(datos, ',')}" scope="page"/>



        <input type="text" value="${datosArray[0]}"><br>
        <input type="text" value="${datosArray[1]}"><br>
        <input type="text" value="${datosArray[2]}"><br>
        <input type="text" value="${datosArray[3]}">


    </body>
</html>
