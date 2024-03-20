

public class Main {
    public static void main(String[] args) {
        Jugador2 jugador = new Jugador2();

        float apostar = jugador.apostar();
        jugador.jugar(apostar, jugador.saldoBanco);

        jugador.cerrarScanner();
    }
}
