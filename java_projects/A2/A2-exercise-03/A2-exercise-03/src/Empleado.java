public abstract class Empleado {
    //    01. ATTRIBUTES
    protected int legajo;
    protected String nombre;
    protected String apellido;

    //    02. CONSTRUCTOR
    public Empleado(int legajo, String nombre, String apellido) {
        this.legajo = legajo;
        this.nombre = nombre;
        this.apellido = apellido;
    }

//    03. SETTERS & GETTERS
    public int getLegajo() {
        return legajo;
    }

    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    //    04. METHODS
    public float calcularSueldo() {
        return 60000;
    }
}
