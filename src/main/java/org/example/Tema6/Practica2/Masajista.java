package org.example.Tema6.Practica2;

public class Masajista extends MutxamelFC implements FuncionesIntegrantes {
    private String titulacion;
    private int anosExperiencia;


    public Masajista(String nombre, int edad, String titulacion, int anosExperiencia) {
        super(nombre, edad);
        this.titulacion = titulacion;
        this.anosExperiencia = anosExperiencia;
    }


    @Override
    public void concentrarse() {
        System.out.println("El masajista " + getNombre() + " esta concentrado");
    }

    @Override
    public void viajar(String ciudad) {
        System.out.println("El masajista" +getNombre() + " a viajado a " + ciudad);
    }

    @Override
    public void celebrarGol() {
        System.out.println("GOOOOOOOOOOL");
    }

    public void darMasajes(Jugador jugador){
        System.out.println("El masajista " + getNombre() + " esta dando un masaje al jugador " + jugador.getNombre());
    }
}
