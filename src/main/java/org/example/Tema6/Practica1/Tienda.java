package org.example.Tema6.Practica1;

import java.util.Scanner;

public class Tienda {
    static Scanner teclado = new Scanner(System.in);

    public static void iniciarPago() {
        System.out.println("¿Qué método de pago quieres utilizar?");
        String metodoPago = teclado.nextLine();

        switch (metodoPago) {
            case "Bizum":
                System.out.println("Elegiste la opción de Bizum");
                System.out.println("Introduce el número de teléfono: ");
                int telefonoBizum = teclado.nextInt();
                Bizum bizum = new Bizum(telefonoBizum);
                System.out.println("Validando método de pago... ");
                if (bizum.validarBizum()) {
                    System.out.println("Está todo correcto.");
                }
                break;

            case "PayPal":
                System.out.println("Elegiste la opción de PayPal");
                System.out.println("Introduce un correo válido:");
                String correoPayPal = teclado.nextLine();
                PayPal payPal = new PayPal(correoPayPal);
                System.out.println("Validando método de pago...");
                if (payPal.validarSaldo(payPal.getSaldo())){
                    System.out.println("El saldo es correcto");
                }
                if (payPal.validarPayPal()){
                    System.out.println("Esta todo correcto");
                }
                break;

            case "TarjetaCredito":
                System.out.println("Eligiste la opcion Tarjeta de credito:");
                System.out.println("Introduce una tarjeta valida: ");
                String tarjeta = teclado.nextLine();
                TarjetaCredito tarjetaCredito = new TarjetaCredito(tarjeta);
                System.out.println("Validando método de pago...");
                if (tarjetaCredito.validarTarjeta()){
                    System.out.println("Esta todo correcto");
                }
                default:
                System.out.println("Introduce una opcion VALIDA");
                break;
        }
    }
    public static void realizarPago(MetodoPago metodo, double importe){
        metodo.procesarPago(importe);
    }

}
