package com.example;

public class Producto {
    private long codigoDeProducto; //este codigo es el codigo de barras
    private String nombre;
    private String descripcion;

    public Producto(long codigoDeProducto,String nombre,String descripcion){
        this.codigoDeProducto = codigoDeProducto;
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    public long getCodigoDeProducto(){
        return codigoDeProducto;
    }

    public String getNombre(){
        return nombre;
    }

    public String getDecripcion(){
        return descripcion;
    }

    @Override
    public String toString() {
        return "Producto {codigoDeProducto= "+codigoDeProducto+" nombre= "+nombre+" descripcion= "+descripcion+"}";
    }
}
