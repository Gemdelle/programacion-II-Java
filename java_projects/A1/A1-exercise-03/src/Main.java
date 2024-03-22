// A1 EXERCISE 03
//Desarrollar una aplicación similar la anterior pero que administre dos catálogos: uno de DVD y otro de CD. La funcionalidad del catalogo de CD es casi la misma que la de los DVD, excepto que queremos obtener listados por intérprete y también queremos saber cuantos temas tienen el CD.

//Listar:
//todos los DVD
//los DVD que tengo
//los DVD que duran menos de un tiempo dado en minutos.
//los DVD de un determinado director.
//todos los DVD ordenados por título.

//Informar:
//la cantidad total de DVD.
//la cantidad de DVD que tengo

//Los detalles que queremos almacenar de cada CD son:
//Título del álbum.
//Intérprete (nombre de la banda o del cantante).
//Cantidad de temas que tiene el CD.
//Tiempo de duración en minutos.
//Un atributo que indique si tenemos o no el CD.
//Un comentario. (Excelente, Muy Buena, Buena, Regular, Mala).
//Género.

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

// Test DVD
        System.out.println("");

        DVD dvd1 = new DVD("Casper", "Horror", 120, false, "Buena", "Sean McNamara");
        DVD dvd2 = new DVD("El Laberinto del Fauno", "Ciencia ficción", 140, true, "Excelente", "Guillermo del Toro");
        DVD dvd3 = new DVD("El Viaje de Chihiro", "Anime", 125, true, "Excelente", "Studio Ghibli");
        DVD dvd4 = new DVD("El Castillo Vagabundo", "Anime", 160, true, "Excelente", "Studio Ghibli");
        DVD dvd5 = new DVD("El hombre mosca", "Ciencia ficción", 70, false, "Regular", "Sam Taylor");
        DVD dvd6 = new DVD("La Historia sin Fin", "Ciencia ficción", 94, false, "Excelente", "Wolfgang Petersen");

//        DVD
        System.out.println("----------FUNCIONES DVD----------");
//        test getTitulo()
        System.out.println("Función getTitulo()" + dvd1.getTitulo());

//        test setTitulo()
        dvd1.setTitulo("Casper, el fantasma");
        System.out.println("Función setTitulo()" + dvd1.getTitulo() + "\n");

//        CATÁLOGO
        CatalogoDVD catalogo1DVD = new CatalogoDVD(new ArrayList<>());
        catalogo1DVD.agregarDVD(dvd1);
        catalogo1DVD.agregarDVD(dvd2);
        catalogo1DVD.agregarDVD(dvd3);
        catalogo1DVD.agregarDVD(dvd4);
        catalogo1DVD.agregarDVD(dvd5);
        catalogo1DVD.agregarDVD(dvd6);

        System.out.println("----------FUNCIONES CATÁLOGO----------");

//        eliminar un DVD
        catalogo1DVD.listarTodosDVD();
        catalogo1DVD.eliminarDVD("El hombre mosca");
        catalogo1DVD.listarTodosDVD();

//        modificar obtenido y comentario por tiítulo de DVD
        System.out.printf("Estado inicial de obtención: %s\n", dvd1.isObtenido());
        catalogo1DVD.modificarObtenido("Casper, el fantasma", "si");
        System.out.printf("Estado final de obtención: %s\n", dvd1.isObtenido());

        System.out.printf("\nComentario inicial: %s\n", dvd1.getComentario());
        catalogo1DVD.modificarComentario("Casper, el fantasma", "Regular");
        System.out.printf("Comentario final: %s\n\n", dvd1.getComentario());

//        listar
        catalogo1DVD.listarTodosDVD();
        catalogo1DVD.listarDVDObtenidos();
        catalogo1DVD.listarDVDTiempoMenor(150);
        catalogo1DVD.listarDVDDirector("Studio Ghibli");
        catalogo1DVD.listarDVDAlfabetico();

//        informar
        catalogo1DVD.contarDVD();
        catalogo1DVD.contarDVDObtenidos();

//        Test CD
        CatalogoCD catalogo1CD = new CatalogoCD(new ArrayList<>());

        System.out.println("");

        CD cd1 = new CD("Bridyam Tales","Gemdelle",8,75,true,"Excelente","Gospell");
        CD cd2 = new CD("Mercury","Ghostemane",10,110,true,"Muy bueno","Techno");
        CD cd3 = new CD("Florida","Kitty Pryde",6,55,false,"Bueno","Rap");
        CD cd4 = new CD("Baby's on fire","Die Antwoord",8,75,true,"Excelente","Alternative Pop");
        CD cd5 = new CD("Bridyam Tales 2","Gemdelle",8,75,true,"Excelente","Gospell");
        CD cd6 = new CD("Bridyam Tales 3","Gemdelle",10,105,true,"Excelente","Gospell");

        catalogo1CD.agregarCD(cd1);
        catalogo1CD.agregarCD(cd2);
        catalogo1CD.agregarCD(cd3);
        catalogo1CD.agregarCD(cd4);
        catalogo1CD.agregarCD(cd5);
        catalogo1CD.agregarCD(cd6);

        catalogo1CD.listarCDPorInterprete("Gemdelle");
        catalogo1CD.cantidadDeTemasPorCD("Bridyam Tales 2");
    }
}
