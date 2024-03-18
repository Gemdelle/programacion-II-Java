// EXERCISE 02b
//Cree una clase llamada Fecha, que incluya tres variables de instancia: un mes (int), un día (int) y un año(int).
// Su clase debe tener un constructor que inicialice las tres variables de instancia, y
// debe verificar que los valores que se proporcionan son correctos.
// Proporcione los métodos get y set para cada variable de instancia.
// Proporcione un método mostrarFecha, para Imprimir la fecha en varios formatos, como 05/21/2010; Junio 14, 2012; 20 Agosto 11.
// Usar constructores sobrecargados para crear objetos Fecha inicializados con fechas de los formatos solicitados para imprimir. En el primer caso, el constructor debe recibir tres valores enteros. En el segundo, debe recibir un objeto String y dos valores enteros. En el tercero debe recibir un valor entero, string y otro entero. Escriba una aplicación de prueba llamada PruebaFecha, que demuestre las capacidades de la clase Fecha.

import java.time.Month;

public class Fecha {

    //    01. ATTRIBUTES
    private int mes;
    private int dia;
    private int anio;

    //    02. CONSTRUCTORS
// 01. int - int - int
    public Fecha(int mes, int dia, int anio) {
        validacionDatos1(mes,dia,anio);
        this.mes = mes;
        this.dia = dia;
        this.anio = anio;
    }

    // str - int - int
    public Fecha(String mes, int dia, int anio) {
        mes = mes.toUpperCase();
        int numero_mes = Month.valueOf(mes).getValue();
        validacionDatos2(mes,dia,anio);
        this.mes = numero_mes;
        this.dia = dia;
        this.anio = anio;
    }

    // int - str - int
    public Fecha(int mes, String dia, int anio) {
        validacionDatos3(mes,dia,anio);
        this.mes = mes;
        this.dia = Integer.parseInt(dia);
        this.anio = anio;
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

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    // Proporcione un método mostrarFecha, para Imprimir la fecha en varios formatos, como 05/21/2010; Junio 14, 2012; 20 Agosto 11.
//    04. METHODS

    private void validacionDatos1(int mes, int dia, int anio) {
        if (mes < 1 || mes > 12 || dia < 1 || dia > 31 || anio < 1 || anio > 2024) {
            throw new RuntimeException("Ingrese valores dentro del rango");
        }
    }

    private void validacionDatos2(String mes, int dia, int anio) {
        Month valor_mes = Month.valueOf(mes); // Con esto ya se valida si existe o no, si no exist tira error.
        if (dia < 1 || dia > 31 || anio < 1 || anio > 2024) {
            throw new RuntimeException("Ingrese valores dentro del rango");
        }
    }

    private void validacionDatos3(int mes, String dia, int anio) {
        int dia_numerico = Integer.parseInt(dia);
        if (mes < 1 || mes > 12 || dia_numerico < 1 || dia_numerico > 31 || anio < 1 || anio > 2024) {
            throw new RuntimeException("Ingrese valores dentro del rango");
        }
    }

    // 05/21/2010; Junio 14, 2012; 20 Agosto 11.
    public void mostrarFecha() {
        String nombre_mes = Month.of(mes).toString();
        nombre_mes = nombre_mes.charAt(0) + nombre_mes.substring(1).toLowerCase();

        System.out.printf("Formato fecha 01 = %d/%d/%d\nFormato fecha 02 = %s %d, %d\nFormato fecha 03 = %d %s %d.\n\n",dia,mes,anio,nombre_mes,dia,anio,dia,nombre_mes,anio);
    }
}