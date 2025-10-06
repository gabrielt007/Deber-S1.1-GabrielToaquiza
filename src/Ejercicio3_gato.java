import java.util.Scanner;
public class Ejercicio3_gato {
    public static void main(String[] args){
        Scanner numero = new Scanner(System.in);
        System.out.println("Ingresa el numero del que deseas imprimir la tabla de multiplicar: ");
        int num = numero.nextInt();
        if(num > 10 || num < 1){
            System.out.println("El numero ingresado es invalido.");
        }else{
            for(int i = 1; i<=10;i++){
                int producto = num * i;
                System.out.println(num + " * " + i + " = " + producto);
            }
        }
    }
}
