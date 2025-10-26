package Tema2;

import java.util.Scanner;

public class Tema2Ejercicio23 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int suma=0;
        int numero;
        int contador=0;

        System.out.print("Ingrese numeros positivos: ");
        numero = in.nextInt();

        //bucle numeros positivos
        while (numero >= 0){
            suma = numero+suma;
            contador++;
            numero = in.nextInt();
        }
        if(contador > 0){
            double media =suma/contador;
            System.out.println("El media es: "+media);
        }else {
            System.out.println("No se introdujeron numeros positivos");
        }
    }
}
