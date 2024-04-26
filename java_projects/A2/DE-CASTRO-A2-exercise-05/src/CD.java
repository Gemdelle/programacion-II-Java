public class CD extends Multimedia {
    //    01. ATTRIBUTES
    private String interprete;
    private int cantidad_temas;

    //    02. CONSTRUCTOR
    public CD(String titulo, String genero, int duracion, Boolean obtenido, String comentario, String interprete, int cantidad_temas) {
        super(titulo, genero, duracion, obtenido, comentario);
        this.interprete = interprete;
        this.cantidad_temas = cantidad_temas;
    }

    //    03. SETTERS & GETTERS
    public String getInterprete() {
        return interprete;
    }

    public void setInterprete(String interprete) {
        this.interprete = interprete;
    }

    public int getCantidad_temas() {
        return cantidad_temas;
    }

    public void setCantidad_temas(int cantidad_temas) {
        this.cantidad_temas = cantidad_temas;
    }
}
