package ToaquizaGabriel_DeberS3_Encapsulamiento;

public class Persona {
    private String nombre;
    private int edad;
    private String profesion;

    public Persona(String nombre, int edad, String profesion){
        setNombre(nombre);
        setEdad(edad);
        setProfesion(profesion);
    }

    public void setNombre(String nombre) {
        if(nombre.isEmpty()){
            System.out.println("No se puede ingresar un nombre vacio.");
        }else{
            this.nombre = nombre;
        }
    }

    public void setEdad(int edad) {
        if(edad<=0){
            System.out.println("No se pueden ingresar valores negativos.");
        }else{
            this.edad = edad;
        }

    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getProfesion() {
        return profesion;
    }

    public static void main(String[] args) {
        Persona sujeto1 = new Persona("",-1,"Nulo");
        Persona sujeto2 = new Persona("Gabriel",21,"Estudiante");
        System.out.println("Persona con atributos incorrectos");
        System.out.println(sujeto1.getNombre());
        System.out.println(sujeto1.getEdad());
        System.out.println(sujeto1.getProfesion());
        System.out.println("Persona con atributos correctos");
        System.out.println(sujeto2.getNombre());
        System.out.println(sujeto2.getEdad());
        System.out.println(sujeto2.getProfesion());

    }
}
