<%@ page import="java.sql.*" %><%--
  Created by IntelliJ IDEA.
  User: Danier Javid
  Date: 11/07/2019
  Time: 5:09 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Verificando usuarios</title>
</head>
<body>

<%

    String usuario = request.getParameter("usuario");
    String contra = request.getParameter("contra");


    try {
        Class.forName("com.mysql.cj.jdbc.Driver"); // Cargando en tiempo de ejecución.

        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/proyectos_jsp?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC", "root", "user123");   // Así no funciona, toca cargar dinamicamente el driver, en tiempo de ejecucion decimos donde esta el driver con Class.forName();


        PreparedStatement queryUser = conn.prepareStatement("SELECT * FROM usuarios WHERE usuario = ? AND contra = ?");

        queryUser.setString(1, usuario);
        queryUser.setString(2, contra);

        ResultSet results = queryUser.executeQuery();

        if (results.absolute(1)) {
            out.println("<h2>Usuario autorizado</h2>");
        } else {
            out.println("<h2>Usuario no autorizado</h2>");
        }


        if ( queryUser != null) {
            queryUser.close();
        }

        conn.close();


    } catch (SQLException e)  {
        out.println("Failed to connect db: " + e.getMessage());
        e.printStackTrace();
    } catch (ClassNotFoundException e) {
        out.println("Couldn't found the class " + e.getMessage());
    }

%>


</body>
</html>
