public class CuentaDeAhorros {
    // 01. ATTRIBUTES
        private static float tasaInteresAnual;
        private float saldoAhorros;

    // 02. CONSTRUCTOR
    public CuentaDeAhorros(int saldoAhorros)
    {
        this.saldoAhorros = saldoAhorros;
    }

    // 03. SETTERS & GETTERS
    public static float getTasaInteresAnual() {
        return tasaInteresAnual;
    }

    public static void setTasaInteresAnual(float tasaInteresAnual) {
        CuentaDeAhorros.tasaInteresAnual = tasaInteresAnual;
    }

    public float getSaldoAhorros() {
        return saldoAhorros;
    }

    public void setSaldoAhorros(float saldoAhorros) {
        this.saldoAhorros = saldoAhorros;
    }

    // 03. METHODS
    // Proporcione el método calcularlnteresMensual para calcular el interés mensual multiplicando el saldoAhorros por la tasalnteresAnual dividida entre 12; este interés debe sumarse al saldoAhorros.
    public void calcularlnteresMensual(int cantidadMeses)
    {
        float interes = saldoAhorros * tasaInteresAnual / 12;

        System.out.printf("\nCÁLCULO DE TASA DE INTERÉS DEL %.2f PARA %d MESES\nSaldo original: %.2f\nTasa de interés mensual: %.2f\n\n",tasaInteresAnual,cantidadMeses,saldoAhorros,interes);
        for(int i = 0; i < cantidadMeses; i++)
        {
            System.out.printf("Mes %d: %.2f\n",i+1,saldoAhorros+interes);
            saldoAhorros += interes;
        }
    }

    // Proporcione un método static llamado modificar Tasalnteres para establecer la tasalnteresAnual en un nuevo valor.
    public static void modificarTasaInteres(float tasaInteres)
    {
        CuentaDeAhorros.tasaInteresAnual = tasaInteres;
    }
}
