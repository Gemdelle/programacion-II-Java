import java.util.List;
import java.util.Objects;
import java.util.Scanner;

/*
 * La clase Catalogo implementa la lógica necesaria para acceder y modificar los DVDs {@link DVD} que son de interés para el usuario.
 * @author Gemdelle
 */

public class Catalogo {

    //    01. ATTRIBUTES
    private final List<DVD> listaDVDs;

    //    02. CONSTRUCTOR
    public Catalogo(List<DVD> listaDVDs) {
        this.listaDVDs = listaDVDs;
    }

    // 03. METHODS
    /*
     * @param dvd el dvd a agregar al catálogo
     */

//    FUNCIÓN PARA IMPRIMIR LA INFORMACIÓN DE LA CLASE POR DEFAULT SIN GETTERS + PRINT


    public void agregarDVD() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduzca el título: ");
        String titulo = scanner.next();
        System.out.println("Introduzca el género: ");
        String genero = scanner.next();
        System.out.println("Introduzca la duración: ");
        int duracion = scanner.nextInt();
        System.out.println("Introduzca el estado de obtención [true/false]: ");
        Boolean obtenido = scanner.nextBoolean();
        System.out.println("Introduzca comentario: ");
        String comentario = scanner.next();
        System.out.println("Introduzca el director: ");
        String director = scanner.next();
        DVD dvdInput = new DVD(titulo,genero,duracion,obtenido,comentario,director);
        listaDVDs.add(dvdInput);
        scanner.close();
    }

    public void eliminarDVD() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduzca el título del DVD a eliminar: ");
        String titulo = scanner.next();
        listaDVDs.removeIf(dvd -> dvd.getTitulo().equals(titulo));
        scanner.close();
    }

    public void modificarObtenido() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduzca el título del DVD a modificar estado de obtención: ");
        String titulo = scanner.next();
        for (DVD dvd : listaDVDs) {
            if (dvd.getTitulo().equals(titulo)) {
                if (Objects.equals(estado, "no")) {
                    dvd.setObtenido(false);
                } else if (Objects.equals(estado, "si")) {
                    dvd.setObtenido(true);
                }
            }
        }
        scanner.close();
    }

    public void modificarComentario(String titulo, String comentario) {
        System.out.printf("Modificar comentario de %s\n", titulo);
        for (DVD dvd : listaDVDs) {
            if (dvd.getTitulo().equals(titulo)) {
                dvd.setComentario(comentario);
            }
        }
    }

    //    LISTADO
    public void listarTodosDVD() {
        System.out.println("Listado de todos los DVDs por título");
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
        System.out.printf("Cantidad total de DVDs: %d\n", listaDVDs.size());
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

    public void interfazUsuario() {
        System.out.println("----------------------------- CATÁLOGO DVDs -----------------------------");
        System.out.println("ACCIONES\n[1] Agregar DVD\n[2] Eliminar DVD\n[3] Modificar estado obtenido\n[4] Modificar un comentario\n[5] Listar todos los DVDs\n[6] Listar los DVDs obtenidos\n[7] Listar los DVDs menores a una determinada duración\n[8] Listar DVDs por director\n[9] Listar DVDs de manera alfabética\n[10] Contar todos los DVDs\n[11] Contar DVDs obtenidos\n¿Qué acción desea realizar?: ");
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        switch (input) {
            case 1:
                agregarDVD();
                break;
//            case 2:
//                eliminarDVD();
//                break;
//            case 3:
//                modificarObtenido();
//                break;
//            case 4:
//                modificarComentario();
//                break;
//            case 5:
//                listarTodosDVD();
//                break;
//            case 6:
//                listarDVDObtenidos();
//                break;
//            case 7:
//                listarDVDTiempoMenor();
//                break;
//            case 8:
//                listarDVDDirector();
//                break;
//            case 9:
//                listarDVDAlfabetico();
//                break;
//            case 10:
//                contarDVD();
//            default:
//                contarDVDObtenidos();
        }
    }
}

/**
 * @return
 */
//    public String toString() {
//        return this.dvd.titulo;
//    }
//}

