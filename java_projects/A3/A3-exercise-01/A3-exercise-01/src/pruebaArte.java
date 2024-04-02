// A3 EXERCISE 04
//	Respuesta
//            Constructor de Arte 100
//            Constructor Dibujo
//            Constructor Dibujo Animado
class Arte {
    Arte () {
        System.out.println("Constructor de Arte");
    }

    Arte (int i) {
        System.out.println("Constructor de Arte " + i);
    }
}

class Dibujo extends Arte{
    Dibujo () {
        super(100);
        System.out.println("Constructor Dibujo" );
    }
}

class DibujoAnimado extends Dibujo {
    DibujoAnimado () {
        System.out.println("Constructor Dibujo Animado" );
    }
}

public class pruebaArte {
    public static void main(String[] args) {
        DibujoAnimado donald = new DibujoAnimado();
    }
}

