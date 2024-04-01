// A3-EXERCISE 03
//Supongamos que el departamento de sistemas de la empresa “Mi Luz S.A.” debe desarrollar un software para la liquidación de los haberes de sus empleados. La empresa cuenta con cuatro tipos de empleados:
//	empleados asalariados
//	empleados por horas
//	empleados por comisión
//	empleados base más comisión
//
//Todos los empleados tienen legajo y nombre y apellido.
// Un empleado asalariado tiene un sueldo mensual.
// Un empleado por horas tiene un sueldo básico, el número de horas trabajadas y el valor horario.
// Un empleado por comisión tiene un sueldo base, una tasa y la cantidad de ventas.
//Cada clase debe tener constructores apropiados, los métodos get y set. Escriba un programa que cree instancias de objetos de cada una de estas clases y que muestre toda la información asociada con cada objeto (incluyendo la información heredada).
public class Main {
    public static void main(String[] args) {

//        01. Crear instancias de los empleados
        EmpleadoAsalariado empleado_asalariado = new EmpleadoAsalariado(100,"Hunny","Bridyam");
        EmpleadoHoras empleado_horas = new EmpleadoHoras(200,"Gemy","Bridyam",40,2000);
        EmpleadoComision empleado_comision = new EmpleadoComision(300,"Clau","Bridyam",310);

//        02. Calcular sueldo de cada tipo de empleado
        float sueldo_empleado_asalariado = empleado_asalariado.calcularSueldo();
        float sueldo_empleado_horas = empleado_horas.calcularSueldo();
        float sueldo_empleado_comision = empleado_comision.calcularSueldo();

//        03. Imprimir datos heredados y propios
        // Empleado asalariado
        System.out.printf("\nDATOS EMPLEADO\nLegajo: %d\nNombre: %s\nApellido: %s\nSueldo: %.2f\n",empleado_asalariado.getLegajo(),empleado_asalariado.getNombre(),empleado_asalariado.getApellido(),sueldo_empleado_asalariado);
        // Empleado horas
        System.out.printf("\nDATOS EMPLEADO\nLegajo: %d\nNombre: %s\nApellido: %s\nHoras trabajadas: %.2f\nValor hora: %.2f\nSueldo: %.2f\n",empleado_horas.getLegajo(),empleado_horas.getNombre(),empleado_horas.getApellido(),empleado_horas.getHorasTrabajadas(),empleado_horas.getValorHora(),sueldo_empleado_horas);
        // Empleado comisión
        System.out.printf("\nDATOS EMPLEADO\nLegajo: %d\nNombre: %s\nApellido: %s\nCantidad de ventas: %d\nSueldo: %.2f\n",empleado_comision.getLegajo(),empleado_comision.getNombre(),empleado_comision.getApellido(),empleado_comision.getCantidadVentas(),sueldo_empleado_comision);
    }
}
