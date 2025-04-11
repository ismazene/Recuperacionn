package org.example.Tema6.Practica2;

public class AppMutxamel {
    public static void main(String[] args) {
        // crear varios jugadores para el equipo SENIOR
        Jugador Ismael = new Jugador("Ismael",19, Equipos.senior, 11, Posiciones.delantero);
        Jugador Irra = new Jugador("Irra",22, Equipos.senior, 9, Posiciones.delantero);
        Jugador Paton = new Jugador("Paton",21, Equipos.senior, 10, Posiciones.centrocampista);
        Jugador Giner = new Jugador("Giner",18, Equipos.senior, 6, Posiciones.defensa);

        // crear al entrenador del equipo SENIOR
        Entrenador Toni = new Entrenador("Pedro Sánchez", 45, Equipos.senior, "2");

        // crear a los masajistas del club
        Masajista Enrique = new Masajista("Enrique", 27, "Fisioterapeuta", 4);

        // crear a algún acompañante para un par de jugadores
        Acompañante acompañanteDeIsmael = new Acompañante("Yasmin", 19, Ismael, "Hermana" );
        Acompañante acompañanteDeIrra = new Acompañante("Elena", 32, Irra, "Madre" );
        Acompañante acompañanteDePaton = new Acompañante("Ivan", 19, Paton, "Hermano" );

        // concentrarse()
        Ismael.concentrarse();
        Irra.concentrarse();
        Paton.concentrarse();
        Giner.concentrarse();
        System.out.println("");

        // entrenar()
        Ismael.entrenar();
        Irra.entrenar();
        Paton.concentrarse();
        Giner.concentrarse();
        System.out.println("");


        // darMasaje() a algún jugador
        Enrique.darMasajes(Irra);
        Enrique.darMasajes(Ismael);
        Enrique.darMasajes(Paton);
        Enrique.darMasajes(Giner);
        System.out.println("");


        // viajar() a Madrid
        Toni.viajar("Madrid");
        System.out.println("");


        // planificarEntrenamiento()
        Toni.planificarEntrenamiento();
        System.out.println("");


        // entrenar()
        Paton.entrenar();
        Giner.entrenar();
        Ismael.entrenar();
        Irra.entrenar();
        System.out.println("");


        // descansar()
        Ismael.descansar();
        Irra.descansar();
        Paton.descansar();
        Giner.descansar();
        System.out.println("");


        // calentar()
        Ismael.calentar();
        Irra.calentar();
        Paton.calentar();
        Giner.calentar();
        System.out.println("");


        // jugarPartido()
        Ismael.jugarPartido("Madrid");
        Irra.jugarPartido("Madrid");
        Paton.jugarPartido("Madrid");
        Giner.jugarPartido("Madrid");
        System.out.println("");


        // animarEquipo()
        acompañanteDeIsmael.animarEquipo();
        acompañanteDeIrra.animarEquipo();
        acompañanteDePaton.animarEquipo();
        System.out.println("");


        // hacerCambios()
        Toni.hacerCambios();
        System.out.println("");


        // marcarGol()
        Ismael.marcarGol();
        Irra.marcarGol();
        Paton.marcarGol();
        Giner.marcarGol(); // Que marque gol este es MUYYY dificil :)))
        System.out.println("");


        // celebrarGol()
        acompañanteDeIsmael.celebrarGol();
        acompañanteDeIrra.celebrarGol();
        acompañanteDePaton.celebrarGol();
        System.out.println("");


        // darMasaje() a varios jugadores
        Enrique.darMasajes(Irra);
        Enrique.darMasajes(Ismael);
        Enrique.darMasajes(Paton);
        Enrique.darMasajes(Giner);
        System.out.println("");


        // viajar() a Mutxamel
        Toni.viajar("Mutxamel");
        System.out.println("");


        // desacansar()
        Ismael.descansar();
        Irra.descansar();
        Paton.descansar();
        Giner.descansar();
    }
}
