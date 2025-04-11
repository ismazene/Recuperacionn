package org.example.Tema6.Practica2;
import java.util.HashSet;
import java.util.Set;

public class Jugador extends MutxamelFC implements FuncionesIntegrantes, AccionesDeportivas {

    private static Set<Integer> dorsalesUsados = new HashSet<>();

    private Equipos categoria;
    private int dorsal;
    private Posiciones posicion;

    public Equipos getCategoria() {
        return categoria;
    }
    public void setCategoria(Equipos categoria) {
        this.categoria = categoria;
    }

    public int getDorsal() {
        return dorsal;
    }
    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }

    public Posiciones getPosicion() {
        return posicion;
    }
    public void setPosicion(Posiciones posicion) {
        this.posicion = posicion;
    }

    public Jugador(String nombre, int edad, Equipos categoria, int dorsal, Posiciones posicion) {
        super(nombre, edad);

        if (dorsalesUsados.contains(dorsal)) {
            throw new IllegalArgumentException("El numero " + dorsal + " no esta disponible, pon otro dorsal.");
        }

        // Si no existe, lo añadimos
        dorsalesUsados.add(dorsal);

        this.categoria = categoria;
        this.dorsal = dorsal;
        this.posicion = posicion;
    }

    // Tu código de métodos sigue igual...
    @Override
    public void entrenar() {
        System.out.println("El jugador " + getNombre() + " está entrenando porque juega de " + posicion);
    }

    @Override
    public void jugarPartido(String rival) {
        System.out.println("El jugador " + getNombre() + " está jugando el partido contra " + rival + " de " + posicion);
    }

    @Override
    public void concentrarse() {
        System.out.println("El jugador " + getNombre() + " está muy concentrado.");
    }

    @Override
    public void viajar(String ciudad) {
        System.out.println("El jugador " + getNombre() + " ha viajado a " + ciudad);
    }

    @Override
    public void celebrarGol() {
        System.out.println(getNombre() + " celebra un gol increíble!");
    }

    public void calentar() {
        System.out.println("El jugador " + getNombre() + " está calentando.");
    }

    public void descansar() {
        System.out.println("El jugador " + getNombre() + " está descansando.");
    }

    public void marcarGol() {
        System.out.println("El jugador " + getNombre() + " ha marcado un gol!");
    }
}
