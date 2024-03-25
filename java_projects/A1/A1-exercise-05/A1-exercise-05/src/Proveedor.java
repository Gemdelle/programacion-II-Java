import java.util.List;
import java.util.Scanner;

public class Proveedor {
//    01. ATTRIBUTES
    private final List<String> editoriales;

//    02. CONSTRUCTOR
    public Proveedor(List<String> stockLibros) {
        this.editoriales = stockLibros;
    }

//    03. METHODS

    public void agregarEditorial() {
        Scanner scanner = new Scanner(System.in);
        String editorial = scanner.next();
        editoriales.add(editorial);
    }
    public void reponerStock(String titulo, int cantidad, List<Libro> librosBiblioteca) {

    }
}
