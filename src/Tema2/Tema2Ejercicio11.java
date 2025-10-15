package Tema2;

import java.util.Scanner;

public class Tema2Ejercicio11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Introduce numero 1");
        final int num1 = in.nextInt();

        System.out.println("Introduce numero 2 ");
        final int num2 = in.nextInt();

        System.out.println("Introduce numero 3 ");
        final int num3 = in.nextInt();

        int resta = num1-num2;
        int resta2 = num3-num1;
        int resta3 = num2-num3;

        // Comprobamos si los tres números son consecutivos
        if ((Math.abs(resta) == 1 && Math.abs(resta2) == 2) || (Math.abs(resta) == 2 && Math.abs(resta3) == 1) || (Math.abs(resta2) == 1 && Math.abs(resta3) == 2)) {
            System.out.println("Los números son consecutivos");
        } else {
            System.out.println("Los números NO son consecutivos");
        }
    }
}
