import java.util.Scanner;
public class Ejercicio23 {
    public static void main(String[] args) {

        double a, b, c, disc, x1, x2;
        Scanner input = new Scanner(System.in);

        System.out.println("Escriba el coeficiente de x^2:");
        a = input.nextDouble();
        System.out.println("Escriba el coeficiente de x:");
        b = input.nextDouble();
        System.out.println("Escriba el termino constante:");
        c = input.nextDouble();

        disc = Math.pow(b,2) - 4 * a * c;

        if (disc >= 0) {
            x1 = (-b + Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / 2 * a;
            x2 = (-b - Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / 2 * a;

            System.out.println("El valor de la solucion 1 es: " + x1);
            System.out.println("El valor de la solucion 2 es: " + x2);
        }
        else {
            System.out.println("La ecucacion cuadratica no tiene soluciones reales.");
        }
    }
}
