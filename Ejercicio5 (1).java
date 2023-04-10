import java.util.Scanner;

public class Ejercicio5 {

    public static void main (String [] args){

    Scanner entrada = new Scanner(System.in);

    System.out.println("Ingrese el primer numero");
    int numero1 = entrada.nextInt();

     
    System.out.println("Ingrese el Segundo numero");
    int numero2 = entrada.nextInt();

    System.out.println("Ingrese el Tercer numero");
    int numero3 = entrada.nextInt();



    if (numero1 < numero2 && numero1 < numero3) {

         System.out.println("los numero ingresaron en orden ascendente ");

    }



    }
}