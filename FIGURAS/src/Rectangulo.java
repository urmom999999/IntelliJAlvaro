public class Rectangulo extends Figura {

    public double ancho;
    public double alto;
// Añadir el ancho y alto
    public Rectangulo(String color, String nombre,double posX,double posY, double ancho, double alto){
        super(color,nombre,posX,posY);
        this.ancho=ancho;
        this.alto=alto;
    }

    //Añadir las funciones aqui para adaptase a cada forma distinta
    public double calcularArea(){}

    public double calcularPerimetro(){}
}
