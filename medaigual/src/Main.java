//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //Para recivir los input estilo proptsync
        ArrayList<Clase> listaClases = new ArrayList<>();
        ArrayList<Alumno> listaAlumnos = new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        System.out.println("Creación de alumno");
        //Clase c1 =new Clase("1cs",12,30);
        System.out.println("Cuantas clases quieres crear? ");
        int numClases= sc.nextInt();
        sc.nextLine();



        for (int i=0; i <numClases; i++) {
            System.out.println("Introduce el curso: ");
            //Para guardar los datos
            String curso = sc.nextLine();
            System.out.println("Introduce el numero: ");
            int numero = sc.nextInt();
            sc.nextLine();
            System.out.println("Introduce la capacidad: ");
            int capacidadMaxima = sc.nextInt();
            sc.nextLine();
            listaClases.add(new Clase(curso, numero, capacidadMaxima));
            //Next line limpia todos los datos;

            for (Clase pepe : listaClases) {
                System.out.println(pepe);
            }


            //Clase c1 =new Clase(curso,12,30);
            //Alumno a1 = new Alumno("Rober","Cahnjkisdbn",500,"12345678E",c1);
            //System.out.println(a1.getclase());
            System.out.println("En que numero de clase quieres añadir un alumno? ");
            int numeroClase = sc.nextInt();
            sc.nextLine();
            //Comprobar si existe
            if (numeroClase > listaClases.size()) {
                System.out.println("Error");
                return;
            }

                Clase claseSeleccionada = listaClases.get(numeroClase - 1);

                System.out.println("Introduce el nombre: ");
                String nombre = sc.nextLine();
                //Para guardar los datos
                //String curso = sc.nextLine();
                System.out.println("Introduce los apellidos: ");
                String apellidos = sc.nextLine();
                sc.nextLine();
                System.out.println("Introduce la edad: ");
                int edad = sc.nextInt();
                sc.nextLine();
                System.out.println("Introduce el DNI: ");
                String DNI = sc.nextLine();

                listaAlumnos.add(new Alumno(nombre,apellidos,edad,DNI,claseSeleccionada));

                for (Alumno alumno : listaAlumnos) {
                    System.out.println(alumno);
                    //Fin ejercicio
                }
            }
        }}