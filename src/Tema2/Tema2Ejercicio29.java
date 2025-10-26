package Tema2;

import java.util.Scanner;
import java.util.Random;

public class Tema2Ejercicio29 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random rnd = new Random();

        int numeroSecreto = rnd.nextInt(100) + 1;
        int numeroUsuario = 0;

        System.out.println("Adivina el numero entre 1 y 100");

        // Bucle hasta que acierte
        while (numeroUsuario != numeroSecreto) {
            System.out.print("Introduce tu numero: ");
            numeroUsuario = in.nextInt();

            if (numeroUsuario < numeroSecreto) {
                System.out.println("El numero secreto es mayor");
            } else if (numeroUsuario > numeroSecreto) {
                System.out.println("El numero secreto es menor");
            } else {
                System.out.println("Has acertado el numero secreto");
            }
        }
    }
}
