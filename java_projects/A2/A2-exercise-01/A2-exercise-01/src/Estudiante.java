public class Estudiante extends Persona {
//    01. ATTRIBUTES
    private int matricula;

//    02. CONSTRUCTOR
    public Estudiante(String nombre, int edad, int DNI, int matricula) {
        super(nombre, edad, DNI);
        this.matricula = matricula;
    }

//    03. METHODS
    public void presentacionEstudiante() {
        System.out.printf("PRESENTACIÓN ESTUDIANTE\nNombre: %s\nEdad: %d\nDNI: %d\nMatrícula: %s\n\n", nombre, edad, DNI, matricula);
    }

    @Override
    public void saludar(){
        System.out.printf("SALUDAR PERSONA OVERRIDE\nHola, soy el estudiante %s\n\n",nombre);
    }

}
