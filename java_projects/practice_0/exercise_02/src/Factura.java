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
    private int numeroFactura;
    private int numeroArticulo;
    private String descripcion;
    private int cantidadAComprar;
    private double precio;

    //    02. CONSTRUCTOR
    public Factura(int numeroFactura, int numeroArticulo, String descripcion, int cantidadAComprar, double precio) {
        this.numeroFactura = numeroFactura;
        this.numeroArticulo = numeroArticulo;
        this.descripcion = descripcion;
        this.cantidadAComprar = cantidadAComprar;
        this.precio = precio;
    }

    // 03. SETTERS & GETTERS
    public int getNumeroFactura() {
        return numeroFactura;
    }

    public void setNumeroFactura(int numeroFactura) {
        this.numeroFactura = numeroFactura;
    }

    public int getNumeroArticulo() {
        return numeroArticulo;
    }

    public void setNumeroArticulo(int numeroArticulo) {
        this.numeroArticulo = numeroArticulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getCantidadAComprar() {
        return cantidadAComprar;
    }

    public void setCantidadAComprar(int cantidadAComprar) {
        this.cantidadAComprar = cantidadAComprar;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

//    04. METHODS

    public double obtenerMontoFactura() {
        if (cantidadAComprar < 0) {
            cantidadAComprar = 0;
        } else if (precio < 0) {
            precio = 0.0;
        }
        return cantidadAComprar * precio;
    }

    public void imprimirFactura(double monto) {
        System.out.printf("El monto para la factura %d es de %.2f\n", numeroFactura, monto);
    }
}
