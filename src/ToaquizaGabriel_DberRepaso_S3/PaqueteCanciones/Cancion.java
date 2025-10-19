package ToaquizaGabriel_DberRepaso_S3.PaqueteCanciones;

public class Cancion {
    private String titulo;
    private double duracion;
    private int reproducciones;
    public Cancion(String titulo, double duracion, int reproducciones){
        setTitulo(titulo);
        setDuracion(duracion);
        setReproducciones(reproducciones);
    }
    public Cancion(){
        titulo = "";
        duracion= 0.0;
        reproducciones=0;
    }
    public void setReproducciones(int reproducciones) {
        if (reproducciones <= 0) {
            System.out.println("El titulo debe tener un nombre");
        } else {
            this.reproducciones = reproducciones;
        }
    }

    public void setTitulo(String titulo) {
        if(titulo.isEmpty()){
            System.out.println("El titulo debe tener un nombre");
        }else{
            this.titulo = titulo;
        }
    }

    public void setDuracion(double duracion) {
        if(duracion<=0){
            System.out.println("El titulo debe tener un nombre");
        }else{
            this.duracion = duracion;
        }
    }
    public  void  aumentarReproducciones(){
        reproducciones++;
    }
    public void informacion(){
        System.out.println("Titulo de la cancion: "+titulo+"\nDuracion de la cancion: "+duracion+"\nReproducciones: "+reproducciones);
    }

}


