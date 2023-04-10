import java.util.Scanner;

public class Ejercicio003 {

    public static void main (String [] args){

    Scanner entrada = new Scanner(System.in);


    System.out.println(" Ingrese Coordenada en el plano cartesiano");

    System.out.println(" Ingrese El valor de X");
    int valor_X = entrada.nextInt();

    System.out.println(" Ingrese El valor de Y");
    int valor_Y = entrada.nextInt();


    if (valor_X > 0 && valor_Y > 0){

         System.out.println("Esta en el cuadrante 1");


     }else if  (valor_X < 0 && valor_Y > 0 ){

         System.out.println("esta en el cuadrante 2");

    }else if (valor_X < 0 && valor_Y < 0){

         System.out.println("esta en el cuadrante 3");

    } else if  (valor_X > 0 && valor_Y < 0 ) {

         System.out.println("esta en el cuadrante 4");

    
    
    }

    }


}