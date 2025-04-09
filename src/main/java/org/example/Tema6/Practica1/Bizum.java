package org.example.Tema6.Practica1;

import java.util.Random;
import java.util.Scanner;

public class Bizum extends MetodoPago {
    static Scanner teclado = new Scanner(System.in);

    private String telefono;
    private int pin;
    private final String formatoTelefono = "[0-9]{9}";

    public Bizum(String telefono) {
        this.telefono = telefono;
    }

    //Genera y guarda el PIN
    public void generarPin() {
        Random random = new Random();
        this.pin = 100000 + random.nextInt(900000);
        System.out.println("El pin generado es: " + this.pin);
    }

    //Pregunta el pin al usuario y lo devuelve
    public int preguntarPin() {
        System.out.println("¿Cual es el pin?");
        int pinUsuario = teclado.nextInt();
        teclado.nextLine();
        return pinUsuario;
    }

    //Compara el pin guardado con el que introduce el usuario
    public boolean validarPin(int pinUsuario) {
        return this.pin == pinUsuario;
    }

    //Procesa el pago
    public void procesarPago(double importe) {
        System.out.println("Procesando pago de " + importe + "€ con Bizum");
        System.out.println("Pago aceptado. Muchas gracias.");
    }

    //Valida que el telefono tenga el formato correcto
    public boolean validarBizum() {
        if (!telefono.matches(formatoTelefono)) {
            System.out.println("El formato del numero de telefono es erroneo");
            return false;
        }
        return true;
    }
}
