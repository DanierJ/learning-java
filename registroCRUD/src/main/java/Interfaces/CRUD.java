package Interfaces;

import java.util.List;

public interface CRUD<T> {

    // Estas son las acciones que realizarán.

    public List<T> list();
    public T getById(int id);
    public boolean add(T object);
    public boolean edit(T object);
    public boolean delete(int id);
}
