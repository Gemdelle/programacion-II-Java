/**
 * La clase DVD implementa la logica necesaria para crear DVDs.
 * @author Gemdelle
 */
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
    /**
     * Obtiene el titulo del DVD.
     * @return El titulo del DVD.
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
     * Obtiene el genero del DVD.
     * @return El genero del DVD.
     */

    public String getGenero() {
        return genero;
    }

    /**
     * Establece el genero del DVD.
     * @param genero El nuevo genero del DVD.
     */

    public void setGenero(String genero) {
        this.genero = genero;
    }

    /**
     * Obtiene la duracion del DVD en minutos.
     * @return La duracion del DVD en minutos.
     */

    public int getDuracion() {
        return duracion;
    }

    /**
     * Establece la duracion del DVD en minutos.
     * @param duracion La nueva duracion del DVD en minutos.
     */

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    /**
     * Verifica si el DVD ha sido obtenido.
     * @return true si el DVD ha sido obtenido, false de lo contrario.
     */

    public boolean isObtenido() {
        return obtenido;
    }

    /**
     * Establece el estado de obtencion del DVD.
     * @param obtenido true si el DVD ha sido obtenido, false de lo contrario.
     */

    public void setObtenido(boolean obtenido) {
        this.obtenido = obtenido;
    }

    /**
     * Obtiene el comentario asociado al DVD.
     * @return El comentario asociado al DVD.
     */

    public String getComentario() {
        return comentario;
    }

    /**
     * Establece el comentario asociado al DVD.
     * @param comentario El nuevo comentario asociado al DVD.
     */

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    /**
     * Obtiene el nombre del director del DVD.
     * @return El nombre del director del DVD.
     */

    public String getDirector() {
        return director;
    }

    /**
     * Establece el nombre del director del DVD.
     * @param director El nuevo nombre del director del DVD.
     */

    public void setDirector(String director) {
        this.director = director;
    }
}
