import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * La clase CatalogoDVDTest implementa la logica necesaria para realizar pruebas sobre los DVDs {@link DVD} que son de interes para el usuario.
 *
 * @author Gemdelle
 */
public class CatalogoCDTest {

    /**
     * Verifica si un CD puede ser agregado correctamente al catalogo.
     */
    @Test
    public void puedoAgregarUnCD() {
        CatalogoCD catalogo = new CatalogoCD();
        CD cd = new CD("Clásico", "Beethoven", 10, 60, true, "Un CD clásico", "Clásica");

        catalogo.agregarCD(cd);

        Assert.assertTrue(catalogo.listaCDs.contains(cd));
    }

    /**
     * Verifica si un CD puede ser eliminado correctamente del catalogo.
     */
    @Test
    public void puedoEliminarunCD() {
        CatalogoCD catalogo = new CatalogoCD();
        CD cd = new CD("Clásico", "Beethoven", 10, 60, true, "Un CD clásico", "Clásica");

        catalogo.agregarCD(cd);
        catalogo.eliminarCD("Clásico");

        Assert.assertFalse(catalogo.listaCDs.contains(cd));
    }

    /**
     * Verifica si se puede modificar correctamente el estado obtenido de un CD en el catalogo.
     */
    @Test
    public void puedoModificarObtenidoCD() {
        CatalogoCD catalogo = new CatalogoCD();
        CD cd = new CD("Clásico", "Beethoven", 10, 60, true, "Un CD clásico", "Clásica");
        catalogo.agregarCD(cd);

        catalogo.modificarObtenido("Clásico", "no");

        Assert.assertFalse(cd.isObtenido());
    }

    /**
     * Verifica si se puede modificar correctamente el comentario de un DVD en el catalogo.
     */
    @Test
    public void puedoModificarComentarioCD() {
        CatalogoCD catalogo = new CatalogoCD();
        CD cd = new CD("Clásico", "Beethoven", 10, 60, true, "Un CD clásico", "Clásica");

        cd.setComentario("Un CD bueno");

        assertEquals("Un CD bueno", cd.getComentario());
    }

    /**
     * Verifica si se pueden imprimir correctamente todos los CDs en el catalogo.
     */
    @Test
    public void imprimenTodosCDs() {
        CatalogoCD catalogo = new CatalogoCD();
        CD cd = new CD("Clásico", "Beethoven", 10, 60, true, "Un CD clásico", "Clásica");
        CD cd2 = new CD("N / O / I / S / E", "Ghostemane", 12, 45, false, "Un CD de Ghostemane", "Rap Metal");
        catalogo.agregarCD(cd);
        catalogo.agregarCD(cd2);

        List<CD> cds = catalogo.listarTodosCD();

        assertEquals(Arrays.asList(cd, cd2), cds);
    }

    /**
     * Verifica si se pueden listar correctamente todos los CDs obtenidos en el catalogo.
     */
    @Test
    public void listaTodosCDsObtenidos() {
        CatalogoCD catalogo = new CatalogoCD();
        CD cd = new CD("Clásico", "Beethoven", 10, 60, true, "Un CD clásico", "Clásica");
        CD cd2 = new CD("N / O / I / S / E", "Ghostemane", 12, 45, false, "Un CD de Ghostemane", "Rap Metal");
        catalogo.agregarCD(cd);
        catalogo.agregarCD(cd2);

        List<CD> cds = catalogo.listarCDsObtenidos();

        Assert.assertEquals(Arrays.asList(cd), cds);
    }

    /**
     * Verifica si se pueden listar correctamente todos los CDs con una duracion menor a un valor especifico en el catalogo.
     */
    @Test
    public void listaTodosCDsTiempoMenor() {
        CatalogoCD catalogo = new CatalogoCD();
        CD cd = new CD("Clásico", "Beethoven", 10, 60, true, "Un CD clásico", "Clásica");
        CD cd2 = new CD("N / O / I / S / E", "Ghostemane", 12, 45, false, "Un CD de Ghostemane", "Rap Metal");
        catalogo.agregarCD(cd);
        catalogo.agregarCD(cd2);

        List<CD> cds = catalogo.listarCDTiempoMenor(50);

        Assert.assertEquals(Arrays.asList(cd2), cds);
    }

