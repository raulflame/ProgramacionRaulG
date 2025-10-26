package Tema2;

public class Tema2Ejercicio27 {
    public static void main(String[] args) {
        int contadorPrimos = 0;
        int numero = 2;

        System.out.println("Los 20 primeros numeros primos son:");

        while (contadorPrimos < 20) {
            boolean esPrimo = true;

            // comprueba si numero es primo
            for (int i = 2; i <= numero / 2; i++) {
                if (numero % i == 0) {
                    esPrimo = false;
                }
            }

            if (esPrimo) {
                System.out.print(numero + " ");
                contadorPrimos++;
            }

            numero++;
        }
    }
}
