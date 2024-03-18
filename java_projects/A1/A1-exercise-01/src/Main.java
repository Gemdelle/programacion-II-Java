//A1 exercise 01
// Desarrollar una aplicación que nos permita almacenar información sobre películas (en DVD).  La idea es crear un catálogo de todos los DVD que tenemos, hemos visto o deseamos tener o ver.

//La funcionalidad que queremos que nos brinde el catálogo debe incluir como mínimo lo siguiente:
//Permitir ingresar información sobre los DVD. (NO ENTIENDO QUÉ SIGNIFICA INGRESAR INFORMACIÓN, NO ES LO MISMO QUE MODIFICAR ATRIBUTOS?)
//Permitir eliminar un DVD conociendo el título.
//Permitir modificar los valores de uno o más atributos conociendo el título. (CÓMO MODIFICO MAÁS DE UN VALOR AL MISMO TIEMPO, CÓMO SABE QUÉ VALOR CORRESPONDE A CADA PARÁMETRO EN LA FUNCIÓN SI NO QUIERO PONER TODOS, SE REFIERE A MODIFICAR POR SEPARADO EN DIFERENTES FUNCIONES?.

//Listar:
//todos los DVD
//los DVD que tengo
//los DVD que duran menos de un tiempo dado en minutos.
//los DVD de un determinado director.
//todos los DVD ordenados por título.

//Informar:
//la cantidad total de DVD.
//la cantidad de DVD que tengo

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

public class Main {
    public static void main(String[] args) {
        System.out.println("");

        DVD dvd1 = new DVD("Casper","Horror",120,false,"Buena","Sean McNamara");
        DVD dvd2 = new DVD("El Laberinto del Fauno","Ciencia ficción",140,true,"Excelente","Guillermo del Toro");
        DVD dvd3 = new DVD("El viaje de Chihiro","Anime",125,true,"Excelente","Studio Ghibli");
        DVD dvd4 = new DVD("El Castillo Vagabundo","Anime",160,true,"Excelente","Studio Ghibli");
        DVD dvd5 = new DVD("El hombre mosca","Ciencia ficción",70,false,"Regular","Sam Taylor");
        DVD dvd6 = new DVD("La Historia sin Fin","Ciencia ficción",94,false,"Excelente","Wolfgang Petersen");

//        DVD
        System.out.println("----------FUNCIONES DVD----------");
//        test getTitulo()
        System.out.println("Función getTitulo()" + dvd1.getTitulo());

//        test setTitulo()
        dvd1.setTitulo("Casper, el fantasma");
        System.out.println("Función setTitulo()" + dvd1.getTitulo() + "\n");

//        CATÁLOGO
        Catalogo catalogo = new Catalogo(new ArrayList<>());
        catalogo.agregadDVD(dvd1);
        catalogo.agregadDVD(dvd2);
        catalogo.agregadDVD(dvd3);
        catalogo.agregadDVD(dvd4);
        catalogo.agregadDVD(dvd5);
        catalogo.agregadDVD(dvd6);

//        ingresar información de DVDs
//        NO ENTIENDO QUÉ HAY QUE HACER
        System.out.println("----------FUNCIONES CATÁLOGO----------");

//        eliminar un DVD
        catalogo.listarTodosDVD();
        catalogo.eliminarDVD("El hombre mosca");
        catalogo.listarTodosDVD();

//        modificar obtenido y comentario por tiítulo de DVD
        System.out.printf("Estado inicial de obtención: %s\n",dvd1.isObtenido());
        catalogo.modificarObtenido("Casper","si");
        System.out.printf("Estado final de obtención: %s\n",dvd1.isObtenido());

        System.out.printf("\nComentario inicial: %s\n",dvd1.getComentario());
        catalogo.modificarComentario("Casper","Regular");
        System.out.printf("Comentario final: %s\n\n",dvd1.getComentario());

//        listar
        catalogo.listarTodosDVD();
        catalogo.listarDVDObtenidos();
        catalogo.listarDVDTiempoMenor(150);
        catalogo.listarDVDDirector("Studio Ghibli");
        catalogo.listarDVDAlfabetico();

//        informar
        catalogo.contarDVD();
        catalogo.contarDVDObtenidos();
    }
}
