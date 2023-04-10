import java.util.Scanner;

public class Ciclos3 {

    public static void main (String [] args){

        Scanner entrada = new Scanner(System.in);

        System.out.print ("Ingrese la altura");
        int numero = entrada.nextInt();

        for(int i=1; i <= numero; i++){

         int altura=(numero *2)-1;
            System.out.print(" la altura "+altura);

        }

        
       





    }
}