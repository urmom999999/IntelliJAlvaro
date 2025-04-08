public class Clase {
    public String curso;

    public int numero;

    public int capacidadMaxima;

    public Clase(String curso, int numero, int capacidadMaxima) {
        this.curso = curso;
        this.numero = numero;
        this.capacidadMaxima = capacidadMaxima;
    }

    public String toString() {
        return "Curso: "+curso +"\nNumero" + numero + "\nCapacidad" + capacidadMaxima;
    }
}
