package com.example;

import java.util.ArrayList;

public class Estante {
    private long codigoDeEstante;
    private String categoria; //bucar la categorias que hay en tiendas
    private ArrayList<Producto> productos;//creo que hay una mejor forma de ordenamiento

    public Estante(long codigoDeEstante,String categoria){
        this.codigoDeEstante = codigoDeEstante;
        this.categoria = categoria;
        productos = new ArrayList<>();
    
    }

    public long getCodigoDeEstante(){
        return codigoDeEstante;
    }

    public String getCategoria(){
        return categoria;
    }

    public ArrayList<Producto> getProductos(){
        return productos;
    }

    @Override
    public String toString() {
        return "Estante{codigoDeEstante= "+codigoDeEstante+" Categoria= "+categoria+"productos= "+productos.toString()+"}";
    }
}
