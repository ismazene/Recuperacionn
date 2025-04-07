package org.example.Tema6.Practica1;

import java.util.Random;
import java.util.Scanner;

public class Bizum extends MetodoPago{

    static Scanner teclado = new Scanner(System.in);
    private String telefono;
    private int pin;
    String formatoTelefono = "[0-9]{9}";

    public Bizum(String telefono, int pin) {
        this.telefono = telefono;
        this.pin = pin;
    }

    public String getTelefono() {
        return telefono;
    }
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public int getPin() {
        return pin;
    }
    public void setPin(int pin) {
        this.pin = pin;
    }

    public void generarPin(){
        Random random = new Random();
        int pin = 100000 + random.nextInt(900000);
        System.out.println("El pin es: " + pin);
    }
    public int preguntarPin(){
        System.out.println("Cual es el pin??");
        int pinUsuario = teclado.nextInt();
        return pinUsuario;
    }
    public void procesarPago(double importe){
        System.out.println("Procesando pago de " + importe + "€ con Bizum");
    }
    public boolean validarBizum(int pinUsuario, int pin){
        if (!formatoTelefono.matches(telefono)){
            System.out.println("El telefono no es correcto");
        }
        if (!(pin == pinUsuario)){
            System.out.println("El pin es inccorecto");
        }
        return false;
    }
}
