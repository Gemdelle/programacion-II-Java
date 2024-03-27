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
    public List<Nota>[] generarNotasPorVendedorPorMes() {
        int dias = 30;
        List<Nota>[] diasMes = new ArrayList[dias]; // crear array de listas con 30 lugares, del 0-29


        Random random = new Random(); //
        int cantidadNotas = 0;
        // CREAR VARIABLE PARA QUE EL PRODUCTO SEA RANDOM ENTRE 1 Y 5

        int ganancia = random.nextInt(3000) + 500; // 500 - 3500

        for (int i = 0; i < dias; i++)
        { // para cada día del mes

            // VARIABLES PARA CREAR LAS NOTAS DE VENDEDOR POR DÍA
            cantidadNotas = random.nextInt(5) + 1; // cambiar la cantidad de notas por día. nextInt(5) -> va a devolver 5 posiciones, pero le suma 1 al resultado para que el 0 sea 1.
            List<Integer> numeroProductos =  new ArrayList<>(); // Lista que va a guardar los números 1-5, que son los números de producto posibles.
            numeroProductos.addAll(Arrays.asList(1, 2, 3, 4, 5)); // Agregar los números 1-5 a la lista.
            for(int c = 0;c < cantidadNotas;c++) {
                int randomIndex = random.nextInt(numeroProductos.size()); // Obtener un índice aleatorio dentro del rango de la lista.
                numeroProductos.remove(randomIndex); // Eliminar el elemento en el índice aleatorio.
            } // Al terminar el for, va a quedar una lista con productos random que se corresponde con la CANTIDAD de notas generadas también de manera random para ese día.
            List<Nota> notasPorDia = new ArrayList<>(); // Lista que va a guardar las notas de cada día

            for (int j = 0; j < cantidadNotas; j++)
            {
                int numeroDeProducto = numeroProductos.get(random.nextInt(numeroProductos.size()));
                Nota nota = new Nota(numeroVendedor, numeroDeProducto, ganancia);
                notasPorDia.add(nota); // una lista con las notas que hay por día
                numeroProductos.remove(numeroDeProducto);
            }
            diasMes[i] = notasPorDia; // array de arrays
        }
        return diasMes;
    }

    //    public determinarNumeroProducto(int cantidadNotas) {
//
//    }
//
    public void impresion(List<Nota>[] diasMes) {
        for (int i = 0; i < diasMes.length-1; i++) {
            List<Nota> notasDia = diasMes[i];
            System.out.println("Día " + (i + 1) + ":");
            for (Nota nota : notasDia) {
                System.out.println(nota);
            }
        }
    }
}





