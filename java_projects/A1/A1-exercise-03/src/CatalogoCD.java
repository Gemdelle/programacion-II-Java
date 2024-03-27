import java.util.*;

public class CatalogoCD {


    //    01. ATTRIBUTES
    final List<CD> listaCDs = new ArrayList<>();
    private boolean elCatalogoDeCDsEstaCorriendo = true;

    // 03. METHODS

    /**
     * Este método agrega CDs al catálogo.
     * @param cd para leer el input del usuario.
     */
    public void agregarCD(CD cd) {
        listaCDs.add(cd);
    }

    /**
     * Este método elimina CDs del catálogo.
     * @param titulo para leer el input del usuario.
     */
    public void eliminarCD(String titulo) {
        listaCDs.removeIf(cd -> cd.getTitulo().equals(titulo));
    }

    /**
     * Este método modifica el CD para indicar si está o no obtenido.
     * @param titulo para leer el input del usuario.
     * @param estado para leer el input del usuario.
     */
    public void modificarObtenido(String titulo, String estado) {
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

    /**
     * Este método modifica el CD para cambiar el comentario.
     * @param titulo para leer el input del usuario.
     * @param comentario para leer el input del usuario.
     */
    public void modificarComentario(String titulo, String comentario) {
        for (CD cd : listaCDs) {
            if (cd.getTitulo().equals(titulo)) {
                cd.setComentario(comentario);
            }
        }
    }

    //    LISTADO
    /**
     * Este método lista todos los CDs creados.
     * @return {@link List<CD>} con todos los CDs creados.
     */
    public List<CD> listarTodosCD() {
        return listaCDs;
    }

    /**
     * Este método lista los CDs obtenidos.
     * @return {@link List<CD>} con todos los CDs obtenidos.
     */
    public List<CD> listarCDsObtenidos() {
        return listaCDs.stream().filter(CD::isObtenido).toList();
    }

    /**
     * Este método lista los CDs que tengan un tiempo menor al que indica el usuario.
     * @param tiempo para filtrar los CDs en base al input del usuario.
     * @return {@link List<CD>} con todos los CDs obtenidos.
     */
    public List<CD> listarCDTiempoMenor(int tiempo) {
        return listaCDs.stream().filter((cd)-> cd.getDuracion() < tiempo ).toList();
    }

    /**
     * Este método lista los CDs de en orden alfabético.
     */
    public List<CD> listarCDsAlfabetico() {
        List<CD> sortedCDs = new ArrayList<>(listaCDs);
        sortedCDs.sort((cd1, cd2) -> cd1.getTitulo().compareToIgnoreCase(cd2.getTitulo()));
        return sortedCDs;
    }

    //    INFORMAR
    /**
     * Este método cuenta la cantidad de CDs creados.
     */
    public int contarCDs() {
        return listaCDs.size();
    }
    /**
     * Este método lista los CDs obtenidos.
     *
     * @return
     */
    public int contarCDsObtenidos() {
        return listaCDs.stream().filter(CD::isObtenido).toList().size();
    }

    /**
     * Este método devuelve la cantidad CDs que existen para ese intérprete.
     * @param interprete para filtrar los CDs en base al input del usuario.
     * @return {@link List<CD>} con todos los CDs obtenidos para ese intérprete.
     */
    public List<CD> listarCDPorInterprete(String interprete) {
        return listaCDs.stream().filter((cd)-> cd.getInterprete().equals(interprete)).toList();
    }

    /**
     * Este método devuelve la cantidad de temas que contiene un CD buscado por título.
     * @param titulo para filtrar los CDs en base al input del usuario.
     * @return {@link int} la cantidad de temas que contiene el CD buscado por título.
     */
    public int cantidadDeTemasPorCD(String titulo) {
        Optional<CD> cdPorTitulo = listaCDs.stream()
                .filter(cd -> cd.getTitulo().equals(titulo))
                .findFirst();

        if (cdPorTitulo.isPresent()) {
            return cdPorTitulo.get().getCantidad_temas();
        } else {
            return 0;
        }
    }

    /**
     * Este método crea la interfaz de usuario.
     */
    public void interfazUsuario(Scanner scanner) {
        while (elCatalogoDeCDsEstaCorriendo) {
            System.out.println("----------------------------- CATÁLOGO CDs -----------------------------");
            System.out.println("ACCIONES\n[1] Agregar CD\n[2] Eliminar CD\n[3] Modificar estado obtenido\n[4] Modificar un comentario\n[5] Listar todos los CDs\n[6] Listar los CDs obtenidos\n[7] Listar los CDs menores a una determinada duración\n[8] Listar CDs de manera alfabética\n[9] Contar todos los CDs\n[10] Contar CDs obtenidos\n[11] Contar cantidad de temas por CD\n[12] Listar CDs por interprete\n[13] Salir\n¿Qué acción desea realizar?: ");
            int input = scanner.nextInt();
            switch (input) {
                case 1 -> {
                    System.out.println("Introduzca el título: ");
                    String titulo = scanner.next();
                    System.out.println("Introduzca el intérprete: ");
                    String interprete = scanner.next();
                    System.out.println("Introduzca cantidad de temas: ");
                    int cantidadDeTemas = scanner.nextInt();
                    System.out.println("Introduzca el género: ");
                    String genero = scanner.nextLine();
                    scanner.nextLine();
                    System.out.println("Introduzca la duración: ");
                    int duracion = scanner.nextInt();
                    System.out.println("Introduzca el estado de obtención [true/false]: ");
                    boolean obtenido = scanner.nextBoolean();
                    System.out.println("Introduzca comentario: ");
                    String comentario = scanner.next();
                    CD cdInput = new CD(titulo,interprete, cantidadDeTemas, duracion, obtenido, comentario, genero);
                    agregarCD(cdInput);
                }
                case 2 -> {
                    System.out.println("Introduzca el título del CD a eliminar: ");
                    String titulo = scanner.next();
                    eliminarCD(titulo);
                }
                case 3 -> {
                    System.out.println("Introduzca el título del CD a modificar estado de obtención: ");
                    String titulo = scanner.next();
                    System.out.println("Introduzca el nuevo estado de obtención [si/no]: ");
                    String estado = scanner.next();
                    modificarObtenido(titulo,estado);
                }
                case 4 -> {
                    System.out.println("Introduzca el título del CD a modificar comentario: ");
                    String titulo = scanner.next();
                    System.out.println("Introduzca el comentario del CD a modificar: ");
                    String comentario = scanner.next();
                    modificarComentario(titulo,comentario);
                }
                case 5 -> {
                    List<CD> cds = listarTodosCD();
                    System.out.println("Listado de todos los CDs por título");
                    for (CD cd : cds) {
                        System.out.println(cd.getTitulo());
                    }
                    System.out.println("\n");
                }
                case 6 -> {
                    List<CD> cdsObtenidos = listarCDsObtenidos();
                    System.out.println("Listado de CDs obtenidos");
                    for(CD cd : cdsObtenidos) {
                        System.out.println(cd.getTitulo());
                    }
                }
                case 7 -> {
                    System.out.println("Introduzca el tiempo de los CD a listar: ");
                    int tiempo = scanner.nextInt();
                    List<CD> cdsMenoresATiempo = listarCDTiempoMenor(tiempo);
                    for(CD cd : cdsMenoresATiempo) {
                        System.out.println(cd);
                    }
                }
                case 8 -> {
                    System.out.println("Listado alfabético de CDs");
                    List<CD> cdsOrdenadosAlfabeticamente = listarCDsAlfabetico();
                    for (CD cd : cdsOrdenadosAlfabeticamente) {
                        System.out.println(cd.getTitulo());
                    }
                    System.out.println("\n");
                }
                case 9 -> {
                    int cantidadCDs = contarCDs();
                    System.out.printf("Cantidad total de CDs: %d\n", cantidadCDs);
                }
                case 10 -> {
                    int cantidadCDsObtenidos = contarCDsObtenidos();
                    System.out.printf("Cantidad de CDs obtenidos: %d\n", cantidadCDsObtenidos);
                }
                case 11 -> {
                    System.out.println("Introduzca el título del CD para buscar sus temas: ");
                    String titulo = scanner.next();
                    int cantidadDeTemasPorCD = cantidadDeTemasPorCD(titulo);
                    System.out.printf("Cantidad de temas para el CD %s: %d\n", titulo ,cantidadDeTemasPorCD);
                }
                case 12 -> {
                    System.out.println("Introduzca el intérprete de los CDs a buscar: ");
                    String interprete = scanner.next();
                    List<CD> listadoDeCDsPorInterprete = listarCDPorInterprete(interprete);
                    for (CD cd : listadoDeCDsPorInterprete) {
                        System.out.println(cd.getTitulo());
                    }
                    System.out.println("\n");
                }
                case 13 -> {
                    elCatalogoDeCDsEstaCorriendo = false;
                }
            }
        }
    }
}
