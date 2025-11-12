import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;

        // Validar entrada
        while (true) {
            System.out.print("Introduce un número entero n (n ≥ 1): ");
            if (sc.hasNextInt()) {
                n = sc.nextInt();
                if (n >= 1) {
                    break;
                } else {
                    System.out.println("El número debe ser mayor o igual a 1. Inténtalo de nuevo.");
                }
            } else {
                System.out.println("Entrada inválida. Debes introducir un número entero.");
                sc.next(); // limpiar entrada incorrecta
            }
        }

        // Generar y mostrar los primeros n términos
        int a = 1, b = 1;

        for (int i = 1; i <= n; i++) {
            System.out.print(a);
            if (i < n) {
                System.out.print(", ");
            }
            int temp = a + b;
            a = b;
            b = temp;
        }

        sc.close();
    }
}


