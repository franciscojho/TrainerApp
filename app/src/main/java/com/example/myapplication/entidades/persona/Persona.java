package com.example.myapplication.entidades.persona;

import com.example.myapplication.entidades.Mostrable;

public abstract class Persona implements Mostrable {
    private String nombre;
    private String apellido;
    private long celular;
    private String correo;
    private int edad;

    public String getNombre() {

        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public long getCelular() {
        return celular;
    }

    public String getCorreo() {
        return correo;
    }

    public int getEdad() {
        return edad;
    }

    public Persona(String nombre, String apellido, long celular, String correo, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.celular = celular;
        this.correo = correo;
        this.edad = edad;
    }

    @Override
    public String MostrarInfo(){
        return "Nombre: "+nombre+"\n"+
                "Apellido: "+apellido+"\n"+
                "Celular: "+celular+"\n"+
                "Correo: "+correo+"\n"+
                "Edad: "+edad+"\n";
    }

}




