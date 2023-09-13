import java.util.Scanner;

public class Palindromo {
    public static boolean esPalindromo(String cadena) {
        return cadena.equals(new StringBuilder(cadena).reverse().toString());
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese una palabra para verificar si es un palíndromo:");
        String entrada = scanner.nextLine();

        System.out.println(esPalindromo(entrada) ? "Es un palíndromo" : "No es un palíndromo");
    }
}
