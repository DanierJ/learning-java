<%--
  Created by IntelliJ IDEA.
  User: Danier Javid
  Date: 11/07/2019
  Time: 9:42 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <%
        // Leyendo datos del formulario
        String paisFavorito = request.getParameter("pais_favorito");

        // Crear cookie
        Cookie cookie = new Cookie("agencia_viajes.pais_favorito", paisFavorito);

        /// Vida de la cookie
        cookie.setMaxAge(120);

        // Enviar la cookie al usuario

        response.addCookie(cookie);


    %>

    <p>Gracias por enviar tus preferencias</p>

    <a href="agencia_viajes.jsp">Ir a la agencia de viajes</a>


</body>
</html>
