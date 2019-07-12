package com.danjerous.jspTags;

public class Empleado {
    private String nombre;
    private String apellido;
    private String pais;
    private String tecnologia;

    public Empleado(String nombre, String apellido, String pais, String tecnologia) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.pais = pais;
        this.tecnologia = tecnologia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getTecnologia() {
        return tecnologia;
    }

    public void setTecnologia(String tecnologia) {
        this.tecnologia = tecnologia;
    }
}
