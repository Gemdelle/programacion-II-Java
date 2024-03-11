public static void main(String[] args) {
    Factura factura1 = new Factura(1,1,"Taza",2,10.0);
    Factura factura2 = new Factura(2, 100, "Vestido", 0, 100.0);
    Factura factura3 = new Factura(10, 200, "Bracelet", 5, 0.0);

    factura1.obtenerMontoFactura(factura1.cantidad_a_comprar, factura1.precio);
    factura2.obtenerMontoFactura(factura2.cantidad_a_comprar, factura2.precio);
    factura3.obtenerMontoFactura(factura3.cantidad_a_comprar, factura3.precio);
}