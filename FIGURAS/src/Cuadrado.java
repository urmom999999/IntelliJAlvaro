public class Cuadrado extends Figura {
public double ancho;
    //Añadir las funciones aqui para adaptase a cada forma distinta
    //Alto no se necesita
    public Cuadrado(String nombre, String color, double ancho){
        super(nombre,color,"cuadrado");
        this.ancho= ancho;
    }
    @Override
    public double calcularPerimetro(){
            return ancho * 4;
    };
    @Override
    public double calcularArea(){
        return ancho *ancho;
    };
};
