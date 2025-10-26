package Tema2;

import java.util.Scanner;

public class Tema2Ejercicio26 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numero = 0;

        System.out.print("Introduzca un numero entero: ");
        numero = in.nextInt();

        //Primo inicia on
        boolean esPrimo = true;

        if (numero <= 1) {
            esPrimo = false;
        } else {
            // comprueba si tiene algun divisor distinto de 1 y de sí mismo
            for (int i = 2; i <= numero / 2; i++) {
                if (numero % i == 0) {
                    esPrimo = false; // Declara como no primo el numero
                }
            }
        }
        if (esPrimo) {
            System.out.println("Primo");
        } else  {
            System.out.println("No Primo");
        }
    }
}