package ToaquizaGabriel_Practicas_S5;
import java.util.Scanner;
public class SolicitanteBeca {
    private String nombreCompleto;
    private String cedula;
    private double promedio;
    private double ingresosFamiliares;
    boolean tieneRecomendacion;

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public void setCedula(String cedula) {
        if (cedula.length()==10){
            this.cedula = cedula;
        }
    }

    public void setPromedio(double promedio) {
        if(0.0 <= promedio && promedio <=10.0){
            this.promedio = promedio;
        }
    }

    public void setIngresosFamiliares(double ingresosFamiliares) {
        if(ingresosFamiliares>=0){
            this.ingresosFamiliares = ingresosFamiliares;
        }
    }

    public void setTieneRecomendacion(boolean tieneRecomendacion) {
        this.tieneRecomendacion = tieneRecomendacion;
    }
    public boolean becaAporbada(){
        if(tieneRecomendacion) {
            return true;
        }else{
            return false;
        }
    }
    public void generarResultado(SolicitanteBeca e) {
        if (e.tieneRecomendacion && e.promedio >= 9.0 && e.ingresosFamiliares <= 800.0) {
            System.out.println("Estudiante " + e.nombreCompleto + " aprobado.");
        } else if (!(e.tieneRecomendacion)) {
            System.out.println("Estudiante" + e.nombreCompleto + "no cuenta con una recomendacion.");
        } else if (!(e.promedio >= 9.0)) {
            System.out.println("Estudiante " + e.nombreCompleto + " no cumple con promedio igual o superior a nueve.");
        } else if (!(e.ingresosFamiliares <= 800.0)) {
            System.out.println("Los ingresos de la familia del estudiante " + e.nombreCompleto + " exceden los 800 dolares.");
        } else {
            System.out.println("El estudiante no cumple con uno o mas de los requisitos\n1.Tener recomendacion.\n2.Promedio igual o superior a nueve.\n3.Ingresos mayores a 800 dolares.");
        }
    }
        public String toString(){
            return "Datos de estudiante: \nNombre: "+
                    nombreCompleto+"\nCedula: "+cedula+
                    "\nPromedio: "+promedio+"\nIngresos familiares: "+
                    ingresosFamiliares+"\nTiene recomendacion: "
                    +tieneRecomendacion;
        }
        public void calcularHorasEstudio(){
        int horas = 0;
        int extra= horas+5;
        if(promedio>=9.0) {
            horas = 20;
            System.out.println("Horas de estudio: "+horas+"\nHoras de estudio con extra 5: "+extra);
        }else{
            horas = 40;
            System.out.println("Horas de estudio: "+horas
                    +"\nHoras de estudio con extra 5: "+extra);
        }
        }
        public void calcularHorasEstudio(int horass){
            int horas = 0;
            int extra= horas+horass;
            if(promedio>=9.0) {
                horas = 20;
                System.out.println("Horas de estudio: "+horas+"\nHoras de estudio con extra 5: "+extra);
            }else{
                horas = 40;
                System.out.println("Horas de estudio: "+horas
                        +"\nHoras de estudio con extra 5: "+extra);
            }
        }

    public static void main(String[] args) {
        Scanner dato = new Scanner(System.in);
        SolicitanteBeca nuevo = new SolicitanteBeca();
        System.out.println("Ingrese su nombre completo: ");
        nuevo.setNombreCompleto(dato.nextLine());
        System.out.println("Ingrese su cedula: ");
        nuevo.setCedula(dato.nextLine());
        System.out.println("Ingrese su promedio: ");
        nuevo.setPromedio(dato.nextDouble());
        dato.nextLine();
        System.out.println("Ingrese sus ingresos familiares: ");
        nuevo.setIngresosFamiliares(dato.nextDouble());
        dato.nextLine();
        System.out.println("¿Tiene recomendacion?(true/false): ");
        nuevo.setTieneRecomendacion(dato.nextBoolean());
        System.out.println();
        System.out.println(nuevo);
        nuevo.becaAporbada();
        nuevo.generarResultado(nuevo);
        nuevo.calcularHorasEstudio();

    }

    }



