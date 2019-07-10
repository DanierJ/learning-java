<!DOCTYPE html>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Ejemplo de declaraciones </title>
</head>
<body>
<h1>Ejemplo de declaraciones JSP</h1>


<%!
    private int resultado;

    public int metodoSuma(int x, int y) {
        return x + y;
    }
    public int metodoResta(int x, int y) {
        return x - y;
    }

    public int metodoMultiplica(int x, int y) {
        return x * y;
    }





%>

 <p>El resultado de la suma 5 + 7 es: <%=metodoSuma(5, 7) %></p>
 <p>El resultado de la resta 5 - 7 es: <%=metodoResta(5, 7) %></p>
 <p>El resultado de la multiplicación 5 * 7 es: <%=metodoMultiplica(5, 7) %></p>


</body>
</html>