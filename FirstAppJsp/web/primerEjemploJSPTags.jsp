<%--
  Created by IntelliJ IDEA.
  User: Danier Javid
  Date: 12/07/2019
  Time: 3:25 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
  String[] alumnos = {"Antonio", "Sandra", "María", "Paco", "Iñaki"};

  pageContext.setAttribute("losAlumnos", alumnos);
%>
<html>
    <head>
        <title>JSP Tags</title>
    </head>
    <body>
        <c:forEach var="alumno" items="${losAlumnos}">
            ${alumno} <br>
        </c:forEach>
    </body>
</html>
