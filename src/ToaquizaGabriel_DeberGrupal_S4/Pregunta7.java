package ToaquizaGabriel_DeberGrupal_S4;

public class Pregunta7 {
    int numero = 12;
    String texto = "hola";

    public int getNumero() {
        return numero;
    }

    public String getTexto() {
        return texto;
    }

    public static void main(String[] args) {
        Pregunta7 nuevo = new Pregunta7();
        System.out.println(nuevo.getNumero());
        System.out.println(nuevo.getTexto());

    }
}
