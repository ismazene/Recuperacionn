package org.example.Tema6.Practica1;

public class PayPal extends MetodoPago {

    private String cuenta;
    private double saldo;
    String formatoCorreo = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9+_.-]+\\.com$";

    public PayPal(String cuenta) {
        this.saldo = 23.0;
        this.cuenta = cuenta;
    }

    //Mostrar por pantalla el pago
    public void procesarPago(double importe) {
        System.out.println("Procesando pago de " + importe + "€ con PayPal");
        System.out.println("Pago aceptado. Muchas gracias.");
    }

    //Validar correo introducido por el usuario
    public boolean validarPayPal() {
        if (!cuenta.matches(formatoCorreo)) {
            System.out.println("El formato no es válido");
            return false;
        }
        return true;
    }

    //Validar el saldo
    public boolean validarSaldo(double importe) {
        if (saldo < importe) {
            System.out.println("No tienes pasta chato, solo te quedan: " + saldo + "euros");
            return false;
        } else {
            System.out.println("Pago aceptado");
            return true;
        }
    }
}
