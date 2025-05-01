import java.util.Date;

public class Libro {
    public int isbn;
    public String nombrelibro;
    public String autor;
    public Date data;
    public boolean prestado;

    public Libro(int isbn,String nombrelibro, String autor){
        this.isbn=isbn;
        this.nombrelibro=nombrelibro;
        this.autor=autor;
        this.prestado=false;
    }
}
