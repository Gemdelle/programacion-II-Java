import java.util.Arrays;
import java.util.Random;
import java.util.ArrayList;
import java.util.List;

public class Vendedor {

    // 01. ATTRIBUTES
    int numeroVendedor;

    // 02. CONSTRUCTOR
    public Vendedor(int numeroVendedor) {
        this.numeroVendedor = numeroVendedor;
    }

    // 03. METHODS
    public List<List<Nota>> generarNotasPorVendedorPorMes() { // Devuelve una lista en donde cada INDEX (día) es una lista de notas.
        int dias = 30;
        List<List<Nota>> diasMes = new ArrayList(); // crear array de listas con 30 lugares, del 0-29

        Random random = new Random();
        int cantidadNotas;
        int ganancia;
        int indexRandom;
        int productoRandom;

        for (int i = 0; i < dias; i++) { // para cada día del mes

            // VARIABLES PARA CREAR LAS NOTAS DE VENDEDOR POR DÍA
            // Generar productos 1-5
            List<Integer> numeroProductos = new ArrayList<>(); // Lista que va a guardar los números 1-5, que son los números de producto posibles.
            numeroProductos.addAll(Arrays.asList(1, 2, 3, 4, 5)); // Agregar los números 1-5 a la lista.

            // Generar lista para guardar notas y cantidad (varía por día)
            cantidadNotas = random.nextInt(5); // cambiar la cantidad de notas por día 0-5
            List<Nota> notasPorDia = new ArrayList(); // Lista que va a guardar las notas de cada día

            // Crear nota por día y guardarla en el array
            for (int j = 0; j < cantidadNotas; j++) {
                // Producto
                indexRandom = random.nextInt(numeroProductos.size()); //
                productoRandom = numeroProductos.get(indexRandom); // Obtener un producto aleatorio dentro de la lista.
                numeroProductos.remove(indexRandom); // Eliminar el elemento en el índice aleatorio.
                // Ganancia
                ganancia = random.nextInt(3000) + 500; // 500 - 3500

                // Crear nota
                Nota nota = new Nota(numeroVendedor, productoRandom, ganancia);
                notasPorDia.add(nota); // una lista con las notas que hay por día
            } // Al terminar el for, va a quedar una lista con la cantidad de notas por día del vendedor

            diasMes.add(notasPorDia); // agregar las notas generadas para un día al día que le corresponde
        }
        return diasMes;
    }

    public void impresion(List<List<Nota>> diasMes) {
        for (int i = 0; i < diasMes.size(); i++) {
            List<Nota> notasDia = diasMes.get(i);
            System.out.println("Día " + (i + 1) + ":");
            for (Nota nota : notasDia) {
                System.out.printf("Producto %d - Ganancia %d\n", nota.getNumeroProducto(), nota.getValorTotalProducto());
            }
        }
    }

    public List<Integer> gananciaPorProducto(List<List<Nota>> notasPorDia) {
        int dias = notasPorDia.size();
        int gananciasProducto1 = 0;
        int gananciasProducto2 = 0;
        int gananciasProducto3 = 0;
        int gananciasProducto4 = 0;
        int gananciasProducto5 = 0;

        for (List<Nota> notas : notasPorDia) {
            for (int j = 0; j < notas.size(); j++) {
                if (notas.get(j).numeroProducto == 1) {
                    gananciasProducto1 += notas.get(j).getValorTotalProducto();
                } else if (notas.get(j).numeroProducto == 2) {
                    gananciasProducto2 += notas.get(j).getValorTotalProducto();
                } else if (notas.get(j).numeroProducto == 3) {
                    gananciasProducto3 += notas.get(j).getValorTotalProducto();
                } else if (notas.get(j).numeroProducto == 4) {
                    gananciasProducto4 += notas.get(j).getValorTotalProducto();
                } else if (notas.get(j).numeroProducto == 5) {
                    gananciasProducto5 += notas.get(j).getValorTotalProducto();
                }
            }
        }

        List<Integer> gananciaPorProducto = new ArrayList<>(); // Si se crea un Arrays.asList no se puede mutar, hay que sí o sí crear una lista y agregar los valores a mano.
        gananciaPorProducto.add(gananciasProducto1);
        gananciaPorProducto.add(gananciasProducto2);
        gananciaPorProducto.add(gananciasProducto3);
        gananciaPorProducto.add(gananciasProducto4);
        gananciaPorProducto.add(gananciasProducto5);
        return gananciaPorProducto;
    }
}





