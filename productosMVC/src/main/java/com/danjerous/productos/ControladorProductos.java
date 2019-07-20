package com.danjerous.productos;

import javax.annotation.Resource;
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

    @Resource(name="jdbc/Productos")
    private DataSource miPool;

    @Override
    public void init() throws ServletException {
        super.init();

        try {
            modeloProductos = new ModeloProductos(miPool);

        } catch (Exception e) {
            throw new ServletException(e);
        }

    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        // Leer parámetro del formulario
        String instruccion  = request.getParameter("instruccion");
        // Si no se envía el parámetro, listar productos

        if (instruccion == null) {
            instruccion  =  "listar";
        }


        switch (instruccion) {
            case "listar":
                obtenerProductos(request, response);
                break;
            case "insertar":
                agregarProductos(request, response);
                break;
            case "cargar":
                obtenerProductoPorCodigo(request,response);
            case "actualizar":
                actualizarProducto(request, response);
                break;
                default:
                    obtenerProductos(request, response);
        }

        // Redirigir el flujo de ejecución al método adecuado

    }

    private void actualizarProducto(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        String codArticulo = request.getParameter("codArt");
        String nombre = request.getParameter("nombre");
        String seccion = request.getParameter("seccion");
        String precio = request.getParameter("precio");
        String fecha = request.getParameter("fecha");
        String pais = request.getParameter("pais");
        String importado = request.getParameter("importado");


        // Crear un objeto de tipo producto

        Productos producto = new Productos(codArticulo, nombre,seccion, precio,fecha, pais, importado);

        // Enviar el objeto al modelo y después insertar el objeto Producto en la BBDD
        try {
            modeloProductos.actualizarProducto(producto);

            // Volver al listado de Productos
            obtenerProductos(request, response);

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private void agregarProductos(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        // leer la información del producto que viene del formulario

       // Map<String, String[]> params = request.getParameterMap();

        String codArticulo = request.getParameter("codArt");
        String nombre = request.getParameter("nombre");
        String seccion = request.getParameter("seccion");
        String precio = request.getParameter("precio");
        String fecha = request.getParameter("fecha");
        String pais = request.getParameter("pais");
        String importado = request.getParameter("importado");


        // Crear un objeto de tipo producto

        Productos producto = new Productos(codArticulo, nombre,seccion, precio,fecha, pais, importado);

        // Enviar el objeto al modelo y después insertar el objeto Producto en la BBDD
        try {
            modeloProductos.insertarProductos(producto);

            // Volver al listado de Productos
            obtenerProductos(request, response);

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private void obtenerProductos(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{

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

    private void obtenerProductoPorCodigo(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Leer el código artículo
        String codArticulo = request.getParameter("cArticulo");

        Productos producto;
        try {
            producto = modeloProductos.getProductoPorCodigo(codArticulo);

            request.setAttribute("producto", producto);


            request.getRequestDispatcher("/formularioActualizar.jsp").forward(request, response);

        } catch (SQLException e) {
            System.out.println("Error al obtener el producto: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
