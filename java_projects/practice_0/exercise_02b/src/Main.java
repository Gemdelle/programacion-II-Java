// EXERCISE 02b
//Cree una clase llamada Fecha, que incluya tres variables de instancia: un mes (int), un día (int) y un año(int).
// Su clase debe tener un constructor que inicialice las tres variables de instancia, y
// debe verificar que los valores que se proporcionan son correctos.
// Usar constructores sobrecargados para crear objetos Fecha inicializados con fechas de los formatos solicitados para imprimir. En el primer caso, el constructor debe recibir tres valores enteros. En el segundo, debe recibir un objeto String y dos valores enteros. En el tercero debe recibir un valor entero, string y otro entero. Escriba una aplicación de prueba llamada PruebaFecha, que demuestre las capacidades de la clase Fecha.
// Proporcione los métodos get y set para cada variable de instancia.
// Proporcione un método mostrarFecha, para Imprimir la fecha en varios formatos, como 05/21/2010; Junio 14, 2012; 20 Agosto 11.

public class Main {
    public static void main(String[] args) {
        Fecha fecha1 = new Fecha(1,4,2021);
        Fecha fecha2 = new Fecha("September",1,1998);
        Fecha fecha3 = new Fecha(12,"26",1990);

        fecha1.mostrarFecha();
        fecha2.mostrarFecha();
        fecha3.mostrarFecha();
    }
}
