import java.util.Scanner;

public class Ejercicio4 {

    public static void main (String [] args){

    Scanner entrada = new Scanner(System.in);

    
    
    
    System.out.println("Ingrese el primer numero");
    int numero1 = entrada.nextInt();

     
    System.out.println("Ingrese el Segundo numero");
    int numero2 = entrada.nextInt();

    System.out.println("Ingrese el Tercer numero");
    int numero3 = entrada.nextInt();


    if (numero1 > numero2 && numero1 > numero3) {

         System.out.println("el numero mayor es " + numero1);

    }

    if ( numero2 > numero1 && numero2 > numero3) {
         System.out.println("el numero mayor es " + numero2);

    }
    if (numero3 > numero2 && numero3 > numero1){

        System.out.println("el numero mayor es " + numero3);

    }

    if (numero1 < numero2 && numero1 < numero3) {

         System.out.println("el numero menor es " + numero1);

    }

    if ( numero2 < numero1 && numero2 < numero3) {
         System.out.println("el numero menor es " + numero2);

    }
    if (numero3 < numero2 && numero3 < numero1){

        System.out.println("el numero menor es " + numero3);

    }



    


















    }
}