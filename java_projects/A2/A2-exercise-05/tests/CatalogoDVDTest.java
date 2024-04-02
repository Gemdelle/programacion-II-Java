import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

/**
 * La clase CatalogoDVDTest implementa la logica necesaria para realizar pruebas sobre los DVDs {@link DVD} que son de interes para el usuario.
 * @author Gemdelle
 */
public class CatalogoDVDTest {

    /**
     * Verifica si un DVD puede ser agregado correctamente al catalogo.
     */
    @Test
    public void puedoAgregarUnDVD() {
        CatalogoDVD catalogo = new CatalogoDVD();
        DVD dvd = new DVD("Un Titulo", "Un Genero", 20, true, "malo", "Gemy");

        catalogo.agregarDVD(dvd);

        Assert.assertTrue(catalogo.listaDVDs.contains(dvd));
    }

    /**
     * Verifica si un DVD puede ser eliminado correctamente del catalogo.
     */
    @Test
    public void puedoEliminarUnDVD() {
        CatalogoDVD catalogo = new CatalogoDVD();
        DVD dvd = new DVD("Un Titulo", "Un Genero", 20, true, "malo", "Gemy");
        catalogo.agregarDVD(dvd);

        catalogo.eliminarDVD("Un Titulo");

        Assert.assertFalse(catalogo.listaDVDs.contains(dvd));
    }

    /**
     * Verifica si se puede modificar correctamente el estado obtenido de un DVD en el catalogo.
     */
    @Test
    public void puedoModificarObtenidoDVD() {
        CatalogoDVD catalogo = new CatalogoDVD();
        DVD dvd = new DVD("Un Titulo", "Un Genero", 20, true, "malo", "Gemy");
        catalogo.agregarDVD(dvd);

        catalogo.modificarObtenido("Un Titulo", "no");

        Assert.assertFalse(dvd.isObtenido());
    }

    /**
     * Verifica si se puede modificar correctamente el comentario de un DVD en el catalogo.
     */
    @Test
    public void puedoModificarComentario() {
        CatalogoDVD catalogo = new CatalogoDVD();
        DVD dvd = new DVD("Un Titulo", "Un Genero", 20, true, "malo", "Gemy");
        catalogo.agregarDVD(dvd);

        catalogo.modificarComentario("Un Titulo", "Muy bueno");

        assertEquals("Muy bueno", dvd.getComentario());
    }

    /**
     * Verifica si se pueden imprimir correctamente todos los DVDs en el catalogo.
     */
    @Test
    public void imprimenTodosDVDs() {
        CatalogoDVD catalogo = new CatalogoDVD();
        DVD dvd = new DVD("Un Titulo", "Un Genero", 20, true, "malo", "Gemy");
        DVD dvd2 = new DVD("Un Titulo2", "Un Genero2", 70, false, "bueno", "Hunny");
        catalogo.agregarDVD(dvd);
        catalogo.agregarDVD(dvd2);

        List<DVD> dvds = catalogo.listarTodosDVD();

        assertEquals(Arrays.asList(dvd, dvd2), dvds);
    }

    /**
     * Verifica si se pueden listar correctamente todos los DVDs obtenidos en el catalogo.
     */
    @Test
    public void listaTodosDVDsObtenidos() {
        CatalogoDVD catalogo = new CatalogoDVD();
        DVD dvd = new DVD("Un Titulo", "Un Genero", 20, true, "malo", "Gemy");
        DVD dvd2 = new DVD("Un Titulo2", "Un Genero2", 70, false, "bueno", "Hunny");
        catalogo.agregarDVD(dvd);
        catalogo.agregarDVD(dvd2);

        List<DVD> dvds = catalogo.listarDVDObtenidos();

        assertEquals(Arrays.asList(dvd), dvds);
    }

    /**
     * Verifica si se pueden listar correctamente todos los DVDs con una duracion menor a un valor especifico en el catalogo.
     */
    @Test
    public void listaTodosDVDsTiempoMenor() {
        CatalogoDVD catalogo = new CatalogoDVD();
        DVD dvd = new DVD("Un Titulo", "Un Genero", 20, true, "malo", "Gemy");
        DVD dvd2 = new DVD("Un Titulo2", "Un Genero2", 70, false, "bueno", "Hunny");
        catalogo.agregarDVD(dvd);
        catalogo.agregarDVD(dvd2);

        List<DVD> dvds = catalogo.listarDVDTiempoMenor(60);

        assertEquals(Arrays.asList(dvd), dvds);
    }


    /**
     * Verifica si se pueden listar correctamente todos los DVDs dirigidos por un director especifico en el catalogo.
     */
    @Test
    public void listaTodosDVDsPorDirector() {
        CatalogoDVD catalogo = new CatalogoDVD();
        DVD dvd = new DVD("Un Titulo", "Un Genero", 20, true, "Malo", "Gemy");
        DVD dvd2 = new DVD("Un Titulo2", "Un Genero2", 70, false, "Bueno", "Hunny");
        catalogo.agregarDVD(dvd);
        catalogo.agregarDVD(dvd2);

        List<DVD> dvds = catalogo.listarDVDDirector("Hunny");

        assertEquals(Arrays.asList(dvd2), dvds);
    }

    /**
     * Verifica si se pueden listar correctamente todos los DVDs en orden alfabetico por titulo en el catalogo.
     */
    @Test
    public void listaTodosDVDsAlfabeticamente() {
        CatalogoDVD catalogo = new CatalogoDVD();
        DVD dvd = new DVD("Insecto", "Abeja", 20, true, "Malo", "Gemy");
        DVD dvd2 = new DVD("Animal", "Foca", 70, false, "Bueno", "Hunny");
        catalogo.agregarDVD(dvd);
        catalogo.agregarDVD(dvd2);

        List<DVD> dvds = catalogo.listarDVDAlfabetico();

        assertEquals(Arrays.asList(dvd2, dvd), dvds);
    }

    /**
     * Verifica si se puede contar correctamente el numero de DVDs en el catalogo.
     */
    @Test
    public void cuentaTodosDVDs() {
        CatalogoDVD catalogo = new CatalogoDVD();
        DVD dvd = new DVD("Insecto", "Abeja", 20, true, "Malo", "Gemy");
        DVD dvd2 = new DVD("Animal", "Foca", 70, false, "Bueno", "Hunny");
        catalogo.agregarDVD(dvd);
        catalogo.agregarDVD(dvd2);

        int dvds = catalogo.contarDVD();

        assertEquals(2, dvds);
    }
}