//Ejercicio 1:
//        1- Un club tiene socios.
//        a) Crear la clase Socio con variables de instancia: nombre, número y variable de Clase: PróximoNúmero.
//        b) Agregar los métodos de acceso y modificación.
//        c) Inicializar en 1 el próximo número.
//        d) Crear un socio, mostrar sus datos
//        e) Crear otro socio, mostrar sus datos
//
//        2- Crear la clase administrativo con atributos nombre y sueldo.
//        Incluir métodos de acceso y modificación. Agregar dos métodos de clase para prueba:
//        - ejemplo1: crea un administrativo con datos a ingresar por el operador y lo muestra.
//        - ejemplo2: crea dos administrativos (usando el ejemplo1) e indica además cuál gana más.
//        - Agregar teléfono en la clase administrativo. Hacer que el método toString lo incluya.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        EJERCICIO 01
//        Socio socio1 = new Socio();
//        Socio socio2 = new Socio();
//
//        socio1.setNombre("Gemy");
//        socio2.setNombre("Hunny");
//
//        socio1.setNumero(1);
//        socio2.setNumero(2);
//
//        String string_print = String.format("Socio N°%d: %s\nSocio N°%d: %s\nPróximo número: %d\n", socio1.getNumero(), socio1.getNombre(), socio2.getNumero(), socio2.getNombre(), Socio.proximoNumero);
//
//        System.out.println(string_print);

//        EJERCICIO 02

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el nombre del administrativo 1: ");
        String input_nombre = scanner.next();
        System.out.println("Ingrese el sueldo del administrativo 1: ");
        int input_sueldo = scanner.nextInt();
        System.out.println("Ingrese el teléfono del administrativo 1: ");
        int input_telefono = scanner.nextInt();

        System.out.println("Ingrese el nombre del administrativo 2: ");
        String input2_nombre = scanner.next();
        System.out.println("Ingrese el sueldo del administrativo 2: ");
        int input2_sueldo = scanner.nextInt();
        System.out.println("Ingrese el teléfono del administrativo 2: ");
        int input2_telefono = scanner.nextInt();
        scanner.close();

        Administrativo administrativo1 = new Administrativo(input_nombre,input_sueldo,input_telefono);
        administrativo1.presentacion();

        Administrativo administrativo2 = new Administrativo(input2_nombre,input2_sueldo,input2_telefono);
        administrativo1.compararSueldos(administrativo2);

        System.out.printf("\n\n" + administrativo1.getTelefono() + "\n");
        System.out.printf("El próximo número es %d",Socio.proximoNumero);
    }
}
