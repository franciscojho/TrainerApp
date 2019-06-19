package com.example.myapplication.entidades.persona;

public class Cliente extends Persona{
    private double altura;
    private double peso;
    private String objetivo;
    private boolean doSports;
    private int image;

    public double getAltura() {
        return altura;
    }

    public double getPeso() {
        return peso;
    }

    public String getObjetivo() {
        return objetivo;
    }

    public boolean isDoSports() {
        return doSports;
    }

    public int getImage() {
        return image;
    }

    public Cliente(String nombre, String apellido, long celular, String correo, int edad,
                   double altura, double peso, String objetivo, boolean doSports, int image) {
        super(nombre, apellido, celular, correo, edad);
        this.altura = altura;
        this.peso = peso;
        this.objetivo = objetivo;
        this.doSports = doSports;
        this.image = image;
    }

    private double CalcularIMC()
    {
        return peso/(altura*altura);
    }

    private String doSports()
    {
        if(doSports) return "Es una persona activa";
        else return "Es sedentario";
    }

    @Override
    public String MostrarInfo() {
        return super.MostrarInfo()+"\n"+
                "Altura: "+altura+"\n"+
                "Peso: " +peso+"\n"+
                "Objetivo: "+objetivo+"\n"+
                "¿Realiza algún deporte?: "+doSports();
    }

}


