// EXERCISE 05
//Cree una clase llamada CuentaDeAhorros. Use una variable “final” (constante) tasalnteresAnual para almacenar la tasa de interés anual para todos los clientes.
// Cada objeto de la clase debe contener una variable de instancia llamada saldoAhorros, que indique la cantidad que el ahorrador tiene actualmente en depósito.
// Proporcione el método calcularlnteresMensual para calcular el interés mensual multiplicando el saldoAhorros por la tasalnteresAnual dividida entre 12; este interés debe sumarse al saldoAhorros.
// Proporcione un método static llamado modificar Tasalnteres para establecer la tasalnteresAnual en un nuevo valor.
// Escriba un programa para probar la clase CuentaDeAhorros.
// Cree dos instancias de objetos CuentaDeAhorros, ahorradorl y ahorrador2, con saldos de $20000.00 y $30000.00.
// Establezca la tasalnteresAnual en 4%, después calcule el interés mensual para cada uno de los 12 meses e imprima los nuevos saldos para ambos ahorradores.
// Luego establezca la tasalnteresAnual en 5%, calcule el interés del siguiente mes e imprima los nuevos saldos para ambos ahorradores.

public class Main {
    public static void main(String[] args) {

    CuentaDeAhorros ahorrador1 = new CuentaDeAhorros(20000);
    CuentaDeAhorros ahorrador2 = new CuentaDeAhorros(30000);

//    CuentaDeAhorros.setTasaInteresAnual(0.04F); Puede hacerse así o con el método que me pide en el enunciado, es lo mismo o no?
        CuentaDeAhorros.modificarTasaInteres(0.04F);
    ahorrador1.calcularlnteresMensual(12);
    ahorrador2.calcularlnteresMensual(12);

        CuentaDeAhorros.modificarTasaInteres(0.05F);
    ahorrador1.calcularlnteresMensual(1);
    ahorrador2.calcularlnteresMensual(1);

    }
}
