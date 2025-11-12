import java.util.Scanner;

public class NotaAlumno {

public static void main(String[] args) {
        int suma =0;
    
        
    int[][] NotaAlumno = new int[][]{
    
            {3,4,5},
            {9,2,3},
            {5,6,1},
            
    
        };
        
        for( int i = 0; i < NotaAlumno.length;i++){

            for ( int j = 0;j < NotaAlumno [i].length;j++){
                suma += NotaAlumno [i][j]; 
            }
            double Media = suma/ NotaAlumno [i].length;
            double media = Math.ceil(Media);
            System.out.println("g"+ (i + 1) + ":"+ Media);
        }

    
    }

}

