import java.util.Scanner;
public class Ejercicio19 {
    public static void main(String[] args) {

        double side, perim, height, area;
        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese el lado del triangulo equilatero:");
        side = input.nextDouble();

        perim = 3 * side;
        height = Math.sqrt(3)/2 * side;
        area = Math.sqrt(3)/4 * Math.pow(side,2);

        System.out.println("El perimetro es: " + perim);
        System.out.println("La altura es: " + height);
        System.out.println("El area del triangulo es: " + area);
    }
}
