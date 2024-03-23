
//* Cada libro tiene un título, uno o más autores, una editorial, un año de edición y formato (tapas duras o edición económica).

import java.util.List;

public class Libro {
//    01. ATTRIBUTES
    private String tipo;
    private String subtipo;
    private String titulo;
    private List<String> autor;
    private String editorial;
    private int anioEdicion;
    private String formato;
    private String ISBN;
    private int capitulos;

//    02. CONSTRUCTOR

    public Libro(String tipo, String subtipo, String titulo, List<String> autor, String editorial, int anioEdicion, String formato, String ISBN, int capitulos) {
        this.tipo = tipo;
        this.subtipo = subtipo;
        this.titulo = titulo;
        this.autor = autor;
        this.editorial = editorial;
        this.anioEdicion = anioEdicion;
        this.formato = formato;
        this.ISBN = ISBN;
        this.capitulos = capitulos;
    }

//    03. SETTERS & GETTERS

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getSubtipo() {
        return subtipo;
    }

    public void setSubtipo(String subtipo) {
        this.subtipo = subtipo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public List<String> getAutor() {
        return autor;
    }

    public void setAutor(List<String> autor) {
        this.autor = autor;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public int getAnioEdicion() {
        return anioEdicion;
    }

    public void setAnioEdicion(int anioEdicion) {
        this.anioEdicion = anioEdicion;
    }

    public String getFormato() {
        return formato;
    }

    public void setFormato(String formato) {
        this.formato = formato;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public int getCapitulos() {
        return capitulos;
    }

    public void setCapitulos(int capitulos) {
        this.capitulos = capitulos;
    }
}
