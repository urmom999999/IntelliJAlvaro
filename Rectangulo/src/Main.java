import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Ancho: ");
            int ancho = scanner.nextInt();

            System.out.print("Alto: ");
            int alto = scanner.nextInt();

            Rectangulo rectangulo = new Rectangulo(ancho, alto);
            rectangulo.dibujar();
        }}}