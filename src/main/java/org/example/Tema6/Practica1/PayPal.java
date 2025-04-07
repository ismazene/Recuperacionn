package org.example.Tema6.Practica1;

public class PayPal extends MetodoPago{

    private String cuenta;
    private double saldo;
    //Formato del correo electronico.
    String formatoCorreo = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9+_.-]+.com$";

    public PayPal(String cuenta, double saldo) {
        this.saldo = 23.0;  // Saldo por defecto 23€
        this.cuenta = "";
    }

    public String getCuenta() {
        return cuenta;
    }

    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void procesarPago(double importe) {
        System.out.println("Procesando pago de" + importe + "€ con PayPal");
    }
    private boolean validarPayPal() {
        if (!cuenta.matches(formatoCorreo))
            System.out.println("El formato no es valido");
            return false;
    }
    public boolean validarSaldo(double importe){
        if (saldo<importe){
            return false;
        }
        if (validarSaldo(importe)){
            System.out.println("Pago aceptado");
        } else {
            System.out.println("NO tienes pasta chato");
        }
        return true;
    }
}