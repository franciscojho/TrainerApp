package com.example.myapplication.entidades;

public class Mes implements Repetible {
    private String nombre;
    private int cantDias;
    private double precio;

    public Mes(String nombre, int cantDias, double precio) {
        this.nombre = nombre;
        this.cantDias = cantDias;
        this.precio = precio;
    }

    @Override
    public String MostrarInfo() {
        return "Mes: "+nombre+"\n"+
                "Cantidad de dias: "+cantDias+"\n"+
                "Precio: "+precio;
    }
}
