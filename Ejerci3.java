import java.util.Scanner;

public class Matrizes1 {

    public static void main (String [] args){

    Scanner entrada = new Scanner(System.in);

    System.out.println("Ingrese Cuantas Filas quiere");
    int filas = entrada.nextInt();

    System.out.println("Ingrese cuantas columnas quiere");
    int columnas = entrada.nextInt();

    int matriz [][]= new int [filas][columnas];


    for(int i=1; i < filas; i++){

        System.out.println("fila numero "+i);
        
        for(int j=1; j < columnas; j++){

            
         System.out.println("Ingrese el numero de la columna en posicion "+j);
            int m = entrada.nextInt();

          
        }
    
    }


    for(int i=1; i < filas; i++){
        for(int j=1; j < columnas; j++){

             System.out.println("fila numero "+i);
            System.out.println("numeros de la fila "+j);

        }
    }



    





    }
}