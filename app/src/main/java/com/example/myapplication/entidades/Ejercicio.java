package com.example.myapplication.entidades;

public class Ejercicio implements Repetible {
    public String nombre;
    private int numeroSets;
    private int repeticiones;


    public Ejercicio(String nombre, int numeroSets, int repeticiones) {
        this.nombre = nombre;
        this.numeroSets = numeroSets;
        this.repeticiones = repeticiones;
    }


    @Override
    public String MostrarInfo() {
        return "Detalle del ejercicio: "+"\n"+
                "Nombre: "+nombre+"\n"+
                "Numero de sets: "+numeroSets+"\n"+
                "Repeticiones: "+repeticiones;



    }
}
