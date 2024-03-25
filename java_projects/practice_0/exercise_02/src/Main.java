// A0 EXERCISE 02:
//Cree una clase llamada Factura, que una ferretería podría utilizar para representar una factura para un artículo vendido en la tienda.
// Una Factura debe incluir un número de factura, un número de articulo, la descripción del articulo, la cantidad de artículos de ese tipo
// que se van a comprar y el precio por artículo.
// Su clase debe tener un constructor que inicialice las variables de instancia.
// Proporcione los métodos get y set para cada variable de instancia.
// Además, proporcione un método llamado obtenerMontoFactura, que calcule el monto de la factura (es decir, que multiplique la cantidad por el precio por artículo) y después lo devuelva como un valor double.
// Si la cantidad no es positiva, debe establecerse en 0.
// Si el precio por artículo no es positivo, debe establecerse en 0.0.
// Escriba una aplicación de prueba llamada PruebaFactura, que demuestre las capacidades de la clase Factura.
public static void main(String[] args) {
    Factura factura1 = new Factura(1,1,"Taza",2,10);
    Factura factura2 = new Factura(2, 100, "Vestido", -1, 100);
    Factura factura3 = new Factura(3, 200, "Bracelet", 5, -100);

    double montoFactura1 = factura1.obtenerMontoFactura();
    factura1.imprimirFactura(montoFactura1);

    double montoFactura2 = factura2.obtenerMontoFactura();
    factura2.imprimirFactura(montoFactura2);

    double montoFactura3 = factura3.obtenerMontoFactura();
    factura3.imprimirFactura(montoFactura3);
}