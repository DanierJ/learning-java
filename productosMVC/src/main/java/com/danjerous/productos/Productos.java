package com.danjerous.productos;

/**
 * Esta clase es para construir los objetos de tipo Producto
 * @author Danier Javid Martínez Camacho
 *
 */
public class Productos {
    private String cArt;
    private String nombre;
    private String seccion;
    private String precio;
    private String fecha;
    private String pais;
    private String importado;

    /**
     *
     * @param cArt: Código del artículo
     * @param nombre: Nombre del producto
     * @param seccion
     * @param precio
     * @param fecha
     * @param pais
     * @param importado
     */
    public Productos(String cArt, String nombre, String seccion, String precio, String fecha, String pais, String importado) {
        this.cArt = cArt;
        this.nombre = nombre;
        this.seccion = seccion;
        this.precio = precio;
        this.fecha = fecha;
        this.pais = pais;
        this.importado = importado;
    }

    public Productos(String nombre, String seccion, String precio, String fecha, String pais, String importado) {
        this.nombre = nombre;
        this.seccion = seccion;
        this.precio = precio;
        this.fecha = fecha;
        this.pais = pais;
        this.importado = importado;
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

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
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

    @Override
    public String toString() {
        return "Productos {" +
                "cArt='" + cArt + '\'' +
                ", nombre='" + nombre + '\'' +
                ", seccion='" + seccion + '\'' +
                ", precio=" + precio +
                ", fecha=" + fecha +
                ", importado='" + importado + '\'' +
                ", pais='" + pais + '\'' +
                '}';
    }
}
