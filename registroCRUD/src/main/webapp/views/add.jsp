<%--
  Created by IntelliJ IDEA.
  User: Danier Javid
  Date: 22/07/2019
  Time: 10:45 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<div class="container">
    <form action="Controlador">
        <div class="form-group">
            <label for="nombre">Nombre</label>
            <input type="text" name="" id="nombre" class="form-control" placeholder="Nombre">
        </div>
        <div class="form-group">
            <label for="pais">Pais</label>
            <input type="text" name="" id="pais" class="form-control" placeholder="Pais">
        </div>
        <input type="submit" class="btn btn-primary"  name="accion" value="agregar">
    </form>
</div>
