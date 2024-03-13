// EXERCISE 03
//El sector de ventas online de notebooks Lenovo paga a sus vendedores mediante comisiones. Los vendedores reciben $2000 por semana, más el 6% de sus ventas brutas durante esa semana. Por ejemplo,un vendedor que vende $50000 de mercancía en una semana, recibe $2000 más el 6% de $50000, o un total de $5000. Usted acaba de recibir una lista de los artículos vendidos por cada vendedor. Los valores de estos artículos son los siguientes:
//                   $ 9129.753                   $ 6899.954                   $ 13150.89
// Desarrolle una aplicación en JAVA que reciba como entrada los artículos vendidos por un vendedor durante cada día de la última semana, y que calcule y muestre los ingresos de ese vendedor. No hay límite en cuanto al número de artículos que un representante puede vender.

public class Vendedor {

    //    01. ATTRIBUTES
    String nombre;
    int numero;
    int auriculares_vendidos_lunes;
    int computadoras_vendidas_lunes;
    int tablets_vendidas_lunes;
    int auriculares_vendidos_martes;
    int computadoras_vendidas_martes;
    int tablets_vendidas_martes;
    int auriculares_vendidos_miercoles;
    int computadoras_vendidas_miercoles;
    int tablets_vendidas_miercoles;
    int auriculares_vendidos_jueves;
    int computadoras_vendidas_jueves;
    int tablets_vendidas_jueves;
    int auriculares_vendidos_viernes;
    int computadoras_vendidas_viernes;
    int tablets_vendidas_viernes;
    double saldo_inicial = 2000.0;

    //    02. CONSTRUCTOR
    public Vendedor(String nombre, int numero, int auriculares_vendidos_lunes, int computadoras_vendidas_lunes, int tablets_vendidas_lunes, int auriculares_vendidos_martes, int computadoras_vendidas_martes, int tablets_vendidas_martes, int auriculares_vendidos_miercoles, int computadoras_vendidas_miercoles, int tablets_vendidas_miercoles, int auriculares_vendidos_jueves, int computadoras_vendidas_jueves, int tablets_vendidas_jueves, int auriculares_vendidos_viernes, int computadoras_vendidas_viernes, int tablets_vendidas_viernes) {
        this.nombre = nombre;
        this.numero = numero;
        this.auriculares_vendidos_lunes = auriculares_vendidos_lunes;
        this.computadoras_vendidas_lunes = computadoras_vendidas_lunes;
        this.tablets_vendidas_lunes = tablets_vendidas_lunes;
        this.auriculares_vendidos_martes = auriculares_vendidos_martes;
        this.computadoras_vendidas_martes = computadoras_vendidas_martes;
        this.tablets_vendidas_martes = tablets_vendidas_martes;
        this.auriculares_vendidos_miercoles = auriculares_vendidos_miercoles;
        this.computadoras_vendidas_miercoles = computadoras_vendidas_miercoles;
        this.tablets_vendidas_miercoles = tablets_vendidas_miercoles;
        this.auriculares_vendidos_jueves = auriculares_vendidos_jueves;
        this.computadoras_vendidas_jueves = computadoras_vendidas_jueves;
        this.tablets_vendidas_jueves = tablets_vendidas_jueves;
        this.auriculares_vendidos_viernes = auriculares_vendidos_viernes;
        this.computadoras_vendidas_viernes = computadoras_vendidas_viernes;
        this.tablets_vendidas_viernes = tablets_vendidas_viernes;
    }

//    03. METHODS
    public void calcularIngreso(int auriculares_vendidos_lunes, int computadoras_vendidas_lunes, int tablets_vendidas_lunes, int auriculares_vendidos_martes, int computadoras_vendidas_martes, int tablets_vendidas_martes, int auriculares_vendidos_miercoles, int computadoras_vendidas_miercoles, int tablets_vendidas_miercoles, int auriculares_vendidos_jueves, int computadoras_vendidas_jueves, int tablets_vendidas_jueves, int auriculares_vendidos_viernes, int computadoras_vendidas_viernes, int tablets_vendidas_viernes) {
        double precio_tablet = 9129.753;
        double precio_computadora = 13150.89;
        double precio_auriculares = 6899.954;

        double ganancias_lunes = saldo_inicial + auriculares_vendidos_lunes * precio_auriculares + tablets_vendidas_lunes * precio_tablet + computadoras_vendidas_lunes * precio_computadora;
        double ganancias_martes = saldo_inicial + auriculares_vendidos_martes * precio_auriculares + tablets_vendidas_martes * precio_tablet + computadoras_vendidas_martes * precio_computadora;
        double ganancias_miercoles = saldo_inicial + auriculares_vendidos_miercoles * precio_auriculares + tablets_vendidas_miercoles * precio_tablet + computadoras_vendidas_miercoles * precio_computadora;
        double ganancias_jueves = saldo_inicial + auriculares_vendidos_jueves * precio_auriculares + tablets_vendidas_jueves * precio_tablet + computadoras_vendidas_jueves * precio_computadora;
        double ganancias_viernes = saldo_inicial + auriculares_vendidos_viernes * precio_auriculares + tablets_vendidas_viernes * precio_tablet + computadoras_vendidas_viernes * precio_computadora;

        double[] ganancias = {ganancias_lunes,ganancias_martes,ganancias_miercoles,ganancias_jueves,ganancias_viernes};
        String[] dias = {"lunes","martes","miercoles","jueves","viernes"};

        for(int i = 0;i<ganancias.length;i++) {
            System.out.printf("Ganancia %s: %.2f\n",dias[i],ganancias[i]);
        }
    }
}


