public class Main {

    public static void main(String[] args) {

        int[] folios = {
            101,
            105,
            110,
            115,
            120
        };

        int folioBuscado = 110;
        boolean encontrado = false;

        for (int i = 0; i < folios.length; i++) {

            if (folios[i] == folioBuscado) {
                encontrado = true;
                break;
            }
        }

        if (encontrado) {
            System.out.println("Si existe el folio 110");
        } else {
            System.out.println("No existe el folio 110");
        }
    }
}

//SI EXISTE EL FOLIO 110//