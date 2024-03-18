public class Socio {
    //    01. ATTRIBUTES
    private String nombre;
    private int numero;
    static int proximoNumero = 1;

    //    02. CONSTRUCTOR

    public Socio() {
        proximoNumero += 1;
    }

    //    03. SETTERS & GETTERS
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
}

