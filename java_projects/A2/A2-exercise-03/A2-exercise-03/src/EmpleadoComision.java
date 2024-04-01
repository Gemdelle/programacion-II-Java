public class EmpleadoComision extends Empleado{
//    01. ATTRIBUTES
    private static float sueldoBase = 60000;
    private static float tasaComision = 12;
    private int cantidadVentas;

//    02. CONSTRUCTOR

    public EmpleadoComision(int legajo, String nombre, String apellido, int cantidadVentas) {
        super(legajo, nombre, apellido);
        this.cantidadVentas = cantidadVentas;
    }

//    03. SETTERS & GETTERS
    public static float getSueldoBase() {
        return sueldoBase;
    }

    public static void setSueldoBase(float sueldoBase) {
        EmpleadoComision.sueldoBase = sueldoBase;
    }

    public static float getTasaComision() {
        return tasaComision;
    }

    public static void setTasaComision(float tasaComision) {
        EmpleadoComision.tasaComision = tasaComision;
    }

    public int getCantidadVentas() {
        return cantidadVentas;
    }

    public void setCantidadVentas(int cantidadVentas) {
        this.cantidadVentas = cantidadVentas;
    }

    //    04. METHODS
    @Override
    public float calcularSueldo() {
        return sueldoBase + cantidadVentas * tasaComision;
    }
}
