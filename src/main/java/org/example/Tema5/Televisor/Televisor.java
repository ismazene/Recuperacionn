package org.example.Tema5.Televisor;

public class Televisor {
    // Atributos
    private int canal;
    private int volumen;

    // Constructor con parámetros
    public Televisor(int valorCanal, int valorVolumen) {
        canal = valorCanal;
        volumen = valorVolumen;
    }

    // Metodos para el canal
    public void subirCanal() {
        if (canal < 99) {
            canal++;
            System.out.println("Canal: " + canal);
        }
    }
    public void bajarCanal() {
        if (canal > 1) {
            canal--;
            System.out.println("Canal: " + canal);
        }
    }

    public int getCanal() {
        return canal;
    }
    public void setCanal(int valorCanal) {
        if (valorCanal >= 1 && valorCanal <= 99) {
            canal = valorCanal;
            System.out.println("Canal: " + canal);
        }
    }

    // Metodos para el volumen
    public void subirVolumen() {
        if (volumen < 100) {
            volumen++;
            System.out.println("Volumen: " + volumen);
        }
    }
    public void bajarVolumen() {
        if (volumen > 0) {
            volumen--;
            System.out.println("Volumen: " + volumen);
        }
    }

    public int getVolumen() {
        return volumen;
    }
    public void setVolumen(int valorVolumen) {
        if (valorVolumen >= 0 && valorVolumen <= 100) {
            volumen = valorVolumen;
            System.out.println("Volumen: " + volumen);
        }
    }
}