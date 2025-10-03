import java.util.Scanner;
public class Registro {
    public static void main() {
        Scanner pr = new Scanner(System.in);

        System.out.println("Ingresa el producto: ");
        String producto = pr.nextLine();
        if(producto.isEmpty()){
            System.out.println("Error no se puede ingresar datos vacios");
        }else {
            System.out.println("Ingresa el precio del producto:");
            Double precio = pr.nextDouble();

            System.out.println("Ingresa la cantidad del producto: ");
            int cantidad = pr.nextInt();
            Double precioStockTotal = precio*cantidad;
            System.out.println("El valor total de stock de "
                    +producto+" es de "+precioStockTotal);
        }

    }
}
