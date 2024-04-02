import java.util.ArrayList;
import java.util.List;
// EDITAR
// agregar() *
// eliminar() *
// modificarObtenido() *
// modificarComentario() *

//LISTAR
// listarTodo() *
// listarObtenidos() *
// listarTiempoMenor() *
// listarAlfabetico() *

//INFORMAR
// contarTodo()
// contarObtenido()

public class Catalogo {
//    01. ATTRIBUTES
    protected List<Multimedia> listaMultimedia;

//    02. CONSTRUCTOR
    public Catalogo() {
        this.listaMultimedia = new ArrayList<>();
    }

//    04. METHODS
//    EDITAR
    public void agregar(Multimedia multimedia) {
        listaMultimedia.add(multimedia);
    }

    public void eliminar(String titulo) {
        listaMultimedia = listaMultimedia.stream().filter((multimedia -> !multimedia.getTitulo().equals(titulo))).toList();
    }

    public void modificarObtenido(String titulo, String estado) {
        for(Multimedia multimedia : listaMultimedia) {
            if(multimedia.getTitulo().equals(titulo)) {
                if(estado.equals("si")) {
                    multimedia.setObtenido(true);
                } else {
                    multimedia.setObtenido(false);
                }
            }
        }
    }

    public void modificarComentario(String titulo, String comentario) {
        for(Multimedia multimedia : listaMultimedia) {
            if(multimedia.getTitulo().equals(titulo)) {
                multimedia.setComentario(comentario);
            }
        }
    }

// LISTAR
    public List<Multimedia> listarTodo() {
        return listaMultimedia;
    }

    public List<Multimedia> listarObtenidos() {
        List<Multimedia> listaObtenidos = new ArrayList<>();
        for(Multimedia multimedia : listaMultimedia) {
            if(multimedia.isObtenido()) {
                listaObtenidos.add(multimedia);
            }
        }
        return listaObtenidos;
    }

    public List<Multimedia> listarTiempoMenor(int duracion) {
        List<Multimedia> listaTiempoMenor = new ArrayList<>();
        for(Multimedia multimedia : listaMultimedia) {
            if(multimedia.getDuracion() < duracion) {
                listaTiempoMenor.add(multimedia);
            }
        }
        return listaTiempoMenor;
    }

    public List<Multimedia> listarAlfabetico() {
        List<Multimedia> copiaListaMultimedia = new ArrayList<>(listaMultimedia);
        copiaListaMultimedia.sort((dvd,dvd2) -> dvd.getTitulo().compareToIgnoreCase(dvd2.getTitulo()));
        return copiaListaMultimedia;
    }

//    CONTAR
    public int contarTodo() {
        return listaMultimedia.size();
    }

    public int contarObtenidos() {
        List<Multimedia> listaObtenidos = listarObtenidos();
        return listaObtenidos.size();
    }
}
