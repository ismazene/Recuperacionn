package org.example.Tema6.Practica2;

public class Entrenador extends MutxamelFC implements FuncionesIntegrantes {
    private Equipos equipos;
    private String formacionPreferida;
    String formatoFormacion = "[0-6]+-[0-4]+-[0-4]";

    public Entrenador(String nombre, int edad, Equipos formacion, String formacionPreferida) {
        super(nombre, edad);
        this.equipos = formacion;
        this.formacionPreferida = formacionPreferida;
    }

    @Override
    public void concentrarse() {
        System.out.println(getNombre() + " esta concentrado para preparar el partido con su equipo " + equipos);
    }

    @Override
    public void viajar(String ciudad) {
        System.out.println("El entrenador " + getNombre() + " ha viajado a " + ciudad + " con el equipo " + equipos);
    }

    @Override
    public void celebrarGol() {
        System.out.println("El entrenador " + getNombre() + " celebra el golazooo ¡GOOOOOOOOOOL!");
    }

    public void hacerCambios() {
        System.out.println("El entrenador " + getNombre() + " esta haciendo cambiosen el partido.");
    }

    public boolean planificarEntrenamiento() {
        if (formacionPreferida.matches(formatoFormacion)) {
            System.out.println("El entrenador " + getNombre() + " planifica el entrenamiento con un " + formacionPreferida);
            return true;
        } else {
            System.out.println("La formacion no es valida. Pon por ejemplo un 4-4-2");
            return false;
        }
    }
}
