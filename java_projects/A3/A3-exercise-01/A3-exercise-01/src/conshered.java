// A3 EXERCISE 03
//Respuesta
//        Madre
//        Hija
public class conshered {
    public static void main(String[] args) {
        Hija2 h = new Hija2(2);
    }
}

class Madre2 {
    public Madre2(int mm) {
        System.out.println("Madre");
    }
}

class Hija2 extends Madre2 {
    public Hija2(int ff) {
        super(ff);
        System.out.println("Hija");
    }
}
