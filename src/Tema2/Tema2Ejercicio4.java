package Tema2;
import java.util.Scanner;

public class Tema2Ejercicio4 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Introduce numero 1");
        int num1 = in.nextInt();

        System.out.println("Introduce numero 2 ");
        int num2 = in.nextInt();

        System.out.println("Introduce numero 3 ");
        int num3 = in.nextInt();

        if(num1>num2 && num1>num3){
            System.out.println("Numero 1 es mayor " + num1);
        }

        if(num2>num1 && num2>num3){
            System.out.println("Numero 2 es mayor " + num2);
        }

        if(num3>num1 && num3>num2){
            System.out.println("Numero 3 es mayor " + num3);
        }

    }
}