package Model;

public class Persona {
    private int id;
    private String nombre;
    private String pais;

    public Persona() { }

    public Persona(String nombre, String pais) {
        this.nombre = nombre;
        this.pais = pais;
    }

    public Persona(int id, String nombre, String pais) {
        this.id = id;
        this.nombre = nombre;
        this.pais = pais;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", pais='" + pais + '\'' +
                '}';
    }
}
