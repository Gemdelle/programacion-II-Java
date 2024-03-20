//Ejercicio 2a:
//        Cree una clase llamada Factura, que una ferretería podría utilizar para representar una factura para un artículo vendido en la tienda. Una Factura debe incluir un número de factura, un número de articulo, la descripción del articulo, la cantidad de artículos de ese tipo que se van a comprar y el precio por artículo.
//        Su clase debe tener un constructor que inicialice las variables de instancia. Proporcione los métodos get y set para cada variable de instancia. Además, proporcione un método llamado obtenerMontoFactura, que calcule el monto de la factura (es decir, que multiplique la cantidad por el precio por artículo) y después lo devuelva como un valor double. Si la cantidad no es positiva, debe establecerse en 0. Si el precio por artículo no es positivo, debe establecerse en 0.0. Escriba una aplicación de prueba llamada PruebaFactura, que demuestre las capacidades de la clase Factura.

public class Main {
    public static void main(String[] args) {
        Auto miAuto = new Auto();
        miAuto.arrancar();
        miAuto.frenar();
    }
}