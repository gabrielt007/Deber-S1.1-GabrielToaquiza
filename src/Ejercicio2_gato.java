import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Ejercicio2_gato {
    public static void main(String[] args){
        Scanner datos = new Scanner(System.in);
        System.out.println("Cuantos numeros desea ingresar? : ");
        int tamanio = datos.nextInt();
        List<Integer> numeros = new ArrayList<>();
        int contador = 0;
        while(contador<tamanio){
            System.out.println("Ingresa el numero: ");
            int numero = datos.nextInt();
            numeros.add(numero);
            contador++;
        }
        int numerosPar = 0;
        System.out.println("Los numeros que añadiste son: ");
        for(int n:numeros){
           System.out.print(n + " ");

           if (n%2==0){
               numerosPar++;
           }
        }
        System.out.println();
        System.out.println("La cantidad de numeros pares que ingresaste en la lista es "+numerosPar);

    }
}
