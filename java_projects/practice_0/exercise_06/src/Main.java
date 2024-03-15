// EXERCISE 06
//Una biblioteca maneja libros, algunos de ellos son originales y otros son fotocopias.  No todos los libros se prestan.
//a) Crear la clase Libro
//b) Agregar atributos: título, original y prestable
//c) Agregar métodos de instancia: ‘getOriginal’, ‘getTitulo’ y ‘getPrestable’.
//d) Agregar métodos de instancia 'esOriginal' y 'sePresta' que retornen el valor booleano correspondiente.
//e) Agregar métodos de instancia ‘setTítulo’ , ‘setOriginal’ y ‘setPrestable’
//f) Crear un método main en una clase para prueba que permita obtener 2 instancias de Libro,
//uno de ellos es original y no se presta, el otro es fotocopia y se presta. Utilizar los métodos de
//instancia para realizar estas operaciones. Mostrar los libros creados.

public class Main {
    public static void main(String[] args) {
        Libro libro1 = new Libro("Medieval Stories",true,false);
        Libro libro2 = new Libro("Bridyam Beads Patterns",false,true);

        libro1.printData();
        libro2.printData();
    }
}
