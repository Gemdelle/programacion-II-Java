
public class Cuadrilatero {
    //    01. ATTRIBUTES
    protected Punto punto1;
    protected Punto punto2;
    protected Punto punto3;
    protected Punto punto4;

    //    02. CONSTRUCTOR
    public Cuadrilatero(Punto punto1, Punto punto2, Punto punto3, Punto punto4) {
        this.punto1 = punto1;
        this.punto2 = punto2;
        this.punto3 = punto3;
        this.punto4 = punto4;
    }

//        03. SETTERS & GETTERS
    public Punto getPunto1() {
        return punto1;
    }

    public void setPunto1(Punto punto1) {
        this.punto1 = punto1;
    }

    public Punto getPunto2() {
        return punto2;
    }

    public void setPunto2(Punto punto2) {
        this.punto2 = punto2;
    }

    public Punto getPunto3() {
        return punto3;
    }

    public void setPunto3(Punto punto3) {
        this.punto3 = punto3;
    }

    public Punto getPunto4() {
        return punto4;
    }

    public void setPunto4(Punto punto4) {
        this.punto4 = punto4;
    }

    //    04. METHODS
    public int calcularLado(Punto puntoA, Punto puntoB) {
        // fórmula para calcular un lado l = √(x2 - x1)^2 + (y2 - y1)^2
        double distancia = Math.sqrt(Math.pow(puntoB.x - puntoA.x, 2) + Math.pow(puntoB.y - puntoA.y, 2));
        return Long.valueOf(Math.round(distancia)).intValue();
    }

    public void calcularArea() {
        int ladoCorto = calcularLado(punto1,punto2);
        int ladoLargo = calcularLado(punto2,punto3);
        System.out.printf("El área del %s es %d\n",getClass().getName(),ladoCorto * ladoLargo);
    }
}
