<%--
  Created by IntelliJ IDEA.
  User: Danier Javid
  Date: 18/07/2019
  Time: 6:25 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<!doctype html>
<html lang="en">
<head>
    <title>Insertar Producto</title>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
          integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
</head>
<body>

    <div class="container">
        <h2 class="display-2">Insertar Articulo</h2>
        <a href="ControladorProductos" class="btn btn-info">Go back</a>
        <form method="GET" action="ControladorProductos">
            <input type="hidden" name="instruccion" value="insertar">
            <div class="form-group">
                <label for="codArticulo">Cod Articulo</label>
                <input type="text" name="codArt" class="form-control" id="CodArticulo" placeholder="Cod Articulo">
            </div>
            <div class="form-group">
                <label for="nombre">Nombre</label>
                <input type="text" name="nombre" class="form-control" id="nombre" placeholder="Nombre">
            </div>
            <div class="form-group">
                <label for="seccion">Seccion</label>
                <input type="text" name="seccion" class="form-control" id="seccion" placeholder="Seccion">
            </div>
            <div class="form-group">
                <label for="precio">Precio</label>
                <input type="text" name="precio" class="form-control" id="precio" placeholder="Precio">
            </div>
            <div class="form-group">
                <label for="precio">Fecha</label>
                <input type="text" name="fecha" class="form-control" id="fecha" placeholder="Fecha">
            </div>
            <div class="form-group">
                <label for="pais">Pais</label>
                <input type="text" name="pais" class="form-control" id="pais" placeholder="Pais">
            </div>
            <div class="form-group">
                <label for="importado">Importado</label>
                <input type="text" name="importado" class="form-control" id="importado" placeholder="Importado">
            </div>
            <button type="submit" class="btn btn-primary">Insertar</button>
        </form>
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