import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

/**
 * La clase Catalogo implementa la lógica necesaria para acceder y modificar los DVDs {@link DVD} que son de interés para el usuario.
 * @author Gemdelle
 */

public class CatalogoDVD {

    //    01. ATTRIBUTES
    final List<DVD> listaDVDs = new ArrayList<>();
    private boolean elCatalogoDeDVDsEstaCorriendo = true;

    // 03. METHODS

    /**
     * Este método agrega DVDs al catálogo.
     * @param dvd para leer el input del usuario.
     */
    public void agregarDVD(DVD dvd) {
        listaDVDs.add(dvd);
    }

    /**
     * Este método elimina DVDs del catálogo.
     * @param titulo para leer el input del usuario.
     */
    public void eliminarDVD(String titulo) {
        listaDVDs.removeIf(dvd -> dvd.getTitulo().equals(titulo));
    }

    /**
     * Este método modifica el DVD para indicar si está o no obtenido.
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
     * @param titulo para leer el input del usuario.
     * @param comentario para leer el input del usuario.
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
     * Este método lista todos los DVDs creados.
     * @return {@link List<DVD>} con todos los DVDs creados.
     */
    public List<DVD> listarTodosDVD() {
        return listaDVDs;
    }

    /**
     * Este método lista los DVDs obtenidos.
     * @return {@link List<DVD>} con todos los DVDs obtenidos.
     */
    public List<DVD> listarDVDObtenidos() {
        return listaDVDs.stream().filter(DVD::isObtenido).toList();
    }

    /**
     * Este método lista los DVDs que tengan un tiempo menor al que indica el usuario.
     * @param tiempo para filtrar los DVDs en base al input del usuario.
     * @return {@link List<DVD>} con todos los DVDs obtenidos.
     */
    public List<DVD> listarDVDTiempoMenor(int tiempo) {
        return listaDVDs.stream().filter((dvd)-> dvd.getDuracion() < tiempo ).toList();
    }
    /**
     * Este método lista los DVDs por director.
     * @param director filtrar los DVDs en base a ese valor.
     */
    public List<DVD> listarDVDDirector(String director) {
        return listaDVDs.stream().filter((dvd)-> director.equals(dvd.getDirector())).toList();
    }
    /**
     * Este método lista los DVDs de en orden alfabético.
     */
    public List<DVD> listarDVDAlfabetico() {
        List<DVD> sortedDVDs = new ArrayList<>(listaDVDs);
        sortedDVDs.sort((dvd1, dvd2) -> dvd1.getTitulo().compareToIgnoreCase(dvd2.getTitulo()));
        return sortedDVDs;
    }

    //    INFORMAR
    /**
     * Este método cuenta la cantidad de DVDs creados.
     */
    public int contarDVD() {
        return listaDVDs.size();
    }
    /**
     * Este método lista los DVDs obtenidos.
     *
     * @return
     */
    public int contarDVDObtenidos() {
        return listaDVDs.stream().filter(DVD::isObtenido).toList().size();
    }
    /**
     * Este método crea la interfaz de usuario.
     */
    public void interfazUsuario(Scanner scanner) {
        while (elCatalogoDeDVDsEstaCorriendo) {
            System.out.println("----------------------------- CATÁLOGO DVDs -----------------------------");
            System.out.println("ACCIONES\n[1] Agregar DVD\n[2] Eliminar DVD\n[3] Modificar estado obtenido\n[4] Modificar un comentario\n[5] Listar todos los DVDs\n[6] Listar los DVDs obtenidos\n[7] Listar los DVDs menores a una determinada duración\n[8] Listar DVDs por director\n[9] Listar DVDs de manera alfabética\n[10] Contar todos los DVDs\n[11] Contar DVDs obtenidos\n[12] Salir\n¿Qué acción desea realizar?: ");
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
                case 6 -> {
                    List<DVD> dvdsObtenidos = listarDVDObtenidos();
                    System.out.println("Listado de DVDs obtenidos");
                    for(DVD dvd : dvdsObtenidos) {
                        System.out.println(dvd.getTitulo());
                    }
                }
                case 7 -> {
                    System.out.println("Introduzca el tiempo de los DVD a listar: ");
                    int tiempo = scanner.nextInt();
                    List<DVD> dvdsMenoresATiempo = listarDVDTiempoMenor(tiempo);
                    for(DVD dvd : dvdsMenoresATiempo) {
                        System.out.println(dvd);
                    }
                }
                case 8 -> {
                    System.out.println("Introduzca el director de los DVD a listar: ");
                    String director = scanner.next();
                    List<DVD> dvdsDeDirector = listarDVDDirector(director);
                    for (DVD dvd : dvdsDeDirector) {
                        if (Objects.equals(dvd.getDirector(), director)) {
                            System.out.println(dvd.getTitulo());
                        }
                    }
                    System.out.println("\n");
                }
                case 9 -> {
                    System.out.println("Listado alfabético de DVDs");
                    List<DVD> dvdsOrdenadosAlfabeticamente = listarDVDAlfabetico();
                    for (DVD dvd : dvdsOrdenadosAlfabeticamente) {
                        System.out.println(dvd.getTitulo());
                    }
                    System.out.println("\n");
                }
                case 10 -> {
                    int cantidadDVDs = contarDVD();
                    System.out.printf("Cantidad total de DVDs: %d\n", cantidadDVDs);
                }
                case 11 -> {
                    int cantidadDVDsObtenidos = contarDVDObtenidos();
                    System.out.printf("Cantidad de DVDs obtenidos: %d\n", cantidadDVDsObtenidos);
                }
                case 12 -> {
                    elCatalogoDeDVDsEstaCorriendo = false;
                }
            }
        }
    }
}

