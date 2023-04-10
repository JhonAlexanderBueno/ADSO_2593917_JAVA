import java.util.Scanner;

public class Principal{
	public static void main(String[] args) {

		Scanner entrada_numero = new Scanner(System.in);
		Scanner entrada_texto = new Scanner(System.in);

        int opcion = 0;
		int pos_disponible = 0;
		Persona arreglo [] = new Persona [10];


        do{
			System.out.println("||----------------------------------||");
			System.out.println("||------------ PERSONAS ------------||");
			System.out.println("||----------------------------------||");
			System.out.println("||------- Personas Registradas: "+((pos_disponible<10)? "0":"")+pos_disponible+" -||");
			System.out.println("||                                  ||");
			System.out.println("||   1. Registrar Persona.          ||");
			System.out.println("||   2. Ver clientes Registrados.   ||");
			System.out.println("||   3. Modificar Informacion Clientes.  ||");
			System.out.println("||   4. Ver informacion cliente.    ||");
			System.out.println("||   5. Eliminar Cliente.           ||");
            System.out.println("||   6. Salir                               ||");
			System.out.println("||----------------------------------||");
			System.out.print("||=> Ingrese una opcion: ");
			opcion = entrada_numero.nextInt();

            if(opcion==1){
                System.out.print("||=> Ingrese el documento: ");
				int documento = entrada_numero.nextInt();

				System.out.print("||=> Ingrese los nombres: ");
				String nombres = entrada_texto.nextLine();

				System.out.print("||=> Ingrese los apellidos: ");
				String apellidos = entrada_texto.nextLine();

				System.out.print("||=> Ingrese el telefono: ");
				String telefono = entrada_texto.nextLine();

				Persona temporal = new Persona(documento, nombres, apellidos, direccion, telefono);

                boolean valido = true;
				for (int i=0; i<pos_disponible; i++) {
					if (temporal.getDocumento() == arreglo[i].getDocumento()) {
						valido = false;
						System.out.println("||===> EL DOCUMENTO YA EXISTE, NO SE PUEDE REGISTRAR. \n\n");
						break;
					}
				}

				if (valido) {
					arreglo[pos_disponible] = temporal;
					pos_disponible++;
					System.out.println("||===> REGISTRADO CON EXITO \n\n");
				}

            }else if (opcion == 2) {
				for (int i=0; i<arreglo.length; i++) {
					if (arreglo[i]!=null) {
						arreglo[i].mostrarResumenDatos();
					}
				}
				System.out.println("\n\n");
			}else if (opcion == 3) {

				for (int i=0; i<arreglo.length; i++) {
					if (arreglo[i]!=null) {
						arreglo[i].mostrarResumenDatos();
					}
				}
				
				System.out.println("\n\n");
				System.out.println("Ingrese El numero de documento que quiere modificar ");
				int modificar = entrada_numero.nextInt();

				if (temporal.getDocumento() == modificar) {

					System.out.println("||----------------------------------||");
					System.out.println("||-------------Modificar------------||");
					System.out.println("||----------------------------------||");
					System.out.println("||-----------1.Documento------------||");
					System.out.println("||-----------2.Nombre---------------||");
					System.out.println("||-----------3.Apellido-------------||");
					System.out.println("||---------- 4.Numero de telefono---||");
					System.out.println("||----------------------------------||");
					dato_mo = entrada_numero.nextInt();

					if (dato_mo==1){
						
					}


				}



				

			}


        }while(opcion!=6);

    }
}
