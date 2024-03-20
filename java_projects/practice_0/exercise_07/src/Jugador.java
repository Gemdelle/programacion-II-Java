import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Jugador {

    //    01. ATTRIBUTES
    public int saldo_banco = 1000;
    private ArrayList<Integer> tiradas;
    private ArrayList<String> frases;

    //    02. CONSTRUCTOR
    public Jugador() {
        tiradas = new ArrayList<>();
        frases = new ArrayList<>();
        frases.add("Oh, se esta yendo a la quiebra, verdad?");
        frases.add("Oh, vamos, arriésguese");
        frases.add("La hizo en grande. Ahora es tiempo de cambiar sus fichas por efectivo!");
        Scanner scanner = new Scanner(System.in);


        System.out.print("Por favor, ingrese un número: ");
        // Leer el número ingresado por el usuario
        int numeroIngresado = scanner.nextInt();
        System.out.println("Usted ingresó el número: " + numeroIngresado);


    }

    //    03. METHODS
    public int tirarDado() {
        int valor = new Random().nextInt(6) + 1;
        return valor;
    }

    public int primeraJugada() {
        int valor1 = tirarDado();
        int valor2 = tirarDado();
        int suma = valor1 + valor2;
        System.out.printf("Tirada 1\nValor 1 = %d   Valor 2 = %d   Puntos = %d", valor1, valor2, suma);
        return suma;
    }

    public int jugada() {
        int valor1 = tirarDado();
        int valor2 = tirarDado();
        int suma = valor1 + valor2;
        return suma;
    }

    public void imprimirJugadas(int tirada) {
        System.out.println("\nValores tiradas");
        int index = 2;
        for (int tiro : tiradas) {
            System.out.printf("Tirada %d = %d%n", index++, tirada);
        }
    }

    public void charla() {
        int index_frase = new Random().nextInt(3) + 1;
        System.out.println(frases.get(index_frase));
    }

    public int apuesta() {

    }
    public void jugar() {
        int primera_jugada = primeraJugada();

        if (primera_jugada == 7 || primera_jugada == 11) {
            System.out.printf("\nFelicidades, ha ganado con una suma de %d en la primera tirada", primera_jugada);
        } else if (primera_jugada == 2 || primera_jugada == 3 || primera_jugada == 12) {
            System.out.printf("\nMejor suerte la próxima, sacó un Scrap con un valor de %d en la primera tirada", primera_jugada);
        } else {
            int jugada = jugada();
            int tirada = 2;
            while (jugada != 7 && jugada != primera_jugada) {
                tiradas.add(jugada);
                tirada += 1;
                jugada = jugada();
            }
            if (jugada == 7) {
                tiradas.add(jugada);
                imprimirJugadas(tirada);
                System.out.printf("\nMejor suerte la próxima, ha perdido en la jugada n %d con una suma de 7.", tirada);

            } else if (jugada == primera_jugada) {
                tiradas.add(jugada);
                imprimirJugadas(tirada);
                System.out.printf("\nFelicidades, ha ganado en la jugada n %d con una suma de %d.", tirada, jugada);

            }
        }

        // Cerrar el objeto Scanner
//        scanner.close();
    }

}

