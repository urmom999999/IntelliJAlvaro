public class Rectangulo
{int ancho;
    int alto;

    public Rectangulo(int ancho, int alto)
    {this.ancho = ancho;
        this.alto = alto;
    }
    //Doble for para alto ancho
    public void dibujar() {
        for (int i = 0; i < alto; i++) {
            for (int j = 0; j < ancho; j++) {
                System.out.print("■");
                //Alt 254 ■
            }
            System.out.println();
        }}}