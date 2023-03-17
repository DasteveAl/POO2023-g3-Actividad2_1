import java.util.Scanner;
public class Ejercicio7 {
    public static void main(String[] args) {

        double a, b;
        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese el valor de A:");
        a = input.nextDouble();
        System.out.println("Ingrese el valor de B:");
        b = input.nextDouble();

        if (a > b) {
            System.out.println("A es mayor que B");
        }
        else if (b > a) {
            System.out.println("B es mayor que A");
        }
        else {
            System.out.println("A es igual a B");
        }
    }
}
