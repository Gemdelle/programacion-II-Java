import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class CatalogoTest {

    @Test
    public void puedoAgregarUnDVD() {
        CatalogoDVD catalogo = new CatalogoDVD();
        DVD dvd = new DVD("Un Titulo", "Un Genero", 20, true, "Malagdo", "Gemy");

        catalogo.agregarDVD(dvd);

        Assert.assertTrue(catalogo.listaDVDs.contains(dvd));
    }

    @Test
    public void puedoEliminarUnDVD() {
        CatalogoDVD catalogo = new CatalogoDVD();
        DVD dvd = new DVD("Un Titulo", "Un Genero", 20, true, "Malagdo", "Gemy");
        catalogo.agregarDVD(dvd);

        catalogo.eliminarDVD("Un Titulo");

        Assert.assertFalse(catalogo.listaDVDs.contains(dvd));
    }

    @Test
    public void puedoModificarObtenidoDVD() {
        CatalogoDVD catalogo = new CatalogoDVD();
        DVD dvd = new DVD("Un Titulo", "Un Genero", 20, true, "Malagdo", "Gemy");
        catalogo.agregarDVD(dvd);

        catalogo.modificarObtenido("Un Titulo", "no");

        assertFalse(dvd.isObtenido());
    }

    @Test
    public void puedoModificarComentario() {
        CatalogoDVD catalogo = new CatalogoDVD();
        DVD dvd = new DVD("Un Titulo", "Un Genero", 20, true, "Malagdo", "Gemy");
        catalogo.agregarDVD(dvd);

        catalogo.modificarComentario("Un Titulo", "Muy buenagdo");

        assertEquals("Muy buenagdo", dvd.getComentario());
    }

    @Test
    public void imprimenTodosDVDs() {
        CatalogoDVD catalogo = new CatalogoDVD();
        DVD dvd = new DVD("Un Titulo", "Un Genero", 20, true, "Malagdo", "Gemy");
        DVD dvd2 = new DVD("Un Titulo2", "Un Genero2", 70, false, "Buenagdo", "Hunny");
        catalogo.agregarDVD(dvd);
        catalogo.agregarDVD(dvd2);

        List<DVD> dvds = catalogo.listarTodosDVD();

        assertEquals(Arrays.asList(dvd, dvd2), dvds);
    }

    @Test
    public void listaTodosDVDsObtenidos() {
        CatalogoDVD catalogo = new CatalogoDVD();
        DVD dvd = new DVD("Un Titulo", "Un Genero", 20, true, "Malagdo", "Gemy");
        DVD dvd2 = new DVD("Un Titulo2", "Un Genero2", 70, false, "Buenagdo", "Hunny");
        catalogo.agregarDVD(dvd);
        catalogo.agregarDVD(dvd2);

        List<DVD> dvds = catalogo.listarDVDObtenidos();

        assertEquals(Arrays.asList(dvd), dvds);
    }

    @Test
    public void listaTodosDVDsTiempoMenor() {
        CatalogoDVD catalogo = new CatalogoDVD();
        DVD dvd = new DVD("Un Titulo", "Un Genero", 20, true, "Malagdo", "Gemy");
        DVD dvd2 = new DVD("Un Titulo2", "Un Genero2", 70, false, "Buenagdo", "Hunny");
        catalogo.agregarDVD(dvd);
        catalogo.agregarDVD(dvd2);

        List<DVD> dvds = catalogo.listarDVDTiempoMenor(60);

        assertEquals(Arrays.asList(dvd), dvds);
    }

    @Test
    public void listaTodosDVDsPorDirector() {
        CatalogoDVD catalogo = new CatalogoDVD();
        DVD dvd = new DVD("Un Titulo", "Un Genero", 20, true, "Malagdo", "Gemy");
        DVD dvd2 = new DVD("Un Titulo2", "Un Genero2", 70, false, "Buenagdo", "Hunny");
        catalogo.agregarDVD(dvd);
        catalogo.agregarDVD(dvd2);

        List<DVD> dvds = catalogo.listarDVDDirector("Hunny");

        assertEquals(Arrays.asList(dvd2), dvds);
    }

    @Test
    public void listaTodosDVDsAlfabeticamente() {
        CatalogoDVD catalogo = new CatalogoDVD();
        DVD dvd = new DVD("Insecto", "Abeja", 20, true, "Malagdo", "Gemy");
        DVD dvd2 = new DVD("Animal", "Foca", 70, false, "Buenagdo", "Hunny");
        catalogo.agregarDVD(dvd);
        catalogo.agregarDVD(dvd2);

        List<DVD> dvds = catalogo.listarDVDAlfabetico();

        assertEquals(Arrays.asList(dvd2, dvd), dvds);
    }

    @Test
    public void cuentaTodosDVDs() {
        CatalogoDVD catalogo = new CatalogoDVD();
        DVD dvd = new DVD("Insecto", "Abeja", 20, true, "Malagdo", "Gemy");
        DVD dvd2 = new DVD("Animal", "Foca", 70, false, "Buenagdo", "Hunny");
        catalogo.agregarDVD(dvd);
        catalogo.agregarDVD(dvd2);

        int dvds = catalogo.contarDVD();

        assertEquals(2, dvds);
    }
}