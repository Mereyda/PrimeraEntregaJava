package com.company;

public class Funciones {
    public static void main(String[] args) {
        double precio = precioConIva(50.00);
        System.out.println(precio);

        //otra forma de hacerlo:
        System.out.println(precioConIva(150.00));

    }

    static double precioConIva(double precio){
        return  precio + (precio * 0.21);
    }
}
