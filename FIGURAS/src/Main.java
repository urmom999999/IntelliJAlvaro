import java.util.ArrayList;

import java.util.Scanner;

public class Main {

    private static ArrayList<Figura> figuras = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

//Predeterminadas
    private static void añadirFigurasPredeterminadas(){

        figuras.add(new Circulo("verde", "Circ", 4.2));
        figuras.add(new Triangulo("amarillo", "Triang", 6.0));
    }



    // - AÑADIR FIGURA
    private static void añadirFigura(){
        System.out.println("==Añadir figura==");
        System.out.println("Escriba el nombre propio que le quieras dar a esta figura");
         scanner.nextLine();
        String nuevoNombre = scanner.nextLine();
        System.out.println("Escriba el color que quieras que tenga");
        String nuevoColor = scanner.nextLine();
        System.out.println("Escribe el tipo de forma de la figura (rectangulo,cuadrado,circulo,triangulo)");
        String nuevoTipo;
        do {
            nuevoTipo = scanner.nextLine();
            //Para que coincida con la forma adecuada con el ! .equals()
        }while (!nuevoTipo.equals("rectangulo") && !nuevoTipo.equals("cuadrado") &&
                !nuevoTipo.equals("circulo") && !nuevoTipo.equals("triangulo"));

        Figura figura;
        switch (nuevoTipo){
            case "rectangulo":
                System.out.println("Escriba el ancho");
                double ancho = Double.parseDouble(scanner.nextLine());
                System.out.println("Escriba el alto");
                double alto = Double.parseDouble(scanner.nextLine());
                //nuevoTipo no hace falta porque esta definido anteriormente
                figura = new Rectangulo(nuevoNombre,nuevoColor,ancho,alto);
                break;
            case "cuadrado":
                System.out.println("Escriba el ancho");
                double anchoCuad = Double.parseDouble(scanner.nextLine());
                figura = new Cuadrado(nuevoNombre,nuevoColor,anchoCuad);
                break;
            case "circulo":
                System.out.println("Escriba el radio");
                double radio = Double.parseDouble(scanner.nextLine());
                figura = new Circulo(nuevoColor, nuevoNombre, radio);
                break;
            case "triangulo":
                System.out.println("Escriba el ancho");
                double lado = Double.parseDouble(scanner.nextLine());
                figura = new Triangulo(nuevoColor,nuevoNombre,lado);
                break;
            default:
                figura = new Figura(nuevoColor, nuevoNombre, nuevoTipo);

        }
        figuras.add(figura);
    }

    private static void eliminarFigura(){
        System.out.println("==Eliminar figura==");
        //Mostrar
        for (Figura figura: figuras){
            System.out.println(figura.nombre + " "+ figura.tipo);
        }
        System.out.println("Escriba el nombre de la figura a eliminar");
        scanner.nextLine();
        String nombreeliminar = scanner.nextLine();
        // -> arrow function para recorrer el array y equals() buscar igual
        figuras.removeIf(figura ->figura.nombre.equals(nombreeliminar));
    }


    private static void calcularAreaTotal(){
        // buscar que tipo de figura es y seleccionar el tipo adecuado o todas?
        for (Figura figura: figuras){
            System.out.println(figura.nombre + " "+ figura.tipo);
        };
        scanner.nextLine();
        System.out.println("==Calcular area total==");
        System.out.println("Escriba el nombre de la figura a calcular");
        String nombrefiguracalarea = scanner.nextLine();

        for (Figura figura: figuras){
        if (figura.nombre.equals(nombrefiguracalarea)){
            System.out.println(figura.calcularArea());
            return;
        }}}

    private static void calcularPerimetroTotal(){
        System.out.println("==Calcular perimetro total==");
        System.out.println("Escriba el nombre de la figura a calcular");
        scanner.nextLine();
        String nombrefiguracalperi = scanner.nextLine();
        for (Figura figura: figuras){
        if (figura.nombre.equals(nombrefiguracalperi) ){
            System.out.println(figura.calcularPerimetro());
            return;
        }}};

    private static void figuraConMayorArea(){
        System.out.println("==Mostrando figura con mayor area==");
        Figura mayor = figuras.get(0);
        for (Figura figura : figuras) {
            if (figura.calcularArea() > mayor.calcularArea()) {
                mayor = figura;
            }


    }System.out.println(mayor.nombre);
    };

    private static void figuraConMayorPerimetro(){
        System.out.println("==Mostrando figura con mayor perimetro==");
        Figura mayorper = figuras.get(0);
        for (Figura figura : figuras) {
            if (figura.calcularPerimetro() > mayorper.calcularPerimetro()) {
                mayorper = figura;
            }

        };
        System.out.println(mayorper.nombre);


    }

    private static void listarFiguras(){
        System.out.println("==Lista de figuras==");
for (Figura figura: figuras){
System.out.println(figura.nombre + " "+ figura.tipo);
}
    }
    private static void listarFigurasTipo(){
        System.out.println("==Lista de figuras por tipo==");
        System.out.println("Escriba el tipo (rectangulo,cuadrado,circulo,triangulo)");
        scanner.nextLine();
        String tipo = scanner.nextLine();

        for (Figura figura : figuras) {
            if (figura.tipo.equals(tipo)) {
                System.out.println(figura.nombre);
            }
        }
    };


    public static void main(String[] args) {
        //TEST
        /*figuras.add(new Figura("azul","pepe","rectangulo",5,7));*/

        añadirFigurasPredeterminadas();
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
            añadirFigura();

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
figura:color, nombre, pos x, pos y
X Y no tiene sentido
+const +get set + calcular area +
 calcular perimetro + mover

 gestion figuras -lista
 añadirFigura(),eliminarFigura(), calcularAreaTotal(), calcularPerimetroTotal(),
 figuraConMayorArea(),figuraConMayorPerimetro(),listarFiguras(),listarFigurasTipo()

 Figura añadida tiene un nombre propio, puede ser de tipo retangulo, cuadrado, circuo, triangulo,
 */