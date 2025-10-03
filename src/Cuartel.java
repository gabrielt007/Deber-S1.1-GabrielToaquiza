import java.util.Scanner;
public class Cuartel {
    public static void main(String args[]){
        Scanner datos = new Scanner(System.in);
        System.out.println("Ingresa la edad del estudiante: ");
        int edad = datos.nextInt();
        System.out.println("Ingresa la estatura del estudiante: ");
        double estatura = datos.nextDouble();
        if(edad>=18&&estatura>=1.60){
            System.out.println("El estudiante cumple");
        }else{
            System.out.println("El estudiante no cumple");
        }
    }
}
