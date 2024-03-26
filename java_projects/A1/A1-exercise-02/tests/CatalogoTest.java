import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class CatalogoTest {

    @Test
    public void puedoAgregarUnDVD() {
        Catalogo catalogo =  new Catalogo();
        DVD dvd = new DVD("Un Titulo", "Un Genero", 20, true, "Malagdo","Gemy");

        catalogo.agregarDVD(dvd);

        Assert.assertTrue(catalogo.listaDVDs.contains(dvd));
    }

    @Test
    public void puedoEliminarUnDVD() {
        Catalogo catalogo =  new Catalogo();
        DVD dvd = new DVD("Un Titulo", "Un Genero", 20, true, "Malagdo","Gemy");
        catalogo.agregarDVD(dvd);

        catalogo.eliminarDVD("Un Titulo");

        Assert.assertFalse(catalogo.listaDVDs.contains(dvd));
    }

    @Test
    public void puedoModificarObtenidoDVD() {
        Catalogo catalogo =  new Catalogo();
        DVD dvd = new DVD("Un Titulo", "Un Genero", 20, true, "Malagdo","Gemy");
        catalogo.agregarDVD(dvd);

        catalogo.modificarObtenido("Un Titulo","no");

        assertFalse(dvd.isObtenido());
    }

    @Test
    public void puedoModificarComentario() {
        Catalogo catalogo =  new Catalogo();
        DVD dvd = new DVD("Un Titulo", "Un Genero", 20, true, "Malagdo","Gemy");
        catalogo.agregarDVD(dvd);

        catalogo.modificarComentario("Un Titulo","Muy buenagdo");

        assertEquals("Muy buenagdo", dvd.getComentario());
    }

    @Test
    public void imprimenTodosDVD() {
        Catalogo catalogo =  new Catalogo();
        DVD dvd = new DVD("Un Titulo", "Un Genero", 20, true, "Malagdo","Gemy");
        DVD dvd2 = new DVD("Un Titulo2", "Un Genero2", 70, false, "Buenagdo","Hunny");
        catalogo.agregarDVD(dvd);
        catalogo.agregarDVD(dvd2);

        List<DVD> dvds = catalogo.listarTodosDVD();

        assertEquals(Arrays.asList(dvd, dvd2), dvds);
    }

    @Test
    public void listaTodosDVDObtenidos() {
        Catalogo catalogo = new Catalogo();
        DVD dvd = new DVD("Un Titulo", "Un Genero", 20, true, "Malagdo","Gemy");
        DVD dvd2 = new DVD("Un Titulo2", "Un Genero2", 70, false, "Buenagdo","Hunny");
        catalogo.agregarDVD(dvd);
        catalogo.agregarDVD(dvd2);

        List<DVD> dvds = catalogo.listarDVDObtenidos();

        assertEquals(Arrays.asList(dvd), dvds);
    }

    @Test
    public void listaTodosDVDTiempoMenor() {

    }
}