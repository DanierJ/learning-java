package com.danjerous.productos;

import javax.annotation.Resource;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

@WebServlet(name = "ServletProductos")
public class ServletProductos extends HttpServlet {

    private static final long serialVersionUID = 1L;

    @Resource(name = "jdbc/Productos")
    private DataSource mipool;

    public ServletProductos() {
        super();
    }


    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Crear el objeto printWriter

        PrintWriter output = response.getWriter();

        response.setContentType("text/plain");


        // Connexión con la base de datos

        Connection connection = null;
        Statement statement = null;

        ResultSet resultSet = null;
        try {


           Context ctx = new InitialContext();
           mipool = (DataSource)ctx.lookup("java:comp/env/jdbc/Productos");
           // System.out.println("ds=" + mipool);

            connection =  mipool.getConnection();

          //  System.out.println("ds.getConnection()= " + connection);


           // connection =  new GetConnection().getSimpleConnection();
          //  connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/pruebas?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC", "root", "user123");


            String sql = "SELECT * FROM productos";


            statement = connection.createStatement();


            resultSet = statement.executeQuery(sql);



            while (resultSet.next()) {
                String producto = resultSet.getString("nombre");
                output.println(producto);
            }




        } catch (Exception e) {
            output.println("Hubo un error estableciendo la conexión: " + e.getMessage());
            e.printStackTrace();
        } /*finally {
            try {
                connection.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }*/

    }

}

