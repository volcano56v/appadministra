package com.example;

import java.util.ArrayList;

public class Estante {
    private long codigoDeEstente;
    private String Categoria; //bucar la categorias que hay en tiendas
    private ArrayList<Producto> productos;//creo que hay una mejor forma de ordenamiento

    public Estante(long codigoDeEstente,String Categoria){
        this.codigoDeEstente = codigoDeEstente;
        this.Categoria = Categoria;
        productos = new ArrayList<>();
    
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString();
    }
}
