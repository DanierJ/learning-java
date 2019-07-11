<!DOCTYPE html>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Ejemplo de scriptlets </title>
</head>
<body>
<h1>Ejemplo de scriptlets JSP</h1>

    <%

        for (int i = 0; i < 10; i++) {
            out.println("<br>Este es el mensaje: " + i);
        }

    %>

</body>
</html>