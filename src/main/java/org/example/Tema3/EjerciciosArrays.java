package org.example.Tema3;

import java.util.Arrays;
import java.util.Scanner;

public class EjerciciosArrays {
    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {
buscarArraylist();
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
}
