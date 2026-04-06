package com.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hola mundo");
        Producto producto = new Producto(0, null, null);
        Estante estante = new Estante(0, null);
        Bodega bodega = new Bodega(0);

        System.out.println("Este es Producto:");
        System.out.println(producto);
        System.out.println("Este es Estante:");
        System.out.println(estante);
        System.out.println("Este es Bodega:");
        System.out.println(bodega);

        //esto es por que quiero ver algo
    }
}