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

        //resultSet.close();
        //statement.close();
        //connection.close();
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


        if (success > 0) {
            return true;
        }

        return false;

    }


}
