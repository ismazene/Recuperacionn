package org.example.Tema6.Practica2;
import java.util.Scanner;

public class AppMantenimiento {

    static Scanner teclado = new Scanner(System.in);

    Jugador Ismael = new Jugador("Ismael",19, Equipos.senior, 11, Posiciones.delantero);

    public static void main(String[] args) {
        menuPrincipal();
    }
    public static void menuPrincipal(Jugador jugador){
        System.out.println("=== Mantenimiento de jugadores ===");
        System.out.println("");
        System.out.println("[1]. Añadir un nuevo jugador");
        System.out.println("[2]. Modificar datos de un jugador existente");
        System.out.println("[3]. Crear acompañantes (solo senior)");
        System.out.println("[X]. Volver al menu principal");
        String opcion = teclado.next();

        switch (opcion) {
            case "1":
                System.out.println("Que quieres modificar: Nombre, Edad, Categoria, Dorsal o la Posicion");
                String opcionModificar = teclado.next();
                switch (opcionModificar) {
                    case "Nombre":
                        System.out.println("Cual es el nombre que le quieres poner: ");
                        String nombreNuevo = teclado.next();
                        jugador.setNombre(nombreNuevo);
                        break;

                    case "Edad":
                        System.out.println("Cual es la edad que le quieres poner: ");
                        int edadNueva = teclado.nextInt();
                        jugador.setEdad(edadNueva);
                        break;

                    case "Categoria":
                        System.out.println("Que categoria quieres poner: ");
                        String categoriaNueva = teclado.next();
                        try {
                            jugador.setCategoria(Equipos.valueOf(categoriaNueva.toUpperCase()));
                        } catch (NumberFormatException e) {
                            System.out.println("Esa categoria no existe, espabila.");
                        }
                        break;

                    case "Dorsal":
                        System.out.println("Que dorsal quieres cambiar??");
                        int dorsalNuevo = teclado.nextInt();
                        jugador.setDorsal(dorsalNuevo);
                        break;

                    case "Posicion":
                        System.out.println("Que posicion quieres cambiar:");
                        String posicionNueva = teclado.next();
                        jugador.setPosicion(Posiciones.valueOf(posicionNueva));
                        break;
                }

            default:
                System.out.println("Debes de escoger una opcion valida...");
                break;
        }

    }
}
