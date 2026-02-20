import java.util.Scanner;

public class CalculadoraBasica {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce el primer número: ");
        double num1 = teclado.nextDouble();

        System.out.print("Introduce la operación (+, -, *, /): ");
        char operacion = teclado.next().charAt(0);

        System.out.print("Introduce el segundo número: ");
        double num2 = teclado.nextDouble();

        double resultado;

        switch (operacion) {
            case '+':
                resultado = num1 + num2;
                System.out.println("Resultado: " + resultado);
                break;
            case '-':
                resultado = num1 - num2;
                System.out.println("Resultado: " + resultado);
                break;
            case '*':
                resultado = num1 * num2;
                System.out.println("Resultado: " + resultado);
                break;
            case '/':
                if (num2 != 0) {
                    resultado = num1 / num2;
                    System.out.println("Resultado: " + resultado);
                } else {
                    System.out.println("Error: No se puede dividir entre cero.");
                }
                break;
            default:
                System.out.println("Operación no válida.");
        }
        teclado.close();
    }
}