package org.example.Tema6.Practica2;

abstract class MutxamelFC implements FuncionesIntegrantes {

    private String nombre;
    private int edad;

    public MutxamelFC(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }


}
