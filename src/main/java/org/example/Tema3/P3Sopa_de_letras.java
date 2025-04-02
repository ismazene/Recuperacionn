package org.example.Tema3;

import java.util.Scanner;
import java.util.InputMismatchException;

public class P3Sopa_de_letras {
    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {
        int numero_filas = 0;
        int numero_columnas = 0;

        //Pedir el numero de filas y columnas dentro del try-catch
        try {
            System.out.println("Introduce el numero de filas: ");
            numero_filas = teclado.nextInt();
            System.out.println("Introduce el numero de columnas: ");
            numero_columnas = teclado.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Error: Debes introducir un numero");
            return;
        }

        // Crear la matriz de sopa de letras
        char[][] matrizSopa = new char[numero_filas][numero_columnas];
        teclado.nextLine();

        // Llenar la matriz con las letras que ponga el usuario
        for (int i = 0; i < numero_filas; i++) {
            System.out.println("Introduce las letras de la fila " + (i + 1));
            String letrasFila = teclado.nextLine().trim();

            //Verificar que la cantidad de letras sea correcta y que no se pongan numeros
            try {
                if (letrasFila.length() != numero_columnas) {
                    System.out.println("ERROR. Debes introducir exactamente " + numero_columnas + " letras.");
                    return;
                }
            } catch (NumberFormatException e) {
            }
            for (int j = 0; j < numero_columnas; j++) {
                matrizSopa[i][j] = letrasFila.charAt(j);
            }
        }

        //Mostrar la sopa de letras
        System.out.println("Sopa de letras:");
        for (int i = 0; i < numero_filas; i++) {
            for (int j = 0; j < numero_columnas; j++) {
                System.out.print(matrizSopa[i][j] + " ");
            }
            System.out.println();
        }

        //Pedir la palabra a buscar
        System.out.println("Introduce la palabra a buscar: ");
        String palabraBuscar = teclado.nextLine().trim().toLowerCase();

        //Variable para ver si la palabra se encuentra en la sopa de letras
        boolean encontrada = false;

        //Buscar la palabra de forma horizontal
        for (int i = 0; i < numero_filas; i++) {
            String fila = new String(matrizSopa[i]).toLowerCase();
            int posicion = fila.indexOf(palabraBuscar);

            if (posicion != -1) {
                encontrada = true;
                break;
            }
        }

        //Buscar la palabra de forma vertical
        if (!encontrada) {
            for (int j = 0; j < numero_columnas; j++) {
                String columna = "";
                for (int i = 0; i < numero_filas; i++) {
                    columna += matrizSopa[i][j];
                }

                //Buscar la palabra en la columna
                int posicion = columna.toLowerCase().indexOf(palabraBuscar);
                if (posicion != -1) {
                    System.out.println("Palabra encontrada en la posicion" + " " + (j + 1) + " " + (posicion + 1));
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