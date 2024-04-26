// A2 EXERCISE 05
//Modifique la aplicación que administra DVD y CD utilizando el concepto de herencia.

// ----------------------------------------------------------------
// Atributos en común
// titulo
// genero;
// duracion;
// obtenido;
// comentario;

// ----------------------------------------------------------------
// INDEPENDIENTES
// DVD
// director;

// CD
// interprete;
// cantidad_temas;

// ----------------------------------------------------------------
// Métodos en común de Catálogos
// EDITAR
// agregar()
// eliminar()
// modificarObtenido()
// modificarComentario()

//LISTAR
// listarTodo()
// listarObtenidos()
// listarTiempoMenor()
// listarAlfabetico()

//INFORMAR
// contarTodo()
// contarObtenido()

// ----------------------------------------------------------------
// INDEPENDIENTES
// CD
// listarInterprete()
// cantidadTemasPorCD()

// DVD
// listarDirector()
// ----------------------------------------------------------------

import java.util.Scanner;

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
                case 1 ->
                    catalogoDVD.interfazUsuario(scanner);
                case 2 ->
                    catalogoCD.interfazUsuario(scanner);
                default -> {
                    scanner.close();
                    sistemaCorriendo = false;
                }
            }
        }
    }
}
