package Tema2;

import java.util.Random;
import java.util.Scanner;

public class Práctica_Programación_Estructurada {
    public static void main(String[] args) {
        int velocidad1 = 0;
        int velocidad2 = 0;
        int ataque1 = 0;
        int ataque2 = 0;
        int defensa1 = 0;
        int defensa2 = 0;
        int vida1 = 0;
        int vida2 = 0;

        int turno = 1;
        int calcdamage1 = 0;
        int calcdamage2 = 0;
        Random ataquerandom = new Random();


        Scanner in = new Scanner(System.in);

        System.out.println("Introduce la velocidad del jugador 1: ");
        velocidad1 = in.nextInt();
        while (velocidad1 <= 0 || velocidad1 >= 201) {
            System.out.println("Introduce un valor dentro del rango: ");
            velocidad1 = in.nextInt();
        }
        System.out.println("Introduce el ataque del jugador 1: ");
        ataque1 = in.nextInt();
        while (ataque1 <= 0 || ataque1 >= 201) {
            System.out.println("Introduce un valor dentro del rango: ");
            ataque1 = in.nextInt();
        }
        System.out.println("Introduce la defensa del jugador 1: ");
        defensa1 = in.nextInt();
        while (defensa1 <= 0 || defensa1 >= 201) {
            System.out.println("Introduce un valor dentro del rango: ");
            defensa1 = in.nextInt();
        }
        System.out.println("Introduce la vida del jugador 1: ");
        vida1 = in.nextInt();
        while (vida1 <= 0 || vida1 >= 201) {
            System.out.println("Introduce un valor dentro del rango: ");
            vida1 = in.nextInt();
        }
        //comprueba que los stats del jugador uno no superen 500 en total
        int stats1 = velocidad1 + ataque1 + defensa1 + vida1;
        while (stats1 > 500) {
            System.out.println("Los Stats suman mas de 500 vuelve a introducir datos");

            //Introducimos los datos de nuevo de cada stat

            System.out.println("Introduce la velocidad del jugador 1: ");
            velocidad1 = in.nextInt();
            while (velocidad1 <= 0 || velocidad1 >= 201) {
                System.out.println("Introduce un valor dentro del rango: ");
                velocidad1 = in.nextInt();
            }

            System.out.println("Introduce el ataque del jugador 1: ");
            ataque1 = in.nextInt();
            while (ataque1 <= 0 || ataque1 >= 201) {
                System.out.println("Introduce un valor dentro del rango: ");
                ataque1 = in.nextInt();
            }

            System.out.println("Introduce la defensa del jugador 1: ");
            defensa1 = in.nextInt();
            while (defensa1 <= 0 || defensa1 >= 201) {
                System.out.println("Introduce un valor dentro del rango: ");
                defensa1 = in.nextInt();
            }

            System.out.println("Introduce la vida del jugador 1: ");
            vida1 = in.nextInt();
            while (vida1 <= 0 || vida1 >= 201) {
                System.out.println("Introduce un valor dentro del rango: ");
                vida1 = in.nextInt();
            }
            stats1 = velocidad1 + ataque1 + defensa1 + vida1;
        }

        // Jugador 2

        System.out.println("Introduce la velocidad del jugador 2: ");
        velocidad2 = in.nextInt();
        while (velocidad2 <= 0 || velocidad2 >= 201) {
            System.out.println("Introduce un valor dentro del rango: ");
            velocidad2 = in.nextInt();
        }
        System.out.println("Introduce el ataque del jugador 2: ");
        ataque2 = in.nextInt();
        while (ataque2 <= 0 || ataque2 >= 201) {
            System.out.println("Introduce un valor dentro del rango: ");
            ataque2 = in.nextInt();
        }
        System.out.println("Introduce la defensa del jugador 2: ");
        defensa2 = in.nextInt();
        while (defensa2 <= 0 || defensa2 >= 201) {
            System.out.println("Introduce un valor dentro del rango: ");
            defensa2 = in.nextInt();
        }
        System.out.println("Introduce la vida del jugador 2: ");
        vida2 = in.nextInt();
        while (vida2 <= 0 || vida2 >= 201) {
            System.out.println("Introduce un valor dentro del rango: ");
            vida2 = in.nextInt();
        }
        //comprueba que los stats del jugador dos no superen 500 en total
        int stats2 = velocidad2 + ataque2 + defensa2 + vida2;
        while (stats2 > 500) {
            System.out.println("Los Stats suman mas de 500 vuelve a introducir datos");

            //Introducimos los datos de nuevo de cada stat

            System.out.println("Introduce la velocidad del jugador 2: ");
            velocidad2 = in.nextInt();
            while (velocidad2 <= 0 || velocidad2 >= 201) {
                System.out.println("Introduce un valor dentro del rango: ");
                velocidad2 = in.nextInt();
            }

            System.out.println("Introduce el ataque del jugador 2: ");
            ataque2 = in.nextInt();
            while (ataque2 <= 0 || ataque2 >= 201) {
                System.out.println("Introduce un valor dentro del rango: ");
                ataque2 = in.nextInt();
            }

            System.out.println("Introduce la defensa del jugador 2: ");
            defensa2 = in.nextInt();
            while (defensa2 <= 0 || defensa2 >= 201) {
                System.out.println("Introduce un valor dentro del rango: ");
                defensa2 = in.nextInt();
            }

            System.out.println("Introduce la vida del jugador 2: ");
            vida2 = in.nextInt();
            while (vida2 <= 0 || vida2 >= 201) {
                System.out.println("Introduce un valor dentro del rango: ");
                vida2 = in.nextInt();
            }
            stats2 = velocidad2 + ataque2 + defensa2 + vida2;
        }

        //Sistema combate y turnos

        System.out.println("Empieza el combate");

        while (vida1 > 0 && vida2 > 0) {
            System.out.println("RONDA " + turno);
            //jugador 1 atacara primero
            if (velocidad1 > velocidad2) {
                int damage1 = (ataque1 - defensa2 + ataquerandom.nextInt(10) + 1);
                vida2 -= damage1;
                System.out.println("Jugador 1 ataca a Jugador 2 y causa " + damage1 + " puntos de daño.");
                if (vida2 > 0) {
                    int damage2 = (ataque2 - defensa1 + ataquerandom.nextInt(10) + 1);
                    vida1 -= damage2;
                    System.out.println("Jugador 2 ataca a Jugador 1 y causa " + damage2 + " puntos de daño.");
                }
            }

            //Jugador 2 atacara primero
            else if (velocidad2 > velocidad1) {
                int damage2 = (ataque2 - defensa1 + ataquerandom.nextInt(10) + 1);
                vida1 -= damage2;
                System.out.println("Jugador 2 ataca a Jugador 1 y causa " + damage2 + " puntos de daño.");

                if (vida2 > 0) {
                    int damage1 = (ataque1 - defensa2 + ataquerandom.nextInt(10) + 1);
                    vida2 -= damage1;
                    System.out.println("Jugador 1 ataca a Jugador 2 y causa " + damage1 + " puntos de daño.");
                }
            }
            int barra1 = Math.max(vida1, 0) * 20 / 200;
            int barra2 = Math.max(vida2, 0) * 20 / 200;
            String vidaGrafica1 = "█".repeat(barra1) + "-".repeat(20 - barra1);
            String vidaGrafica2 = "█".repeat(barra2) + "-".repeat(20 - barra2);

            System.out.println("Jugador 1: " + Math.max(vida1, 0) + " " + vidaGrafica1);
            System.out.println("Jugador 2: " + Math.max(vida2, 0) + " " + vidaGrafica2);
            turno++;
        }
    }
}

