/**
 * La clase CD implementa la logica necesaria para crear CDs.
 * @author Gemdelle
 */
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
    /**
     * Obtiene el titulo del CD.
     * @return El titulo del CD.
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * Establece el titulo del DVD.
     * @param titulo El nuevo titulo del DVD.
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    /**
     * Obtiene el interprete del CD.
     * @return El interprete del CD.
     */
    public String getInterprete() {
        return interprete;
    }

    /**
     * Establece el interprete del CD.
     * @param interprete El nuevo interprete del CD.
     */
    public void setInterprete(String interprete) {
        this.interprete = interprete;
    }

    /**
     * Obtiene la cantidad de temas del CD.
     * @return La cantidad de temas del CD.
     */
    public int getCantidad_temas() {
        return cantidad_temas;
    }

    /**
     * Establece la cantidad de temas del CD.
     * @param cantidad_temas La nueva cantidad de temas del CD.
     */
    public void setCantidad_temas(int cantidad_temas) {
        this.cantidad_temas = cantidad_temas;
    }

    /**
     * Obtiene la duracion del CD en minutos.
     * @return La duracion del CD en minutos.
     */
    public int getDuracion() {
        return duracion;
    }

    /**
     * Establece la duracion del CD en minutos.
     * @param duracion La nueva duracion del CD en minutos.
     */
    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    /**
     * Verifica si el CD ha sido obtenido.
     * @return true si el CD ha sido obtenido, false de lo contrario.
     */
    public boolean isObtenido() {
        return obtenido;
    }

    /**
     * Establece el estado de obtencion del CD.
     * @param obtenido true si el CD ha sido obtenido, false de lo contrario.
     */
    public void setObtenido(boolean obtenido) {
        this.obtenido = obtenido;
    }

    /**
     * Obtiene el comentario asociado al CD.
     * @return El comentario asociado al CD.
     */
    public String getComentario() {
        return comentario;
    }

    /**
     * Establece el comentario asociado al CD.
     * @param comentario El nuevo comentario asociado al CD.
     */
    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    /**
     * Obtiene el genero del CD.
     * @return El genero del CD.
     */
    public String getGenero() {
        return genero;
    }

    /**
     * Establece el genero del CD.
     * @param genero El nuevo genero del CD.
     */
    public void setGenero(String genero) {
        this.genero = genero;
    }
}
