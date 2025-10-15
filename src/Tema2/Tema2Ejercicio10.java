package Tema2;

import java.util.Scanner;

public class Tema2Ejercicio10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Introduce numero 1");
        double num1 = in.nextDouble();

        System.out.println("Introduce numero 2 ");
        double num2 = in.nextDouble();

        System.out.println("Introduce numero 3 ");
        double num3 = in.nextDouble();

        if (num1 < num2 && num2 < num3) {
            System.out.println("Los numeros estan ordenadores de mayor a menor ");
        } else {
                System.out.println("Los numeros NO estan ordenadores de mayor a menor ");
            }
    }
}

