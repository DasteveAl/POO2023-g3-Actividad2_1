import java.util.Scanner;
public class Ejercicio22 {
    public static void main(String[] args) {

        String name;
        double wage, w_hours, salary;
        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese nombre del empleado:");
        name = input.nextLine();
        System.out.println("Ingrese el salario por hora:");
        wage = input.nextDouble();
        System.out.println("Ingrese las horas trabajadas en el mes:");
        w_hours = input.nextDouble();

        salary = wage * w_hours;

        if (salary > 450000) {
            System.out.println("El nombre del empleado es: " + name);
            System.out.println("El salario mensual es: " + salary);
        }
        else {
            System.out.println("El nombre del empleado es: " + name);
        }
    }
}
