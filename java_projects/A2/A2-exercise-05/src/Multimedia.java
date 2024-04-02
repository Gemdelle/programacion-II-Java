public class Multimedia {
    //    01. ATTRIBUTES
    protected String titulo;
    protected String genero;
    protected int duracion;
    protected boolean obtenido;
    protected String comentario;

//    02. CONSTRUCTOR
    public Multimedia(String titulo, String genero, int duracion, boolean obtenido, String comentario) {
        this.titulo = titulo;
        this.genero = genero;
        this.duracion = duracion;
        this.obtenido = obtenido;
        this.comentario = comentario;
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
}
