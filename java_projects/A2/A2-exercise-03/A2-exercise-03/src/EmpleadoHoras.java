public class EmpleadoHoras extends Empleado{
//    01. ATTRIBUTES
    private static float sueldoBase = 20000;
    private float horasTrabajadas;
    private float valorHora;

    //    02. CONSTRUCTOR
    public EmpleadoHoras(int legajo, String nombre, String apellido, float horasTrabajadas, float valorHora) {
        super(legajo, nombre, apellido);
        this.horasTrabajadas = horasTrabajadas;
        this.valorHora = valorHora;
    }

//    03. SETTERS & GETTERS
    public static float getSueldoBase() {
        return sueldoBase;
    }

    public static void setSueldoBase(float sueldoBase) {
        EmpleadoHoras.sueldoBase = sueldoBase;
    }

    public float getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(float horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    public float getValorHora() {
        return valorHora;
    }

    public void setValorHora(float valorHora) {
        this.valorHora = valorHora;
    }

    //    04. METHODS
    @Override
    public float calcularSueldo() {
        return sueldoBase + horasTrabajadas * valorHora;
    }
}