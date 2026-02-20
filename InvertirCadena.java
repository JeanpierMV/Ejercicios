import java.util.Scanner;

public class InvertirCadena {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce un texto: ");
        String original = teclado.nextLine();
        
        String invertida = "";

        // Recorremos desde el último índice hasta el 0
        for (int i = original.length() - 1; i >= 0; i--) {
            invertida += original.charAt(i);
        }

        System.out.println("Texto invertido: " + invertida);
        
        teclado.close();
    }
}
