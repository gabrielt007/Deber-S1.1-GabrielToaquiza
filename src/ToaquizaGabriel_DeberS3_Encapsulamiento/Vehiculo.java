package ToaquizaGabriel_DeberS3_Encapsulamiento;

public class Vehiculo {
    public String marca;
    private String modelo;
    private int velocidadMaxima;
    private String codigoSeguridad;
    private String color;

    public Vehiculo(int velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public int getVelocidadMaxima(){
        return velocidadMaxima;
    }
    public void setCodigoSeguridad(String codigoSeguridad){
        this.codigoSeguridad=codigoSeguridad;
    }
    public String getColor(){
        return color;
    }

    public void setColor(String color) {
        if (color.equals("rojo") || color.equals("azul") || color.equals("blanco")) {
            this.color = color;
        }

    }
    }
