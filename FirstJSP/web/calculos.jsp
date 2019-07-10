<%@ page import="com.danjerous.calculosMatematicos.Calculos" %><%--
  Created by IntelliJ IDEA.
  User: Danier Javid
  Date: 10/07/2019
  Time: 11:32 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Utilizando las classes java independientes</title>
</head>
<body>
    <h1>Utilizando las classes java independientes</h1>

    <p>La suma de de 5 y 7 es: <%=Calculos.metodoSuma(5, 7)%></p>
    <p>La resta de de 5 y 7 es: <%=Calculos.metodoResta(5, 7)%></p>
    <p>La multiplicación de de 5 y 7 es: <%=Calculos.metodoMultiplica(5, 7)%></p>
</body>
</html>
