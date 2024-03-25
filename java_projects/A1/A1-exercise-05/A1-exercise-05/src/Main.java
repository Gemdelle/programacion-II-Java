import java.util.ArrayList;
import java.util.Arrays;

/*
* Ejercicio 5:
* Se desea diseñar un programa que registre libros (técnicos y novelas) para una librería y permita buscarlos, venderlos y verificar su stock.

* Las novelas se clasifican como de ciencia ficción, romance, misterio, juveniles y policiales.
* Los libros técnicos se clasifican como de ingeniería, ciencias naturales o ciencias sociales.
* Cada libro tiene un título, uno o más autores, una editorial, un año de edición y formato (tapas duras o edición económica).
* Los libros tienen además un código ISBN y capítulos, los que tratan una o más materias (en los técnicos) o es una simple división en las novelas.

* La librería obtiene los libros por medio de proveedores que representan a una o más editoriales. De cada libro se tiene un stock (que puede ser cero).
* Al venderse un libro, el stock se actualiza. Si un cliente requiere un libro cuyo stock es cero, se puede realizar un encargo por parte del cliente.
* Esto significa que se pide el libro a un proveedor de la editorial del libro.
* */
public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca(new ArrayList<>());
        Libro libroCienciaFiccion1 = new Libro("Novela", "Ciencia Ficción", "El Juego de Ender", Arrays.asList("Orson Scott Card"), "Penguin Random House", 2000, "Tapas duras", "9788497599445", 10);
        Libro libroCienciaFiccion2 = new Libro("Novela", "Ciencia Ficción", "El Juego de Ender", Arrays.asList("Orson Scott Card"), "HarperCollins", 2000, "Tapas duras", "9788497599446", 10);
        Libro libroCienciaFiccion3 = new Libro("Novela", "Ciencia Ficción", "El Juego de Ender", Arrays.asList("Orson Scott Card"), "Simon & Schuster", 2000, "Audiolibro", "9788497599447", 10);

        Libro libroRomance = new Libro("Novela", "Romance", "Orgullo y Prejuicio", Arrays.asList("Jane Austen"), "Penguin Random House", 1813, "Digital", "9788497599448", 24);

        Libro libroMisterio = new Libro("Novela", "Misterio", "El Código Da Vinci", Arrays.asList("Dan Brown"), "HarperCollins", 2003, "Impreso", "9788497599449", 105);

        Libro libroJuvenil = new Libro("Novela", "Juvenil", "Harry Potter y la Piedra Filosofal", Arrays.asList("J.K. Rowling"), "Simon & Schuster", 1997, "Impreso", "9788497599450", 17);

        Libro libroPolicial = new Libro("Novela", "Policial", "El Silencio de los Corderos", Arrays.asList("Thomas Harris"), "Penguin Random House", 1988, "Digital", "9788497599451", 20);

        Libro libroIngenieria1 = new Libro("Técnico", "Ingeniería", "Introducción a la Ingeniería", Arrays.asList("John Doe"), "McGraw-Hill", 2020, "Tapas duras", "9788497599445", 10);
        Libro libroIngenieria2 = new Libro("Técnico", "Ingeniería", "Introducción a la Ingeniería", Arrays.asList("John Doe"), "Pearson", 2015, "Edición económica", "9788497599446", 12);
        Libro libroCienciasNaturales = new Libro("Técnico", "Ciencias Naturales", "Biología Celular", Arrays.asList("Jane Smith", "Alan Johnson"), "Pearson", 2018, "Edición económica", "9788497599447", 15);
        Libro libroCienciasSociales = new Libro("Técnico", "Ciencias Sociales", "Economía Internacional", Arrays.asList("Emily Brown"), "Oxford University Press", 2019, "Tapas duras", "9788497599448", 20);

        biblioteca.agregarLibro(libroCienciaFiccion1);
        biblioteca.agregarLibro(libroCienciaFiccion1);
        biblioteca.agregarLibro(libroCienciaFiccion2);
        biblioteca.agregarLibro(libroCienciaFiccion3);
        biblioteca.agregarLibro(libroRomance);
        biblioteca.agregarLibro(libroMisterio);
        biblioteca.agregarLibro(libroJuvenil);
        biblioteca.agregarLibro(libroPolicial);
        biblioteca.agregarLibro(libroIngenieria1);
        biblioteca.agregarLibro(libroIngenieria2);
        biblioteca.agregarLibro(libroCienciasNaturales);
        biblioteca.agregarLibro(libroCienciasSociales);
    }
}
