import java.util.ArrayList;
import java.util.Scanner;

public class Biblioteca {

    private ArrayList<Libro> listaLibros;
    private ArrayList<Usuario> listaUsuarios;
    private Scanner sc = new Scanner(System.in);

    public Biblioteca(){
        this.listaLibros =new ArrayList<>();
        this.listaUsuarios=new ArrayList<>();
    }

    public void agregarusuario(String nombreusuario,String apellidos, String dni, int year)
                {Usuario nuevoUsuario= new Usuario(nombreusuario, apellidos, dni, year);
                    listaUsuarios.add(nuevoUsuario);
    }

    public void agregarLibro(Libro libro)
                {listaLibros.add(libro);
    }


    public void pedirLibro() {
        System.out.print("Introduce el ISBN: ");
        int buscarISBN = Integer.parseInt(sc.nextLine());

        for (Libro libro : listaLibros) {
            if (libro.isbn == buscarISBN)
                {if (libro.prestado) {
                    System.out.println("El libro está prestado");
                } else {libro.prestado = true;
                        System.out.println("Libro prestado con éxito");
                }
                return;
            }
        }
        System.out.println("Error no encontrado");
    }

    public void devolverLibro() {
        System.out.print("Introduce el ISBN: ");
        int buscarISBN = Integer.parseInt(sc.nextLine());

        for (Libro libro : listaLibros)
        {if (libro.isbn == buscarISBN)
            {if (libro.prestado) {
                    libro.prestado = false;
                    System.out.println("Libro devuelto");
                } else
                {System.out.println("Libro no prestado");
                }
                return;
            }
        }
        System.out.println("Error no encontrado");
    }
}
