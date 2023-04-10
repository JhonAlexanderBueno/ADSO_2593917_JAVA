import java.util.Scanner;

public class Ejercicio2ciclos {

    public static void main (String [] args){

    Scanner entrada = new Scanner(System.in);


    System.out.print ("Ingrese la cantidad de notas");
    int Cant_Nota = entrada.nextInt();

    float notat=0;
    int Credt=0;

    for(int i=1; i <= Cant_Nota; i++){
    System.out.print(" Ingrese nota"+i+":");
    float nota = entrada.nextFloat();
    notat=notat+nota;

    System.out.print(" Ingrese Creditos de materia"+i+":");
    int Creditos = entrada.nextInt();
    Credt=Credt+Creditos;

    System.out.print(" El total de creditos es:"+Credt);



    }

    System.out.println(" El total de creditos es:"+Credt);

    float Promedio = notat / Cant_Nota;
    System.out.println(" El promedio es:"+Promedio);
    
    


    }
}