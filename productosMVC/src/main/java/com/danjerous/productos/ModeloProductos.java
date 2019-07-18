package com.danjerous.productos;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
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
            Productos producto = new Productos(resultSet.getString("cod_articulo"),resultSet.getString("seccion"),resultSet.getDouble("precio"),resultSet.getDate("fecha"),resultSet.getString("importado"),resultSet.getString("pais"));

            productos.add(producto);

        }

        //resultSet.close();
        //statement.close();
        //connection.close();
        return productos;
    }


}
