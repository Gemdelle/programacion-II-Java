public class Libro {
//    01. ATTRIBUTES
    private String titulo;
    private boolean original;
    private boolean prestable;

//    02. CONSTRUCTOR
public Libro(String titulo, boolean original, boolean prestable) {
    this.titulo = titulo;
    this.original = original;
    this.prestable = prestable;
}

//    03. SETTERS & GETTERS
public String getTitulo() {
    return titulo;
}
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public boolean isOriginal() {
        return original;
    }

    public void setOriginal(boolean original) {
        this.original = original;
    }

    public boolean isPrestable() {
        return prestable;
    }

    public void setPrestable(boolean prestable) {
        this.prestable = prestable;
    }

//    04. METHODS
    public void printData() {
        System.out.printf("Título: %s\nOriginal: %s\nPrestable: %s\n\n",titulo,original ? "Sí" : "No",prestable ? "Sí" : "No");
    }
}

