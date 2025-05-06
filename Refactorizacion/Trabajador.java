package org.example;

public class Trabajador {
    public String nombre;
    public String apellido;
    public String direccion;
    public String telefono;
    public Tienda tienda;

    public Trabajador(String nombre, String apellido, String direccion, String telefono, Tienda tienda) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.telefono = telefono;
        this.tienda = tienda;
    }}