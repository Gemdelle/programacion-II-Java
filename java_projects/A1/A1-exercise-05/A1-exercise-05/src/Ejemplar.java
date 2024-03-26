import java.util.List;

public class Ejemplar {
    //    01. ATTRIBUTES
    private String tipo;
    private String subtipo;
    private String titulo;
    private List<String> autor;
    private String editorial;
    private int anioEdicion;
    private String formato;
    private int capitulos;

//    02. CONSTRUCTOR

    public Ejemplar(String tipo, String subtipo, String titulo, List<String> autor, String editorial, int anioEdicion, String formato, int capitulos) {
        this.tipo = tipo;
        this.subtipo = subtipo;
        this.titulo = titulo;
        this.autor = autor;
        this.editorial = editorial;
        this.anioEdicion = anioEdicion;
        this.formato = formato;
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

    public int getCapitulos() {
        return capitulos;
    }

    public void setCapitulos(int capitulos) {
        this.capitulos = capitulos;
    }
}
