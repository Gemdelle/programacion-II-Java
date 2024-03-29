// A2 EXERCISE 01
//Definir la clase Estudiante como subclase de Persona. El estudiante tiene además matricula.
//Verificar que los métodos y variables de instancia definidos como protected se heredan.
//Probar con private y public.
public class Main {
    public static void main(String[] args) {
        Persona persona = new Persona("Gemy", 25, 41559613);
        Estudiante estudiante = new Estudiante("Cipriano", 14, 39485443, 483);

        persona.presentacion();
        estudiante.presentacionEstudiante();

//        Chequear método presentacion() heredado
        System.out.println("MÉTODO HEREDADO DE PERSONA");
        estudiante.presentacion();

        persona.saludar();
        estudiante.saludar();
    }
}
