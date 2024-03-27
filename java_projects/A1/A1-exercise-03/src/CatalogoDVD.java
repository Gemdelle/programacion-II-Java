import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

/**
 * La clase CatalogoDVD implementa la logica necesaria para acceder y modificar los DVDs {@link DVD} que son de interes para el usuario.
 * @author Gemdelle
 */
public class CatalogoDVD {

    //    01. ATTRIBUTES
    final List<DVD> listaDVDs = new ArrayList<>();
    private boolean elCatalogoDeDVDsEstaCorriendo = true;

    // 03. METHODS

    /**
     * Agrega un DVD al catalogo.
     * @param dvd El DVD que se va a agregar al catalogo.
     */
    public void agregarDVD(DVD dvd) {
        listaDVDs.add(dvd);
    }


    /**
     * Elimina un DVD del catalogo basado en su titulo.
     * @param titulo El titulo del DVD que se va a eliminar del catalogo.
     */
    public void eliminarDVD(String titulo) {
        listaDVDs.removeIf(dvd -> dvd.getTitulo().equals(titulo));
    }

    /**
     * Modifica el estado obtenido de un DVD en el catalogo.
     * @param titulo El titulo del DVD que se va a modificar.
     * @param estado El estado obtenido del DVD, puede ser "si" o "no".
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
     * Modifica el DVD para cambiar el comentario.
     * @param titulo El titulo del DVD que se va a modificar.
     * @param comentario El nuevo comentario del DVD.
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
     * Lista todos los DVDs creados.
     * @return Una lista con todos los DVDs creados.
     */
    public List<DVD> listarTodosDVD() {
        return listaDVDs;
    }

    /**
     * Lista los DVDs obtenidos.
     * @return Una lista con todos los DVDs obtenidos.
     */
    public List<DVD> listarDVDObtenidos() {
        return listaDVDs.stream().filter(DVD::isObtenido).toList();
    }

    /**
     * Lista los DVDs que tengan un tiempo menor al que indica el usuario.
     * @param tiempo El tiempo máximo en minutos para filtrar los DVDs.
     * @return Una lista con todos los DVDs cuya duración sea menor al tiempo especificado por el usuario.
     */
    public List<DVD> listarDVDTiempoMenor(int tiempo) {
        return listaDVDs.stream().filter((dvd)-> dvd.getDuracion() < tiempo ).toList();
    }

    /**
     * Lista los DVDs por director.
     * @param director El nombre del director para filtrar los DVDs.
     * @return Una lista con todos los DVDs dirigidos por el director especificado.
     */
    public List<DVD> listarDVDDirector(String director) {
        return listaDVDs.stream().filter((dvd)-> director.equals(dvd.getDirector())).toList();
    }

    /**
     * Lista los DVDs de manera alfabetica.
     * @return Una lista con todos los DVDs ordenados alfabeticamente por titulo.
     */
    public List<DVD> listarDVDAlfabetico() {
        List<DVD> sortedDVDs = new ArrayList<>(listaDVDs);
        sortedDVDs.sort((dvd1, dvd2) -> dvd1.getTitulo().compareToIgnoreCase(dvd2.getTitulo()));
        return sortedDVDs;
    }

    //    INFORMAR
    /**
     * Cuenta la cantidad de DVDs creados.
     * @return La cantidad de DVDs en el catalogo.
     */
    public int contarDVD() {
        return listaDVDs.size();
    }

    /**
     * Cuenta la cantidad de DVDs obtenidos.
     * @return El numero de DVDs obtenidos.
     */
    public int contarDVDObtenidos() {
        return listaDVDs.stream().filter(DVD::isObtenido).toList().size();
    }

    /**
     * Crea la interfaz de usuario.
     */
    public void interfazUsuario(Scanner scanner) {
        while (elCatalogoDeDVDsEstaCorriendo) {
            System.out.println("----------------------------- CATALOGO DVDs -----------------------------");
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

