package com.example;

import java.util.ArrayList;

public class Bodega {
    private long codigoDeBodega;
    private ArrayList<Producto> productos;

    public Bodega(long codigoDeBodega){
        this.codigoDeBodega = codigoDeBodega;
        this.productos = new ArrayList<>();
    }

    public long getCodigoDeBodega(){
        return codigoDeBodega;
    }

    public ArrayList<Producto> geProductos(){
        return productos;
    }

    public void agregarProductoBodega(Producto producto){
        productos.add(producto);
    }

    @Override
    public String toString() {
        return "Bodega{codigoDeBodega= "+codigoDeBodega+" productos= "+productos.toString()+"}";
    }

}
