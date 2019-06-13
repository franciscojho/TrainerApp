package com.example.myapplication.entidades;

public abstract class Usuario {
    protected String nombre;
    protected String apellido;
    protected long celular;
    protected String correo;
    protected String fec_nac;
    protected String contraseña;


    public Usuario(String nombre, String apellido, long celular, String correo, String fec_nac, String contraseña) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.celular = celular;
        this.correo = correo;
        this.fec_nac = fec_nac;
        this.contraseña = contraseña;
    }


    @Override
    public String toString() {
        return "Datos del Usuario" + "\n"+
                "nombre='" + nombre  + "\n"+
                ", apellido='" + apellido  + "\n"+
                ", celular=" + celular  + "\n"+
                ", correo='" + correo  + "\n"+
                ", fec_nac='" + fec_nac  + "\n"+
                ", contraseña='" + contraseña ;
    }

}




