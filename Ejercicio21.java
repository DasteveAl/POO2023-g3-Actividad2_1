import java.util.Scanner;
public class Ejercicio21 {
    public static void main(String[] args) {

        double a, b, c, perim, sem_perim, area;
        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese lado a:");
        a = input.nextDouble();
        System.out.println("Ingrese lado b:");
        b = input.nextDouble();
        System.out.println("Ingrese lado c:");
        c = input.nextDouble();

        perim = a + b + c;
        sem_perim = perim/2;
        area = Math.sqrt(sem_perim * (sem_perim - a) * (sem_perim - b) * (sem_perim - c)); // Formula de Heron

        System.out.println("El perimetro es: " + perim);
        System.out.println("El semiperimetro es: " + sem_perim);
        System.out.println("El area es: " + area);
    }
}
