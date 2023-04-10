import java.util.Scanner;

public class Ejercicio6 {

    public static void main (String [] args){

    Scanner entrada = new Scanner(System.in);


    System.out.println("Ingrese un numero");
    int numero1 = entrada.nextInt();


    System.out.println("MENU:");
    System.out.println("1. Primer Digito 2.Segundo Digito 3. Tercer Digito");
    System.out.println("4. Cuarto Digito 5. Quinto Digito 6. Sexto Digito");

    System.out.println("Ingrese una opcion");
    int opcion = entrada.nextInt();

    if (opcion == 1) {

        int opcion_1=numero1/10;
        int opcion1=opcion_1%10;

         System.out.println(" El primer numero es "+opcion1);

        }else if (opcion == 2){
            int opcion_2=numero1/10;
            int opcion2=opcion_2%10;
            System.out.println(" El segundo numero es "+opcion2);
        } else if (opcion == 3){
            int opcion_3=numero1/100;
            int opcion3=opcion_3%10;
            System.out.println(" El tercer numero es "+opcion3);
        }else if (opcion == 4){
            int opcion_4=numero1/1000;
            int opcion4=opcion_4%10;
            System.out.println(" El cuarto numero es "+opcion4);
        }else if (opcion == 5){
            int opcion_5=numero1/10000;
            int opcion5=opcion_5%10;
            System.out.println(" El quinto numero es "+opcion5);
        }else if (opcion == 6){
            int opcion_6=numero1/100000;
            int opcion6=opcion_6%10;
            System.out.println(" El sexto numero es "+opcion6);
        }



      






    }
}