    /**
     * Verifica si se pueden listar correctamente todos los CDs dirigidos por un interprete especifico en el catalogo.
     */
    @Test
    public void listaTodosCDsPorInterprete() {
        CatalogoCD catalogo = new CatalogoCD();
        CD cd = new CD("Clásico", "Beethoven", 10, 60, true, "Un CD clásico", "Clásica");
        CD cd2 = new CD("N / O / I / S / E", "Ghostemane", 12, 45, false, "Un CD de Ghostemane", "Rap Metal");
        catalogo.agregarCD(cd);
        catalogo.agregarCD(cd2);

        List<CD> cds = catalogo.listarCDPorInterprete("Ghostemane");

        Assert.assertEquals(Arrays.asList(cd2), cds);
    }

    /**
     * Verifica si se pueden listar correctamente todos los CDs en orden alfabetico por titulo en el catalogo.
     */
    @Test
    public void listaTodosCDsAlfabeticamente() {
        CatalogoCD catalogo = new CatalogoCD();
        CD cd = new CD("Clásico", "Beethoven", 10, 60, true, "Un CD clásico", "Clásica");
        CD cd2 = new CD("N / O / I / S / E", "Ghostemane", 12, 45, false, "Un CD de Ghostemane", "Rap Metal");
        catalogo.agregarCD(cd);
        catalogo.agregarCD(cd2);

        List<CD> cds = catalogo.listarCDsAlfabetico();

        Assert.assertEquals(Arrays.asList(cd, cd2), cds);
    }

    /**
     * Verifica si se puede contar correctamente el numero de CDs en el catalogo.
     */
    @Test
    public void cuentaTodosCDs() {
        CatalogoCD catalogo = new CatalogoCD();
        CD cd = new CD("Clásico", "Beethoven", 10, 60, true, "Un CD clásico", "Clásica");
        CD cd2 = new CD("N / O / I / S / E", "Ghostemane", 12, 45, false, "Un CD de Ghostemane", "Rap Metal");
        catalogo.agregarCD(cd);
        catalogo.agregarCD(cd2);

        int cantidadCds = catalogo.contarCDs();

        assertEquals(2, cantidadCds);
    }

    //   ESPECIFICO: listados por intérprete.
    /**
     * Verifica si se pueden listar correctamente todos los CDs asociados a un interprete especifico en el catalogo.
     */
    @Test
    public void listaCDsPorInterpete() {
        CatalogoCD catalogo = new CatalogoCD();
        CD cd = new CD("Clásico", "Beethoven", 10, 60, true, "Un CD clásico", "Clásica");
        CD cd2 = new CD("N / O / I / S / E", "Ghostemane", 12, 45, false, "Un CD de Ghostemane", "Rap Metal");
        CD cd3 = new CD("ANTI-ICON", "Ghostemane", 15, 55, true, "Un CD de Ghostemane", "Rap Metal");
        catalogo.agregarCD(cd);
        catalogo.agregarCD(cd2);
        catalogo.agregarCD(cd3);

        List<CD> cds = catalogo.listarCDPorInterprete("Ghostemane");

        Assert.assertEquals(Arrays.asList(cd2, cd3), cds);
    }

//   ESPECIFICO: cantidad de temas.
    /**
     * Verifica si se puede contar correctamente la cantidad de temas de un CD especifico en el catalogo.
     */
    @Test
    public void cuentaTemasCD() {
        CatalogoCD catalogo = new CatalogoCD();
        CD cd = new CD("Clásico", "Beethoven", 10, 60, true, "Un CD clásico", "Clásica");
        catalogo.agregarCD(cd);

        int temas = catalogo.cantidadDeTemasPorCD("Clásico");

        Assert.assertEquals(10,temas);
    }
}