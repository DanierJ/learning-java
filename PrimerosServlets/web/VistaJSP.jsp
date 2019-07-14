<%--
  Created by IntelliJ IDEA.
  User: Danier Javid
  Date: 13/07/2019
  Time: 9:53 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Recibiendo la info del servlet</title>
</head>
<body>
    <h2>Lista de productos:</h2>

    <c:forEach var="producto" items="${listaProductos}">
        ${producto} <br>
    </c:forEach>
</body>
</html>
