package com.danjerous.productos;


import javax.annotation.Resource;
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
import java.sql.SQLException;
import java.sql.Statement;


@WebServlet(name = "ServletPool", urlPatterns = {"/ServletPool"})
public class ServletPool extends HttpServlet {
    // Haciendo referencia al pool de conexión, definiendo o estableciendo el DataSource
    @Resource(name="jdbc/Productos")
    DataSource miPool;



    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        // Crear el objeto printWriter

        PrintWriter output = response.getWriter();

        response.setContentType("text/plain");


        // Connexión con la base de datos

        try {
            Connection connection = null;

            Statement statement = null;

            ResultSet resultSet = null;




            connection =  new GetConnection().getSimpleConnection();

            String sql = "SELECT * FROM productos";


            statement = connection.createStatement();


            resultSet = statement.executeQuery(sql);



            while (resultSet.next()) {
                String producto = resultSet.getString("nombre");
                output.println(producto);
            }




        } catch (SQLException e) {
            output.println("Hubo un error estableciendo la conexión: " + e.getMessage());
            e.printStackTrace();
        }

    }
}
