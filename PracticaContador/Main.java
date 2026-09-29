public class Main {

    public static void main(String[] args) {

        int[] numeros = {
            5,
            8,
            2,
            10,
            4
        };

        int contador = 0;

        for (int i = 0; i < numeros.length; i++) {

            if (numeros[i] > 5) {
                contador++;
            }
        }

        System.out.println("El valor final del contador es: " + contador);
    }
}

//¿Cuál será el valor final de contador? Respuesta: 2//
//¿Por qué?Porque el ciclo recore todos los números del arreglo y la condición:numeros[i] > 5//