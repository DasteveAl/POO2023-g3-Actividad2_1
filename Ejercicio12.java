import java.util.Scanner;
public class Ejercicio12 {
    public static void main(String[] args) {

        String name;
        double w_hours, wage, salary, two_extra, three_extra;
        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese nombre trabajador:");
        name = input.nextLine();
        System.out.println("Ingrese el numero de horas trabajadas:");
        w_hours = input.nextDouble();
        System.out.println("Ingrese el valor de la hora:");
        wage = input.nextDouble();

        if (w_hours > 40) {
            if (w_hours - 40 <= 8) {
                two_extra = w_hours - 40;
                salary = 40 * wage + two_extra * 2 * wage;
            }
            else {
                two_extra = w_hours - 40;
                three_extra = w_hours - 48;
                salary = 40 * wage + (two_extra - three_extra) * 2 * wage + three_extra * 3 * wage;
            }
        }
        else {
            salary = w_hours * wage;
        }
        System.out.println("El salario de " + name + " es : " + salary);
    }
}
