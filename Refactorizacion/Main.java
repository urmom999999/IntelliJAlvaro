package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    // Array para introducir los diferentes datos
    private static ArrayList<Producto> productos = new ArrayList<>();
    private static ArrayList<Trabajador> trabajadores = new ArrayList<>();
    //Clientes no utilizado?
    private static ArrayList<Cliente> clientes = new ArrayList<>();

    //error, añadir aqui las tiendas tambien
    private static ArrayList<Tienda> tiendas = new ArrayList<>();

//No meterlos dentro del main()
    private static void infotienda() {
        System.out.println("\nInformacion de las tiendas:");

        for (Tienda tienda : tiendas) {
            System.out.println("Dirección: " + tienda.direccion);
            System.out.println("Teléfono: " + tienda.telefono);
            System.out.println("--------------------------");
        }
    }

    private static void infotrabajador() {
        System.out.println("\nInformación de los trabajadores:");
        //for para recorrer el array
        for (Trabajador trabajador : trabajadores) {
            System.out.println("Nombre: " + trabajador.nombre);
            System.out.println("Apellido: " + trabajador.apellido);
            System.out.println("Dirección: " + trabajador.direccion);
            System.out.println("Teléfono: " + trabajador.telefono);
            System.out.println("Tienda: " + trabajador.tienda.direccion);
            System.out.println("-------------------------");
        }
    }

    private static void mostrarproductos() {
        System.out.println("\nProductos disponibles:");
        for (Producto producto : productos) {
            System.out.println("Nombre: " + producto.nombre);
            System.out.println("Precio: " + producto.precio);
            System.out.println("Cantidad: " + producto.cantidad);
            System.out.println("SKU: " + producto.sku);
            System.out.println("----------------------------");
        }
    }

    private static void ultimosproductos() {
        System.out.println("\nÚltimos 3 productos añadidos:");
        //foreach error
        //Comienzo es desde el final de la lista -3
        int comienzo = Math.max(0, productos.size() - 3);
        for (int i = comienzo; i < productos.size(); i++) {
            Producto producto = productos.get(i);
            System.out.println("Nombre: " + producto.nombre);
            System.out.println("Precio: " + producto.precio);
            System.out.println("Cantidad: " + producto.cantidad);
            System.out.println("SKU: " + producto.sku);
            System.out.println("---------------------");
        }
    }

    private static void comprarproductos(Scanner scanner) {
        System.out.println("Comprar productos");
        System.out.print("Escriba el codigo: ");
        String sku = scanner.next();
        System.out.print("Cantidad: ");
        int cantidad = scanner.nextInt();

        for (Producto producto : productos) {
            if (producto.sku.equals(sku)) {

                if (producto.cantidad >= cantidad) {
                    producto.cantidad -= cantidad;
                    System.out.println("Correcto");
                } else
                {
                    System.out.println("Error");
                }
                return;
            }
        }
        System.out.println("Error");
    }




    public static void main(String[] args) {
//Añadir datos al array, eliminar el indicador de numero de usuario
        tiendas.add(new Tienda("Calle 123", "1234567"));
        tiendas.add(new Tienda("Calle 456", "7654321"));

        trabajadores.add(new Trabajador("Juan", "Perez", "Calle 123", "1234567", tiendas.get(0))); //seleccionar la tienda adecuada no 1 2
        trabajadores.add(new Trabajador("Maria", "Lopez", "Calle 456", "7654321", tiendas.get(0)));
        trabajadores.add(new Trabajador("Pedro", "Gomez", "Calle 789", "4567890", tiendas.get(1)));
        trabajadores.add(new Trabajador("Ana", "Garcia", "Calle 101", "0987654", tiendas.get(1)));

        clientes.add(new Cliente("Carlos", "Perez", "Calle 123", "1234567"));
        clientes.add(new Cliente("Ana", "Lopez", "Calle 456", "7654321"));
        clientes.add(new Cliente("Pedro", "Gomez", "Calle 789", "4567890"));
        clientes.add(new Cliente("Maria", "Garcia", "Calle 101", "0987654"));


        productos.add(new Producto("Patatas", 1.5, 100, "1234"));
        productos.add(new Producto("Manzanas", 2.5, 200, "5678"));
        productos.add(new Producto("Peras", 3.5, 300, "9101"));
        productos.add(new Producto("Uvas", 4.5, 400, "1121"));
        productos.add(new Producto("Fresas", 5.5, 500, "3141"));
        productos.add(new Producto("Platanos", 6.5, 600, "5161"));
        productos.add(new Producto("Naranjas", 7.5, 700, "7181"));
        productos.add(new Producto("Mangos", 8.5, 800, "9201"));



        Scanner scanner = new Scanner(System.in);
        int opcion;
        while (true) {
            System.out.println("1. Mostrar información de todas las tiendas");
            System.out.println("2. Mostrar información de todos los trabajadores");
            System.out.println("3. Mostrar productos disponibles");
            System.out.println("4. Últimos 3 productos añadidos");
            System.out.println("5. Comprar productos");
            System.out.println("6. Salir");
            System.out.print("Ingrese la opción: ");

            opcion = scanner.nextInt();
//  --MENU--
            switch (opcion) {
                case 1:
                    infotienda();
                    break;
                case 2:
                    infotrabajador();
                    break;
                case 3:
                    mostrarproductos();
                    break;
                case 4:
                    ultimosproductos();

                    break;
                case 5:
                    comprarproductos(scanner);
                    break;
                case 6:
                    System.exit(0);
                default:
                    System.out.println("Error");

            }

        }
    }}