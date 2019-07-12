<%@ page import="java.sql.*" %>
<%@ page import="com.danjerous.jspTags.Empleado" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %><%--
  Created by IntelliJ IDEA.
  User: Danier Javid
  Date: 12/07/2019
  Time: 4:21 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%
        List<Empleado> empleados = new ArrayList<>();
    try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/proyectos_jsp?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC", "root", "user123");


        PreparedStatement queryEmployees = connection.prepareStatement("SELECT * FROM usuarios");

        ResultSet results = queryEmployees.executeQuery();


        while (results.next()) {
            empleados.add(new Empleado(results.getString(2), results.getString(3),results.getString(6),results.getString(7)));
        }

        results.close();
        queryEmployees.close();
        connection.close();


    } catch (SQLException e) {
        System.out.println(e.getMessage());
    }

    pageContext.setAttribute("losEmpleados", empleados);
%>



<html>
<head>
    <title>Utilizando el tag c:forEach </title>
</head>
<body>
    <h2>Lista de empleados</h2>
    <c:forEach var="empleado" items="${losEmpleados}">
        <br>

        Nombre: ${empleado.nombre} <br>

        Apellido: ${empleado.apellido} <br>

        Pais: ${empleado.pais} <br>

        Tecnología: ${empleado.tecnologia} <br>
    </c:forEach>
</body>
</html>
