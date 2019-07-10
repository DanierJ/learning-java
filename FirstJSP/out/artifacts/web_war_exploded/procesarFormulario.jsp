<%--
  Created by IntelliJ IDEA.
  User: Danier Javid
  Date: 10/07/2019
  Time: 12:32 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h1>Procesando el formulario de registro</h1>

    <p>Usuario confirmado: </p>
    Nombre: <%= request.getParameter("nombre")%> <br>
    Apellido: <%= request.getParameter("apellido")%>

</body>
</html>
