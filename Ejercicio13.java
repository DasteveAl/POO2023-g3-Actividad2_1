import java.util.Scanner;
public class Ejercicio13 {
    public static void main(String[] args) {

        double t_bought, payment, dscnt = 0;
        String color;
        Scanner input =  new Scanner(System.in);

        System.out.println("Ingrese el valor de la compra total:");
        t_bought = input.nextDouble();
        input.nextLine();
        System.out.print("Ingrese el color de la bolita: ");
        color = input.nextLine();

        if (color.equalsIgnoreCase("blanco")) {
            dscnt = 0;
        }
        else {
            if (color.equalsIgnoreCase("verde")) {
                dscnt = 0.1;
            }
            else if (color.equalsIgnoreCase("amarilla")) {
                dscnt = 0.25;
            }
            else if (color.equalsIgnoreCase("azul")) {
                dscnt = 0.5;
            }
            else if (color.equalsIgnoreCase("roja")) {
                dscnt = 1;
            }
        }
        payment = t_bought - dscnt * t_bought;

        System.out.println("El cliente debera pagar : " + payment);
    }
}
