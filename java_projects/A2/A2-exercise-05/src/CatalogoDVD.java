import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CatalogoDVD extends Catalogo {

    //    01. ATTRIBUTES
    private boolean elCatalogoDeDVDsEstaCorriendo = true;

    // 03. METHODS
    public List<Multimedia> listarDirector(String director) {

        List<Multimedia> listaDirector = new ArrayList<>();
        for (Multimedia multimedia : listaMultimedia) {
            if (((DVD) multimedia).getDirector().equals(director)) {
                listaDirector.add(multimedia);
            }
        }
        return listaDirector;
    }

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
                    DVD dvdInput = new DVD(titulo, genero, duracion, obtenido, comentario, director);
                    agregar(dvdInput);
                }
                case 2 -> {
                    System.out.println("Introduzca el título del DVD a eliminar: ");
                    String titulo = scanner.next();
                    eliminar(titulo);
                }
                case 3 -> {
                    System.out.println("Introduzca el título del DVD a modificar estado de obtención: ");
                    String titulo = scanner.next();
                    System.out.println("Introduzca el nuevo estado de obtención [si/no]: ");
                    String estado = scanner.next();
                    modificarObtenido(titulo, estado);
                }
                case 4 -> {
                    System.out.println("Introduzca el título del DVD a modificar comentario: ");
                    String titulo = scanner.next();
                    System.out.println("Introduzca el comentario del DVD a modificar: ");
                    String comentario = scanner.next();
                    modificarComentario(titulo, comentario);
                }
                case 5 -> {
                    List<Multimedia> dvds = listarTodo();
                    System.out.println("Listado de todos los DVDs por título");
                    for (Multimedia dvd : dvds) {
                        System.out.println(dvd.getTitulo());
                    }
                    System.out.println("\n");
                }
                case 6 -> {
                    List<Multimedia> dvdsObtenidos = listarObtenidos();
                    System.out.println("Listado de DVDs obtenidos");
                    for (Multimedia dvd : dvdsObtenidos) {
                        System.out.println(dvd.getTitulo());
                    }
                }
                case 7 -> {
                    System.out.println("Introduzca el tiempo de los DVD a listar: ");
                    int tiempo = scanner.nextInt();
                    List<Multimedia> dvdsMenoresATiempo = listarTiempoMenor(tiempo);
                    for (Multimedia dvd : dvdsMenoresATiempo) {
                        System.out.println(dvd);
                    }
                }
                case 8 -> {
                    System.out.println("Introduzca el director de los DVD a listar: ");
                    String director = scanner.next();
                    List<Multimedia> dvdsDeDirector = listarDirector(director);
                    for (Multimedia dvd : dvdsDeDirector) {
                        if (((DVD) dvd).getDirector().equals(director)) {
                            System.out.println(dvd.getTitulo());
                        }
                    }
                    System.out.println("\n");
                }
                case 9 -> {
                    System.out.println("Listado alfabético de DVDs");
                    List<Multimedia> dvdsOrdenadosAlfabeticamente = listarAlfabetico();
                    for (Multimedia dvd : dvdsOrdenadosAlfabeticamente) {
                        System.out.println(dvd.getTitulo());
                    }
                    System.out.println("\n");
                }
                case 10 -> {
                    int cantidadDVDs = contarTodo();
                    System.out.printf("Cantidad total de DVDs: %d\n", cantidadDVDs);
                }
                case 11 -> {
                    int cantidadDVDsObtenidos = contarObtenidos();
                    System.out.printf("Cantidad de DVDs obtenidos: %d\n", cantidadDVDsObtenidos);
                }
                case 12 ->
                    elCatalogoDeDVDsEstaCorriendo = false;
            }
        }
    }
}

