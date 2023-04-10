import java.util.Scanner;

public class Ciclos4 {

    public static void main (String [] args){

        Scanner entrada = new Scanner(System.in);

       
        int i = 0;

        while(i<=3){

        System.out.print("Ingrese una opcion");
        int e = entrada.nextInt();

            
        if (e == 1){

           System.out.print ("Ingrese la cantidad de notas");
            int Cant_Nota1 = entrada.nextInt();

             float Sumatoria=0;

            for(int a=1; a <= Cant_Nota1; a++){
            System.out.print(" Ingrese nota"+a+":");
            float nota1 = entrada.nextFloat();
            Sumatoria=Sumatoria+nota1;
    
            }

            float promedio = Sumatoria / Cant_Nota1;
            System.out.print(" El promedio es:"+promedio);


         }if (e==2){

                System.out.print ("Ingrese la cantidad de notas");
                int Cant_Nota = entrada.nextInt();

                float notat=0;
                int Credt=0;

                for(int j=1; j <= Cant_Nota; j++){
                System.out.print(" Ingrese nota"+j+":");
                float nota = entrada.nextFloat();
                notat=notat+nota;

                System.out.print(" Ingrese Creditos de materia"+j+":");
                int Creditos = entrada.nextInt();
                Credt=Credt+Creditos;

                System.out.print(" El total de creditos es:"+Credt);

                }

                System.out.println(" El total de creditos es:"+Credt);

                float Promedio = notat / Cant_Nota;
                 System.out.println(" El promedio es:"+Promedio);


        }if (e==3){ 
                
            System.out.print(" Gracias por utilizar la aplicacion Vuelva Pronto ");



        } else if (e<1 || e>3){

            System.out.println(" Los Datos Ingresados Son incorrectos Vuelva a intentar ");

            }

        


        }





    }
    
}