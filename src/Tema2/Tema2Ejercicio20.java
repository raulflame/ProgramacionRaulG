package Tema2;

import java.util.Scanner;

public class Tema2Ejercicio20 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Introduce numero A");
        int A = in.nextInt();

        System.out.println("Introduce numero B");
        int B = in.nextInt();

        int contador = A;

        do {
            if (contador % 2 == 1) {
                System.out.println(contador);
            }
            contador++;
        } while (contador <= B);
        if (B<A){
            System.out.println("El número A debe ser menor que B.");
        }
    }
}