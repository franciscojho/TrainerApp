package com.example.myapplication.entidades;

public class Dia implements  Repetible{
    private String nombre;
    private RutinaDia rutinaDia;

    public Dia(String nombre, RutinaDia rutinaDia) {
        this.nombre = nombre;
        this.rutinaDia = rutinaDia;
    }


    @Override
    public String MostrarInfo() {
        return "Dia: "+nombre+"\n"+
                "Rutina para hoy: "+rutinaDia.nombre;
    }
}
