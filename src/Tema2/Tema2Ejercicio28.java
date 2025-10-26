package Tema2;

import java.util.Scanner;
import java.util.Random;

public class Tema2Ejercicio28 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random rnd = new Random();

        // Generar numero aleatorio(0 a 99.999)
        int numeroLoteria = rnd.nextInt(100000);
        System.out.println("Numero GANADOR: " + numeroLoteria);

        int intentos = 5;

        for (int i = 1; i <= intentos; i++) {
            System.out.print("Introduce tu numero de la loteria (intento " + i + "): ");
            int numeroUsuario = in.nextInt();

            if (numeroUsuario == numeroLoteria) {
                System.out.println("Has ganado la loteria");
            } else {
                System.out.println("No has ganado. Intenta otra vez");
            }
        }
    }
}
