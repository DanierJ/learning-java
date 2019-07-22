package Interfaces;

import Model.Persona;

import java.util.List;

public interface CRUD {

    public List list();
    public Persona getPersonaById(int id);
    public boolean add(Persona persona);
    public boolean edit(Persona persona);
    public boolean delete(int id);
}
