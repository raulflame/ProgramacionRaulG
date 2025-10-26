package Tema2;

import java.util.Scanner;

public class Tema2Ejercicio30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String salir = ""; // Variable para controlar salir

        System.out.println("Calculadora. Escribe 's' para salir");

        // Bucle principal
        while (!salir.equalsIgnoreCase("s")) {

            // Primero numero
            System.out.print("Introduce el primer numero: ");
            double num1 = sc.nextDouble();

            // operacion
            System.out.print("Introduce la operación (+, -, *, /, %): ");
            char op = sc.next().charAt(0); // Tomamos el primer carácter de la entrada

            // Segundo numero
            System.out.print("Introduce el segundo numero: ");
            double num2 = sc.nextDouble();

            double resultado = 0;
            boolean operacionValida = true;

            switch (op) {
                case '+':
                    resultado = num1 + num2;
                    break;
                case '-':
                    resultado = num1 - num2;
                    break;
                case '*':
                    resultado = num1 * num2;
                    break;
                case '/':
                    resultado = num1 / num2;
                    break;
                case '%':
                    resultado = num1 % num2;
                    break;
                default:
                    System.out.println("Operación no valida.");
                    operacionValida = false;
            }

            // validador
            if (operacionValida) {
                System.out.println("Resultado: " + resultado);
            }

            // Exit
            System.out.print("¿Quieres salir? (s para salir, otra tecla para continuar): ");
            salir = sc.next();
        }
    }
}
