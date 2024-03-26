import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class CatalogoTest {

    @Test
    public void puedoAgregarUnDVD() {
        Catalogo catalogo = new Catalogo();
        DVD dvd = new DVD("Un Titulo", "Un Genero", 20, true, "Malagdo", "Gemy");

        catalogo.agregarDVD(dvd);

        Assert.assertTrue(catalogo.listaDVDs.contains(dvd));
    }

    @Test
    public void puedoEliminarUnDVD() {
        Catalogo catalogo = new Catalogo();
        DVD dvd = new DVD("Un Titulo", "Un Genero", 20, true, "Malagdo", "Gemy");
        catalogo.agregarDVD(dvd);

        catalogo.eliminarDVD("Un Titulo");

        Assert.assertFalse(catalogo.listaDVDs.contains(dvd));
    }

    @Test
    public void puedoModificarObtenidoDVD() {
        Catalogo catalogo = new Catalogo();
        DVD dvd = new DVD("Un Titulo", "Un Genero", 20, true, "Malagdo", "Gemy");
        catalogo.agregarDVD(dvd);

        catalogo.modificarObtenido("Un Titulo", "no");

        assertFalse(dvd.isObtenido());
    }

    @Test
    public void puedoModificarComentario() {
        Catalogo catalogo = new Catalogo();
        DVD dvd = new DVD("Un Titulo", "Un Genero", 20, true, "Malagdo", "Gemy");
        catalogo.agregarDVD(dvd);

        catalogo.modificarComentario("Un Titulo", "Muy buenagdo");

        assertEquals("Muy buenagdo", dvd.getComentario());
    }

    @Test
    public void imprimenTodosDVDs() {
        Catalogo catalogo = new Catalogo();
        DVD dvd = new DVD("Un Titulo", "Un Genero", 20, true, "Malagdo", "Gemy");
        DVD dvd2 = new DVD("Un Titulo2", "Un Genero2", 70, false, "Buenagdo", "Hunny");
        catalogo.agregarDVD(dvd);
        catalogo.agregarDVD(dvd2);

        List<DVD> dvds = catalogo.listarTodosDVD();

        assertEquals(Arrays.asList(dvd, dvd2), dvds);
    }

    @Test
    public void listaTodosDVDsObtenidos() {
        Catalogo catalogo = new Catalogo();
        DVD dvd = new DVD("Un Titulo", "Un Genero", 20, true, "Malagdo", "Gemy");
        DVD dvd2 = new DVD("Un Titulo2", "Un Genero2", 70, false, "Buenagdo", "Hunny");
        catalogo.agregarDVD(dvd);
        catalogo.agregarDVD(dvd2);

        List<DVD> dvds = catalogo.listarDVDObtenidos();

        assertEquals(Arrays.asList(dvd), dvds);
    }

    @Test
    public void listaTodosDVDsTiempoMenor() {
        Catalogo catalogo = new Catalogo();
        DVD dvd = new DVD("Un Titulo", "Un Genero", 20, true, "Malagdo", "Gemy");
        DVD dvd2 = new DVD("Un Titulo2", "Un Genero2", 70, false, "Buenagdo", "Hunny");
        catalogo.agregarDVD(dvd);
        catalogo.agregarDVD(dvd2);

        List<DVD> dvds = catalogo.listarDVDTiempoMenor(60);

        assertEquals(Arrays.asList(dvd), dvds);
    }

    @Test
    public void listaTodosDVDsPorDirector() {
        Catalogo catalogo = new Catalogo();
        DVD dvd = new DVD("Un Titulo", "Un Genero", 20, true, "Malagdo", "Gemy");
        DVD dvd2 = new DVD("Un Titulo2", "Un Genero2", 70, false, "Buenagdo", "Hunny");
        catalogo.agregarDVD(dvd);
        catalogo.agregarDVD(dvd2);

        List<DVD> dvds = catalogo.listarDVDDirector("Hunny");

        assertEquals(Arrays.asList(dvd2), dvds);
    }

    @Test
    public void listaTodosDVDsAlfabeticamente() {
        Catalogo catalogo = new Catalogo();
        DVD dvd = new DVD("Insecto", "Abeja", 20, true, "Malagdo", "Gemy");
        DVD dvd2 = new DVD("Animal", "Foca", 70, false, "Buenagdo", "Hunny");
        catalogo.agregarDVD(dvd);
        catalogo.agregarDVD(dvd2);

        List<DVD> dvds = catalogo.listarDVDAlfabetico();

        assertEquals(Arrays.asList(dvd2, dvd), dvds);
    }

    @Test
    public void cuentaTodosDVDs() {
        Catalogo catalogo = new Catalogo();
        DVD dvd = new DVD("Insecto", "Abeja", 20, true, "Malagdo", "Gemy");
        DVD dvd2 = new DVD("Animal", "Foca", 70, false, "Buenagdo", "Hunny");
        catalogo.agregarDVD(dvd);
        catalogo.agregarDVD(dvd2);

        int dvds = catalogo.contarDVD();

        assertEquals(2, dvds);
    }
}