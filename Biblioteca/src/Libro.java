import java.util.Date;

public class Libro {
    public int isbn;
    public String nombrelibro;
    public String autor;
    public Date data;
    public boolean prestado =false;

    public Libro(int isbn,String nombre, String autor){
        this.isbn=isbn;
        this.nombrelibro=nombrelibro;
        this.autor=autor;
        this.data=data;
        this.prestado=prestado;
    }
}
