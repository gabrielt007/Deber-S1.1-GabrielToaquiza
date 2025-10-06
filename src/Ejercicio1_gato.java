import java.util.Scanner;
public class Ejercicio1_gato {
    public static void main(String[] args){
        Scanner datos = new Scanner(System.in);
        System.out.println("Ingresa el nombre completo del estudiante: ");
        String nombre = datos.nextLine();
        int contador=0;
        double nota=0;
        while(contador<3){
            System.out.println("Ingresa la nota del estudiante:");
            nota += datos.nextDouble();
            contador++;
        }
        double promedio = nota/contador;
        if(promedio>=7){
            System.out.println("El estudiante "+nombre+" con promedio de "+promedio+" Aprueba.");
        }else if(promedio<7){
            System.out.println("El estudiante "+nombre+" con promedio de "+Math.round(promedio)+" Reprueba.");
        }else{
            System.out.println("Error notas ingresadas invalidas.");
        }

    }
}
