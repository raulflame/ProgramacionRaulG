package Tema2;
import java.util.Scanner;

public class Tema2Ejercicio1 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Introduce un numero ");
        int lado = in.nextInt();

        System.out.println("Superficie: " + (lado * lado));
        System.out.println("Perimetro: " + (lado * lado * lado * lado));

    }
}
