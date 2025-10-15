package Tema2;

import java.util.Scanner;

public class Tema2Ejercicio6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Introduce numero ");
        int num = in.nextInt();

        if (num==0){
            System.out.println("Numero es zero " + num);
        }

        if (num>0){
            System.out.println("Numero es positivo " + num);
        }

        if (num<0){
            System.out.println("Numero es negativo " + num);
        }




    }
}
