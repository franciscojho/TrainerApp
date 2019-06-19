package com.example.myapplication.entidades;

import com.example.myapplication.entidades.persona.Cliente;

public class RutinaDia implements Mostrable{
    private Cliente cliente;
    public String nombre;
    private String fecha;
    private Ejercicio ejercicio;
    private String hora;



    public RutinaDia(Cliente cliente, String nombre, String fecha, Ejercicio ejercicio, String hora) {
        this.cliente = cliente;
        this.nombre = nombre;
        this.fecha = fecha;
        this.ejercicio = ejercicio;
        this.hora = hora;
    }


    @Override
    public String MostrarInfo() {
        return "El cliente"+ cliente.getNombre()+ " debe realizar la siguiente rutina: "+"\n"+
                "Nombre: "+nombre+"\n"+
                "Fecha: "+fecha+"\n"+
                "Ejercicio: "+ ejercicio.nombre+"\n"+
                "Hora: "+hora;
    }
}
