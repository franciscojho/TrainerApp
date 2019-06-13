package com.example.myapplication.entidades;

public class Entrenador extends Usuario {
    private String empresa;
    private int añosexp;
    private String descripcion;

    public Entrenador(String nombre, String apellido, long celular, String correo, String fec_nac, String contraseña, String empresa, int añosexp, String descripcion) {
        super(nombre, apellido, celular, correo, fec_nac, contraseña);
        this.empresa = empresa;
        this.añosexp = añosexp;
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "Datos del entrenador "+"\n"+
                "Nombre: "+"\n"+
                "Apellido: "+"\n"+
                "Empresa: "+empresa+"\n"+
                "Años de experiencia: "+añosexp+"\n"+
                "Descripcion: "+descripcion;
    }
}

