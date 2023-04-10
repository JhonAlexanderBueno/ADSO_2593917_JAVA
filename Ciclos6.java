import java.util.Scanner;

public class Ciclos6 {

    public static void main (String [] args){

        Scanner entrada = new Scanner(System.in);

      
         int a=1,b,c=0;
         
            System.out.println("Ingrese un numero");
            int numero = entrada.nextInt();

         for(int i=0; i < numero; i++){

            b=c;
            c=a+c;
            a=b;
        }  
        
        System.out.println( a);
            

    }

}

  
  

