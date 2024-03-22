import java.util.List;
import java.util.Objects;

public class CatalogoCD {
    //    01. ATTRIBUTES
    private final List<CD> listaCDs;

//    02. CONSTRUCTOR

    public CatalogoCD(List<CD> listaCDs) {
        this.listaCDs = listaCDs;
    }

    //    04. METHODS
    public void agregarCD(CD cd) {
        listaCDs.add(cd);
    }

    public void eliminarCD(String titulo) {
        System.out.printf("Se ha eliminado el CD %s\n", titulo);
        listaCDs.removeIf(cd -> cd.getTitulo().equals(titulo));

    }

    public void modificarObtenido(String titulo, String estado) {
        System.out.printf("Modificar estado de obtención de %s\n", titulo);
        for (CD cd : listaCDs) {
            if (cd.getTitulo().equals(titulo)) {
                if (Objects.equals(estado, "no")) {
                    cd.setObtenido(false);
                } else if (Objects.equals(estado, "si")) {
                    cd.setObtenido(true);
                }
            }
        }
    }

    public void modificarComentario(String titulo, String comentario) {
        System.out.printf("Modificar comentario de %s\n", titulo);
        for (CD cd : listaCDs) {
            if (cd.getTitulo().equals(titulo)) {
                cd.setComentario(comentario);
            }
        }
    }

    //    LISTADO
    public void listarTodosCD() {
        System.out.println("Listado de todos los CDs por título");
        for (CD cd : listaCDs) {
            System.out.println(cd.getTitulo());
        }
        System.out.println("\n");
    }

    public void listarCDObtenidos() {
        System.out.println("Listado de CDs obtenidos");
        for (CD cd : listaCDs) {
            if (cd.isObtenido()) {
                System.out.println(cd.getTitulo());
            }
        }
        System.out.println("\n");
    }

    public void listarCDTiempoMenor(int tiempo) {
        System.out.printf("Listado de CDs con duración menor a %d\n", tiempo);
        for (CD cd : listaCDs) {
            if (cd.getDuracion() < tiempo) {
                System.out.printf("Título: %s / Duración: %d\n", cd.getTitulo(), cd.getDuracion());
            }
        }
        System.out.println("\n");
    }

    public void listarCDDirector(String interprete) {
        System.out.printf("Listado de CDs con director %s\n", interprete);
        for (CD cd : listaCDs) {
            if (Objects.equals(cd.getInterprete(), interprete)) {
                System.out.println(cd.getTitulo());
            }
        }
        System.out.println("\n");
    }

    public void listarCDAlfabetico() {
        System.out.println("Listado alfabético de CDs");
        // Ordenar la lista de CDs por título
        listaCDs.sort((cd1, cd2) -> cd1.getTitulo().compareToIgnoreCase(cd2.getTitulo()));
        for (CD cd : listaCDs) {
            System.out.println(cd.getTitulo());
        }
        System.out.println("\n");
    }

    //    ESPECÍFICO: LISTADO DE INTÉRPRETES
    public void listarCDPorInterprete(String interprete) {
        for(CD cd : listaCDs) {
            if(cd.getInterprete().equals(interprete)) {
                System.out.println(cd.getTitulo());
            }
        }
    }

    //    INFORMAR
    public void contarCD() {
        System.out.printf("Cantidad total de CDs: %d\n", listaCDs.size());
    }

    public void contarCDObtenidos() {
        int obtenidos = 0;
        for (CD cd : listaCDs) {
            if (cd.isObtenido()) {
                obtenidos += 1;
            }
        }
        System.out.printf("Cantidad de CDs obtenidos: %d\n", obtenidos);
    }

    //    ESPECÍFICO: CANTIDAD DE TEMAS
    public void cantidadDeTemasPorCD(String titulo) {
        for(CD cd : listaCDs) {
            if(cd.getTitulo().equals(titulo)) {
                System.out.printf("La cantidad de temas que tiene el CD %s es %d\n",titulo,cd.getCantidad_temas());
            }
        }
    }
}
