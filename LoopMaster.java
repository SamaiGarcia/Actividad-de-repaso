import java.util.Scanner;

public class LoopMaster {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;

        // Validar que n ≥ 1
        do {
            System.out.print("Introduce un número entero mayor o igual a 1: ");
            n = scanner.nextInt();
        } while (n < 1);

        // Llamadas a los métodos
        contarHastaN(n);
        imprimirSumaHastaN(n);
        imprimirTablaMultiplicar(n);
    }

    public static void contarHastaN(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.print(i);
            if (i < n) {
                System.out.print(" ");
            }
        }
        System.out.println(); // Salto de línea al final
    }

    public static void imprimirSumaHastaN(int n) {
        int suma = 0;
        for (int i = 1; i <= n; i++) {
            suma += i;
        }
        System.out.println("Suma = " + suma);
    }

    public static void imprimirTablaMultiplicar(int n) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " x " + i + " = " + (n * i));
        }
    }
}