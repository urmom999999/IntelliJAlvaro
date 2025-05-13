public class Circulo extends Figura {
public double radio;
public Circulo(String color, String nombre, double radio){
    super (color,nombre,"circulo");
    this.radio=radio;
}
    //Añadir las funciones aqui para adaptase a cada forma distinta
    @Override
    public double calcularPerimetro(){
        return 2 * Math.PI * radio;
    };
    @Override
    public double calcularArea(){
        return Math.PI * radio * radio;
    };
};
