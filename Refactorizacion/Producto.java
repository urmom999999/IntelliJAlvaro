package org.example;

public class Producto {
    public String nombre;
    public double precio;
    public int cantidad;
    public String sku;

    public Producto(String nombre, double precio, int cantidad, String sku) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
        this.sku = sku;
    }
/*
    public String getNombreProducto() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public String getSku() {
        return sku;
    }
*/
}