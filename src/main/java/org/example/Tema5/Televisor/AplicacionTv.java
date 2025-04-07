package org.example.Tema5.Televisor;

public class AplicacionTv {
    public static void main(String[] args) {
        // Crear objetos Televisor
        Televisor tv1 = new Televisor(11, 43);
        Televisor tv2 = new Televisor(10, 20);

        // Probar métodos en tv1
        tv1.subirCanal();
        tv1.subirVolumen();
        tv1.setCanal(50);
        tv1.setVolumen(80);

        // Probar métodos en tv2
        tv2.bajarCanal();
        tv2.bajarVolumen();
        tv2.setCanal(1);
        tv2.setVolumen(0);

        // Intentar valores inválidos
        tv1.setCanal(100);
        tv2.setVolumen(-1);
    }
}
