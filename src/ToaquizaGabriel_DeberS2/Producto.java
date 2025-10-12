package ToaquizaGabriel_DeberS2;

public class Producto {
    String nombre;
    double precio;
    int cantidad;
    public Producto(String nombre,double precio,int cantidad) {
        this.nombre=nombre;
        this.precio=precio;
        this.cantidad=cantidad;
    }
    public Producto(boolean valorFijo) {
        if(valorFijo){
            nombre="Papa";
            precio=0.50;
            cantidad=10;
        }
    }
    public Producto() {
        nombre="Sin nombre";
        precio=0.0;
        cantidad=0;
    }
    public void imprimir(){
        System.out.println("Nombre: "+nombre+"\nPrecio: "+precio+"\nCantidad: "+cantidad);
    }

    public static void main(String[] args) {
        Producto producto1 = new Producto();
        Producto producto2 = new Producto(true);
        Producto producto3 = new Producto("Algodón",0.50,10);
        producto1.imprimir();
        producto2.imprimir();
        producto3.imprimir();
    }
}
