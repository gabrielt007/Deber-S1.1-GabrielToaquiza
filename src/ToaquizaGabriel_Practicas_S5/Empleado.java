package ToaquizaGabriel_Practicas_S5;
import java.util.Scanner;
public class Empleado {
    private String nombreCompleto;
    private String cedula;
    private double salarioMensual;
    private int aniosAntiguedad;
    private boolean esGerente;

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public void setCedula(String cedula) {
        if(cedula.length()==10){
            this.cedula = cedula;
        }
    }

    public void setAniosAntiguedad(int aniosAntiguedad) {
        if(aniosAntiguedad>=0){
            this.aniosAntiguedad = aniosAntiguedad;
        }
    }

    public void setEsGerente(boolean esGerente) {
        this.esGerente = esGerente;
    }

    public void setSalarioMensual(double salarioMensual) {
        if(salarioMensual>=500){
            this.salarioMensual = salarioMensual;
        }
    }
    public boolean puedeRecibirBonificacion(){
        if(salarioMensual<3000){
            return true;
        }else if(aniosAntiguedad>=5){
            return true;
        }else{
            return false;
        }
    }
    public void generarResultado(Empleado e){
        if (e.puedeRecibirBonificacion()){
            System.out.println("Bonificacion Aprobada");
            double bono = e.salarioMensual*0.1;
            System.out.println("Bonificacion mensual: "+bono+"\nBonificacion con extra: "+bono+50);
        }else{
            System.out.println("Bonificacion no aprobada");
        }
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "nombreCompleto='" + nombreCompleto + '\'' +
                ", cedula='" + cedula + '\'' +
                ", salarioMensual=" + salarioMensual +
                ", aniosAntiguedad=" + aniosAntiguedad +
                ", esGerente=" + esGerente +
                '}';
    }

    public static void main(String[] args) {
        Scanner dato = new Scanner(System.in);
        Empleado nuevo = new Empleado();
        System.out.println("Ingrese nombre del empleado: ");
        nuevo.setNombreCompleto(dato.nextLine());
        System.out.println("Ingrese cedula: ");
        nuevo.setCedula(dato.nextLine());
        System.out.println("Ingrese salario mensual: ");
        nuevo.setSalarioMensual(dato.nextDouble());
        dato.nextLine();
        System.out.println("Ingrese anios de antiguedad: ");
        nuevo.setAniosAntiguedad(dato.nextInt());
        dato.nextLine();
        System.out.println("¿Es gerente?(true/false): ");
        nuevo.setEsGerente(dato.nextBoolean());
        System.out.println();
        System.out.println(nuevo);
        System.out.println("Es Gerente: "+nuevo.puedeRecibirBonificacion());
        nuevo.generarResultado(nuevo);

    }




}
