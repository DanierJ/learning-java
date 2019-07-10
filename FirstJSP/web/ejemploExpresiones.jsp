<!DOCTYPE html>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Ejemplo de expresiones </title>
</head>
<body>
    <h1>Ejemplo de expresiones JSP</h1>

    <p>Convirtiendo a mayúsculas: <%= "danier".toUpperCase() %></p>

    <br>

    <p>La suma de 5 y 7 es: <%= 5 + 7 %></p>

    <br>

    <p>10 es mayor que 100: <%= 10 > 100 %></p>
</body>
</html>