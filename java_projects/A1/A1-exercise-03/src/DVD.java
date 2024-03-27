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

    public int getDuracion() {
        return duracion;
    }

    public boolean isObtenido() {
        return obtenido;
    }

    public void setObtenido(boolean obtenido) {
        this.obtenido = obtenido;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }
    public String getDirector() {
        return director;
    }
    public String getGenero() {
        return genero;
    }

    public String getComentario() {
        return comentario;
    }
}
