import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        List<List<Integer>> columnas = new ArrayList<>();
//        List<Integer> fila1 = new ArrayList<>();
//        List<Integer> fila2 = new ArrayList<>();
//
//        fila1.addAll(Arrays.asList(1,2,3,4,5,6));
//        fila2.addAll(Arrays.asList(7,8,9,10,11,12));
//        columnas.addAll(Arrays.asList(fila1));
//        columnas.addAll(Arrays.asList(fila2));
//
//        for (List<Integer> fila : columnas) {
//            for (int dato : fila) {
//                System.out.print(dato + "\t"); // Imprimir el dato seguido de un tabulador
//            }
//            System.out.println(); // Cambiar de línea después de imprimir todos los datos de la fila
//        }

        List<List<Integer>> columnas = new ArrayList<>();
        List<Integer> fila1 = new ArrayList<>();
        List<Integer> fila2 = new ArrayList<>();

        fila1.addAll(Arrays.asList(1,2,3,4,5,6));
        fila2.addAll(Arrays.asList(7,8,9,10,11,12));

        for (int i = 0; i < fila1.size(); i++) {
            List<Integer> columna = new ArrayList<>();
            columna.add(fila1.get(i));
            columna.add(fila2.get(i));
            columnas.add(columna);
        }

        for (List<Integer> columna : columnas) {
            for (int dato : columna) {
                System.out.print(dato + "\t"); // Imprimir el dato seguido de un tabulador
            }
            System.out.println(); // Cambiar de línea después de imprimir todos los datos de la columna
        }
    }
}
