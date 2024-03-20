import java.util.Random;
import java.util.Scanner;

public class Jugador {
    //01. ATTRIBUTES
    private float saldoBanco = 1000;

    //02. CONSTRUCTOR
    public Jugador() {
        this.saldoBanco = saldoBanco;
    }

    //04. METHODS

    public float ingresarApuesta()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Saldo: %.2f\nIngrese su apuesta: ",saldoBanco);
        float apuesta = Float.parseFloat(scanner.nextLine());
        while(apuesta > saldoBanco)
        {
            System.out.printf("Ingrese una apuesta menor al saldo disponible ➤ %.2f\nApuesta: ",saldoBanco);
            apuesta = Float.parseFloat(scanner.nextLine());
        }
        System.out.printf("Ha ingresado una apuesta de %.2f",apuesta);
        return apuesta;
    }
    public int tirarDado()
    {
        Random random = new Random();
        int valorCara = random.nextInt(6)+1;
        return valorCara;
    }

    public void jugada()
    {
        // valor de dado 1 y dado 2
        int dado1 = tirarDado();
        int dado2 = tirarDado();
        int puntos = dado1 + dado2;
        int jugada = 1;

        if(puntos == 7 || puntos == 11)
        {
            System.out.printf("Felicidades, ha ganado con los valores %d y %d ➤ %d en la jugada %d\n",dado1,dado2,puntos,jugada);
        } else if(puntos == 2 || puntos == 3 || puntos == 12)
        {
            System.out.printf("Mejor suerte la próxima, ha perdido con  los valores %d y %d ➤ %d en la jugada %d\n",dado1,dado2,puntos,jugada);
        } else {
            int punto = puntos;
            do {
                System.out.printf("Ha obtenido un puntaje de %d y %d ➤ %d en la jugada %d\n", dado1, dado2, puntos, jugada);
                jugada += 1;
                dado1 = tirarDado();
                dado2 = tirarDado();
                puntos = dado1 + dado2;

            } while (puntos != 7 && puntos != punto);

            if(puntos == 7)
            {
                System.out.printf("Mejor suerte la próxima, ha perdido con  los valores %d y %d ➤ %d en la jugada %d\n",dado1,dado2,puntos,jugada);
            } else {
                System.out.printf("Felicidades, ha igualado su punto %d con los valores %d y %d ➤ %d en la jugada %d\n",punto,dado1,dado2,puntos,jugada);
            }
        }
    }
}
