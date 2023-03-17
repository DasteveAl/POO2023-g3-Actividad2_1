import java.util.Scanner;
public class Ejercicio11 {
    public static void main(String[] args) {

        double a, b, c;
        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese el primer numero:");
        a = input.nextDouble();
        System.out.println("Ingrese el segundo numero:");
        b = input.nextDouble();
        System.out.println("Ingrese el tercer numero:");
        c = input.nextDouble();

        if ((a > b) && (a > c)) {
            System.out.println("El mayor numero es: " + a);
        }
        else if ((b > a) && (b > c)) {
            System.out.println("El mayor numero es: " + b);
        }
        else {
            System.out.println("El mayor numero es: " + c);
        }
    }
}
