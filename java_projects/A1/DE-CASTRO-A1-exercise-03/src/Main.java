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
import java.util.Scanner;

/**
 * La clase Main sirve para correr el programa principal e implementar el guardado de las instancias de {@link DVD} en un {@link CatalogoDVD} y las instancias de {@link CD} en un {@link CatalogoCD}.
 * @author Gemdelle
 */
public class Main {
    private static boolean sistemaCorriendo = true;
    public static void main(String[] args) {
        System.out.println("");
        CatalogoDVD catalogoDVD = new CatalogoDVD();
        CatalogoCD catalogoCD = new CatalogoCD();
        Scanner scanner = new Scanner(System.in);
        while (sistemaCorriendo) {
            System.out.println("ACCIONES\n[1] Ir a Catálogo DVDs\n[2] Ir a Catálogo CDs\n[3] Salir\n¿Qué acción desea realizar?: ");
            int input = scanner.nextInt();
            switch (input) {
                case 1 -> {
                    catalogoDVD.interfazUsuario(scanner);
                }
                case 2 -> {
                    catalogoCD.interfazUsuario(scanner);
                }
                default -> {
                    scanner.close();
                    sistemaCorriendo = false;
                }
            }
        }
    }
}
