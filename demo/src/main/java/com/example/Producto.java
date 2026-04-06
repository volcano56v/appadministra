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

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString();
    }
}
