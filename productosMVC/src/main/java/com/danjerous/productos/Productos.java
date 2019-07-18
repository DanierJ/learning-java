package com.danjerous.productos;

import java.util.Date;

public class Productos {
    private String cArt;
    private String nombre;
    private String seccion;
    private double precio;
    private Date fecha;
    private String importado;
    private String pais;

    public Productos(String cArt, String nombre, String seccion, double precio, Date fecha, String importado, String pais) {
        this.cArt = cArt;
        this.nombre = nombre;
        this.seccion = seccion;
        this.precio = precio;
        this.fecha = fecha;
        this.importado = importado;
        this.pais = pais;
    }

    public Productos(String nombre, String seccion, double precio, Date fecha, String importado, String pais) {
        this.nombre = nombre;
        this.seccion = seccion;
        this.precio = precio;
        this.fecha = fecha;
        this.importado = importado;
        this.pais = pais;
    }

    public String getcArt() {
        return cArt;
    }

    public void setcArt(String cArt) {
        this.cArt = cArt;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSeccion() {
        return seccion;
    }

    public void setSeccion(String seccion) {
        this.seccion = seccion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getImportado() {
        return importado;
    }

    public void setImportado(String importado) {
        this.importado = importado;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }
}
