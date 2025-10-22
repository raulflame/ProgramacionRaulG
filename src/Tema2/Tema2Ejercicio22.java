package Tema2;

import java.util.Scanner;

public class Tema2Ejercicio22 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int cifras = 0;
        System.out.println("Introduce numero entero");
        int original = in.nextInt();


        while (original > 0){
            original = original/10;
            cifras++;
        }
        System.out.println("El numero entero tiene " + cifras);
    }
}
