package Tema2;

import java.util.Scanner;

public class Tema2Ejercicio25 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int factorial = 1;
        int numero = 0;

        System.out.print("Introduzca un numero entero: ");
        numero = in.nextInt();

        if (numero < 0) {
            System.out.print("Ingrese un numero positivo");
        }else {
            for (int i = 1; i <= numero; i++) {
                factorial *= i;
            }
            System.out.println("Factorial de " + numero + " = " + factorial);
        }
    }
}