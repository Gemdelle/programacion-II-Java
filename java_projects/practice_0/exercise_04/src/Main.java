
// EXERCISE 04
//Una compañía tiene cuatro vendedores que venden cinco productos distintos. Al finalizar la jornada laboral, cada vendedor pasa una nota por cada tipo de producto vendido. Cada nota contiene lo siguiente:
// a) El número del vendedor
// b) El número del producto
// c) El valor total de ese producto vendido en ese día
// Así, cada vendedor pasa entre 0 y 5 notas de venta por día. Suponga que está disponible la información sobre todas las notas del mes pasado. Escriba una aplicación que lea toda esta información para las ventas del último mes y que resuma las ventas totales por vendedor, y por producto. Todos los totales deben guardarse en el vector bidimensional ventas. Después de procesar toda la información del mes pasado, muestre los resultados en formato tabular, en donde cada columna represente a un vendedor específico y cada fila simboliza un producto. Saque el total de cada fila para obtener las ventas totales de cada producto durante el último mes. Calcule el total de cada columna para sacar las ventas totales de cada vendedor durante el último mes. Su impresión tabular debe incluir estos totales cruzados a la derecha de las filas totalizadas, y en la parte inferior de las columnas totalizadas.

import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Crear vendedores.
        Vendedor vendedor1 = new Vendedor(1);
        Vendedor vendedor2 = new Vendedor(2);
        Vendedor vendedor3 = new Vendedor(3);
        Vendedor vendedor4 = new Vendedor(4);

        // Generar notas mensuales de cada vendedor.
        List<List<Nota>> notasVendedor1 = vendedor1.generarNotasPorVendedorPorMes();
        List<List<Nota>> notasVendedor2 = vendedor2.generarNotasPorVendedorPorMes();
        List<List<Nota>> notasVendedor3 = vendedor3.generarNotasPorVendedorPorMes();
        List<List<Nota>> notasVendedor4 = vendedor4.generarNotasPorVendedorPorMes();

        // Imprimir notas mensuales de cada vendedor para chequear funcionamiento.
//        System.out.println("\nNOTAS VENDEDOR 1");
//        vendedor1.impresion(notasVendedor1);
//        System.out.println("\nNOTAS VENDEDOR 2");
//        vendedor1.impresion(notasVendedor2);
//        System.out.println("\nNOTAS VENDEDOR 3");
//        vendedor1.impresion(notasVendedor3);
//        System.out.println("\nNOTAS VENDEDOR 4");
//        vendedor1.impresion(notasVendedor4);

        // Crear mercado
        Mercado mercado = new Mercado();
        List<List<String>> gananciasTotales = mercado.gananciasTotalesPorMes(vendedor1,vendedor2,vendedor3,vendedor4);
        mercado.impresionGanancias(gananciasTotales);
    }
}
