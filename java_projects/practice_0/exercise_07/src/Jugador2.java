import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Jugador2 {
//    01. ATTRIBUTES
    public float saldoBanco = 1000;
    Scanner scanner = new Scanner(System.in);

//    04. METHODS
    public float apostar() {
        System.out.printf("Fondos: %.02f\nIngrese su apuesta: ", saldoBanco);
        int apuesta = scanner.nextInt();
        while (apuesta > saldoBanco) {
            System.out.printf("Fondos: %.02f\nLa apuesta supera los fondos. Ingrese nuevamente su apuesta: ", saldoBanco);
            apuesta = scanner.nextInt();
        }
        return apuesta;
    }

    public int tirarDado() {
        int puntos = new Random().nextInt(6) + 1;
        return puntos;
    }

    public boolean continuar(){
        boolean continuar = false;

        int apuesta = scanner.nextInt();
        System.out.printf("Continuar jugando? [Y/N]");
        String respuesta = scanner.next();
        if(respuesta == "Y") {
            continuar = true;
        }
        return continuar;
    }
    public void jugar(float apuesta, float saldoBanco) {
        int dado1 = tirarDado();
        int dado2 = tirarDado();
        int puntaje = dado1 + dado2;

//        System.out.println("TRY");

        ArrayList<Integer> dado1_tiradas;
        ArrayList<Integer> dado2_tiradas;
        ArrayList<Integer> puntajes;

        if(puntaje == 7 || puntaje == 11){
            saldoBanco += apuesta;
            System.out.printf("Felicidades, ha ganado con un puntaje de %d.\nFondo inicial: %.2f    Fondo actual: %.2f",puntaje,saldoBanco-apuesta,saldoBanco);
        } else {
            charla();
            boolean continuar = continuar();
            int turno = 1;
            while(continuar) {
                dado1 = tirarDado();
                dado2 = tirarDado();
                puntaje = dado1 + dado2;

                if(puntaje == 2 || puntaje == 12 || puntaje ==13) {
                    System.out.printf("Mejor suerte la próxima, ha perdido en la jugada %d con un puntaje de %d",turno,puntaje);
                } else if(puntaje == 4 || puntaje == 5 || puntaje == 6 || puntaje == 8 || puntaje == 9 || puntaje == 10) {
                    int punto = puntaje;
                    System.out.printf("Ha seteado su puntaje en un valor de %d",punto);
                }
                continuar = continuar();
            }
        }
    }

    public void charla() {
        ArrayList<String> frases;
    }

    public void cerrarScanner() {
            scanner.close();
    }
}

