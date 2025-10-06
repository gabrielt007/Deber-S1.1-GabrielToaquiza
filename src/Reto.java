import java.util.Scanner;
public class Reto {
    public static void main(String[] args) {
        Scanner datos = new Scanner(System.in);
        System.out.println("Ingresa el nombre del estudiante: ");
        String nombre = datos.nextLine();
        System.out.println("Ingresa la edad del estudiante: ");
        int edad = datos.nextInt();
        System.out.println("Ingresa la estatura del estudiante: ");
        double estatura = datos.nextDouble();
        if (edad > 18 && estatura > 1.60) {
            System.out.println("El estudiante " + nombre + " fue aceptado por el equipo");
        } else {
            System.out.println("El estudiante " + nombre + " no cumple los requisitos");
        }
    }
}
