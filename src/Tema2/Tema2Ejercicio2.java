package Tema2;
import java.util.Scanner;

public class Tema2Ejercicio2 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Introduce la base ");
        int base = in.nextInt();

        System.out.println("Introduce la altura ");
        int altura = in.nextInt();

        System.out.println("Superficie: " + (base * altura));
        System.out.println("Perimetro: " + ((base + altura)*2));

    }
}