import java.util.Scanner;

public class Ejercicio001 {

    public static void main (String [] args){
    
    
    Scanner entrada = new Scanner(System.in);

    System.out.print(" Hola Cliente ");


    System.out.print ("Escriba su Edad ");
    int Edad = entrada.nextInt();



    if (Edad <= 1 && Edad >= 100 ){

        if ( Edad <= 18){
         System.out.println(" Recibira un auxilio de $800000 ");
        }
         else 
         System.out.println(" Recibira un auxilio de $200000 ");
        
     }

     else 
     System.out.println(" EDAD NO VALIDA "); 
 

 
 

    

 }


  }


