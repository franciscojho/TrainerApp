package com.example.myapplication.entidades.persona;

import com.example.myapplication.entidades.MyDatePicker;

public class Cliente extends Persona{
    private double cSize;
    private double cWeight;
    private String cObjetive;
    private boolean doSports;
    private int cImage;

    public double getcSize() {
        return cSize;
    }

    public double getcWeight() {
        return cWeight;
    }

    public String getcObjetive() {
        return cObjetive;
    }

    public String isDoSports() {
        return doSports();
    }

    public int getcImage() {
        return cImage;
    }

    public Cliente(String nombre, String apellido, long celular, String correo, int edad, double cSize,
                   double cWeight, String cObjetive, boolean doSports, int cImage) {
        super(nombre, apellido, celular, correo, edad);
        this.cSize = cSize;
        this.cWeight = cWeight;
        this.cObjetive = cObjetive;
        this.doSports = doSports;
        this.cImage = cImage;
    }

    private String doSports()
    {
        if(doSports) return "Es una persona activa";
        else return "Es sedentario";
    }

    @Override
    public String MostrarInfo() {
        return super.MostrarInfo()+"\n"+
                "Altura: "+ cSize +"\n"+
                "Peso: " +cWeight+"\n"+
                "Objetivo: "+ cObjetive +"\n"+
                "¿Realiza algún deporte?: "+doSports();
    }

}


