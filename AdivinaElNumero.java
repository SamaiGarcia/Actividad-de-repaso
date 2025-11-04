import java.util.Scanner;
import java.util.Random;

// El import random se usa para generar numero  aletorio 
public class AdivinaElNumero {
 public static void main(String[] args) {
    
    final int Min = 0;
    final int Max = 100;
    int secreto = Min + new Random().nextInt(Max-Min + 1);

// MINIMO Y MAXIMO DE NUMEROS SECRETOS  Y SECRETO SE GENERA ALETORIAMENTE DEL 0 AL 100 

 int intentos = 0; 
 Scanner scanner = new Scanner(System.in);


 // intentos del usuario , y el scaner lee lo que el usuario escribe


 System.out.println("El numero elegido es" + Min "al " + Max + "."  );
// pide al usuario que adine de un rango de numero de minimo a maximo ahora os falaria el buncle.


while (true) {
    System.out.println("Intento : ");
    String entrada = scanner.nextLine();
// buncle infinito que detiene dependiendo el usuario entrada guarde lo que el usurio escribio

}

try {
    int Intento = Integer.parseInt("entrada");
// try cnvirte el texto a numero entero 

if ( intentos < secreto){
    System.out.println("Mayor");
}
else if (intentos > secreto) {
    System.out.println("Menor");
}
else{
    System.out.println("Correcto en " + intentos + "intentos");
    break;
}

// el break permite que el usurio salga del buncle.

}catch(NumberFormatException e) {
    System.out.println("Introduce numero valido");
}

// el catch  maneja errores para que el usuario no introduzca letras


scanner.close();


}

}
