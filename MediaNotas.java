import java.util.Scanner;

public class MediaNotas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nota;
        int suma = 0;
        int contador = 0;

        do {
            System.out.print("Nota [0..10] (-1 para terminar): ");
            while (!sc.hasNextInt()) {
                System.out.println("Nota inválida.");
                sc.next(); // limpiar entrada incorrecta
                System.out.print("Nota [0..10] (-1 para terminar): ");
            }
            nota = sc.nextInt();

            if (nota == -1) {
                // terminar
            } else if (nota >= 0 && nota <= 10) {
                suma += nota;
                contador++;
            } else {
                System.out.println("Nota inválida.");
            }
        } while (nota != -1);

        if (contador > 0) {
            double media = (double) suma / contador;
            System.out.printf("Media = %.1f%n", media);
        } else {
            System.out.println("No hay datos.");
        }

        sc.close();
    }
}
