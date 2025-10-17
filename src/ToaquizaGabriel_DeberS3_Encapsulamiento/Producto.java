package ToaquizaGabriel_DeberS3_Encapsulamiento;

public class Producto {
    private double precio;
    private String nombre;
    public Producto(double precio, String nombre){
        setPrecio(precio);
        setNombre(nombre);
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrecio(double precio) {
        if(precio<=0){
            System.out.println("No se permiten precios negativos o menores a cero.");
        }else{
            this.precio = precio;
        }
    }

    public String getNombre() {
        return nombre;
    }
    public void imprimir(){
        System.out.println("\nNombre: "+nombre+"\nPrecio: "+precio);
    }

    public static void main(String[] args) {
        Producto producto1 = new Producto(0,"Leche");
        Producto producto2 = new Producto(2.50,"Jamon");
        System.out.println("Precios invalidos");
        producto1.imprimir();
        System.out.println("Precios validos");
        producto2.imprimir();
    }
}
