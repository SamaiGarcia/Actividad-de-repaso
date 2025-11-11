import java.util.Scanner;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class MenuInteractivo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int elegido = 0;
        do {
            System.out.println("-- Menú -- ");
            System.out.println("1. Hola");
            System.out.println("2. Hora");
            System.out.println("3. Salir");
            System.out.println("Elegido : ");

            elegido = input.nextInt();
            input.nextLine();

            try {

                switch (elegido) {
                    case 1:
                        System.out.println("Hola");
                        break;

                    case 2:
                        String hora = LocalTime.now().format(DateTimeFormatter.ofPattern("HH:mm:ss"));
                        System.out.println(hora);
                        break;

                    case 3:
                        /* String Salir= input.nextLine(); */
                        System.out.println("Salir");
                        break;

                }
            } catch (NumberFormatException e) {
                System.out.println("error");
            }

        } while (elegido != 3);

        input.close();
    }

}
