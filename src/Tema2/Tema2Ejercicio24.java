package Tema2;

import java.util.Scanner;

public class Tema2Ejercicio24 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int suma=0;
        int notas;
        int contadoraprobado=0;
        int contadorsuspendido=0;

        System.out.print("Ingrese las notas (para salir introduzca un aprobado negativo): ");
        notas = in.nextInt();

        //bucle aprobados y suspendidos
        while (notas >= 0) {
            if(notas >=5) {
                contadoraprobado++;
            }
            else {
                contadorsuspendido++;
            }
            notas = in.nextInt();
            }
        System.out.println("Aprobados: "+contadoraprobado);
        System.out.println("Suspendidos: "+contadorsuspendido);
        }
    }

