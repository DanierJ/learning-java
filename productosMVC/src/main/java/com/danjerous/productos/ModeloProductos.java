package com.danjerous.productos;

import javax.sql.DataSource;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ModeloProductos {
    private DataSource origenDatos;

    public ModeloProductos(DataSource origenDatos) {
        this.origenDatos = origenDatos;
    }

    public List<Productos> getProductos () throws SQLException {
        List<Productos> productos = new ArrayList<>();

        Connection connection = null;

        Statement statement = null;

        ResultSet resultSet = null;

        connection = origenDatos.getConnection();

        statement = connection.createStatement();

        String sql = "SELECT * FROM productos";


        resultSet = statement.executeQuery(sql);

        while (resultSet.next()) {
            Productos producto = new Productos(resultSet.getString("cod_articulo"), resultSet.getString("nombre"),resultSet.getString("seccion"),resultSet.getString("precio"),resultSet.getString("fecha"),resultSet.getString("pais"),resultSet.getString("importado"));

            productos.add(producto);

        }
        /// CERRAR CONEXIONES
        resultSet.close();
        statement.close();
        connection.close();
        return productos;
    }

    public boolean insertarProductos(Productos producto) throws SQLException {
        Connection connection = null;

        Statement statement = null;

        ResultSet resultSet = null;

        connection = origenDatos.getConnection();

        PreparedStatement insertarProducto = connection.prepareStatement("INSERT INTO productos (cod_articulo, nombre, seccion, precio, fecha, pais, importado) VALUES (?, ?, ?, ?, ?, ?, ?)");

        insertarProducto.setString(1, producto.getcArt());
        insertarProducto.setString(2, producto.getNombre());
        insertarProducto.setString(3, producto.getSeccion());
        insertarProducto.setString(4,producto.getPrecio());
        insertarProducto.setString(5,producto.getFecha());
        insertarProducto.setString(6,producto.getPais());
        insertarProducto.setString(7,producto.getImportado());


        int success = insertarProducto.executeUpdate();

        resultSet.close();
        statement.close();
        connection.close();

        if (success > 0) {
            return true;

        }

        return false;

    }


    public Productos getProductoPorCodigo (String codArticulo) throws SQLException{
        Connection connection = null;
        PreparedStatement queryProducto = null;
        ResultSet resultSet = null;

        connection = origenDatos.getConnection();

        queryProducto = connection.prepareStatement("SELECT * FROM productos WHERE cod_articulo = ?");


        queryProducto.setString(1, codArticulo);

        resultSet = queryProducto.executeQuery();

        Productos producto = null;

        if (resultSet.next()) {
            producto = new Productos(codArticulo, resultSet.getString("nombre"),resultSet.getString("seccion"),resultSet.getString("precio"),resultSet.getString("fecha"),resultSet.getString("pais"),resultSet.getString("importado"));
        } else {
            throw new SQLException("No se pudo encontrar el producto con ese codigo");
        }

        resultSet.close();
        queryProducto.close();
        connection.close();

        return producto;


        /// CERRAR CONEXIONES
    }

    public boolean actualizarProducto(Productos producto) throws SQLException {
        Connection connection = null;
        PreparedStatement updateProducto = null;


        connection = origenDatos.getConnection();


        String sql = "UPDATE productos SET nombre = ? , seccion = ?, precio = ?, fecha = ?, pais = ?, importado = ? WHERE cod_articulo = ?";

        updateProducto = connection.prepareStatement(sql);

        updateProducto.setString(1, producto.getNombre());
        updateProducto.setString(2, producto.getSeccion());
        updateProducto.setString(3, producto.getPrecio());
        updateProducto.setString(4, producto.getFecha());
        updateProducto.setString(5, producto.getPais());
        updateProducto.setString(6, producto.getImportado());
        updateProducto.setString(7, producto.getcArt());


        int actualizado = updateProducto.executeUpdate();

        updateProducto.close();
        connection.close();


        if (actualizado > 0) {
            return true;
        }

        return false;

        /// CERRAR CONEXIONES


    }

    public boolean eliminarProducto(String codArticulo) throws SQLException {
        Connection connection = null;
        PreparedStatement deleteProducto = null;

        connection = origenDatos.getConnection();

        deleteProducto = connection.prepareStatement("DELETE FROM productos WHERE cod_articulo = ?");

        deleteProducto.setString(1,codArticulo);

        int eliminado = deleteProducto.executeUpdate();

        deleteProducto.close();
        connection.close();

        if (eliminado > 0) {
            return true;
        }

        return false;
    }


}
