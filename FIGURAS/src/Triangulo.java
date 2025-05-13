public class Triangulo extends Figura {
//equilatero y ya
    public double lado;
    public Triangulo(String color, String nombre, double lado) {
        super(color,nombre,"triangulo");
        this.lado = lado;
    };
    //Añadir las funciones aqui para adaptase a cada forma distinta
    @Override
    public double calcularPerimetro(){
        return lado * 3;
    };
    @Override
    public double calcularArea(){
 return (Math.sqrt(3)/4) * lado * lado;
    };
}
