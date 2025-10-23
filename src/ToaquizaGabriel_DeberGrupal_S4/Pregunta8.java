package ToaquizaGabriel_DeberGrupal_S4;

public class Pregunta8 {
    String nombre;
    public Pregunta8(String nombre){
        this.nombre=nombre;
    }
    public void saludar(){
        System.out.println("Hola "+nombre);
    }
    public void saludar(String ciudad){
        System.out.println("Hola "+nombre+" eres de "+ciudad);
    }

    public static void main(String[] args) {
        Pregunta8 nuevo = new Pregunta8("Gabriel");
        nuevo.saludar();
        nuevo.saludar("Quito");
    }
}
