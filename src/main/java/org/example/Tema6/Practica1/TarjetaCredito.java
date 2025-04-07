package org.example.Tema6.Practica1;

public class TarjetaCredito {

    private String nro_tarjeta;
    private String tipo;
    String[] tipos = {"VISA", "MASTERCARD", "MAESTRO"};
    int numeroMax = 16;


    public TarjetaCredito(String nro_tarjeta, String tipo) {
        this.nro_tarjeta = nro_tarjeta;
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getNro_tarjeta() {
        return nro_tarjeta;
    }

    public void setNro_tarjeta(String nro_tarjeta) {
        this.nro_tarjeta = nro_tarjeta;
    }

    public static void procesarPago(double importe) {
        System.out.println("Procesando pago de " + importe + "€ con tarjeta de crédito X");
    }

    public boolean validarTarjeta() {
        // Validación de la longitud de la tarjeta
        if (nro_tarjeta.length() != numeroMax) {
            System.out.println("Número de tarjeta invalido. Debe tener " + numeroMax + " dígitos.");
            return false;
        }

        boolean tipoValido = false;
        for (String t : tipos) {
            if (tipo.equalsIgnoreCase(t)) {
                tipoValido = true;
                break;
            }
        }

        if (!tipoValido) {
            System.out.println("Tipo de tarjeta no valido.");
            return false;
        }

        return true;
    }
}

