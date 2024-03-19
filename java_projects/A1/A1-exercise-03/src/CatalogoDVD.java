import java.util.List;
import java.util.Objects;

public class CatalogoDVD {
//    01. ATTRIBUTES
    private List<DVD> listaDVDs;

//    02. CONSTRUCTOR

    public CatalogoDVD(List<DVD> listaDVDs) {
        this.listaDVDs = listaDVDs;
    }

//    04. METHODS
    public void agregarDVD(DVD dvd){
        System.out.printf("Se ha agregado el DVD %s", dvd.getTitulo());
        listaDVDs.add(dvd);
    }
    public void eliminarDVD(String titulo){
        System.out.printf("Se ha eliminado el DVD %s", titulo);
        listaDVDs.removeIf(dvd -> dvd.getTitulo().equals(titulo));
    }

    public void modificarObtenido(String titulo, String estado) {
        for(DVD dvd : listaDVDs) {
            if(Objects.equals(dvd.getTitulo(), titulo)) {
                if(Objects.equals(estado, "no")) {
                    dvd.setObtenido(false);
                } else if (Objects.equals(estado, "si")) {
                    dvd.setObtenido(true);
                } else {
                    System.out.println("Ingrese el valor <si> o <no> en el campo obtenido.");
                }
            }
        }
    }

    public void modificarComentario(String titulo, String comentario) {
        for(DVD dvd : listaDVDs) {
            if(Objects.equals(dvd.getTitulo(),titulo)) {
                dvd.setComentario(comentario);
            }
        }
    }
}
