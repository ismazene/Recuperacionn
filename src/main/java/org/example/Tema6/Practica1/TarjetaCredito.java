package org.example.Tema6.Practica1;

public class TarjetaCredito extends MetodoPago {

    private String nro_tarjeta;
    private String tipo;
    String[] tipos = {"VISA", "MASTERCARD", "MAESTRO"};

    public TarjetaCredito(String nro_tarjeta, String tipo) {
        this.nro_tarjeta = nro_tarjeta;
        this.tipo = tipo;
    }

    //Procesa el pago
    public void procesarPago(double importe) {
        System.out.println("Procesando pago de " + importe + " € con tarjeta de crédito " + tipo);
        System.out.println("Pago aceptado. Muchas gracias.");

    }

    //Validar que el tipo de targeta sea el correcto
    public boolean validarTarjeta() {
        boolean tipoValido = false;
        for (String t : tipos) {
            if (tipo.equalsIgnoreCase(t)) {
                tipoValido = true;
                break;
            }
        }

        if (!tipoValido) {
            System.out.println("Tipo de tarjeta no válido.");
            return false;
        }

        return true;
    }
}
