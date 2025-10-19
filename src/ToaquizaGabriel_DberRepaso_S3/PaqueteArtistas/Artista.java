package ToaquizaGabriel_DberRepaso_S3.PaqueteArtistas;

public class Artista {
    private String nombre;
    private String genero;
    private int seguidores;

    public Artista(){
        nombre="";
        genero="";
        seguidores=0;
    }
    public Artista(String nombre, String genero, int seguidores){
        setNombre(nombre);
        setGenero(genero);
        setSeguidores(seguidores);
    }

    public void setNombre(String nombre) {
        if(nombre.isEmpty()==false){
            this.nombre = nombre;
        }
    }

    public void setGenero(String genero) {
        if(genero.isEmpty()==false){
            this.genero = genero;
        }
    }

    public void setSeguidores(int seguidores) {
        if((seguidores<=0)==false){
            this.seguidores = seguidores;
        }
    }
    public void ganarSeguidores(int cantidad){
        if(cantidad>0){
            seguidores+=cantidad;
        }
    }
    public void mostrarPerfil(){
        System.out.println("\nNombre del artista: "+nombre+"\nGenero musical: "+genero+"\nNumero de seguidores: "+seguidores);
    }
}
