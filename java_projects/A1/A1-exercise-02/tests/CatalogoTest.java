import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

/**
 * La clase CatalogoTest implementa la logica necesaria para realizar pruebas sobre los DVDs {@link DVD} que son de interes para el usuario.
 * @author Gemdelle
 */

public class CatalogoTest {

    /**
     * Verifica si un DVD puede ser agregado correctamente al catálogo.
     */
    @Test
    public void puedoAgregarUnDVD() {
        Catalogo catalogo = new Catalogo();
        DVD dvd = new DVD("Un Titulo", "Un Genero", 20, true, "malo", "Gemy");

        catalogo.agregarDVD(dvd);

        Assert.assertTrue(catalogo.listaDVDs.contains(dvd));
    }

    /**
     * Verifica si un DVD puede ser eliminado correctamente del catálogo.
     */
    @Test
    public void puedoEliminarUnDVD() {
        Catalogo catalogo = new Catalogo();
        DVD dvd = new DVD("Un Titulo", "Un Genero", 20, true, "malo", "Gemy");
        catalogo.agregarDVD(dvd);

        catalogo.eliminarDVD("Un Titulo");

        Assert.assertFalse(catalogo.listaDVDs.contains(dvd));
    }

    /**
     * Verifica si se puede modificar correctamente el estado obtenido de un DVD en el catálogo.
     */
    @Test
    public void puedoModificarObtenidoDVD() {
        Catalogo catalogo = new Catalogo();
        DVD dvd = new DVD("Un Titulo", "Un Genero", 20, true, "malo", "Gemy");
        catalogo.agregarDVD(dvd);

        catalogo.modificarObtenido("Un Titulo", "no");

        assertFalse(dvd.isObtenido());
    }

    /**
     * Verifica si se puede modificar correctamente el comentario de un DVD en el catálogo.
     */
    @Test
    public void puedoModificarComentario() {
        Catalogo catalogo = new Catalogo();
        DVD dvd = new DVD("Un Titulo", "Un Genero", 20, true, "malo", "Gemy");
        catalogo.agregarDVD(dvd);

        catalogo.modificarComentario("Un Titulo", "Muy bueno");

        assertEquals("Muy bueno", dvd.getComentario());
    }

    /**
     * Verifica si se puede modificar correctamente el comentario de un DVD en el catálogo.
     */
    @Test
    public void imprimenTodosDVDs() {
        Catalogo catalogo = new Catalogo();
        DVD dvd = new DVD("Un Titulo", "Un Genero", 20, true, "malo", "Gemy");
        DVD dvd2 = new DVD("Un Titulo2", "Un Genero2", 70, false, "bueno", "Hunny");
        catalogo.agregarDVD(dvd);
        catalogo.agregarDVD(dvd2);

        List<DVD> dvds = catalogo.listarTodosDVD();

        assertEquals(Arrays.asList(dvd, dvd2), dvds);
    }

    /**
     * Verifica si se pueden listar correctamente todos los DVDs obtenidos en el catálogo.
     */
    @Test
    public void listaTodosDVDsObtenidos() {
        Catalogo catalogo = new Catalogo();
        DVD dvd = new DVD("Un Titulo", "Un Genero", 20, true, "malo", "Gemy");
        DVD dvd2 = new DVD("Un Titulo2", "Un Genero2", 70, false, "bueno", "Hunny");
        catalogo.agregarDVD(dvd);
        catalogo.agregarDVD(dvd2);

        List<DVD> dvds = catalogo.listarDVDObtenidos();

        assertEquals(Arrays.asList(dvd), dvds);
    }

    /**
     * Verifica si se pueden listar correctamente todos los DVDs con una duración menor a un valor específico en el catálogo.
     */
    @Test
    public void listaTodosDVDsTiempoMenor() {
        Catalogo catalogo = new Catalogo();
        DVD dvd = new DVD("Un Titulo", "Un Genero", 20, true, "malo", "Gemy");
        DVD dvd2 = new DVD("Un Titulo2", "Un Genero2", 70, false, "bueno", "Hunny");
        catalogo.agregarDVD(dvd);
        catalogo.agregarDVD(dvd2);

        List<DVD> dvds = catalogo.listarDVDTiempoMenor(60);

        assertEquals(Arrays.asList(dvd), dvds);
    }


    /**
     * Verifica si se pueden listar correctamente todos los DVDs dirigidos por un director específico en el catálogo.
     */
    @Test
    public void listaTodosDVDsPorDirector() {
        Catalogo catalogo = new Catalogo();
        DVD dvd = new DVD("Un Titulo", "Un Genero", 20, true, "Malo", "Gemy");
        DVD dvd2 = new DVD("Un Titulo2", "Un Genero2", 70, false, "Bueno", "Hunny");
        catalogo.agregarDVD(dvd);
        catalogo.agregarDVD(dvd2);

        List<DVD> dvds = catalogo.listarDVDDirector("Hunny");

        assertEquals(Arrays.asList(dvd2), dvds);
    }

    /**
     * Verifica si se pueden listar correctamente todos los DVDs en orden alfabético por título en el catálogo.
     */
    @Test
    public void listaTodosDVDsAlfabeticamente() {
        Catalogo catalogo = new Catalogo();
        DVD dvd = new DVD("Insecto", "Abeja", 20, true, "Malo", "Gemy");
        DVD dvd2 = new DVD("Animal", "Foca", 70, false, "Bueno", "Hunny");
        catalogo.agregarDVD(dvd);
        catalogo.agregarDVD(dvd2);

        List<DVD> dvds = catalogo.listarDVDAlfabetico();

        assertEquals(Arrays.asList(dvd2, dvd), dvds);
    }

    /**
     * Verifica si se puede contar correctamente el número de DVDs en el catálogo.
     */
    @Test
    public void cuentaTodosDVDs() {
        Catalogo catalogo = new Catalogo();
        DVD dvd = new DVD("Insecto", "Abeja", 20, true, "Malo", "Gemy");
        DVD dvd2 = new DVD("Animal", "Foca", 70, false, "Bueno", "Hunny");
        catalogo.agregarDVD(dvd);
        catalogo.agregarDVD(dvd2);

        int dvds = catalogo.contarDVD();

        assertEquals(2, dvds);
    }
}