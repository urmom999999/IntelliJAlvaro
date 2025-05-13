public class Rectangulo extends Figura {
    public double ancho;
    public double alto;
    // Añadir el ancho y alto
    public Rectangulo(String color, String nombre, double ancho, double alto) {
        super(color, nombre, "rectangulo");
        this.ancho = ancho;
        this.alto = alto;
    };

    //Añadir las funciones aqui para adaptase a cada forma distinta
    @Override
    public double calcularPerimetro(){
    return (ancho + alto) * 2;
    }
@Override
    public double calcularArea(){
    return ancho * alto;
    }
};
