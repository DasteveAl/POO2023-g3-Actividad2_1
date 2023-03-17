import java.util.Scanner;
public class Ejercicio15 {
    public static void main(String[] args) {

        double weight_A, weight_B, weight_C, weight_D;
        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese el peso A:");
        weight_A = input.nextDouble();
        System.out.println("Ingrese el peso B:");
        weight_B = input.nextDouble();
        System.out.println("Ingrese el peso C:");
        weight_C = input.nextDouble();
        System.out.println("Ingrese el peso D");
        weight_D = input.nextDouble();

        if ((weight_A == weight_B) && (weight_A == weight_C)) {
            if (weight_D > weight_A) {
                System.out.println("La esfera D es la diferente y es la de mayor peso.");
            }
            else {
                System.out.println("La esfera D es la diferente y es la de menor peso.");
            }
        }
        else {
            if ((weight_A == weight_B) && (weight_A == weight_D)) {
                System.out.println("La esfera C es la diferente.");
                if (weight_C > weight_A) {
                    System.out.println("Y es de mayor peso.");
                }
                else {
                    System.out.println("Y es de menor peso.");
                }
            }
            else {
                if ((weight_A == weight_C) && (weight_A == weight_D)) {
                    System.out.println("La esfera B es diferente.");
                    if (weight_B > weight_D) {
                        System.out.println("Y es de mayor peso.");
                    }
                    else {
                        System.out.println("Y es de menor peso.");
                    }
                }
                else {
                    System.out.println("La esfera A es la diferente.");
                    if (weight_A > weight_B) {
                        System.out.println("Y es de mayor peso.");
                    }
                    else {
                        System.out.println("Y es de menor peso.");
                    }
                }
            }
        }
    }
}
