package ModelDAO;

import Config.DBConnection;
import Interfaces.CRUD;
import Model.Persona;
import org.apache.commons.dbutils.DbUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Aquí se realiza toda la lógica de negocio y conectar con la base de datos.
 */
public class PersonaDAO implements CRUD<Persona> {
    private DBConnection connection = new DBConnection();
    private Connection conn = null;
    private PreparedStatement ps = null;
    private ResultSet rs = null;
    private Persona persona = new Persona();

    @Override
    public List<Persona> list() {
        List<Persona> personaList = new ArrayList<>();
        String sql = "SELECT * FROM usuarios";

        try {

            conn = connection.getConnection();
            ps = conn.prepareStatement(sql);

            rs = ps.executeQuery();

            while (rs.next()) {
                Persona persona = new Persona(rs.getInt("id"), rs.getString("nombre"), rs.getString("pais"));
                personaList.add(persona);
            }

        } catch (SQLException e) {
            System.out.println("Error connecting to DB: " + e.getMessage());
        } finally {
            // This
            DbUtils.closeQuietly(rs);
            DbUtils.closeQuietly(ps);
            DbUtils.closeQuietly(conn);
        }

        return personaList;
    }

    @Override
    public Persona getById(int id) {
        String sql = "SELECT * FROM usuarios WHERE id = ?";

        try {
            conn = connection.getConnection();
            ps = conn.prepareStatement(sql);

            ps.setInt(1, id);

            rs = ps.executeQuery();

            while (rs.next()) {
                Persona persona = new Persona(rs.getInt("id"), rs.getString("nombre"),rs.getString("pais"));

                return persona;
            }

        } catch (SQLException e) {
            System.out.println("Error performing the query: " + e.getMessage());
            e.printStackTrace();
        } finally {

            DbUtils.closeQuietly(rs);
            DbUtils.closeQuietly(ps);
            DbUtils.closeQuietly(conn);
        }

        return null;
    }

    @Override
    public boolean add(Persona persona) {
       String sql = "INSERT INTO usuarios (nombre, pais) VALUES (?, ?)";

       try {
           conn = connection.getConnection();
           ps = conn.prepareStatement(sql);

           ps.setString(1, persona.getNombre());
           ps.setString(2, persona.getPais());

           int query = ps.executeUpdate();

           return query > 0;

       } catch (SQLException e) {
           System.out.println("Error connecting to DB: " + e.getMessage());
       } finally {
           // This
           DbUtils.closeQuietly(rs);
           DbUtils.closeQuietly(ps);
           DbUtils.closeQuietly(conn);
       }

       return false;

    }

    @Override
    public boolean edit(Persona persona) {
        String sql = "UPDATE usuarios SET nombre = ?, pais = ? WHERE id = ?";

        try {
            conn = connection.getConnection();
            ps = conn.prepareStatement(sql);

            ps.setString(1,persona.getNombre());

            ps.setString(2, persona.getPais());

            ps.setInt(3, persona.getId());


            int update = ps.executeUpdate();

            return update > 0;

        } catch (SQLException e) {
            System.out.println("Error performing the query: " + e.getMessage());
            e.printStackTrace();
        } finally {
            DbUtils.closeQuietly(rs);
            DbUtils.closeQuietly(ps);
            DbUtils.closeQuietly(conn);
        }
        return false;
    }

    @Override
    public boolean delete(int id) {
        String sql = "DELETE FROM usuarios WHERE id = ?";

        try {
            conn = connection.getConnection();
            ps = conn.prepareStatement(sql);

            ps.setInt(1, id);

            int delete = ps.executeUpdate();

            return delete > 0;

        } catch (SQLException e) {

            System.out.println("Error performing the query: " + e.getMessage());
            e.printStackTrace();

        } finally {
            DbUtils.closeQuietly(rs);
            DbUtils.closeQuietly(ps);
            DbUtils.closeQuietly(conn);
        }

        return false;
    }

}
