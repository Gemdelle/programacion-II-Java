public class DVD {
//    01. ATTRIBUTES
    private String titulo;
    private String genero;
    private int duracion;
    private boolean obtenido;
    private String comentario;
    private String director;

//    02. CONSTRUCTOR
public DVD(String titulo, String genero, int duracion, boolean obtenido, String comentario, String director) {
    this.titulo = titulo;
    this.genero = genero;
    this.duracion = duracion;
    this.obtenido = obtenido;
    this.comentario = comentario;
    this.director = director;
}

//    03. SETTERS & GETTERS
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public boolean isObtenido() {
        return obtenido;
    }

    public void setObtenido(boolean obtenido) {
        this.obtenido = obtenido;
    }
    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }
    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

}
