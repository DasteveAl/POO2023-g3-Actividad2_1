import java.util.Scanner;
public class Ejercicio10 {
    public static void main(String[] args) {

        int inscription, estrato;
        double ptrmio, payment, total_pay;
        String name;
        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese numero de inscription:");
        inscription = input.nextInt();
        input.nextLine();
        System.out.println("Ingrese nombres:");
        name = input.nextLine();
        System.out.println("Ingrese patrimonio:");
        ptrmio = input.nextDouble();
        System.out.println("Ingrese el estrato:");
        estrato = input.nextInt();

        payment = 50000;

        if ((ptrmio > 2000000) && (estrato > 3)) {
            total_pay = payment + 0.03 * ptrmio;
        }
        else {
            total_pay = payment;
        }

        System.out.println("El estudiante con numero de inscripcion " + inscription +
                " y nombre " + name + " debe pagar " + total_pay);
    }
}
