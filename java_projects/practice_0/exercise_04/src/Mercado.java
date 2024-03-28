import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Mercado {

    //    04. METHODS
    public List<List<Integer>> gananciasTotalesPorMes(Vendedor vendedor1, Vendedor vendedor2, Vendedor vendedor3, Vendedor vendedor4) { // Genera una lista con vendedor como index, con todas las ganancias por producto del mes.
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

//        Sumar todas las ganancias de cada vendedor para agregar al final como el TOTAL en el print.
//        Vendedor 1
        int gananciaTotalVendedor1 = 0;
        for (int i = 0; i < gananciasVendedor1.size(); i++) {
            gananciaTotalVendedor1 += gananciasVendedor1.get(i);
        }
        System.out.println(gananciaTotalVendedor1);
        gananciasVendedor1.add(gananciaTotalVendedor1);

        //        Vendedor 2
        int gananciaTotalVendedor2 = 0;
        for (int i = 0; i < gananciasVendedor2.size(); i++) {
            gananciaTotalVendedor2 += gananciasVendedor2.get(i);
        }
        gananciasVendedor2.add(gananciaTotalVendedor2);

        //        Vendedor 3
        int gananciaTotalVendedor3 = 0;
        for (int i = 0; i < gananciasVendedor3.size(); i++) {
            gananciaTotalVendedor3 += gananciasVendedor3.get(i);
        }
        gananciasVendedor3.add(gananciaTotalVendedor3);

        //        Vendedor 4
        int gananciaTotalVendedor4 = 0;
        for (int i = 0; i < gananciasVendedor4.size(); i++) {
            gananciaTotalVendedor4 += gananciasVendedor4.get(i);
        }
        gananciasVendedor4.add(gananciaTotalVendedor4);

        List<List<Integer>> gananciasTotalesTodosVendedores = new ArrayList<>();
        gananciasTotalesTodosVendedores.add(gananciasVendedor1);
        gananciasTotalesTodosVendedores.add(gananciasVendedor2);
        gananciasTotalesTodosVendedores.add(gananciasVendedor3);
        gananciasTotalesTodosVendedores.add(gananciasVendedor4);

        return gananciasTotalesTodosVendedores;

    }

    public void impresionGanancias(List<List<Integer>> gananciasTotalesTodosVendedores) {
        for (int i = 0; i < gananciasTotalesTodosVendedores.size(); i++) {
            for (int j = 0; j < gananciasTotalesTodosVendedores.get(i).size(); j++) {
                System.out.print(gananciasTotalesTodosVendedores.get(i).get(j) + "\t"); // Imprimir el dato seguido de un tabulador
            }
            System.out.println(); // Cambiar de línea después de imprimir todos los datos de la fila
        }
    }
}


