package org.example.Tema3;

import java.util.Random;
import java.util.Scanner;

public class PracticaSamurai {
    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {
        int[] equipo1 = new int[7];
        int[] equipo2 = new int[7];

        System.out.println("Equipo 1");
        asignarPotencia(equipo1);
        System.out.println("Equipo 2");
        asignarPotencia(equipo2);

        System.out.println("¡Empieza la batalla!");
        batalla(equipo1, equipo2);
    }

    public static void asignarPotencia(int[] equipo) {
        boolean potenciaValida = false;

        while (!potenciaValida) {
            System.out.println("Introduce potencia de los samurais: ");
            String input = teclado.nextLine();
            String[] entradas = input.split(" ");

            if (entradas.length != 7) {
                System.out.println("ERROR. Debes introducir exactamente 7 valores.");
                continue;
            }

            int sumaPotencia = 0;
            for (int i = 0; i < 7; i++) {
                try {
                    equipo[i] = Integer.parseInt(entradas[i]);
                    sumaPotencia += equipo[i];
                } catch (NumberFormatException e) {
                    System.out.println("ERROR. Todos los valores deben ser números.");
                    continue;
                }
            }

            if (sumaPotencia == 30) {
                potenciaValida = true;
                System.out.println("Equipo completado.");
            } else {
                System.out.println("ERROR. La potencia total no suma 30.");
            }
        }
    }

    public static void batalla(int[] equipo1, int[] equipo2) {
        Random random = new Random();
        int jugadorActual = random.nextInt(7);

        System.out.println("La batalla inicia con el Samurai " + (jugadorActual + 1));

        int bajasEquipo1 = 0;
        int bajasEquipo2 = 0;

        while (bajasEquipo1 < 4 && bajasEquipo2 < 4) {
            System.out.println("Samurai " + (jugadorActual + 1));

            if (jugadorActual % 2 == 0) {
                if (equipo1[jugadorActual] > equipo2[jugadorActual]) {
                    System.out.println("Gana Equipo 1. " + equipo1[jugadorActual] + " vs " + equipo2[jugadorActual]);
                    bajasEquipo2++;
                } else if (equipo1[jugadorActual] < equipo2[jugadorActual]) {
                    System.out.println("Gana Equipo 2. " + equipo1[jugadorActual] + " vs " + equipo2[jugadorActual]);
                    bajasEquipo1++;
                } else {
                    System.out.println("Empate. " + equipo1[jugadorActual] + " vs " + equipo2[jugadorActual]);
                }
            } else {
                if (equipo2[jugadorActual] > equipo1[jugadorActual]) {
                    System.out.println("Gana Equipo 2. " + equipo2[jugadorActual] + " vs " + equipo1[jugadorActual]);
                    bajasEquipo1++;
                } else if (equipo2[jugadorActual] < equipo1[jugadorActual]) {
                    System.out.println("Gana Equipo 1. " + equipo2[jugadorActual] + " vs " + equipo1[jugadorActual]);
                    bajasEquipo2++;
                } else {
                    System.out.println("Empate. " + equipo2[jugadorActual] + " vs " + equipo1[jugadorActual]);
                }
            }

            if (bajasEquipo1 >= 4) {
                System.out.println("¡Equipo 2 GANA! Equipo 1 ha tenido " + bajasEquipo1 + " bajas.");
                return;
            } else if (bajasEquipo2 >= 4) {
                System.out.println("¡Equipo 1 GANA! Equipo 2 ha tenido " + bajasEquipo2 + " bajas.");
                return;
            }

            // Cambiamos al siguiente samurai
            jugadorActual = (jugadorActual + 1) % 7;
        }
    }
}
