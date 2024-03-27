public class CD {
//    01. ATTRIBUTES
    private String titulo;
    private String interprete;
    private int cantidad_temas;
    private int duracion;
    private boolean obtenido;
    private String comentario;
    private String genero;

//    02. CONSTRUCTOR
public CD(String titulo, String interprete, int cantidad_temas, int duracion, boolean obtenido, String comentario, String genero) {
    this.titulo = titulo;
    this.interprete = interprete;
    this.cantidad_temas = cantidad_temas;
    this.duracion = duracion;
    this.obtenido = obtenido;
    this.comentario = comentario;
    this.genero = genero;
}

//    03. SETTERS & GETTERS
    public String getTitulo() {
        return titulo;
    }

    public String getInterprete() {
        return interprete;
    }

    public int getCantidad_temas() {
        return cantidad_temas;
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

}
