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
        System.out.println("3. Eco ");
        System.out.println("4. Salir");
        
        System.out.println("Elegido : ");

        
          elegido = input.nextInt();
          input.nextLine();
         

        switch (elegido) {
            case 1:
                System.out.println("Hola");
                break;

            case 2:
                String hora = LocalTime.now().format(DateTimeFormatter.ofPattern("Hora:Minuto"));
                System.out.println(hora);
                break;

            case 3:
                System.out.print("Eco");
                String eco = input.nextLine();

                System.out.println(eco);

                
            case 4:
                    /*String Salir= input.nextLine();*/
                    System.out.println("Salir");
                    break;



        }

    }while (elegido!= 4);

     input.close();
    }

}
