<%--
  Created by IntelliJ IDEA.
  User: Danier Javid
  Date: 10/07/2019
  Time: 12:20 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Objetos JSP Predefinidos</title>
</head>
<body>
    <h1>Objetos predefinidos JSP</h1>

    <p>Petición datos del navegador (Request): <%= request.getHeader("User-Agent") %> - Escribe los datos del navegador </p>

    <p>Petición de idioma utilizado: <%= request.getLocale()%></p>

</body>
</html>
