package ToaquizaGabriel_DeberGrupal_S4;

public class Invocacion {
    String nombre;
    public Invocacion(String nombre){
        this.nombre=nombre;
    }
    public String saludo(){
        return "Hola "+ nombre;
    }
    public void edad(int edad){
        String c = saludo();
        System.out.println(c+" tienes "+edad+" anios");
    }

    public static void main(String[] args) {
        Invocacion nuevo = new Invocacion("Gabriel");
        nuevo.edad(21);
    }
}
