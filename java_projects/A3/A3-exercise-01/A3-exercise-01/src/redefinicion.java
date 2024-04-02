// A3 EXERCISE 02
//Respuesta
//        Soy de la clase Madre
//        Soy de la clase Hija
//        Soy de la clase Hija
public class  redefinicion {
    public static void main(String[] args) {
        Madre m = new Madre();
        m.habla();
        Hija h = new Hija();
        h.habla();
        Nieta n = new Nieta();
        n.habla();
    }
}

class Madre {
    public void habla() {
        System.out.println("Soy de la clase Madre");
    }
}

class Hija extends Madre {
    public void habla() {
        System.out.println("Soy de la clase Hija");
    }
}

class Nieta extends Hija {
    public void otro() {
        System.out.println("Soy de la clase Nieta");
    }
}
