public class DVD extends Multimedia{
    //    01. ATTRIBUTES
    private String director;

    //    02. CONSTRUCTOR
    public DVD(String titulo, String genero, int duracion, boolean obtenido, String comentario, String director) {
        super(titulo, genero, duracion, obtenido, comentario);
        this.director = director;
    }

    //    03. SETTERS & GETTERS
    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }
}
