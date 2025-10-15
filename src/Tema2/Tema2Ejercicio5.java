package Tema2;
import java.util.Scanner;

public class Tema2Ejercicio5 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Introduce numero 1");
        double num1 = in.nextDouble();

        System.out.println("Introduce numero 2 ");
        double num2 = in.nextDouble();

        System.out.println("Introduce numero 3 ");
        double num3 = in.nextDouble();

        System.out.println("La media es " + ((num1+num2+num3)/3));

    }
    }