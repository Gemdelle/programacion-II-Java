import java.util.ArrayList;
import java.util.Scanner;

import static java.util.Arrays.asList;

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
    private static boolean estaCorriendo = true;
    public static void main(String[] args) {

//       01. Crear proveedores
        Proveedor proveedor1 = new Proveedor(asList("HarperCollins", "Simon & Schuster", "McGraw-Hill", "Pearson"));
        Proveedor proveedor2 = new Proveedor(asList("Oxford University Press", "Cambridge University Press", "Macmillan Publishers", "Hachette Livre", "Springer Nature"));
        Proveedor proveedor3 = new Proveedor(asList("Wiley", "Penguin Random House", "Elsevier", "Bloomsbury Publishing", "Cengage Learning"));

//        02. Crear ejemplares de libros
        Ejemplar libroCienciaFiccion = new Ejemplar("Novela", "Ciencia Ficción", "El Juego de Ender", asList("Orson Scott Card"), "Penguin Random House", 2000, "Tapas duras", 10);

        Ejemplar libroRomance = new Ejemplar("Novela", "Romance", "Orgullo y Prejuicio", asList("Jane Austen"), "Penguin Random House", 1813, "Digital", 24);

        Ejemplar libroMisterio = new Ejemplar("Novela", "Misterio", "El Código Da Vinci", asList("Dan Brown"), "HarperCollins", 2003, "Impreso", 105);

        Ejemplar libroJuvenil = new Ejemplar("Novela", "Juvenil", "Harry Potter y la Piedra Filosofal", asList("J.K. Rowling"), "Simon & Schuster", 1997, "Impreso", 17);

        Ejemplar libroPolicial = new Ejemplar("Novela", "Policial", "El Silencio de los Corderos", asList("Thomas Harris"), "Hachette Livre", 1988, "Digital", 20);

        Ejemplar libroIngenieria = new Ejemplar("Técnico", "Ingeniería", "Introducción a la Ingeniería", asList("John Doe"), "McGraw-Hill", 2020, "Tapas duras", 10);
        Ejemplar libroCienciasNaturales = new Ejemplar("Técnico", "Ciencias Naturales", "Biología Celular", asList("Jane Smith", "Alan Johnson"), "Pearson", 2018, "Edición económica", 15);
        Ejemplar libroCienciasSociales = new Ejemplar("Técnico", "Ciencias Sociales", "Economía Internacional", asList("Emily Brown"), "Oxford University Press", 2019, "Tapas duras", 20);

//        03. Crear biblioteca
        Biblioteca biblioteca = new Biblioteca(asList(libroIngenieria,libroJuvenil,libroPolicial,libroMisterio, libroCienciaFiccion,libroCienciasSociales,libroMisterio,libroRomance,libroCienciasNaturales), asList(proveedor1,proveedor2,proveedor3), new ArrayList<>());

//        04. Crear libros
        Libro libroCienciaFiccion1 = new Libro("Novela", "Ciencia Ficción", "El Juego de Ender", asList("Orson Scott Card"), "Penguin Random House", 2000, "Tapas duras", 10);
        Libro libroCienciaFiccion2 = new Libro("Novela", "Ciencia Ficción", "El Juego de Ender", asList("Orson Scott Card"), "HarperCollins", 2000, "Tapas duras", 10);
        Libro libroCienciaFiccion3 = new Libro("Novela", "Ciencia Ficción", "El Juego de Ender", asList("Orson Scott Card"), "Simon & Schuster", 2000, "Audiolibro", 10);

        Libro libroRomance1 = new Libro("Novela", "Romance", "Orgullo y Prejuicio", asList("Jane Austen"), "Penguin Random House", 1813, "Digital", 24);

        Libro libroMisterio1 = new Libro("Novela", "Misterio", "El Código Da Vinci", asList("Dan Brown"), "HarperCollins", 2003, "Impreso", 105);

        Libro libroJuvenil1 = new Libro("Novela", "Juvenil", "Harry Potter y la Piedra Filosofal", asList("J.K. Rowling"), "Simon & Schuster", 1997, "Impreso", 17);

        Libro libroPolicial1 = new Libro("Novela", "Policial", "El Silencio de los Corderos", asList("Thomas Harris"), "Hachette Livre", 1988, "Digital", 20);

        Libro libroIngenieria1 = new Libro("Técnico", "Ingeniería", "Introducción a la Ingeniería", asList("John Doe"), "McGraw-Hill", 2020, "Tapas duras", 10);
        Libro libroCienciasNaturales1 = new Libro("Técnico", "Ciencias Naturales", "Biología Celular", asList("Jane Smith", "Alan Johnson"), "Pearson", 2018, "Edición económica", 15);
        Libro libroCienciasSociales1 = new Libro("Técnico", "Ciencias Sociales", "Economía Internacional", asList("Emily Brown"), "Oxford University Press", 2019, "Tapas duras", 20);

//        05. Agregar libros
        biblioteca.agregarLibro(libroCienciaFiccion1); // este libro va a estar 3 veces, tiene el mismo título y diferente ISBN.
        biblioteca.agregarLibro(libroCienciaFiccion2);
        biblioteca.agregarLibro(libroCienciaFiccion3);
        biblioteca.agregarLibro(libroRomance1);
        biblioteca.agregarLibro(libroMisterio1);
        biblioteca.agregarLibro(libroJuvenil1);
        biblioteca.agregarLibro(libroPolicial1);
        biblioteca.agregarLibro(libroIngenieria1);
        biblioteca.agregarLibro(libroCienciasNaturales1);
        biblioteca.agregarLibro(libroCienciasSociales1);

//        06. Programa
        Scanner scanner = new Scanner(System.in);
        while(estaCorriendo) {

            System.out.println("\nBienvenido a la Biblioteca\n\nACCIONES\nComprar libro [C]\nListar libros [L]\nSalir [E]\nQué acción desea realizar?: ");

            String accion = scanner.next().toUpperCase();
            scanner.nextLine();
            switch (accion){
                case "C":
                    biblioteca.comprarLibro(scanner);
                    break;
                case "L":
                    biblioteca.listarLibros();
                    break;
                case "E":
                    System.out.println("Gracias por visitar la biblioteca.");
                    estaCorriendo = false;
                    scanner.close();
            }
        }
    }
}
