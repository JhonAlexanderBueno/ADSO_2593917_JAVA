import java.util.Scanner;

public class Ejercicio1ciclos {

    public static void main (String [] args){

    Scanner entrada = new Scanner(System.in);


    System.out.print ("Ingrese la cantidad de notas");
    int Cant_Nota = entrada.nextInt();

    float Sumatoria=0;

    for(int i=1; i <= Cant_Nota; i++){
    System.out.print(" Ingrese nota"+i+":");
    float nota = entrada.nextFloat();
    Sumatoria=Sumatoria+nota;
    
    }

     float promedio = Sumatoria / Cant_Nota;
     System.out.print(" El promedio es:"+promedio);

    




    }

    }
