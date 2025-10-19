package ToaquizaGabriel_DberRepaso_S3;
import ToaquizaGabriel_DberRepaso_S3.PaqueteArtistas.Artista;
import ToaquizaGabriel_DberRepaso_S3.PaqueteCanciones.Cancion;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner datos = new Scanner(System.in);
        Artista nuevo1 = new Artista("Gabriel","Pop",300);
        Artista nuevo2 = new Artista();
        Cancion nueva = new Cancion();
        Artista nuevo = new Artista();
        System.out.println("Ingrese el nombre del artista: ");
        nuevo2.setNombre(datos.nextLine());
        System.out.println("Ingrese el genero musical del artista:");
        nuevo2.setGenero(datos.nextLine());
        System.out.println("Ingrese el numero de seguidores: ");
        nuevo2.setSeguidores(datos.nextInt());
        int opcion;
        do {
            System.out.println("##### MENU #####");
            System.out.println("\n1. Registrar un artista.\n2. Registrar una cancion.\n3. Aumentar seguidores.\n4. Reproducir una cancion\n5. Mostrar informacion general\n6. Salir");
            System.out.println("Ingrese una opcion: ");
            opcion = datos.nextInt();
            datos.nextLine();
            switch (opcion){
                case 1:
                    System.out.println("Ingrese el nombre del artista: ");
                    nuevo.setNombre(datos.nextLine());
                    System.out.println("Ingrese el genero musical del artista:");
                    nuevo.setGenero(datos.nextLine());
                    System.out.println("Ingrese el numero de seguidores: ");
                    nuevo.setSeguidores(datos.nextInt());
                    datos.nextLine();
                    System.out.println("Artista registrado exitosamente!!");
                    break;
                case 2:
                    System.out.println("Ingrese el titulo: ");
                    nueva.setTitulo(datos.nextLine());
                    System.out.println("Ingrese la duracion: ");
                    nueva.setDuracion(datos.nextDouble());
                    datos.nextLine();
                    System.out.println("Ingrese las reproducciones");
                    nueva.setReproducciones(datos.nextInt());
                    datos.nextLine();
                    System.out.println("Cancion registrada con exito!!");
                    break;
                case 3:
                    System.out.println("Ingrese la cantidad a aumentar: ");
                    nuevo.ganarSeguidores(datos.nextInt());
                    datos.nextLine();
                    System.out.println("Seguidores aumentados exitosamente!!");
                    break;
                case 4:
                    nueva.aumentarReproducciones();
                    System.out.println("Cancion reproducida exitosamente!!");
                    break;
                case 5:
                    nuevo.mostrarPerfil();
                    System.out.println();
                    nueva.informacion();
                    break;
                case 6:
                    System.out.println("Saliendo....");
                    break;
                default:
                    System.out.println("Ingrese una opcion valida.");
                    break;
            }
        }while (opcion!=6);
    }
}
