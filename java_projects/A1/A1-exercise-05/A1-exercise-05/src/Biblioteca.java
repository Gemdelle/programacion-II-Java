import java.util.List;
import java.util.Scanner;

public class Biblioteca {
//    01. ATTRIBUTES
    private final List<Libro> libros;

//    02. CONSTRUCTOR
    public Biblioteca(List<Libro> libros) {
        this.libros = libros;
    }

// 04. METHODS
    public void agregarLibro(Libro libro) {
        System.out.printf("Se ha agregado el libro %s\n",libro.getTitulo());
        libros.add(libro);
    }

    public void eliminarLibro(String titulo) {
        for(Libro libro : libros) {
            if(libro.getTitulo().equals(titulo)) {
                libros.remove(libro);
            }
        }
    }

    public void comprarLibro(String titulo) {
        int stock = 0;
        for(Libro libro : libros) {
            if(libro.getTitulo().equals(titulo)) {
                stock += 1;
            }
        }

        if(stock > 0) {
            System.out.printf("Hay stock disponible para el libro %s ➤ %d",titulo,stock);
            eliminarLibro(titulo); // actualiza el stock
        } else {
            System.out.printf("Lo sentimos, no hay stock para el libro %s. Si desea comprar, deberá reponer.",titulo);
            System.out.println("Quiere comprar? [Y/N]");
            Scanner scanner = new Scanner(System.in);
            String input = scanner.next().toUpperCase();
            if(input.equals("Y")) {

            }
        }



    }
}
