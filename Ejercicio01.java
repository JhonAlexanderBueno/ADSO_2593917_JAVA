import java.util.Scanner;

public class Ejercicio01 {

    public static void main (String [] args){

    Scanner entrada = new Scanner(System.in);

    int contador=0;
    System.out.print("Ingrese un oracion: ");
    String oracion = entrada.nextLine();
    for (int i=0;i<oracion.length();i++){

        if(oracion.charAt(i)=="a")||(oracion.charAt(i)=="A")||(oracion.charAt(i)=="e")||(oracion.charAt(i)=="i")||(oracion.charAt(i)=="I")|| (oracion.charAt(i)=="o")||(oracion.charAt(i)=="O")|| (oracion.charAt(i)=="u")||(oracion.charAt(i)=="U"){
        
        contador++;

    }

    System.out.println("la cantidad de vocales es:"+contador);


    }
    }
}

   
