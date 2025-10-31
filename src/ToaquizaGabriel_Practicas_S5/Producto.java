package ToaquizaGabriel_Practicas_S5;
import java.util.Scanner;
public class Producto {
    private String nombre;
    private String codigo;
    private double precio;
    private int cantidadStock;
    private boolean esPerecible;

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setPrecio(double precio) {
        if(precio>=0){
            this.precio = precio;
        }
    }
    public void setCodigo(String codigo) {
        if(codigo.length()>=5){
            this.codigo = codigo;
        }
    }
    public void setCantidadStock(int cantidadStock) {
        if(cantidadStock>=0){
            this.cantidadStock = cantidadStock;
        }
    }
    public void setEsPerecible(boolean esPerecible) {
        this.esPerecible = esPerecible;
    }
    public boolean stockDisponible(){
        if(cantidadStock>0){
            return true;
        }else{
            return false;
        }
    }

    public void mostrarEstado(){
        System.out.println("Nombre: "+nombre+"\nPrecio: "+precio+"\nStock: "+cantidadStock+"\nEs perecible: "+esPerecible);
    }
    public static String mostrarReglasProducto(){
        return "El producto tiene que tener un precio mayor a cero y una cantidad mayor a cero.";
    }
    public double calcularValorTotal(){
        double total=precio*cantidadStock;
        return total;
    }
    public void calcularValorTotal(double descuento, Producto p){
        System.out.println("Valor total con descuento: "+(p.calcularValorTotal()-descuento));
    }

    public static void main(String[] args) {
        Scanner dato = new Scanner(System.in);
        Producto nuevo = new Producto();
        System.out.println("Ingrese nombre del producto: ");
        nuevo.setNombre(dato.nextLine());
        System.out.println("Ingrese codigo del producto:");
        nuevo.setCodigo(dato.nextLine());
        System.out.println("Ingrese el precio: ");
        nuevo.setPrecio(dato.nextDouble());
        dato.nextLine();
        System.out.println("Ingrese cantidad en stock: ");
        nuevo.setCantidadStock(dato.nextInt());
        dato.nextLine();
        System.out.println("¿Es Perecible?(true/false): ");
        nuevo.setEsPerecible(dato.nextBoolean());
        System.out.println();
        nuevo.mostrarEstado();
        System.out.println("Stock disponible: " + nuevo.stockDisponible());
        System.out.println("Valor total: " + nuevo.calcularValorTotal());
        nuevo.calcularValorTotal(10, nuevo);
    }
}
