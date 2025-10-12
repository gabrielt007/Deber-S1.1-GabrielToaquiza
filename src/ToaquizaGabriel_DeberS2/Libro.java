package ToaquizaGabriel_DeberS2;

public class Libro {
    String autor;
    String titulo;
    String anioPublicacion;
    public Libro(String autor, String titulo,String anioPublicacion){
        this.autor=autor;
        this.titulo=titulo;
        this.anioPublicacion=anioPublicacion;
    }
    public void mostrarInformacion(){
        System.out.println("Autor: "+autor+"\nTitulo: "+titulo+"\nAnio de publicacion: "+anioPublicacion);

    }

    public static void main(String[] args) {
        Libro miLibro1=new Libro("Diego","Aventura espacial","11/12/1999");
        miLibro1.mostrarInformacion();
        System.out.println();
        Libro miLibro2=new Libro("Alan","Bosque encantado","20/04/2001");
        miLibro2.mostrarInformacion();
    }
}
