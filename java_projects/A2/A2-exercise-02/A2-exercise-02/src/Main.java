// A2 EXERCISE 02
//Dibuje una jerarquía de herencia para las clases Cuadrilátero, Trapezoide, Paralelogramo, Rectángulo y Cuadrado.
//Escriba esta jerarquía en Java. Los datos privados de Cuadrilátero deben ser los pares (x,y) para las cuatro esquinas. Escriba un programa para instanciar objetos de las distintas clases que muestre el área de cada objeto (excepto Cuadrilátero).
public class Main {
    public static void main(String[] args) {
//        01. Instanciar cada figura.
        Cuadrado cuadrado = new Cuadrado(new Punto(0,1),new Punto(1,1),new Punto(1,0),new Punto(0,0));
        Rectangulo rectangulo = new Rectangulo(new Punto(0,1),new Punto(2,1),new Punto(2,0),new Punto(0,0));
        Paralelogramo paralelogramo = new Paralelogramo(new Punto(1,2),new Punto(3,2),new Punto(0,0),new Punto(2,2));
        Trapezoide trapezoide = new Trapezoide(new Punto(0,5),new Punto(1,4),new Punto(0,0),new Punto(-1,4));

//        02. Calcular área de cada figura
        cuadrado.calcularArea();
        rectangulo.calcularArea();
        paralelogramo.calcularArea(); // La cuenta matemática no se puede hacer porque falta la altura, solo se tiene el lado largo.
        trapezoide.calcularArea();
    }
}
