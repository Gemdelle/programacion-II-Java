// EXERCISE 03
//El sector de ventas online de notebooks Lenovo paga a sus vendedores mediante comisiones. Los vendedores reciben $2000 por semana, más el 6% de sus ventas brutas durante esa semana. Por ejemplo,un vendedor que vende $50000 de mercancía en una semana, recibe $2000 más el 6% de $50000, o un total de $5000. Usted acaba de recibir una lista de los artículos vendidos por cada vendedor. Los valores de estos artículos son los siguientes:
//                   $ 9129.753                   $ 6899.954                   $ 13150.89
// Desarrolle una aplicación en JAVA que reciba como entrada los artículos vendidos por un vendedor durante cada día de la última semana, y que calcule y muestre los ingresos de ese vendedor. No hay límite en cuanto al número de artículos que un representante puede vender.

public class Vendedor {

    //    01. ATTRIBUTES
    String nombre;
    int numero;
    int auricularesVendidosLunes;
    int computadorasVendidasLunes;
    int tabletsVendidasLunes;
    int auricularesVendidosMartes;
    int computadorasVendidasMartes;
    int tabletsVendidasMartes;
    int auricularesVendidosMiercoles;
    int computadorasVendidasMiercoles;
    int tabletsVendidasMiercoles;
    int auricularesVendidosJueves;
    int computadorasVendidasJueves;
    int tabletsVendidasJueves;
    int auricularesVendidosViernes;
    int computadorasVendidasViernes;
    int tabletsVendidasViernes;
    double saldoInicial = 2000.0;

    //    02. CONSTRUCTOR
    public Vendedor(String nombre, int numero, int auricularesVendidosLunes, int computadorasVendidasLunes, int tabletsVendidasLunes, int auricularesVendidosMartes, int computadorasVendidasMartes, int tabletsVendidasMartes, int auricularesVendidosMiercoles, int computadorasVendidasMiercoles, int tabletsVendidasMiercoles, int auricularesVendidosJueves, int computadorasVendidasJueves, int tabletsVendidasJueves, int auricularesVendidosViernes, int computadorasVendidasViernes, int tabletsVendidasViernes) {
        this.nombre = nombre;
        this.numero = numero;
        this.auricularesVendidosLunes = auricularesVendidosLunes;
        this.computadorasVendidasLunes = computadorasVendidasLunes;
        this.tabletsVendidasLunes = tabletsVendidasLunes;
        this.auricularesVendidosMartes = auricularesVendidosMartes;
        this.computadorasVendidasMartes = computadorasVendidasMartes;
        this.tabletsVendidasMartes = tabletsVendidasMartes;
        this.auricularesVendidosMiercoles = auricularesVendidosMiercoles;
        this.computadorasVendidasMiercoles = computadorasVendidasMiercoles;
        this.tabletsVendidasMiercoles = tabletsVendidasMiercoles;
        this.auricularesVendidosJueves = auricularesVendidosJueves;
        this.computadorasVendidasJueves = computadorasVendidasJueves;
        this.tabletsVendidasJueves = tabletsVendidasJueves;
        this.auricularesVendidosViernes = auricularesVendidosViernes;
        this.computadorasVendidasViernes = computadorasVendidasViernes;
        this.tabletsVendidasViernes = tabletsVendidasViernes;
    }

//    03. METHODS
    public void calcularIngreso() {
        double precioTablet = 9129.753;
        double precioComputadora = 13150.89;
        double precioAuriculares = 6899.954;

        double gananciasLunes = saldoInicial + (auricularesVendidosLunes * precioAuriculares + tabletsVendidasLunes * precioTablet + computadorasVendidasLunes * precioComputadora) * 0.06;
        double gananciasMartes = saldoInicial + (auricularesVendidosMartes * precioAuriculares + tabletsVendidasMartes * precioTablet + computadorasVendidasMartes * precioComputadora) * 0.06;
        double gananciasMiercoles = saldoInicial + (auricularesVendidosMiercoles * precioAuriculares + tabletsVendidasMiercoles * precioTablet + computadorasVendidasMiercoles * precioComputadora) * 0.06;
        double gananciasJueves = saldoInicial + (auricularesVendidosJueves * precioAuriculares + tabletsVendidasJueves * precioTablet + computadorasVendidasJueves * precioComputadora) * 0.06;
        double gananciasViernes = saldoInicial + (auricularesVendidosViernes * precioAuriculares + tabletsVendidasViernes * precioTablet + computadorasVendidasViernes * precioComputadora) * 0.06;

        double[] ganancias = {gananciasLunes, gananciasMartes, gananciasMiercoles,gananciasJueves,gananciasViernes};
        String[] dias = {"lunes","martes","miercoles","jueves","viernes"};

        System.out.printf("\nGanancias de Vendedor %s\n",nombre);
        for(int i = 0;i<ganancias.length;i++) {
            System.out.printf("Ganancia %s: %.2f\n",dias[i],ganancias[i]);
        }
    }
}


