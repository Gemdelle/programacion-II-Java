public class Cuadrado extends Cuadrilatero {
//    02. CONSTRUCTOR
    public Cuadrado(Punto punto1, Punto punto2, Punto punto3, Punto punto4) {
        super(punto1, punto2, punto3, punto4);
    }

    //    04. METHODS
    @Override
    public void calcularArea() {
        int lado = calcularLado(punto1,punto2);
        System.out.printf("El área del %s es %d\n",getClass().getName(),lado * lado);
    }
}
