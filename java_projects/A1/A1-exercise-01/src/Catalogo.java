import java.util.Collections;
import java.util.List;
import java.util.Objects;

// POR QUÉ HAY QUE PONER BREAK PARA QUE ANDE? 29
// por qué no se puede hacer dvd.obtenido = estado 49

public class Catalogo {

    //    01. ATTRIBUTES
    private List<DVD> listaDVDs;

    //    02. CONSTRUCTOR
    public Catalogo(List<DVD> listaDVDs) {
        this.listaDVDs = listaDVDs;
    }

    // 03. METHODS
    public void agregadDVD(DVD dvd) {
        listaDVDs.add(dvd);
    }

    public void eliminarDVD(String titulo) {
        System.out.printf("Se ha eliminado el DVD %s", titulo);

//        FORMA 1
        // Iterar sobre la lista de DVDs
        for (DVD dvd : listaDVDs) {
            // Verificar si el título del DVD coincide con el título proporcionado
            if (dvd.getTitulo().equals(titulo)) {
                // Si coincide, eliminar el DVD de la lista y salir del bucle
                listaDVDs.remove(dvd);
                break; // POR QUÉ HAY QUE PONER BREAK PARA QUE ANDE?
            }

//        FORMA 2
//            listaDVDs.removeIf(dvd -> dvd.getTitulo().equals(titulo));
        }
    }

    public void modificarObtenido(String titulo, String estado) {
        System.out.printf("Modificar estado de obtención de %s\n",titulo);
        for (DVD dvd : listaDVDs) {
            if (dvd.getTitulo().equals(titulo)) {
                if (Objects.equals(estado, "no")) {
                    dvd.setObtenido(false); // por qué no se puede hacer dvd.obtenido = estado
                } else {
                    dvd.setObtenido(true);
                }

            }
        }
    }

    public void modificarComentario(String titulo, String comentario) {
        System.out.printf("Modificar comentario de obtención de %s\n",titulo);
        for (DVD dvd : listaDVDs) {
            if (dvd.getTitulo().equals(titulo)) {
                dvd.setComentario(comentario);
            }
        }
    }

    //    LISTADO
    public void listarTodosDVD() {
        System.out.println("Listado de DVDs por título");
        for (DVD dvd : listaDVDs) {
            System.out.println(dvd.getTitulo());
        }
        System.out.println("\n");
    }

    public void listarDVDObtenidos() {
        System.out.println("Listado de DVDs obtenidos");
        for (DVD dvd : listaDVDs) {
            if (dvd.isObtenido()) {
                System.out.println(dvd.getTitulo());
            }
        }
        System.out.println("\n");
    }

    public void listarDVDTiempoMenor(int tiempo) {
        System.out.printf("Listado de DVDs con duración menor a %d\n", tiempo);
        for (DVD dvd : listaDVDs) {
            if (dvd.getDuracion() < tiempo) {
                System.out.printf("Título: %s / Duración: %d\n", dvd.getTitulo(), dvd.getDuracion());
            }
        }
        System.out.println("\n");
    }

    public void listarDVDDirector(String director) {
        System.out.printf("Listado de DVDs con director %s\n", director);
        for (DVD dvd : listaDVDs) {
            if (Objects.equals(dvd.getDirector(), director)) {
                System.out.println(dvd.getTitulo());
            }
        }
        System.out.println("\n");
    }

    public void listarDVDAlfabetico() {
        System.out.println("Listado alfabético de DVDs");
        // Ordenar la lista de DVDs por título
        listaDVDs.sort((dvd1, dvd2) -> dvd1.getTitulo().compareToIgnoreCase(dvd2.getTitulo()));
        for (DVD dvd : listaDVDs) {
            System.out.println(dvd.getTitulo());
        }
        System.out.println("\n");
    }

    //    INFORMAR
    public void contarDVD() {
        System.out.printf("Cantidad total de DVDs: %d\n",listaDVDs.size());
    }

    public void contarDVDObtenidos() {
        int obtenidos = 0;
        for (DVD dvd : listaDVDs) {
            if (dvd.isObtenido()) {
                obtenidos += 1;
            }
        }
        System.out.printf("Cantidad de DVDs obtenidos: %d\n", obtenidos);
    }
}
