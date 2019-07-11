<%@ page import="java.sql.Connection" %>
<%@ page import="java.sql.DriverManager" %>
<%@ page import="java.sql.SQLException" %>
<%@ page import="java.sql.PreparedStatement" %><%--
  Created by IntelliJ IDEA.
  User: Danier Javid
  Date: 11/07/2019
  Time: 4:00 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Getting data</title>
</head>
<body>
    <%
        String nombre = request.getParameter("nombre");
        String apellido = request.getParameter("apellido");
        String usuario = request.getParameter("usuario");
        String contra = request.getParameter("contra");
        String pais = request.getParameter("pais");
        String tecnologia = request.getParameter("tecno");


        try {
            Class.forName("com.mysql.cj.jdbc.Driver"); // Cargando en tiempo de ejecución.

            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/proyectos_jsp?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC", "root", "user123");   // Así no funciona, toca cargar dinamicamente el driver, en tiempo de ejecucion decimos donde esta el driver con Class.forName();


            PreparedStatement insertUsers = conn.prepareStatement("INSERT INTO usuarios (nombre, apellido, usuario, contra, pais, tecnologia) VALUES (?, ?, ?, ?, ?, ?)");


            insertUsers.setString(1, nombre);
            insertUsers.setString(2, apellido);
            insertUsers.setString(3, usuario);
            insertUsers.setString(4, contra);
            insertUsers.setString(5, pais);
            insertUsers.setString(6, tecnologia);

            insertUsers.executeUpdate();

            if ( insertUsers != null) {
                insertUsers.close();
            }

            conn.close();

            out.println("Registrado con éxito.");

        } catch (SQLException e)  {
          out.println("Failed to connect db: " + e.getMessage());
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
          out.println("Couldn't found the class " + e.getMessage());
        }

    %>

</body>
</html>
