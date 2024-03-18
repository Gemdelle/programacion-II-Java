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

public class Factura {

    //    01. ATTRIBUTES
    int numero_factura;
    int numero_articulo;
    String descripcion;
    int cantidad_a_comprar;
    double precio;

    //    02. CONSTRUCTOR
    public Factura(int numero_factura, int numero_articulo, String descripcion, int cantidad_a_comprar, double precio) {
        this.numero_factura = numero_factura;
        this.numero_articulo = numero_articulo;
        this.descripcion = descripcion;
        this.cantidad_a_comprar = cantidad_a_comprar;
        this.precio = precio;
    }

    // 03. SETTERS & GETTERS
    public int getNumero_factura() {
        return numero_factura;
    }

    public void setNumero_factura(int numero_factura) {
        this.numero_factura = numero_factura;
    }

    public int getNumero_articulo() {
        return numero_articulo;
    }

    public void setNumero_articulo(int numero_articulo) {
        this.numero_articulo = numero_articulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getCantidad_a_comprar() {
        return cantidad_a_comprar;
    }

    public void setCantidad_a_comprar(int cantidad_a_comprar) {
        this.cantidad_a_comprar = cantidad_a_comprar;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

//    04. METHODS

    public void obtenerMontoFactura() {
        if (cantidad_a_comprar == 0) {
            int monto_int = 0;
            System.out.printf("El monto para la factura %d es de %d\n", numero_factura, monto_int);
        } else if (precio == 0.0) {
            double monto_double = 0.0;
            System.out.printf("El monto para la factura %d es de %.2f\n", numero_factura, monto_double);
        } else {
            double monto = cantidad_a_comprar * precio;
            System.out.printf("El monto para la factura %d es de %.2f\n", numero_factura, monto);
        }
    }
}
