package org.example.Tema6.Practica1;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.concurrent.ExecutionException;

public class Tienda {
    static Scanner teclado = new Scanner(System.in);

    //Pedimos metodo de pago.
    public static void iniciarPago() {
        System.out.println("¿Que metodo de pago quieres utilizar (Bizum/PayPal/TarjetaCredito)??");
        String metodoPago = teclado.nextLine();

        //Esto es un switch para cada uno de los metodos de pago, cada uno se comporta diferente
        switch (metodoPago) {
            case "Bizum":
                System.out.println("Elegiste la opcion de Bizum");
                System.out.println("Introduce el numero de telefono: ");
                String telefonoBizum = teclado.nextLine();

                //Creamos el objeto bizum con el atributo telefonoBizum que lo acabamos de pedir
                Bizum bizum = new Bizum(telefonoBizum);

                //Este if valida que el formato del bizum sea correcto
                if (bizum.validarBizum()) {
                    System.out.println("Validando metodo de pago...");
                    //Generamos el pin y lo mostramos por pantalla
                    bizum.generarPin();
                    int pinUsuario = bizum.preguntarPin();

                    //Este if es el que valida el pin que pone el usuario y que previamente le preguntamos
                    if (bizum.validarPin(pinUsuario)) {
                        System.out.println("PIN correcto. Procediendo al pago.");
                        //Si llega aqui y no se a roto confirmamos el pago
                        double importe = dineroPagar();
                        bizum.procesarPago(importe);
                    } else {
                        //Si llega aqui es porque el pin que ha puestoel usuario no coincide con ell metodo generarPin
                        System.out.println("PIN incorrecto. Pago cancelado.");
                    }
                }
                break;


            case "PayPal":
                System.out.println("Elegiste la opcion de PayPal");
                System.out.println("Introduce un correo valido:");
                String correoPayPal = teclado.nextLine();
                //Creamos un objeto payPal con el atributo correoPayPal
                PayPal payPal = new PayPal(correoPayPal);
                System.out.println("Validando correo...");

                //Este if valida el correo (el metodo validarPayPal se encarga de comparar q
                //que el correo introducido tiene el formato correcto)
                if (payPal.validarPayPal()) {
                    System.out.println("El correo es valido");
                    double importe = dineroPagar();
                    //Este if valida el saldo porque en la cuenta de PayPal solo tenemos 23€
                    if (payPal.validarSaldo(importe)) {
                        realizarPago(payPal, importe);
                    }
                }
                break;

            case "TarjetaCredito":
                System.out.println("Elegiste la opcion de Tarjeta de Credito:");
                System.out.println("Introduce el numero de tarjeta (16 digitos):");
                String tarjeta = teclado.nextLine();

                //Aqui hacemos la validacion de que el usuario ponga un numero de 16 digitos, si no es asi salta el error
                if (!tarjeta.matches("\\d{16}")) {
                    System.out.println("ERROR. Son 16 numeros exactos");
                    break;
                }

                //Pedimos tipo de tarjeta
                System.out.println("Introduce el tipo de tarjeta (VISA, MASTERCARD o MAESTRO):");
                String tipo = teclado.nextLine();

                //Creamos un objeto TargetaCredito con los atributos tarjeta y el tipo de la tarjeta
                TarjetaCredito tarjetaCredito = new TarjetaCredito(tarjeta, tipo);

                //Hacemos la validacion y no salta ningun error el pago se confirma
                System.out.println("Validando tarjeta...");
                if (tarjetaCredito.validarTarjeta()) {
                    double importe = dineroPagar();
                    realizarPago(tarjetaCredito, importe);
                }
                break;



            default:
                System.out.println("Introduce una opcion VALIDA");
                break;
        }
    }

    //Todos los tipos de pago llaman a este metodo si va bien para confirmar el pago
    public static double dineroPagar() {
        System.out.println("Introduce el importe a pagar:");
        try {
            int importe = teclado.nextInt();
            return importe;
        }catch (InputMismatchException e){
            System.out.println("Introduce numeros porfavor");
            System.exit(0);
        }
        return 0;
    }

    //Llamamos al metodo procesarPago del metodo de pago
    public static void realizarPago(MetodoPago metodo, double importe) {
        metodo.procesarPago(importe);
    }
}
