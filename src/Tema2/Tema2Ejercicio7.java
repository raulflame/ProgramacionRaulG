package Tema2;
import java.util.Scanner;

public class Tema2Ejercicio7 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Introduce numero 1");
        int num1 = in.nextInt();

        System.out.println("Introduce numero 2 ");
        int num2 = in.nextInt();

        if (num1>num2){
            System.out.println("Num1 es mayor (Num1-Num2) " + (num1-num2));
        }

        if (num2>num1){
            System.out.println("Num2 es mayor (Num2-Num1)" + (num2-num1));
        }
    }
}