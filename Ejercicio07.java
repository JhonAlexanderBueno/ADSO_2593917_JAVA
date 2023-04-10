import java.util.Scanner;

public class Ejercicio07 {

    public static void main (String [] args){

    Scanner entrada = new Scanner(System.in);

    System.out.println("Ingrese un numero");
    long numero1 = entrada.nextInt();

    int numero_1=numero1/10;
    int numero2=numero1/100;
    int resultado2=numero2%10;
    int numero3=numero1/1000;
    int resultado3=numero3/10;
    int numero4=numero1/10000;
    int resultado4=numero4%10;
    int numero5=numero1/100000;
    int resultado5=numero5%10;
    int numero6=numero1/1000000;
    int resultado6=numero6%10;
    int numero7=numero1/10000000;
    int resultado7=numero7%10;
    int numero8=numero1/100000000;
    int resultado8=numero8%10;
    int numero9=numero1/1000000000;
    int resultado9=numero9%10;
    long numero10=numero1/10000000000;
    int resultado10=numero10%10;

    System.out.println(" El formato moneda es "+numero_1+resultado2+resultado3+"."+resultado4+resultado5+resultado6+"."+resultado7+resultado8+resultado9+"."+resultado10);



    

   



    }
}
