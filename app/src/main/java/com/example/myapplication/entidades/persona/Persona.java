package com.example.myapplication.entidades.persona;

import com.example.myapplication.entidades.Mostrable;

public abstract class Persona implements Mostrable {
    private String nombre;
    private String apellido;
    private long celular;
    private String correo;
    private String  fecNac;

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

    public String getFecNac() {
        return fecNac;
    }

    public Persona(String nombre, String apellido, long celular, String correo, String fecNac) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.celular = celular;
        this.correo = correo;
        this.fecNac = fecNac;
    }

    @Override
    public String MostrarInfo(){
        return "Nombre: "+nombre+"\n"+
                "Apellido: "+apellido+"\n"+
                "Celular: "+celular+"\n"+
                "Correo: "+correo+"\n"+
                "Edad: "+ fecNac +"\n";
    }

}




