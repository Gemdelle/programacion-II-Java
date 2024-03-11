// EXERCISE 02b
//Cree una clase llamada Fecha, que incluya tres variables de instancia: un mes (int), un día (int) y un año(int).
// Su clase debe tener un constructor que inicialice las tres variables de instancia, y
// debe verificar que los valores que se proporcionan son correctos. ????????????????????? eso no lo hace el constructor?
// Proporcione los métodos get y set para cada variable de instancia.
// Proporcione un método mostrarFecha, para Imprimir la fecha en varios formatos, como 05/21/2010; Junio 14, 2012; 20 Agosto 11.
// Usar constructores sobrecargados para crear objetos Fecha inicializados con fechas de los formatos solicitados para imprimir. En el primer caso, el constructor debe recibir tres valores enteros. En el segundo, debe recibir un objeto String y dos valores enteros. En el tercero debe recibir un valor entero, string y otro entero. Escriba una aplicación de prueba llamada PruebaFecha, que demuestre las capacidades de la clase Fecha.

public class Fecha {

    //    01. VARIABLES
    int mes;
    int dia;
    int año;

    //    02. CONSTRUCTORS
// int - int - int
    public Fecha(int mes, int dia, int año) {
        this.mes = mes;
        this.dia = dia;
        this.año = año;
    }

    // str - int - int
    public Fecha(String mes, int dia, int año) {
        this.mes = Integer.parseInt(mes);
        this.dia = dia;
        this.año = año;
    }

    // int - str - int
    public Fecha(int mes, String dia, int año) {
        this.mes = mes;
        this.dia = Integer.parseInt(dia);
        this.año = año;
    }

    //    03. SETTERS & GETTERS
    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }


    // Proporcione un método mostrarFecha, para Imprimir la fecha en varios formatos, como 05/21/2010; Junio 14, 2012; 20 Agosto 11.
//    04. METHODS
    public void mostrarFecha(int mes, int dia, int año) {
        System.out.println();


        int monthNumber = 3; // For example, March

        // Get the Month object corresponding to the month number
        Month month = Month.of(monthNumber);

        // Get the name of the month
        String monthName = month.toString();
    }
}
