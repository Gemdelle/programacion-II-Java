

//A1 exercise 01
// Desarrollar una aplicación que nos permita almacenar información sobre películas (en DVD).  La idea es crear un catálogo de todos los DVD que tenemos, hemos visto o deseamos tener o ver.

//La funcionalidad que queremos que nos brinde el catálogo debe incluir como mínimo lo siguiente:
//Permitir ingresar información sobre los DVD.
//Permitir eliminar un DVD conociendo el título.
//Permitir modificar los valores de uno o más atributos conociendo el título.

//Listar:
//todos los DVD
//los DVD que tengo
//los DVD que duran menos de un tiempo dado en minutos.
//los DVD de un determinado director.
//todos los DVD ordenados por título.

//Informar:
//la cantidad total de DVD.
//la cantidad de DVD que tengo.

// Los detalles que queremos almacenar de cada DVD son:
//Título.
//Género.
//Tiempo de duración en minutos.
//Un atributo que indique si tenemos o no el DVD.
//Un comentario. (Excelente, Muy Buena, Buena, Regular, Mala)

//Se pide:
//Dibujar los diagramas de clase.
//Programar la clase DVD e ir probando cada método.
//Programar la clase Catálogo.
//Realizar pruebas positivas y pruebas negativas.
//Desarrollar pruebas automatizadas.
//Documentar la aplicación usando javadoc.

import java.util.ArrayList;
/**
 * La clase Main sirve para correr el programa principal e implementar el guardado de las instancias de {@link DVD} en un {@link Catalogo}.
 * @author Gemdelle
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("");
        Catalogo catalogoDVD = new Catalogo();
        catalogoDVD.interfazUsuario();
    }
}
