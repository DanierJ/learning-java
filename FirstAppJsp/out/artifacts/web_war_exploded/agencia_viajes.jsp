<%--
  Created by IntelliJ IDEA.
  User: Danier Javid
  Date: 11/07/2019
  Time: 9:57 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Pagina personalizada</title>
</head>
<body>
    <%

        /// Valor por defecto

        String paisFavorito = "Colombia";

        // Lee la cookie de la petición del navegador

        Cookie[] cookies = request.getCookies();

        // Buscar las preferencias. El país favorito

        if (cookies != null) {
            for (Cookie cook : cookies) {
                if (cook.getName().equals("agencia_viajes.pais_favorito")) {
                    paisFavorito = cook.getValue();
                    break;
                }
            }
        }
    %>

    <h2 class="display-4">Estás listo para viajar a <%=paisFavorito%> ?</h2>

    <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Accusamus, aperiam consequatur iusto praesentium quibusdam veniam vero voluptatem. Commodi cupiditate delectus doloribus, facere facilis harum libero similique. Error iusto repudiandae voluptas.</p>
</body>
</html>
