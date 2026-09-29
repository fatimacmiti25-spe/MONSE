public class GrupoEstudiantes {

    public static void main(String[] args) {

        // Paso 1 - Declaración
        int[] edades;

        // Paso 2 - Creación
        edades = new int[5];

        // Paso 3 - Asignación
        edades[0] = 18;
        edades[1] = 19;
        edades[2] = 18;
        edades[3] = 20;
        edades[4] = 19;

        // Visualización del arreglo
        System.out.println("VISUALIZACION DE LA PRACTICA");
        System.out.println();
        System.out.println("Indice:  0   1   2   3   4");
        System.out.println("Edad:   " + edades[0] + "  "
                + edades[1] + "  "
                + edades[2] + "  "
                + edades[3] + "  "
                + edades[4]);

        // Preguntas
        System.out.println();
        System.out.println("RESPUESTAS:");
        System.out.println("Edad del indice 0: " + edades[0]);
        System.out.println("Edad del indice 3: " + edades[3]);
        System.out.println("Ultimo indice: " + (edades.length - 1));
        System.out.println("Tamaño del arreglo: " + edades.length);

        System.out.println(
            "edades[6] daria error porque el indice 6 no existe."
        );
    }
}