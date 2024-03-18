// EXERCISE 03
//El sector de ventas online de notebooks Lenovo paga a sus vendedores mediante comisiones. Los vendedores reciben $2000 por semana, más el 6% de sus ventas brutas durante esa semana. Por ejemplo,un vendedor que vende $50000 de mercancía en una semana, recibe $2000 más el 6% de $50000, o un total de $5000. Usted acaba de recibir una lista de los artículos vendidos por cada vendedor. Los valores de estos artículos son los siguientes:
//                   $ 9129.753                   $ 6899.954                   $ 13150.89
// Desarrolle una aplicación en JAVA que reciba como entrada los artículos vendidos por un vendedor durante cada día de la última semana, y que calcule y muestre los ingresos de ese vendedor. No hay límite en cuanto al número de artículos que un representante puede vender.

public class Main {
    public static void main(String[] args) {
        Vendedor vendedor1 = new Vendedor("Ro",1,1,1,1,1,2,5,4,3,2,1,2,3,5,6,5);

        vendedor1.calcularIngreso();

        double precio_tablet = 9129.753;
        double precio_computadora = 13150.89;
        double precio_auriculares = 6899.954;
        double ganancia = 2000 + (precio_tablet+precio_computadora+precio_auriculares)*0.06;

        System.out.println("\nValor calculado en consola (lunes): ganancia = " + ganancia);
    }
}
