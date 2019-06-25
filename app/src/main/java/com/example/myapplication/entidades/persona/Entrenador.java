package com.example.myapplication.entidades.persona;

public class Entrenador extends Persona {
    private String password;

    public Entrenador(String nombre, String apellido, long celular,
                      String correo, String fecNac, String password) {
        super(nombre, apellido, celular, correo, fecNac);
        this.password = password;
    }

    @Override
    public String MostrarInfo() {
        return super.MostrarInfo();
    }
}

