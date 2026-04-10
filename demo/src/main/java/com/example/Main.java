package com.example;

import java.util.random.RandomGenerator;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hola mundo");
        Producto producto = new Producto(generarNumerosAleatorios(), null, null);
        Estante estante = new Estante(generarNumerosAleatorios(), null);
        Bodega bodega = new Bodega(generarNumerosAleatorios());

        System.out.println("Este es Producto:");
        System.out.println(producto);
        System.out.println("Este es Estante:");
        System.out.println(estante);
        System.out.println("Este es Bodega:");
        System.out.println(bodega);
    }

    public static long generarNumerosAleatorios(){
        long resultado;
        long min = 100000000000L;
        long max = 1000000000000L;
        RandomGenerator generator = RandomGenerator.of("L64X128MixRandom");
        resultado = generator.nextLong(min, max + 1);
        return resultado;
    }
}