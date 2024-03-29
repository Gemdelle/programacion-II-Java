public class Fecha {

    //01. ATRIBUTOS

    private int mes;
    private int dia;
    private int year;


    //02. CONSTRUCTURES

    //CONSTRUCTOR 1: INT-INT-INT
    public Fecha(int mes, int dia, int year) {
        verificarFecha1(mes, dia,year);
        this.mes = mes;
        this.dia = dia;
        this.year = year;
    }

    //CONSTRUCTOR 2: STR-INT-INT
    public Fecha(String mes, int dia, int year) {
        verificarFecha2(mes,dia,year);
        this.mes= Integer.parseInt(mes);
        this.dia= dia;
        this.year= year;
    }

    //CONSTRUCTOR 3: INT-STR-INT
    public Fecha(int dia, String mes, int year) {
        verificarFecha3(dia,mes,year);
        this.dia= dia;
        this.mes= Integer.parseInt(mes);
        this.year= year;
        asignarNombreMes(this.mes); //SE PONE THIS PARA DIFERENCIAR EL CAMPO DE LA CLASE NO AL PARAMETRO DEL CONSTRUCTOR O MÉTODO
    }


    //03. GETTERS Y SETTERS

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }


    //04. MÉTODOS


//VERIFICAR QUE LOS VALORES DE LOS CONSTRUCTORES SEAN CORRECTOS 

    private void verificarFecha1(int mes,int dia, int year) {
        if (mes <1 | mes > 12){
            throw new IllegalArgumentException("Día inválido: " + dia);
        }
        if (dia < 1 || dia > 31 ){
            throw new IllegalArgumentException("Mes innválido: " + mes);
        }
        if (year < 1 || year >2024){
            throw new IllegalArgumentException("Año inválido: "+ year);
        }

    }

    private void verificarFecha2 (String mes,int dia, int year) {
        if (dia < 1 || dia > 31) {
            throw new IllegalArgumentException("Día inválido: " + dia);
        }
        if (Integer.parseInt(mes) < 1 || Integer.parseInt(mes) > 12) {
            throw new IllegalArgumentException("Mes inválido: " + mes);
        }
        if (year < 1 || year > 2024) {
            throw new IllegalArgumentException("Año inválido: " + year);
        }
    }

    private void verificarFecha3(int dia,String mes ,int year) {
        if (dia < 1 || dia > 31) {
            throw new IllegalArgumentException("Día inválido: " + dia);
        }
        if (Integer.parseInt(mes) < 1 || Integer.parseInt(mes) > 12) {
            throw new IllegalArgumentException("Mes inválido: " + mes);
        }
        if (year < 1 || year > 2024) {
            throw new IllegalArgumentException("Año inválido: " + year);
        }
    }


//MOSTRAR LA FECHA DE DIFERENTES MANERAS

    public void mostrarFecha() {
        //FORMATO DD/MM/AAAA
        System.out.println(String.format("%02d/%02d/%04d", mes, dia, year));

        //FORMATO MES DIA AÑO: SE NECESITA OBTENER EL NOMBRE DEL MES ASIGNADO A CADA NUMERO
        String nombreMes= asignarNombreMes(mes); //VARIABLE QUE ALMACENA EL RESULTADO DE LA FUNCION ASIGNARNOMBREMES
        System.out.println(String.format("%s %02d %04d", nombreMes,dia,year));

        //FORMATO DIA MES AÑO:
        System.out.println(String.format("%02d %s %04d", dia,nombreMes, year));
    }


//ASIGNAR MES A CADA NUMERO DEL 1 AL 12

    private String asignarNombreMes(int mes) {
        if (mes >= 1 && mes <= 12) {
            if (mes == 1) {
                return "Enero";
            } else if (mes == 2) {
                return "Febrero";
            } else if (mes == 3) {
                return "Marzo";
            } else if (mes == 4) {
                return "Abril";
            } else if (mes == 5) {
                return "Mayo";
            } else if (mes == 6) {
                return "Junio";
            } else if (mes == 7) {
                return "Julio";
            } else if (mes == 8) {
                return "Agosto";
            } else if (mes == 9) {
                return "Septiembre";
            } else if (mes == 10) {
                return "Octubre";
            } else if (mes == 11) {
                return "Noviembre";
            } else {
                return "Diciembre";
            }
        } else {
            throw new IllegalArgumentException("Mes inválido: " + mes);
        }
    }
}