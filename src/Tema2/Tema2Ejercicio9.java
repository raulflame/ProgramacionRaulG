package Tema2;
import java.util.Scanner;

public class Tema2Ejercicio9 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Introduce tus dolares");
        double dolar = in.nextDouble();
        double euro = 0.85;

        System.out.println("Tienes en euros " + (dolar*euro));
        }
    }