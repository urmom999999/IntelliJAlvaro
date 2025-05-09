import java.util.ArrayList;

import java.util.Scanner;

public class Main {

    private static ArrayList<Figura> figuras = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    private static void añadirFigura(){
        System.out.println("==Añadir figura==");
        int nuevoNombre = Integer.parseInt(sc.nextline());
        int nuevoColor = Integer.parseInt(sc.nextline());
        int nuevoposX = Integer.parseInt(sc.nextline());
        int nuevoposY = Integer.parseInt(sc.nextline());

figuras.add(figura);
    }

    private static void eliminarFigura(){
        System.out.println("==Eliminar figura==");
        System.out.println("Escriba el nombre de la figura a eliminar");
    }

    private static void calcularAreaTotal(){
        System.out.println("==Calcular area total==");
    }

    private static void calcularPerimetroTotal(){
        System.out.println("==Calcular perimetro total==");
        System.out.println("Ecribe el nombre dado a la figura");
        int figuraACalcular = scanner.nextInt();
        /*System.out.println("1 Rectangulo");
        System.out.println("2 Cuadrado");
        System.out.println("3 Circulo");
        System.out.println("4 Triangulo");
        System.out.println("5 Salir...");
        int figuraACalcular = scanner.nextInt();
        switch(figuraACalcular){
            case 1:
                rectangulo.calcularPerimetro();
                break;
            case 2:

                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                System.exit(0);
            default:
                System.out.println("Error");
        }*/
    }

    private static void figuraConMayorArea(){
        System.out.println("==Mostrando figura con mayor area==");
    }

    private static void figuraConMayorPerimetro(){
        System.out.println("==Mostrando figura con mayor perimetro==");
    }

    private static void listarFiguras(){
        System.out.println("==Lista de figuras==");
for (Figura figura: figuras){
System.out.println(figura.nombre);
}
    }

    private static void listarFigurasTipo(){
        System.out.println("==Lista de figuras por tipo==");

    }


    public static void main(String[] args) {
        //TEST
        figuras.add(new Figura("azul","rectangulo","0","0"));


    int opcion;
while (true){
    System.out.println("==Menu figuras==");
    System.out.println("Opciones:");
    System.out.println("1 Añadir figura");
    System.out.println("2 Eliminar figura");
    System.out.println("3 Calcular area total");
    System.out.println("4 Calcular perimetro total");
    System.out.println("5 Figura con mayor area");
    System.out.println("6 Figura con mayor perimetro");
    System.out.println("7 Listar figuras");
    System.out.println("8 Listar figuras por tipo");
    System.out.println("9 Salir del menu");

    opcion = scanner.nextInt();
    switch(opcion) {
        case 1:
            añadirFigura(figuras);

            break;
        case 2:
            eliminarFigura();
            break;
        case 3:
            calcularAreaTotal();
            break;
        case 4:
            calcularPerimetroTotal();
            break;
        case 5:
            figuraConMayorArea();
            break;
        case 6:
            figuraConMayorPerimetro();
            break;
        case 7:
            listarFiguras();
            break;
        case 8:
            listarFigurasTipo();
            break;
        case 9:
            System.exit(0);
        default:
            System.out.println("Error");
    }
}}
}
/* figura, retangulo, cuadrado, circuo, triangulo
figura:color, nombre, pos x, pos
+const +get set + calcular area +
 calcular perimetro + mover

 gestion figuras -lista
 añadirFigura(),eliminarFigura(), calcularAreaTotal(), calcularPerimetroTotal(),
 figuraConMayorArea(),figuraConMayorPerimetro(),listarFiguras(),listarFigurasTipo()
 */