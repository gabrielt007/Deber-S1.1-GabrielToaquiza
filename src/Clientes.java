import java.util.Scanner;
public class Clientes {
    public static void main(String args[]){
        //Hola este comentario fue hecho en la clase de POO 03/10/2025
        Scanner datos = new Scanner(System.in);
        System.out.println("Ingrese su cedula: ");
        String cedula = datos.nextLine();
        System.out.println("Ingrese sus nombres completos: ");
        String nombres = datos.nextLine();
        System.out.println("Ingrese su numero de telefono: ");
        String telefono = datos.nextLine();
        System.out.println("Ingrese su correo electronico: ");
        String email = datos.nextLine();
        if(cedula.isEmpty() && nombres.isEmpty()){
            System.out.println("Error todos los campos deben estar llenos");
        }else if(telefono.isEmpty() && email.isEmpty()){
            System.out.println("Error todos los campos deben estar llenos");
        }else{
            System.out.println("CLIENTE REGISTRADO"+
                    "\nDatos:\n"+"Cedula: \n"
                    +cedula+
                    "\nNombres: \n"+nombres+
                    "\nTelefono:\n"+telefono+"\nEmail: \n"+email);
        }
    }
}
