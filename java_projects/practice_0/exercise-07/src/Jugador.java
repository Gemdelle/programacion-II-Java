import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Jugador {
    //01. ATTRIBUTES
    private float saldoBanco = 1000;

    //04. METHODS

    public float ingresarApuesta() {
        System.out.println("⚅ ⚄ ⚃ ⚂ ⚁ ⚀ \uD835\uDD6D\uD835\uDD8E\uD835\uDD8A\uD835\uDD93\uD835\uDD9B\uD835\uDD8A\uD835\uDD93\uD835\uDD8E\uD835\uDD89\uD835\uDD94 ⚀ ⚁ ⚂ ⚃ ⚄ ⚅ ⚅");
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Saldo: %.2f\nIngrese su apuesta: ", saldoBanco);
        float apuesta = Float.parseFloat(scanner.nextLine());
        while (apuesta > saldoBanco) {
            System.out.printf("Ingrese una apuesta menor al saldo disponible ➤ %.2f\nApuesta: ", saldoBanco);
            apuesta = Float.parseFloat(scanner.nextLine());
        }
        System.out.printf("Ha ingresado una apuesta de %.2f\n", apuesta);
        return apuesta;
    }

    public int tirarDado() {
        return new Random().nextInt(6) + 1;
    }

    public void jugada(float apuesta) {

        System.out.println("\n⚅ ⚄ ⚃ ⚂ ⚁ ⚀ \uD835\uDCD2\uD835\uDCE1\uD835\uDCD0\uD835\uDCDF\uD835\uDCE2 \uD835\uDCD6\uD835\uDCEA\uD835\uDCF6\uD835\uDCEE ⚀ ⚁ ⚂ ⚃ ⚄ ⚅ ⚅");

        boolean seguirJugando = true;
        while (seguirJugando) {

            // valor de dado 1 y dado 2
            int dado1 = tirarDado();
            int dado2 = tirarDado();
            int puntos = dado1 + dado2;
            int jugada = 1;
            float saldoInicial = saldoBanco;

            if (puntos == 7 || puntos == 11) {
                saldoBanco += apuesta;
                System.out.printf("\nFelicidades, ha ganado con los valores %d y %d ➤ %d en la jugada %d\nSaldo inicial = %.2f / Saldo actual = %.2f\n", dado1, dado2, puntos, jugada, saldoInicial, saldoBanco);
                charla();
            } else if (puntos == 2 || puntos == 3 || puntos == 12) {
                saldoBanco -= apuesta;
                System.out.printf("\nMejor suerte la próxima, ha perdido con  los valores %d y %d ➤ %d en la jugada %d\nSaldo inicial = %.2f / Saldo actual = %.2f\n", dado1, dado2, puntos, jugada, saldoInicial, saldoBanco);
                charla();
            } else {
                System.out.printf("\nHa obtenido un puntaje de %d y %d ➤ %d en la jugada %d\n", dado1, dado2, puntos, jugada);
                int punto = puntos;
                System.out.printf("----- El valor de su punto es ➤ %d -----\n", punto);
                do {
                    jugada += 1;
                    dado1 = tirarDado();
                    dado2 = tirarDado();
                    puntos = dado1 + dado2;
                    System.out.printf("Ha obtenido un puntaje de %d y %d ➤ %d en la jugada %d\n", dado1, dado2, puntos, jugada);

                } while (puntos != 7 && puntos != punto);
                charla();

                if (puntos == 7) {
                    saldoBanco -= apuesta;
                    System.out.printf("\nMejor suerte la próxima, ha perdido con  los valores %d y %d ➤ %d en la jugada %d\nSaldo inicial = %.2f / Saldo actual = %.2f\n", dado1, dado2, puntos, jugada, saldoInicial, saldoBanco);
                } else {
                    saldoBanco += apuesta;
                    System.out.printf("\nFelicidades, ha igualado su punto %d con los valores %d y %d ➤ %d en la jugada %d\nSaldo inicial = %.2f / Saldo actual = %.2f\n", punto, dado1, dado2, puntos, jugada, saldoInicial, saldoBanco);
                }
            }

            if (saldoBanco == 0) {
                System.out.println("\nLo siento, ¡se quedo sin fondos!");
                seguirJugando = false;
            } else {
                Scanner scanner = new Scanner(System.in);
                System.out.println("\n¿Seguir jugando? [Y/N]: ");
                String respuestaJuego = scanner.nextLine().toUpperCase();
                if (respuestaJuego.equals("N")) {
                    System.out.printf("⚅ ⚄ ⚃ ⚂ ⚁ ⚀ Se retira con un saldo de %.2f. Gracias por visitar el casino. ⚀ ⚁ ⚂ ⚃ ⚄ ⚅ ⚅",saldoBanco);
                    seguirJugando = false;
                } else {
                    apuesta = ingresarApuesta();
                }
            }
        }
    }

    public void charla() {
        String frase1 = "\uD835\uDCDE\uD835\uDCF1, \uD835\uDCFC\uD835\uDCEE \uD835\uDCEE\uD835\uDCFC\uD835\uDCFD\uD835\uDCEA \uD835\uDD02\uD835\uDCEE\uD835\uDCF7\uD835\uDCED\uD835\uDCF8 \uD835\uDCEA \uD835\uDCF5\uD835\uDCEA \uD835\uDCFA\uD835\uDCFE\uD835\uDCF2\uD835\uDCEE\uD835\uDCEB\uD835\uDCFB\uD835\uDCEA, \uD835\uDCFF\uD835\uDCEE\uD835\uDCFB\uD835\uDCED\uD835\uDCEA\uD835\uDCED?";
        String frase2 = "\uD835\uDCDE\uD835\uDCF1, \uD835\uDCFF\uD835\uDCEA\uD835\uDCF6\uD835\uDCF8\uD835\uDCFC, \uD835\uDCEA\uD835\uDCFB\uD835\uDCFB\uD835\uDCF2\uD835\uDCEE\uD835\uDCFC\uD835\uDCF0\uD835\uDCFE\uD835\uDCEE\uD835\uDCFC\uD835\uDCEE!";
        String frase3 = "\uD835\uDCDB\uD835\uDCEA \uD835\uDCF1\uD835\uDCF2\uD835\uDD03\uD835\uDCF8 \uD835\uDCEE\uD835\uDCF7 \uD835\uDCF0\uD835\uDCFB\uD835\uDCEA\uD835\uDCF7\uD835\uDCED\uD835\uDCEE. \uD835\uDCD0\uD835\uDCF1\uD835\uDCF8\uD835\uDCFB\uD835\uDCEA \uD835\uDCEE\uD835\uDCFC \uD835\uDCFD\uD835\uDCF2\uD835\uDCEE\uD835\uDCF6\uD835\uDCF9\uD835\uDCF8 \uD835\uDCED\uD835\uDCEE \uD835\uDCEC\uD835\uDCEA\uD835\uDCF6\uD835\uDCEB\uD835\uDCF2\uD835\uDCEA\uD835\uDCFB \uD835\uDCFC\uD835\uDCFE\uD835\uDCFC \uD835\uDCEF\uD835\uDCF2\uD835\uDCEC\uD835\uDCF1\uD835\uDCEA\uD835\uDCFC \uD835\uDCF9\uD835\uDCF8\uD835\uDCFB \uD835\uDCEE\uD835\uDCEF\uD835\uDCEE\uD835\uDCEC\uD835\uDCFD\uD835\uDCF2\uD835\uDCFF\uD835\uDCF8!";

        List<String> frases = new ArrayList<>();
        frases.add(frase1);
        frases.add(frase2);
        frases.add(frase3);

        int index = new Random().nextInt(2)+1;
        System.out.println(frases.get(index));
    }

    public void craps() {
        float apuesta = ingresarApuesta();
        jugada(apuesta);
    }
}
