package org.example.Tema3;
import java.util.Arrays;
import java.util.Scanner;

public class EjerciciosMatrices {
    static Scanner teclado = new Scanner(System.in);
    public static void main(String[] args) {

    }
    public static void matrices(){

        int matriz[][] = {{1,4,5},{6,7,2},{8,3,8}};
        System.out.println(matriz[0][1]); //4
        System.out.println(matriz[1][2]); //2
        System.out.println(matriz[2][0]); //8
    }
    public static void numeroElementos(){

        int[][] matriz = {{1,4,5},{6,7,2},{8,3,8}};
        int filas = matriz.length; //3
        int elementosFila0 = matriz[0].length; //3 numeros en la fila...
        int elementosFila1 = matriz[1].length; //3
        int elementosFila2 = matriz[2].length; //3
    }
    public static void recorrerMatriz(){
        //declaración y inicialización
        int[][] matriz = {{1,4,5},{6,7,2},{8,3,8}};

        //recorrido de la matriz
        for (int fila = 0; fila < matriz.length; fila++) {

            for (int columna = 0; columna < matriz[fila].length; columna++) {
                System.out.print(matriz[fila][columna]+" ");
            }
            System.out.println();
        }

        //Manera mas rapida...
        int[][] array3 = {{1,4,5},{6,7,8},{3,8}};
        for(int[] fila : array3) {
            for(int columna : fila) {
                System.out.print(columna);
            }
        } //14567838
    }
    public static void rellenarMatrizTeclado(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce el número de filas: ");
        int filas = sc.nextInt();
        System.out.print("Introduce el número de columnas: ");
        int columnas = sc.nextInt();

        int matriz[][] = new int[filas][columnas];

        //proceso de rellenar la matriz
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print("Valor para la posición [" + i + "][" + j + "]: ");
                matriz[i][j] = sc.nextInt();
            }
        }

        //mostramos el resultado
        System.out.println("La matriz ha quedado de la siguiente manera: ");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println(); //insertamos un salto de línea al final de cada fila para que se imprima fiel a la realidad
        }
    }
    public static void imprimMatriz(){
        int[][] array4 = {{3,8,5},{4,1,8,4},{5,2}};
        for(int[] fila : array4) {
            System.out.println(Arrays.toString(fila));
        }
    }
    public static void matrizDeVectores(){

        int matriz[][] =  new int[4][4];

        for(int i=0; i<matriz.length; i++){
            System.out.print("Ingresa el vector: ");
            String[] lectura = teclado.next().split(",");
            for(int j=0; j<matriz[i].length; j++){
                matriz[i][j] = Integer.parseInt(lectura[j]);
            }
        }

        for(int[] filas : matriz){
            for(int columnas : filas){
                System.out.print(columnas + " ");
            }
            System.out.print("\n");
        }
    }
}
