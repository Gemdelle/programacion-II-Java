import java.util.List;
import java.util.Objects;
import java.util.Scanner;

/**
 * La clase Catalogo implementa la lógica necesaria para acceder y modificar los DVDs {@link DVD} que son de interés para el usuario.
 * @author Gemdelle
 */

public class Catalogo {

    //    01. ATTRIBUTES
    final List<DVD> listaDVDs;
    private boolean systemOnline = true;

    //    02. CONSTRUCTOR
    public Catalogo(List<DVD> listaDVDs) {
        this.listaDVDs = listaDVDs;
    }

    // 03. METHODS

//    FUNCIÓN PARA IMPRIMIR LA INFORMACIÓN DE LA CLASE POR DEFAULT SIN GETTERS + PRINT

    /**
     * Este método agrega DVDs al catálogo.
     * @param dvd para leer el input del usuario
     */
    public void agregarDVD(DVD dvd) {
        listaDVDs.add(dvd);
    }

    /**
     * Este método elimina DVDs del catálogo.
     * @param titulo para leer el input del usuario
     */
    public void eliminarDVD(String titulo) {
        listaDVDs.removeIf(dvd -> dvd.getTitulo().equals(titulo));
    }

    /**
     * Este método modifica el DVD para indicar si esta o no obtenido.
     * @param titulo para leer el input del usuario.
     * @param estado para leer el input del usuario.
     */
    public void modificarObtenido(String titulo, String estado) {
        for (DVD dvd : listaDVDs) {
            if (dvd.getTitulo().equals(titulo)) {
                if (Objects.equals(estado, "no")) {
                    dvd.setObtenido(false);
                } else if (Objects.equals(estado, "si")) {
                    dvd.setObtenido(true);
                }
            }
        }
    }

    /**
     * Este método modifica el DVD para cambiar el comentario.
     * @param titulo para leer el input del usuario
     * @param comentario para leer el input del usuario
     */
    public void modificarComentario(String titulo, String comentario) {
        for (DVD dvd : listaDVDs) {
            if (dvd.getTitulo().equals(titulo)) {
                dvd.setComentario(comentario);
            }
        }
    }

    //    LISTADO
    /**
     * Este método lista todos los DVDs creados
     */
    public List<DVD> listarTodosDVD() {
        return listaDVDs;
    }

    /**
     * Este método lista los DVDs obtenidos.
     */
    public void listarDVDObtenidos() {
        System.out.println("Listado de DVDs obtenidos");
        for (DVD dvd : listaDVDs) {
            if (dvd.isObtenido()) {
                System.out.println(dvd.getTitulo());
            }
        }
        System.out.println("\n");
    }

    /**
     * Este método lista los DVDs que tengan un tiempo menor al que indica el usuario.
     * @param scanner para leer el input del usuario
     */
    public void listarDVDTiempoMenor(Scanner scanner) {
        System.out.println("Introduzca el tiempo de los DVD a listar: ");
        int tiempo = scanner.nextInt();
        for (DVD dvd : listaDVDs) {
            if (dvd.getDuracion() < tiempo) {
                System.out.printf("Título: %s / Duración: %d\n", dvd.getTitulo(), dvd.getDuracion());
            }
        }
        System.out.println("\n");
    }
    /**
     * Este método lista los DVDs por director.
     * @param scanner para leer el input del usuario
     */
    public void listarDVDDirector(Scanner scanner) {
        System.out.println("Introduzca el director de los DVD a listar: ");
        String director = scanner.next();
        for (DVD dvd : listaDVDs) {
            if (Objects.equals(dvd.getDirector(), director)) {
                System.out.println(dvd.getTitulo());
            }
        }
        System.out.println("\n");
    }
    /**
     * Este método lista los DVDs de en orden alfabetico.
     */
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
    /**
     * Este método cuenta la cantidad de DVDs creados.
     */
    public void contarDVD() {
        System.out.printf("Cantidad total de DVDs: %d\n", listaDVDs.size());
    }
    /**
     * Este método lista los DVDs obtenidos.
     */
    public void contarDVDObtenidos() {
        int obtenidos = 0;
        for (DVD dvd : listaDVDs) {
            if (dvd.isObtenido()) {
                obtenidos += 1;
            }
        }
        System.out.printf("Cantidad de DVDs obtenidos: %d\n", obtenidos);
    }
    /**
     * Este método crea la interfaz de usuario.
     */
    public void interfazUsuario() {
        while (systemOnline) {
            System.out.println("----------------------------- CATÁLOGO DVDs -----------------------------");
            System.out.println("ACCIONES\n[1] Agregar DVD\n[2] Eliminar DVD\n[3] Modificar estado obtenido\n[4] Modificar un comentario\n[5] Listar todos los DVDs\n[6] Listar los DVDs obtenidos\n[7] Listar los DVDs menores a una determinada duración\n[8] Listar DVDs por director\n[9] Listar DVDs de manera alfabética\n[10] Contar todos los DVDs\n[11] Contar DVDs obtenidos\n[12] Salir\n¿Qué acción desea realizar?: ");
            Scanner scanner = new Scanner(System.in);
            int input = scanner.nextInt();
            switch (input) {
                case 1 -> {
                    System.out.println("Introduzca el título: ");
                    String titulo = scanner.next();
                    System.out.println("Introduzca el género: ");
                    String genero = scanner.nextLine();
                    scanner.nextLine();
                    System.out.println("Introduzca la duración: ");
                    int duracion = scanner.nextInt();
                    System.out.println("Introduzca el estado de obtención [true/false]: ");
                    boolean obtenido = scanner.nextBoolean();
                    System.out.println("Introduzca comentario: ");
                    String comentario = scanner.next();
                    System.out.println("Introduzca el director: ");
                    String director = scanner.next();
                    DVD dvdInput = new DVD(titulo,genero,duracion,obtenido,comentario,director);
                    agregarDVD(dvdInput);
                }
                case 2 -> {
                    System.out.println("Introduzca el título del DVD a eliminar: ");
                    String titulo = scanner.next();
                    eliminarDVD(titulo);
                }
                case 3 -> {
                    System.out.println("Introduzca el título del DVD a modificar estado de obtención: ");
                    String titulo = scanner.next();
                    System.out.println("Introduzca el nuevo estado de obtención [si/no]: ");
                    String estado = scanner.next();
                    modificarObtenido(titulo,estado);
                }
                case 4 -> {
                    System.out.println("Introduzca el título del DVD a modificar comentario: ");
                    String titulo = scanner.next();
                    System.out.println("Introduzca el comentario del DVD a modificar: ");
                    String comentario = scanner.next();
                    modificarComentario(titulo,comentario);
                }
                case 5 -> {
                    List<DVD> dvds = listarTodosDVD();
                    System.out.println("Listado de todos los DVDs por título");
                    for (DVD dvd : dvds) {
                        System.out.println(dvd.getTitulo());
                    }
                    System.out.println("\n");
                }
                case 6 -> listarDVDObtenidos();
                case 7 -> listarDVDTiempoMenor(scanner);
                case 8 -> listarDVDDirector(scanner);
                case 9 -> listarDVDAlfabetico();
                case 10 -> contarDVD();
                case 11 -> contarDVDObtenidos();
                case 12 -> {
                    scanner.close();
                    systemOnline = false;
                }
            }
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

