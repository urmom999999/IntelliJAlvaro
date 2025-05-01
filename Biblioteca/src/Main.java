//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Biblioteca accesobib = new Biblioteca();

        Scanner sc=new Scanner(System.in);
        int i;
        do{System.out.println("Que opcion deseas seleccionar? " +
                "\n 1. Registrar usuario " +
                "\n 2. Registrar libro " +
                "\n 3. Pedir libro " +
                "\n 4. Devolver libro." +
                "\n 5. Salir del menu" +
                "\nEscriba el numero:");

        i = sc.nextInt();
        sc.nextLine();
        switch(i) {
            case 1:
                System.out.println("Registrar usuario, seleccionado");
                System.out.println("Añadir nuevo usuario desde Biblioteca");
                System.out.print("-Nombre: ");
                String nombreusuario = sc.nextLine();
                System.out.print("-Apellidos: ");
                String apellidos = sc.nextLine();
                System.out.print("-DNI: ");
                String dni = sc.nextLine();
                System.out.print("-Año: ");
                int year = Integer.parseInt(sc.nextLine());

                accesobib.agregarusuario(nombreusuario,apellidos,dni,year);
                break;
            case 2:
                System.out.println("Registrar libro, seleccionado");
                System.out.print("-ISBN: ");
                int isbn = Integer.parseInt(sc.nextLine());
                System.out.print("-Nombre del libro: ");
                String nombrelibro =sc.nextLine();
                System.out.print("-Nombre autor: ");
                String autor =sc.nextLine();
                Libro nuevoLibro = new Libro(isbn,nombrelibro,autor);
                accesobib.agregarLibro(nuevoLibro);
                break;
            case 3:
//Seguir aqui, que busque el ISBN si no se encuentra y comprobar si prestado es =false
                System.out.println("Pedir libro, seleccionado");
                accesobib.pedirLibro();
                break;

            case 4:
                System.out.println("Devolver libro, seleccionado");
                accesobib.devolverLibro();

                break;

            case 5:
                break;
            default:System.out.println("Error");
        }}while(i !=5);
        sc.close();
    }
};