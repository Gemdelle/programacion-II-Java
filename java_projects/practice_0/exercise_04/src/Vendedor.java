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
    public List<Nota>[] generarNotasPorVendedor() {
        int dias = 29;
        List<Nota>[] diasMes = new ArrayList[dias]; // crear array de listas con 30 lugares


        Random random = new Random(); // nextInt(5) -> va a devolver 5 posiciones, pero le suma 1 al resultado para que el 0 sea 1.
        int cantidadNotas = 0;
        // CREAR VARIABLE PARA QUE EL PRODUCTO SEA RANDOM ENTRE 1 Y 5

        int ganancia = random.nextInt(3000) + 500; // 500 - 3500

        for (int i = 0; i < dias; i++)
        { // para cada día del mes
            cantidadNotas = random.nextInt(5) + 1; // cambiar la cantidad de notas por día
            List<Nota> notasPorDia = new ArrayList<>();
            for (int j = 0; j < cantidadNotas; j++)
            {
                Nota nota = new Nota(numeroVendedor, j, ganancia);
                notasPorDia.add(nota); // una lista con las notas que hay por día
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





