//        2- Crear la clase administrativo con atributos nombre y sueldo.
//        Incluir métodos de acceso y modificación. Agregar dos métodos de clase para prueba:
//        - ejemplo1: crea un administrativo con datos a ingresar por el operador y lo muestra.
//        - ejemplo2: crea dos administrativos (usando el ejemplo1) e indica además cuál gana más.
//        Agregar teléfono en la clase administrativo. Hacer que el método toString lo incluya.


public class Administrativo {

    //    01. ATTRIBUTES
    String nombre;
    int sueldo;
    int telefono;

//    02. CONSTRUCTOR

    public Administrativo(String nombre, int sueldo, int telefono) {

        this.nombre = nombre;
        this.sueldo = sueldo;
        this.telefono = telefono;
    }

//    03. SETTERS & GETTERS

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getSueldo() {
        return sueldo;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

//    04. METHODS

    public void presentacion() {
        System.out.printf("Nombre: %s\nSueldo: %d\nTeléfono: %d\n\n",this.getNombre(), this.getSueldo(), this.getTelefono());
    }

    public void compararSueldos(Administrativo admin2) {
        if (sueldo > admin2.sueldo) {
            System.out.printf("Sueldo %s: %d\nSueldo %s: %d\nEl administrativo %s gana más que %s.", nombre, sueldo, admin2.nombre, admin2.sueldo, nombre, admin2.nombre);
        }
        else {
            System.out.printf("Sueldo %s: %d\nSueldo %s: %d\nEl administrativo %s gana más que %s.", admin2.nombre, admin2.sueldo, nombre, sueldo, admin2.nombre, nombre);
        }
    }

}
