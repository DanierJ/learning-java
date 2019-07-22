package ModelDAO;

import Config.Connection;
import Interfaces.CRUD;
import Model.Persona;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

/**
 * Aquí se realiza toda la lógica de negocio y conectar con la base de datos.
 */
public class PersonaDAO implements CRUD<Persona> {
    private Connection conn = new Connection();
    private PreparedStatement ps;
    private ResultSet rs;
    private Persona persona = new Persona();

    @Override
    public List<Persona> list() {
        return null;
    }

    @Override
    public Persona getById(int id) {
        return null;
    }

    @Override
    public boolean add(Persona persona) {
        return false;
    }

    @Override
    public boolean edit(Persona persona) {
        return false;
    }

    @Override
    public boolean delete(int id) {
        return false;
    }
}
