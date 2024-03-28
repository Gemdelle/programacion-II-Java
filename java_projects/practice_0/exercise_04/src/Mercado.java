import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Mercado {

    //    04. METHODS
    public List<List<String>> gananciasTotalesPorMes(Vendedor vendedor1, Vendedor vendedor2, Vendedor vendedor3, Vendedor vendedor4) { // Genera una lista con vendedor como index, con todas las ganancias por producto del mes.
//        Generar notas por mes para cada vendedor.
        List<List<Nota>> notasPorMesVendedor1 = vendedor1.generarNotasPorVendedorPorMes();
        List<List<Nota>> notasPorMesVendedor2 = vendedor2.generarNotasPorVendedorPorMes();
        List<List<Nota>> notasPorMesVendedor3 = vendedor3.generarNotasPorVendedorPorMes();
        List<List<Nota>> notasPorMesVendedor4 = vendedor4.generarNotasPorVendedorPorMes();

//        Generar ganancias de cada vendedor por producto en base a las notas de 1 mes (notasPorMesVendedorx).
        List<Integer> gananciasVendedor1 = vendedor1.gananciaPorProducto(notasPorMesVendedor1); // array final con ganancia de vendedor1 por producto por mes.
        List<Integer> gananciasVendedor2 = vendedor2.gananciaPorProducto(notasPorMesVendedor2); // array final con ganancia de vendedor2 por producto por mes.
        List<Integer> gananciasVendedor3 = vendedor3.gananciaPorProducto(notasPorMesVendedor3); // array final con ganancia de vendedor3 por producto por mes.
        List<Integer> gananciasVendedor4 = vendedor4.gananciaPorProducto(notasPorMesVendedor4); // array final con ganancia de vendedor4 por producto por mes.

        // 01. CREAR PRIMER ARRAY CON TÍTULOS DE PRODUCTOS
        List<String> titulosProductos = new ArrayList<>();
        titulosProductos.addAll(Arrays.asList("Producto","Producto 1","Producto 2","Producto 3","Producto 4","Producto 5","TOTAL"));

        // 02. CREAR SEGUNDO ARRAY CON VALOR POR PRODUCTO POR VENDEDOR
//        Sumar todas las ganancias de cada vendedor para agregar al final como el TOTAL en el print.
//        Vendedor 1
        int gananciaTotalVendedor1 = 0;
        for (Integer integer : gananciasVendedor1) {
            gananciaTotalVendedor1 += integer;
        }
        gananciasVendedor1.add(gananciaTotalVendedor1);

        //        Vendedor 2
        int gananciaTotalVendedor2 = 0;
        for (Integer integer : gananciasVendedor2) {
            gananciaTotalVendedor2 += integer;
        }
        gananciasVendedor2.add(gananciaTotalVendedor2);

        //        Vendedor 3
        int gananciaTotalVendedor3 = 0;
        for (Integer integer : gananciasVendedor3) {
            gananciaTotalVendedor3 += integer;
        }
        gananciasVendedor3.add(gananciaTotalVendedor3);

        //        Vendedor 4
        int gananciaTotalVendedor4 = 0;
        for (Integer integer : gananciasVendedor4) {
            gananciaTotalVendedor4 += integer;
        }
        gananciasVendedor4.add(gananciaTotalVendedor4);

        // Hasta acá se tienen listas con todos los valores de cada producto + total.
        // Agregar String con el n° de vendedor para que aparezca en el print final. Para eso, cambiar todos los valores a String.
        List<String> gananciasVendedor1Str = new ArrayList<>(gananciasVendedor1.stream().map(Object::toString).toList());
        List<String> gananciasVendedor2Str = new ArrayList<>(gananciasVendedor2.stream().map(Object::toString).toList());
        List<String> gananciasVendedor3Str = new ArrayList<>(gananciasVendedor3.stream().map(Object::toString).toList());
        List<String> gananciasVendedor4Str = new ArrayList<>(gananciasVendedor4.stream().map(Object::toString).toList());

        // Agregar título en el primer index a cada lista.

        gananciasVendedor1Str.add(0, "Vendedor 1");
        gananciasVendedor2Str.add(0, "Vendedor 2");
        gananciasVendedor3Str.add(0, "Vendedor 3");
        gananciasVendedor4Str.add(0, "Vendedor 4");

        // 03. CREAR TERCER ARRAY CON VALORES TOTALES POR PRODUCTO
        List<Integer> sumaTotalProducto = new ArrayList<>();
        for(int i = 0;i < gananciasVendedor1.size()-1;i++) {
            int sumaTotal = gananciasVendedor1.get(i) + gananciasVendedor2.get(i) + gananciasVendedor3.get(i) + gananciasVendedor4.get(i);
            sumaTotalProducto.add(sumaTotal);
        }

        // Agregar ganancia TOTAL, suma de todas las ganancias
        int gananciaTotal = 0;
        for(int ganancia : sumaTotalProducto) {
            gananciaTotal += ganancia;
        }
        sumaTotalProducto.add(gananciaTotal);

        List<String> gananciasTotalesProductoStr = new ArrayList<>(sumaTotalProducto.stream().map(Object::toString).toList());
        gananciasTotalesProductoStr.add(0, "Total");

//        04. CREAR ARRAY FINAL CON TODOS LOS VALORES DE LA TABLA
        List<List<String>> gananciasTotalesTodosVendedores = new ArrayList<>();
        gananciasTotalesTodosVendedores.add(titulosProductos);
        gananciasTotalesTodosVendedores.add(gananciasVendedor1Str);
        gananciasTotalesTodosVendedores.add(gananciasVendedor2Str);
        gananciasTotalesTodosVendedores.add(gananciasVendedor3Str);
        gananciasTotalesTodosVendedores.add(gananciasVendedor4Str);
        gananciasTotalesTodosVendedores.add(gananciasTotalesProductoStr);

        return gananciasTotalesTodosVendedores;

    }

    public void impresionGanancias(List<List<String>> gananciasTotalesTodosVendedores) {

        int tamanioFila = gananciasTotalesTodosVendedores.get(0).size();
        List<List<String>> columnas = new ArrayList<>();
        for (int c = 0; c < tamanioFila; c++) {
            List<String> columna = new ArrayList<>();
            columna.add(gananciasTotalesTodosVendedores.get(0).get(c));
            columna.add(gananciasTotalesTodosVendedores.get(1).get(c));
            columna.add(gananciasTotalesTodosVendedores.get(2).get(c));
            columna.add(gananciasTotalesTodosVendedores.get(3).get(c));
            columna.add(gananciasTotalesTodosVendedores.get(4).get(c));
            columna.add(gananciasTotalesTodosVendedores.get(5).get(c));
            columnas.add(columna);
        }

        int anchoFijo = 15; // Ancho fijo para todas las columnas

        // Imprimir la tabla con columnas de igual ancho
        for (List<String> columna : columnas) {
            System.out.println("---------------------------------------------------------------------------------------");
            for (String dato : columna) {
                System.out.printf("%-" + anchoFijo + "s", dato); // Ajustar el ancho
            }
            System.out.println();
        }
        System.out.println("---------------------------------------------------------------------------------------");
    }
}


