
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="java.util.List" %>
<%@ page import="com.danjerous.productos.Productos" %><%--
  Created by IntelliJ IDEA.
  User: Danier Javid
  Date: 18/07/2019
  Time: 2:52 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>


<%

%>

<!doctype html>
<html lang="en">
<head>
    <title>Lista productos</title>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
          integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
</head>
<body>

<div class="container">
    <h2 class="display-2">Lista de productos</h2>

    <a href="formularioInsertar.jsp" class="btn btn-primary">Insertar registro</a>
    <br> <br>
    <table class="table table-striped">
        <thead>
        <tr>
            <th>cod_art</th>
            <th>nombre</th>
            <th>sección</th>
            <th>precio</th>
            <th>fecha</th>
            <th>importado</th>
            <th>país</th>
            <th>editar</th>
            <th>eliminar</th>
        </tr>
        </thead>
        <tbody>
            <c:forEach var="producto" items="${productos}">
                <tr>
                    <td> ${producto.cArt} </td>
                    <td> ${producto.nombre} </td>
                    <td> ${producto.seccion} </td>
                    <td> ${producto.precio} </td>
                    <td> ${producto.fecha}</td>
                    <td> ${producto.importado} </td>
                    <td> ${producto.pais} </td>
                    <td><a href="ControladorProductos?instruccion=cargar&cArticulo=${producto.cArt}" class="btn btn-info">Editar</a></td>
                    <td><a href="ControladorProductos?instruccion=eliminar&cArticulo=${producto.cArt}" class="btn btn-danger">Eliminar</a></td>
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
