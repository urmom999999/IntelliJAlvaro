import java.util.ArrayList;
import java.util.Scanner;
public class Biblioteca {

    private ArrayList<Libro> listaLibros;
    private ArrayList<Usuario> listaUsuarios;

    public Biblioteca(){
        this.listaLibros =new ArrayList<>();
        this.listaUsuarios=new ArrayList<>();
    }

    public void agregarusuario(String nombreusuario,String apellidos, String dni, int year)
                {
                    Usuario nuevoUsuario= new Usuario(nombreusuario, apellidos, dni, year);
                    listaUsuarios.add(nuevoUsuario);
    }
    public void pedirlibro(){
    String buscarISBN =sc.nextLine();
                for (int i = 0; i <listaLibros.length ; i++) {
        if (!(buscarISBN = listaLibros.isbn)) {
            continue;
        }
        else if (Libro.prestado=true){System.out.println("El libro esta prestado")}
        System.out.println("Libro encontrado");}
    }



 }
