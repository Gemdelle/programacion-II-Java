import java.util.*;
public class CatalogoCD extends Catalogo{

    //    01. ATTRIBUTES
    private boolean elCatalogoDeCDsEstaCorriendo = true;

    // 03. METHODS
    public List<Multimedia> listarInterprete(String interprete) {
        List<Multimedia> listaInterprete = new ArrayList<>();
        for(Multimedia multimedia : listaMultimedia) {
            if(((CD) multimedia).getInterprete().equals(interprete)) {
                listaInterprete.add(multimedia);
            }
        }
        return listaInterprete;
    }

    public int cantidadTemasPorCD(String titulo) {
        int cantidad = 0;
        for(Multimedia multimedia : listaMultimedia) {
            if(multimedia.getTitulo().equals(titulo)) {
                cantidad = ((CD) multimedia).getCantidad_temas();
            }
        }
        return cantidad;
    }

    public void interfazUsuario(Scanner scanner) {
        while (elCatalogoDeCDsEstaCorriendo) {
            System.out.println("----------------------------- CATALOGO CDs -----------------------------");
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
                    CD cdInput = new CD(titulo,genero,duracion,obtenido,comentario,interprete,cantidadDeTemas);
                    agregar(cdInput);
                }
                case 2 -> {
                    System.out.println("Introduzca el título del CD a eliminar: ");
                    String titulo = scanner.next();
                    eliminar(titulo);
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
                    List<Multimedia> cds = listarTodo();
                    System.out.println("Listado de todos los CDs por título");
                    for (Multimedia cd : cds) {
                        System.out.println(cd.getTitulo());
                    }
                    System.out.println("\n");
                }
                case 6 -> {
                    List<Multimedia> cdsObtenidos = listarObtenidos();
                    System.out.println("Listado de CDs obtenidos");
                    for(Multimedia cd : cdsObtenidos) {
                        System.out.println(cd.getTitulo());
                    }
                }
                case 7 -> {
                    System.out.println("Introduzca el tiempo de los CD a listar: ");
                    int tiempo = scanner.nextInt();
                    List<Multimedia> cdsMenoresATiempo = listarTiempoMenor(tiempo);
                    for(Multimedia cd : cdsMenoresATiempo) {
                        System.out.println(cd);
                    }
                }
                case 8 -> {
                    System.out.println("Listado alfabético de CDs");
                    List<Multimedia> cdsOrdenadosAlfabeticamente = listarAlfabetico();
                    for (Multimedia cd : cdsOrdenadosAlfabeticamente) {
                        System.out.println(cd.getTitulo());
                    }
                    System.out.println("\n");
                }
                case 9 -> {
                    int cantidadCDs = contarTodo();
                    System.out.printf("Cantidad total de CDs: %d\n", cantidadCDs);
                }
                case 10 -> {
                    int cantidadCDsObtenidos = contarObtenidos();
                    System.out.printf("Cantidad de CDs obtenidos: %d\n", cantidadCDsObtenidos);
                }
                case 11 -> {
                    System.out.println("Introduzca el título del CD para buscar sus temas: ");
                    String titulo = scanner.next();
                    int cantidadDeTemasPorCD = cantidadTemasPorCD(titulo);
                    System.out.printf("Cantidad de temas para el CD %s: %d\n", titulo ,cantidadDeTemasPorCD);
                }
                case 12 -> {
                    System.out.println("Introduzca el intérprete de los CDs a buscar: ");
                    String interprete = scanner.next();
                    List<Multimedia> listadoDeCDsPorInterprete = listarInterprete(interprete);
                    for (Multimedia cd : listadoDeCDsPorInterprete) {
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
