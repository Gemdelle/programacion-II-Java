public class Trapezoide extends Cuadrilatero{
//    02. CONSTRUCTOR
    public Trapezoide(Punto punto1, Punto punto2, Punto punto3, Punto punto4) {
        super(punto1, punto2, punto3, punto4);
    }

//    04. METHODS
    @Override
    public void calcularArea() {
        int ladoLargo = calcularLado(punto1,punto3);
        int ladoCorto = calcularLado(punto2,punto4);
        System.out.printf("El área del %s es %d\n",getClass().getName(),ladoCorto * ladoLargo);
    }
}
