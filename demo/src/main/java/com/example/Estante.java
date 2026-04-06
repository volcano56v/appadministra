package com.example;

import java.util.ArrayList;

public class Estante {
    private long codigoDeEstante;
    private String Categoria; //bucar la categorias que hay en tiendas
    private ArrayList<Producto> productos;//creo que hay una mejor forma de ordenamiento

    public Estante(long codigoDeEstante,String Categoria){
        this.codigoDeEstante = codigoDeEstante;
        this.Categoria = Categoria;
        productos = new ArrayList<>();
    
    }

    @Override
    public String toString() {
        return "Estante{codigoDeEstante= "+codigoDeEstante+" Categoria= "+Categoria+"productos= "+productos.toString()+"}";
    }
}
