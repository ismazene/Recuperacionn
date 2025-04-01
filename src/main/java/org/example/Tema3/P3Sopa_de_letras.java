package org.example.Tema3;

import java.util.Scanner;

public class P3Sopa_de_letras {
    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Introduce el numero de filas: ");
        int numero_filas = teclado.nextInt();

        System.out.println("Introduce el numero de columnas: ");
        int numero_columnas = teclado.nextInt();

        // Crear la matriz de sopa de letras
        char[][] matrizSopa = new char[numero_filas][numero_columnas];

        // Limpiar el buffer de la entrada
        teclado.nextLine();

        // Llenar la matriz con las letras que ingrese el usuario
        for (int i = 0; i < numero_filas; i++) {
            System.out.println("Introduce las letras de la fila " + (i + 1) + " (sin espacios): ");
            String letrasFila = teclado.nextLine().trim();

            // Verificar que la cantidad de letras sea correcta
            if (letrasFila.length() != numero_columnas) {
                System.out.println("ERROR. Debes introducir exactamente " + numero_columnas + " letras.");
                return; // Terminar el programa si el tamaño no coincide
            }

            // Llenar la matriz con las letras
            for (int j = 0; j < numero_columnas; j++) {
                matrizSopa[i][j] = letrasFila.charAt(j);
            }
        }

        // Mostrar la sopa de letras
        System.out.println("Sopa de letras:");
        for (int i = 0; i < numero_filas; i++) {
            for (int j = 0; j < numero_columnas; j++) {
                System.out.print(matrizSopa[i][j] + " ");
            }
            System.out.println();
        }

        // Pedir la palabra a buscar
        System.out.println("Introduce la palabra a buscar: ");
        String palabraBuscar = teclado.nextLine().trim();

        // Variable para verificar si la palabra se encuentra
        boolean encontrada = false;

        // Buscar la palabra de forma horizontal
        for (int i = 0; i < numero_filas; i++) {
            String fila = new String(matrizSopa[i]);
            int posicion = fila.indexOf(palabraBuscar);

            if (posicion != -1) {
                System.out.println("Palabra encontrada en la fila " + (i + 1) + ", posición: " + (posicion + 1));
                encontrada = true;
                break; // Salir del bucle cuando se encuentra la palabra
            }
        }

        // Buscar la palabra de forma vertical
        if (!encontrada) {
            for (int j = 0; j < numero_columnas; j++) {
                // Crear la columna como un String
                String columna = "";
                for (int i = 0; i < numero_filas; i++) {
                    columna += matrizSopa[i][j];  // Concatenar las letras de la columna
                }

                // Buscar la palabra en la columna
                int posicion = columna.indexOf(palabraBuscar);
                if (posicion != -1) {
                    System.out.println("Palabra encontrada en la posicion" + " " + (j + 1) + " "+ (posicion + 1));
                    encontrada = true;
                    break;
                }
            }
        }
        if (!encontrada) {
            System.out.println("Palabra no encontrada.");
        }

    }
}

