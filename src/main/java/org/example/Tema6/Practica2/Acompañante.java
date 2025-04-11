package org.example.Tema6.Practica2;

public class Acompañante extends MutxamelFC implements FuncionesIntegrantes {

    private Jugador integrante;
    private String parentesco;

    public Acompañante(String nombre, int edad, Jugador integrante, String parentesco) {
        super(nombre, edad);
        this.integrante = integrante;
        this.parentesco = parentesco;
    }
    @Override
    public void concentrarse() {
        System.out.println("El acompañante " + getNombre() + "esta to concentrado");
    }

    @Override
    public void viajar(String ciudad) {
        System.out.println( "El acompañante " + getNombre() + " viaja a " + ciudad + " con " + integrante.getNombre());
    }

    @Override
    public void celebrarGol() {
        System.out.println("El acompañante " + getNombre() + " celebra el gol ¡GOOOOOOOOOOL!");
    }

    public void animarEquipo() {
        System.out.println("El acompañante " + getNombre()  + parentesco + " de " + integrante.getNombre() + " anima al equipo Vamossss");
    }

}
