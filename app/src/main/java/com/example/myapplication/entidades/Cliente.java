package com.example.myapplication.entidades;

public class Cliente extends Usuario {
    private double altura;
    private double peso;
    private String descripcion;
    private String objetivo;
    private boolean es_deportista;


    public Cliente(String nombre, String apellido, long celular, String correo, String fec_nac, String contraseña, double altura, double peso, String descripcion, String objetivo, boolean es_deportista) {
        super(nombre, apellido, celular, correo, fec_nac, contraseña);
        this.altura = altura;
        this.peso = peso;
        this.descripcion = descripcion;
        this.objetivo = objetivo;
        this.es_deportista = es_deportista;
    }

    private double CalcularIMC()
    {
        double IMC = peso/(altura*altura);
        return IMC;
    }

    private String esDeportista()
    {
        String msg = "";
        if(es_deportista=true) msg ="Si es deportista";
        else msg = "No es deportista";
        return msg;
    }


    @Override
    public String toString() {
        return "Datos del cliente: "+"\n"+
                "Altura: "+altura+"\n"+
                "Peso: "+peso+"\n"+
                "Descripcion: "+descripcion+"\n"+
                "Es deportista: "+esDeportista()+"\n"+
                "Objetivo: "+ objetivo;

    }

}


