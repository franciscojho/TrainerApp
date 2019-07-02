package com.example.myapplication.entidades.persona;

public class Entrenador extends Persona {
    private String password;



    public Entrenador(String nombre, String apellido, long celular,
                      String correo, int edad, String password) {
        super(nombre, apellido, celular, correo, edad);
        this.password = password;
    }

    @Override
    public String MostrarInfo() {
        return super.MostrarInfo();
    }
}

