import java.util.Scanner;
public class Ejercicio24 {
    public static void main(String[] args) {

        double w_a, w_b, w_c;
        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese el peso de la esfera A:");
        w_a = input.nextDouble();
        System.out.println("Ingrese el peso de la esfera B:");
        w_b = input.nextDouble();
        System.out.println("Ingrese el peso de la esfera C:");
        w_c = input.nextDouble();

        if ((w_a > w_b) && (w_a > w_c)) {
            System.out.println("La esfera de mayor peso es la A.");
        }
        else if ((w_b > w_a) && (w_b > w_c)) {
            System.out.println("La esfera de mayor peso es la B.");
        }
        else {
            System.out.println("La esfera de mayor peso es la C.");
        }
    }
}
