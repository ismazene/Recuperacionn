package org.example.Tema3;
import java.util.Arrays;
import java.util.Scanner;

public class EjerciciosArrays {
    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {
    }

    public static void arrays() {
        int[] notas = {5, 2, 8, 4, 6,};
        for (int i = 0; i < notas.length; i++) {
            System.out.println(notas[i]);
        }
    }
    public static void mostrarArray() {
        int[] numeros = {1, 2, 3, 4, 5};
        int[] copiaNumeros;

        copiaNumeros = numeros;
        copiaNumeros[0] = 0;

        System.out.println(Arrays.toString(numeros));
    }
    public static void arraysClonados() {
        int[] primos = {1, 2, 3, 5, 7, 11, 13, 17, 19, 23};
        int[] copiaClonado;

        copiaClonado = primos.clone();
        copiaClonado[0] = 0;

        System.out.println(Arrays.toString(primos));
        System.out.println(Arrays.toString(copiaClonado));
    }
    public static void arraysDividir(){
        String cadena = "Hola,Soy,Una,Cadena";
        String[] subcadenas = cadena.split(",");
        System.out.println(Arrays.toString(subcadenas));

    }
    public static void buscarArraylist(){
        String[] colores = {"azul","amarillo","verde","rojo"};
        System.out.println("Que color quieres buscar");
        String color = teclado.next();

        boolean colorEncontrado = Arrays.asList(colores).contains(color);

        if (colorEncontrado){
            System.out.println("Se ha encontrado el color: " + color);
        } else {
            System.out.println("NO se ha encontrado el color: " + color);
        }
    }

    //Ordenacion de arrays: Ordenacion de seleccion
    public static void ordenacionArrays(){
        int array[] = {4,6,2,8,7};

        //Ordenacion de forma ascendente (de menor a mayor)
        for (int i = 0; i < array.length-1; i++) {
            for (int j = i+1; j < array.length ; j++) {
                if (array[j]<array[i]){
                    int aux = array[j];
                    array[j] = array[i];
                    array[i] = aux;
                }
            }
        }
        //Ordenacion de forma descendiente (de mayor a menor)
        //Es absolutamente lo mismo solo que el if es con el signo <
        for (int i = 0; i < array.length-1; i++) {
            for (int j = i+1; j < array.length ; j++) {
                if (array[j]>array[i]){
                    int aux = array[j];
                    array[j] = array[i];
                    array[i] = aux;
                }
            }
        }
    }

    public static void eliminarDuplicados(){
        //Da igual la posicion de los elementos a eliminar, siempre se eliminan
        int vector[] = {3,3,7,8,8,9,10,15,15};
        //El stream se pone siempre cuando queremos eliminar los duplicados de un array
        //despues de eso utilizamos el distinct para eliminarlos, es como si el stream los selecciona
        //y el distinct los elimina y por ultimo el toString devuelve de nuevo el Array, porque estabamos trabajando en un stream
        int vector2[] = Arrays.stream(vector).distinct().toArray();
        System.out.println(Arrays.toString(vector));
        System.out.println(Arrays.toString(vector2));
    }
}
