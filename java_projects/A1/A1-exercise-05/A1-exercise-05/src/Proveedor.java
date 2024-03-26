import java.util.ArrayList;
import java.util.List;

public class Proveedor {
//    01. ATTRIBUTES
    private final List<String> editoriales;

//    02. CONSTRUCTOR
    public Proveedor(List<String> editoriales) {
        this.editoriales = editoriales;
    }

//    03. METHODS

    public void agregarEditorial(String editorial) {
        if(!editoriales.contains(editorial)) {
            editoriales.add(editorial);
        }
    }

    public Boolean tieneEditorial(String editorial) {
        return editoriales.contains(editorial);
    }
    public List<Libro> reponerStock(Ejemplar ejemplar) {
        List<Libro> librosAReponer = new ArrayList<>();
        for(int i=0;i<19;i++){
            Libro libro = new Libro(ejemplar.getTipo(), ejemplar.getSubtipo(), ejemplar.getTitulo(), ejemplar.getAutor(), ejemplar.getEditorial(), ejemplar.getAnioEdicion(), ejemplar.getFormato(), ejemplar.getCapitulos());
            librosAReponer.add(libro);
        }
        return librosAReponer;
    }
}
