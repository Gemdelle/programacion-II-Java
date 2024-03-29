public class Persona {
    //   01. ATTRIBUTES
    protected String nombre;
    protected int edad;
    protected int DNI;

    //    02. CONSTRUCTOR
    public Persona(String nombre, int edad, int DNI) {
        this.nombre = nombre;
        this.edad = edad;
        this.DNI = DNI;
    }

    //    03. METHODS
    public void presentacion() {
        System.out.printf("PRESENTACIÓN PERSONA\nMe llamo %s. Tengo %d años y mi DNI es %d.\n\n", nombre, edad, DNI);
    }

    public void saludar() {
        System.out.printf("SALUDAR PERSONA\nHola, soy la persona %s\n\n",nombre);
    }
}
