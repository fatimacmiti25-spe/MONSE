class Estudiante {

    String matricula;
    String nombre;
    double promedio;
    int cuatrimestre;

    Estudiante(String m, String n, double p, int c) {
        matricula = m;
        nombre = n;
        promedio = p;
        cuatrimestre = c;
    }

    void mostrarInformacion() {
        System.out.println(matricula + " - " + nombre +
                           " - " + promedio + " - " + cuatrimestre);
    }
}

public class Main {

    public static void main(String[] args) {

        // Arreglo simple
        double[] notas = {8.9, 9.4, 8.6};
        System.out.println("Primera nota: " + notas[0]);

        // Arreglo de objetos
        Estudiante[] alumnos = {
            new Estudiante("C01", "Diego", 8.9, 4),
            new Estudiante("C02", "Valeria", 9.4, 4),
            new Estudiante("C03", "Emilio", 8.6, 4)
        };

        // Acceso a un objeto
        System.out.println("Primer alumno: " + alumnos[0].nombre);
        System.out.println("Promedio: " + alumnos[0].promedio);

        // Recorrer arreglo usando un metodo
        System.out.println("\nLista de alumnos:");

        for (int i = 0; i < alumnos.length; i++) {
            alumnos[i].mostrarInformacion();
        }
    }
}