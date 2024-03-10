public class Socio {
//    01. ATTRIBUTES
    String nombre;

    int numero;

    static int proximoNumero = 1;

//    02. SETTERS & GETTERS
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

    //    03. METHODS
    public void aumentarNumero() {
        proximoNumero += 1;
    }

//    04. CONSTRUCTOR

    public Socio() {
        proximoNumero += 1;
    }
}
