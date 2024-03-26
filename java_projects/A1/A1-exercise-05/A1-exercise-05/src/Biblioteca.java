import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Biblioteca {
    //    01. ATTRIBUTES
    private final List<Ejemplar> catalogo;
    private final ArrayList<Libro> libros;
    private final List<Proveedor> proveedores;

    //    02. CONSTRUCTOR
    public Biblioteca(List<Ejemplar> catalogo, List<Proveedor> proveedores, ArrayList<Libro> libros) {
        this.catalogo = catalogo;
        this.proveedores = proveedores;
        this.libros = libros;
    }

    // 04. METHODS
    public void agregarLibro(Libro libro) {
        System.out.printf("Se ha agregado el libro %s\n", libro.getTitulo());
        libros.add(libro);

        boolean existeEditorial = false;
        for (Proveedor proveedor : proveedores) {
            if (proveedor.tieneEditorial(libro.getEditorial())) {
                existeEditorial = true;
            }
        }

        if (!existeEditorial) {
            Random random = new Random();
            int index = random.nextInt(0, 3) + 1;
            proveedores.get(index).agregarEditorial(libro.getEditorial());
        }
    }

    public void eliminarLibro(String titulo) {
        int index = 0;
        for(int i = 0;i<libros.size();i++) {
            if(libros.get(i).getTitulo().equals(titulo)) {
                index = i;
            }
        }
        libros.remove(index);
    }

    public Boolean existeLibro(String titulo) {
        boolean existe = false;
        for (Ejemplar ejemplar : catalogo) {
            if (ejemplar.getTitulo().equals(titulo)) {
                existe = true;
            }
        }
        return existe;
    }

    public void listarLibros() {
        System.out.println("\nLISTADO DE LIBROS");
        for (Libro libro : libros) {
            System.out.println(libro.getTitulo());
        }
    }

    public void comprarLibro(Scanner scanner) {
        System.out.println("Ingrese el título del libro que desea comprar: ");
        String titulo = scanner.nextLine();

        if (!existeLibro(titulo)) {
            System.out.printf("Lo sentimos, la biblioteca no trabaja el título ➤ %s", titulo);
        } else {
            int stock = 0;
            for (Libro libro : libros) {
                if (libro.getTitulo().equals(titulo)) {
                    stock += 1;
                }
            }

            if (stock > 0) {
                System.out.printf("Hay stock disponible para el libro %s ➤ %d\nHa comprado un libro \uD83D\uDCD3 \n", titulo, stock);
                eliminarLibro(titulo); // actualiza el stock
            } else {
                System.out.printf("Lo sentimos, no hay stock para el libro %s. Si desea comprar, deberá reponer.", titulo);
                System.out.println("¿Quiere reponer? [Y/N]");
                String input = scanner.next().toUpperCase();
                if (input.equals("Y")) {
                    for (Ejemplar ejemplar : catalogo) {
                        if (ejemplar.getTitulo().equals(titulo)) {
                            String editorialLibro = ejemplar.getEditorial();
                            for (Proveedor proveedor : proveedores) {
                                if (proveedor.tieneEditorial(editorialLibro)) {
                                    List<Libro> librosAReponer = proveedor.reponerStock(ejemplar);
                                    libros.addAll(librosAReponer);
                                    System.out.printf("Se han agregado 20 libros ➤ %s", titulo);
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}
