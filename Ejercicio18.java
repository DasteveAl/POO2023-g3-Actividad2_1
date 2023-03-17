import java.util.Scanner;
public class Ejercicio18 {
    public static void main(String[] args) {

        double code, w_hours, wage, rtn;
        double net_salary, gross_salary;
        String name;
        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese el codigo del empleado:");
        code = input.nextDouble();
        input.nextLine();
        System.out.println("Ingrese nombres:");
        name = input.nextLine();
        System.out.println("Ingrese numero de horas trabajadas este mes:");
        w_hours = input.nextDouble();
        System.out.println("Ingrese el valor de la hora trabajada:");
        wage = input.nextDouble();
        System.out.println("Ingrese el porcentaje de retencion (0 a 1):");
        rtn = input.nextDouble();

        gross_salary = w_hours * wage;
        net_salary = gross_salary - gross_salary * rtn;

        System.out.println("Codigo: " + code);
        System.out.println("Nombres: " + name);
        System.out.println("Salario bruto: " + gross_salary);
        System.out.println("Salario neto: " + net_salary);
    }
}