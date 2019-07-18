package com.danjerous.productos;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

@WebServlet(name = "ControladorProductos")
public class ControladorProductos extends HttpServlet {

    private ModeloProductos modeloProductos;

   // @Resource(name="jdbc/Productos")
    private DataSource miPool;

    @Override
    public void init() throws ServletException {
        super.init();

        try {

            Context context = new InitialContext();
            miPool = (DataSource)context.lookup("java:comp/env/jdbc/Productos");

            modeloProductos = new ModeloProductos(miPool);

        } catch (Exception e) {
            throw new ServletException(e);
        }

    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        // Obtener la lista de productos desde el modelo

        try {
            List<Productos> productos = modeloProductos.getProductos();


            request.setAttribute("productos", productos);

            RequestDispatcher dispatcher = request.getRequestDispatcher("/listaProductos.jsp");

            dispatcher.forward(request, response);

        } catch (SQLException e) {
            System.out.println("Hubo un error obteniendo los productos: " + e.getMessage());
            e.printStackTrace();
        }




    }
}
