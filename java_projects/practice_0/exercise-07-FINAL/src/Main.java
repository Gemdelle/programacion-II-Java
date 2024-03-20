//// EXERCISE 07
//// Un juego de azar popular es el juego de dados conocido como “Craps”, el cual se juega en casinos y callejones portodo el mundo. Las reglas del juego son simples:
//// Un jugador tira dos dados.
//// Cada uno tiene seis caras, las cuales contienen uno, dos, tres cuatro, cinco y seis puntos negros, respectivamente.
//// Una vez que los dados dejan de moverse, se calcula la suma de los puntos negros en las dos caras superiores.
//// Si la suma es 7 u 11 en el primer tiro, el jugador gana.
//// Si la suma es 2, 3 o 12 en el primer tiro (llamado “Craps”), el jugador pierde (es decir, la “casa” gana).
//// Si la suma es 4, 5, 6, 8, 9 o 10 en el primer tiro, esta suma se convierte en el  “punto” del jugador.
//// Para ganar, el jugador debe seguir tirando los dados hasta que salga otra vez “su punto” (es decir, que tire ese mismo valor de punto).
//// El jugador pierde si tira un 7 antes de llegar a su punto.
//
//// Apuestas
//// Iniciar la variable saldoBanco con $1,000.
//// Pida al jugador que introduzca una apuesta. Compruebe que esa apuesta sea menor o igual que saldoBanco y,
//// si no lo es, haga que el usuario vuelva a introducir la apuesta hasta que se ingrese un valor válido.
//
//// Después de esto, comience un juego de Craps.
//// Si el jugador gana, agregue la apuesta al saldoBanco e imprima el nuevo saldoBanco.
//// Si pierde, reste la apuesta al saldoBanco, imprima el nuevo saldoBanco, compruebe si saldoBanco se ha vuelto cero y, de ser así, imprima el mensaje "Lo siento. Se quedo sin fondos! ”
//// A medida que el juego progrese, imprima varios mensajes para crear algo de “charla”, como "Oh, se esta yendo a la quiebra, verdad?”,o “Oh, vamos, arriesguese!”, o “La hizo en grande. Ahora es tiempo de cambiar sus fichas por efectivo!
//// Implemente la “charla” como un método separado que seleccione en forma aleatoria la cadena a mostrar.

public class Main {
    public static void main(String[] args) {
        Jugador jugador1 = new Jugador();
        jugador1.craps();
    }
}
