import java.util.Scanner;
public class Ejercicio14 {
    public static void main(String[] args) {

        double dptm_one, dptm_two, dptm_three, salary;
        double t_sales, pctg_sales, slry_one, slry_two, slry_three;
        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese ventas del departamento 1:");
        dptm_one = input.nextDouble();
        System.out.println("Ingrese ventas del departamento 2:");
        dptm_two = input.nextDouble();
        System.out.println("Ingrese ventas del departamento 3:");
        dptm_three = input.nextDouble();
        System.out.println("Ingrese el salario:");
        salary = input.nextDouble();

        t_sales = dptm_one + dptm_two + dptm_three;
        pctg_sales = 0.33 * t_sales;

        if (dptm_one > pctg_sales) {
            slry_one = salary + 0.2 * salary;
        }
        else {
            slry_one = salary;
        }
        if (dptm_two > pctg_sales) {
            slry_two = salary + 0.2 * salary;
        }
        else {
            slry_two = salary;
        }
        if (dptm_three > pctg_sales) {
            slry_three = salary + 0.2 * salary;
        }
        else {
            slry_three = salary;
        }

        System.out.println("Salario departamento 1: " + slry_one);
        System.out.println("Salario departamento 2: " + slry_two);
        System.out.println("Salario departamento 3: " + slry_three);
    }
}
