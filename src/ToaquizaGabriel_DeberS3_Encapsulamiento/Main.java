package ToaquizaGabriel_DeberS3_Encapsulamiento;

public class Main {
    public static void main(String[] args) {
            Vehiculo v = new Vehiculo(180);
            v.marca = "Toyota";
            v.setModelo("Corolla");
            v.setCodigoSeguridad("ABC123");

            v.setColor("verde");
            v.setColor("rojo");

            System.out.println("Marca: " + v.marca);
            System.out.println("Modelo: " + v.getModelo());
            System.out.println("Velocidad Máxima: " + v.getVelocidadMaxima());
            System.out.println("Color: " + v.getColor());
        }

    }

