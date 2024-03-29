<%@ page import="Model.Persona" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Danier Javid
  Date: 22/07/2019
  Time: 10:45 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<!doctype html>
<html lang="en">
<head>
    <title>Listado de personas</title>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
          integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
</head>
<body>

 <div class="container">
     <h1 class="display-4">Listado personas</h1>
     <a href="Controlador?accion=add" class="btn btn-primary">Agregar</a>
     <table class="table">
         <thead>
         <tr>
             <th>id</th>
             <th>nombre</th>
             <th>pais</th>
             <th>editar</th>
             <th>eliminar</th>
         </tr>
         </thead>
         <tbody>
         <c:forEach var="persona" items="${personas}">
             <tr>
                 <td>${persona.id}</td>
                 <td>${persona.nombre}</td>
                 <td>${persona.pais}</td>
                 <td>
                     <a href="Controlador?accion=edit&amp;id=${persona.id}" class="btn btn-info">Editar</a>
                 </td>
                 <td>
                     <form action="Controlador" method="POST">
                         <input type="hidden" name="id" value="${persona.id}">
                         <input type="submit" name="accion"  value="delete" class="btn btn-danger">
                     </form>
                 </td>
             </tr>
         </c:forEach>
         </tbody>
     </table>
 </div>

<!-- Optional JavaScript -->
<!-- jQuery first, then Popper.js, then Bootstrap JS -->
<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"
        integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo"
        crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"
        integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1"
        crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"
        integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM"
        crossorigin="anonymous"></script>
</body>
</html>